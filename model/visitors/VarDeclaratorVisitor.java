package model.visitors;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.ScopedVariableDeclarationContext;
import parser.PSCParser.VariableDeclarationContext;
import parser.PSCParser.VariableDeclarationInitializeContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.ScopeManager;
import model.semcheck.*;
import model.objects.*;
import model.Scope;

public class VarDeclaratorVisitor implements ParseTreeListener {

    public VarDeclaratorVisitor() {}

    public void visit(ScopedVariableDeclarationContext ctx) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, ctx);
    }

    @Override
	public void enterEveryRule(ParserRuleContext ctx) {

		if (ctx instanceof ScopedVariableDeclarationContext) {
			ScopedVariableDeclarationContext scopedVarDecCtx = (ScopedVariableDeclarationContext) ctx;
			VariableDeclarationContext varDecCtx = scopedVarDecCtx.variableDeclaration();
			PseudoValue pseudoValue = null;

			if (varDecCtx != null) {

				VariableDeclarationInitializeContext varDecInitCtx = varDecCtx.variableDeclarationInitialize();
				
				MultipleVarSemCheck mulVarSemCheck = new MultipleVarSemCheck(varDecInitCtx);
				mulVarSemCheck.check();
				
				if (varDecCtx.typeSpecifier().Int() != null) {
					pseudoValue = new PseudoValue(null, "int");
				} else if (varDecCtx.typeSpecifier().Bool() != null) {
					pseudoValue = new PseudoValue(null, "bool");
				} else if (varDecCtx.typeSpecifier().String() != null) {
					pseudoValue = new PseudoValue(null, "String");
				} else if (varDecCtx.typeSpecifier().Float() != null) {
					pseudoValue = new PseudoValue(null, "float");
				}
				
				if (varDecInitCtx.Assign() == null) {
					// empty initialization, walang problema
					Scope scope = ScopeManager.getInstance().getScope();
					scope.addVariable(varDecInitCtx.IDENTIFIER().getText(), pseudoValue);
				} else {
					// may value, you need to check
					TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(pseudoValue, varDecInitCtx.simpleExpression());
					typeMMSemCheck.check();
				}
			
				System.out.println("lmao found a normie declaration");
			} else if (scopedVarDecCtx.arrayVariableDeclaration() != null) {

				System.out.println("lmao found a array declaration");
			}
		}

	}

    @Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

    @Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		
	}

    
}