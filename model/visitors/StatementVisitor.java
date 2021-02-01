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


import model.objects.*;
import model.semcheck.*;
import model.commands.*;
import model.*;

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
                    } else {

                        if (pseudoValue.getPrimitiveType() == PrimitiveType.ARRAY) {
                            Console.log("Cannot scan to array", stmtCtx.getStart().getLine());
                        } else {
                            ScanCommand scanCommand = new ScanCommand(scanCtx.StringLiteral().getText() , scanCtx.IDENTIFIER().getText());
                            RuntimeManager.getInstance().addCommand(scanCommand);
                        }
                    }
                }

                
            } else if (stmtCtx.printStmt() != null) {
                PrintStmtContext printCtx = stmtCtx.printStmt();

                if (printCtx.printParams() != null) {
                    PrintCommand printCommand = new PrintCommand(printCtx.printParams());
                    RuntimeManager.getInstance().addCommand(printCommand);
                }

            } else if (stmtCtx.selectionStmt() != null) {
                SelectionStmtContext ifCtx = stmtCtx.selectionStmt();
                analyzeSelection(ifCtx);
            } else if (stmtCtx.iterationStmt() != null) {
                IterationStmtContext iterStmtCtx = stmtCtx.iterationStmt();

                IterationVisitor iterationVisitor = new IterationVisitor();
                iterationVisitor.visit(iterStmtCtx);
            } else if (stmtCtx.expressionStmt() != null) { // assignment standalone or function call

                if (stmtCtx.expressionStmt().assignmentStandaloneExpression() != null) { // assignment
                    analyzeExpressionStmt(stmtCtx.expressionStmt().assignmentStandaloneExpression());
                } else if (stmtCtx.expressionStmt().call() != null) { // call
                    FunctionCallSemCheck callSemCheck = new FunctionCallSemCheck(stmtCtx.expressionStmt().call());
                    callSemCheck.check();
                }
            } else if (stmtCtx.returnStmt() != null) {

                 

                if (FunctionReturnTracker.getInstance().getCurFunction() != null && ScopeManager.getInstance().getScope().getParent() == null) {
                    FunctionReturnTracker.getInstance().setHasReturn(true);

                    if (FunctionReturnTracker.getInstance().getCurFunction().getReturnType() == FunctionType.VOID) {
                        Console.log("Encountered a return statement in void-type function.", ctx.getStart().getLine());
                    }
                }   

           

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

        ConstantSemCheck constSemCheck = new ConstantSemCheck(mutableCtx.IDENTIFIER());
        constSemCheck.check();

        PseudoValue pv = ScopeManager.getInstance().searchMyScopeVariable(mutableCtx.IDENTIFIER().getText());


        // if (mutableCtx.LeftBracket() != null ) { // x[2] = 2

        //     if (pv != null) {
                
        //     }

        //     AssignCommand assignCommand = new AssignCommand(mutableCtx, ctx.simpleExpression());
        //     RuntimeManager.getInstance().addCommand(assignCommand);


        // } else 
        if (ctx.simpleExpression() != null) { // x = 2 + 2
            if (pv != null) {
                AssignCommand assignCommand = new AssignCommand(mutableCtx, ctx.simpleExpression());
                RuntimeManager.getInstance().addCommand(assignCommand);

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

                // if size is int int[size] <--
                TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(new PseudoValue(null, "int"), ctx.createArrayExpression().simpleExpression());
                typeMMSemCheck.check();

                CreateArrayCommand createArrCommand = new CreateArrayCommand(ctx.createArrayExpression().simpleExpression(), pa);
                RuntimeManager.getInstance().addCommand(createArrCommand);	
            }
        } 
    }

}