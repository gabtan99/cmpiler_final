package model.visitors;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.IterationStmtContext;
import parser.PSCParser.WhileStatementContext;
import parser.PSCParser.ForStatementContext;
import parser.PSCParser.IterationStmtContext;
import parser.PSCParser.CompoundStmtContext;
import parser.PSCParser.LoopDeclarationContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.ScopeManager;
import model.semcheck.*;
import model.Console;
import model.objects.*;
import model.Scope;

public class IterationVisitor {

    public IterationVisitor() {}

    public void visit(IterationStmtContext ctx) {
        
        if (ctx.whileStatement() != null ) {
            WhileStatementContext whileCtx = ctx.whileStatement();

            // to check identifier while i <---
            PseudoValue pseudoValue = ScopeManager.getInstance().searchMyScopeVariable(whileCtx.IDENTIFIER().getText());

			if(pseudoValue == null) {
				Console.log("UndeclaredVariable Error at while line " + ctx.getStart().getLine());
			} else {
                if (pseudoValue.getPrimitiveType() != PrimitiveType.INT) {
                    Console.log("TypeMismatch Error at while line " + ctx.getStart().getLine());
                }
            }

            // to check simple expression up to -> z  
            UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(whileCtx.simpleExpression());
            undeclaredSemCheck.check();

            // goal has to be int
            TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(new PseudoValue(null, "int"), whileCtx.simpleExpression());
            typeMMSemCheck.check();

            // to check content { }
            analyzeContent(whileCtx.compoundStmt());   

        } else if (ctx.forStatement() != null) {
            ForStatementContext forCtx = ctx.forStatement();

            LoopDeclarationContext loopDecCtx = forCtx.loopDeclaration();

            // int i = 2
            if (loopDecCtx.Int() != null) { // to check if declared new var

                if (ScopeManager.getInstance().searchMyScopeVariable(loopDecCtx.IDENTIFIER().getText()) != null) {
				    Console.log("MultipleVarDeclaration Error at while line" + ctx.getStart().getLine());
			    }   

                // i = 2
                if (loopDecCtx.Assign() != null ) {
                    TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(new PseudoValue(null, "int"), loopDecCtx.simpleExpression());
                    typeMMSemCheck.check(); 
                }

            // i, i = 2
            } else { // to check if variable only

                PseudoValue pseudoValue = ScopeManager.getInstance().searchMyScopeVariable(loopDecCtx.IDENTIFIER().getText());

                if(pseudoValue == null) {
                    Console.log("UndeclaredVariable Error at while line " + ctx.getStart().getLine());
                } else {
                    if (pseudoValue.getPrimitiveType() != PrimitiveType.INT) {
                        Console.log("TypeMismatch Error at while line " + ctx.getStart().getLine());
                    } 
                } 

                // i = 2
                if (loopDecCtx.Assign() != null ) {
                    TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(new PseudoValue(null, "int"), loopDecCtx.simpleExpression());
                    typeMMSemCheck.check(); 
                }
            }

            // to check simple expression up to -> z  
            UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(forCtx.simpleExpression());
            undeclaredSemCheck.check();

            // goal has to be int
            TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(new PseudoValue(null, "int"), forCtx.simpleExpression());
            typeMMSemCheck.check();

            analyzeContent(forCtx.compoundStmt());   
        }

    }

    private void analyzeContent(CompoundStmtContext compoundCtx) {
        Scope scope = new Scope(ScopeManager.getInstance().getScope());
        ScopeManager.getInstance().setScope(scope);
        System.out.println("Opened iteration scope");

        // if and else if
        CompoundVisitor ifCompoundVisitor = new CompoundVisitor();
        ifCompoundVisitor.visit(compoundCtx);
    }



}