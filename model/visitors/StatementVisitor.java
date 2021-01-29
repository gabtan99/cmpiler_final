package model.visitors;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.StatementContext;
import parser.PSCParser.ScanStmtContext;
import parser.PSCParser.PrintStmtContext;
import parser.PSCParser.PrintParamsSelectorContext;
import parser.PSCParser.IterationStmtContext;
import parser.PSCParser.SelectionStmtContext;
import parser.PSCParser.MutableContext;
import parser.PSCParser.TypeSpecifierContext;
import parser.PSCParser.AssignmentStandaloneExpressionContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.*;

import model.Console;
import model.ScopeManager;
import model.objects.*;
import model.semcheck.*;
import model.Scope;

public class StatementVisitor {

    public StatementVisitor() {}

	public void visit(ParserRuleContext ctx) {

        if (ctx instanceof StatementContext) {
            StatementContext stmtCtx = (StatementContext) ctx;

            if (stmtCtx.scanStmt() != null) {
                ScanStmtContext scanCtx = stmtCtx.scanStmt();

                if (scanCtx.IDENTIFIER() != null) {
                    PseudoValue pseudoValue = ScopeManager.getInstance().searchMyScopeVariable(scanCtx.IDENTIFIER().getText());

                    if(pseudoValue == null) {
                        Console.log("UndeclaredVariable Error at scan statement", stmtCtx.getStart().getLine());
                    }
                }
            } else if (stmtCtx.printStmt() != null) {
                PrintStmtContext printCtx = stmtCtx.printStmt();

                if (printCtx.printParams() != null) {
                    List<PrintParamsSelectorContext> paramsList = printCtx.printParams().printParamsSelector();

                    for (PrintParamsSelectorContext param : paramsList) {
                        if (param.IDENTIFIER() != null) {
                            PseudoValue pseudoValue = ScopeManager.getInstance().searchMyScopeVariable(param.IDENTIFIER().getText());
                            if(pseudoValue == null) {
                                Console.log("UndeclaredVariable Error at print statement", stmtCtx.getStart().getLine());
                            }
                        } else if (param.call() != null) {
                            PseudoFunction pseudoFunction = ScopeManager.getInstance().getFunction(param.call().IDENTIFIER().getText());

                            if (pseudoFunction == null) {
                                Console.log("UndeclaredFunction error at print statement",  stmtCtx.getStart().getLine());
                            }
                        }
                    }
                }
            } else if (stmtCtx.selectionStmt() != null) {
                SelectionStmtContext ifCtx = stmtCtx.selectionStmt();
                analyzeSelection(ifCtx);
            } else if (stmtCtx.iterationStmt() != null) {
                IterationStmtContext iterStmtCtx = stmtCtx.iterationStmt();

                IterationVisitor iterationVisitor = new IterationVisitor();
                iterationVisitor.visit(iterStmtCtx);
            } else if (stmtCtx.expressionStmt() != null) { // assignment standalone or function call

                if (stmtCtx.expressionStmt().assignmentStandaloneExpression() != null) {
                    analyzeExpressionStmt(stmtCtx.expressionStmt().assignmentStandaloneExpression());
                } else if (stmtCtx.expressionStmt().call() != null) {
                    FunctionCallSemCheck callSemCheck = new FunctionCallSemCheck(stmtCtx.expressionStmt().call());
                    callSemCheck.check();
                }
            } else if (stmtCtx.returnStmt() != null) {
                UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(stmtCtx.returnStmt().simpleExpression());
                undeclaredSemCheck.check();
            }
        } else if (ctx instanceof SelectionStmtContext) {
            SelectionStmtContext ifCtx = (SelectionStmtContext) ctx;
            analyzeSelection(ifCtx);
        } 
	
	}

    private void analyzeSelection(SelectionStmtContext ifCtx) {
        UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(ifCtx.simpleExpression());
        undeclaredSemCheck.check();

        Scope scope = new Scope(ScopeManager.getInstance().getScope());
        ScopeManager.getInstance().setScope(scope);
        System.out.println("Opened if/elseif scope");

        // if and else if
        CompoundVisitor ifCompoundVisitor = new CompoundVisitor();
        ifCompoundVisitor.visit(ifCtx.compoundStmt());
    
        // else
        if (ifCtx.elseSelector() != null) {
            if (ifCtx.elseSelector().compoundStmt() != null) {
                Scope elseScope = new Scope(ScopeManager.getInstance().getScope());
                ScopeManager.getInstance().setScope(elseScope);
                System.out.println("Opened else scope");
                
                CompoundVisitor elseCompoundVisitor = new CompoundVisitor();
                elseCompoundVisitor.visit(ifCtx.elseSelector().compoundStmt());
            } else {
                StatementVisitor stmtVisitor = new StatementVisitor();
                stmtVisitor.visit(ifCtx.elseSelector().selectionStmt());
            }
        }
    }   


    private void analyzeExpressionStmt(AssignmentStandaloneExpressionContext ctx) {
        MutableContext mutableCtx = ctx.mutable();

        

        ConstantSemCheck constSemCheck = new ConstantSemCheck(mutableCtx);
        constSemCheck.check();

        PseudoValue pv = ScopeManager.getInstance().searchMyScopeVariable(mutableCtx.IDENTIFIER().getText());

        if (ctx.simpleExpression() != null) {
            if (pv != null) {
                TypeMismatchSemCheck typeSemCheck = new TypeMismatchSemCheck(pv, ctx.simpleExpression());
                typeSemCheck.check();
            } else {
                Console.log("UndeclaredVariable error", ctx.getStart().getLine());
            }
        
            
        } else if (ctx.createArrayExpression() != null) { //  x= create int[]

            if (pv.getPrimitiveType() != PrimitiveType.ARRAY) {
                Console.log("Identifier is not an array", ctx.getStart().getLine());
            } else {
                TypeSpecifierContext typeSpecifier = ctx.createArrayExpression().typeSpecifier();

                PseudoArray pa = (PseudoArray) pv.getValue();

                if ((pa.getPrimitiveType() == PrimitiveType.INT && typeSpecifier.Int() == null) || 
                    (pa.getPrimitiveType() == PrimitiveType.STRING && typeSpecifier.String() == null) || 
                    (pa.getPrimitiveType() == PrimitiveType.BOOLEAN && typeSpecifier.Bool() == null) ||
                    (pa.getPrimitiveType() == PrimitiveType.FLOAT && typeSpecifier.Float() == null) ) {
                    Console.log("TypeMismatch Error", ctx.getStart().getLine() );
                }	 
            }
        }
    }

}