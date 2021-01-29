package model.visitors;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.StatementContext;
import parser.PSCParser.ScanStmtContext;
import parser.PSCParser.PrintStmtContext;
import parser.PSCParser.PrintParamsSelectorContext;
import parser.PSCParser.IterationStmtContext;
import parser.PSCParser.SelectionStmtContext;
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
                        Console.log("UndeclaredVariable Error at scan line " + stmtCtx.getStart().getLine());
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
                                Console.log("UndeclaredVariable Error at print line " + stmtCtx.getStart().getLine());
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
}