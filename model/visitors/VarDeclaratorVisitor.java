package model.visitors;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.ScopedVariableDeclarationContext;
import parser.PSCParser.VariableDeclarationContext;
import parser.PSCParser.VariableDeclarationInitializeContext;
import parser.PSCParser.ArrayVariableDeclarationInitializeContext;
import parser.PSCParser.ArrayVariableDeclarationContext;
import parser.PSCParser.TypeSpecifierContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.ScopeManager;
import model.semcheck.*;
import model.objects.*;
import model.Scope;
import model.Console;

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
		
			PseudoValue pseudoValue = null;

			MultipleVarSemCheck mulVarSemCheck = new MultipleVarSemCheck(scopedVarDecCtx);
			mulVarSemCheck.check();
			

			if (scopedVarDecCtx.variableDeclaration() != null) {
				VariableDeclarationContext varDecCtx = scopedVarDecCtx.variableDeclaration();
				VariableDeclarationInitializeContext varDecInitCtx = varDecCtx.variableDeclarationInitialize();
					
				if (varDecCtx.typeSpecifier().Int() != null) {
					pseudoValue = new PseudoValue(null, "int");
				} else if (varDecCtx.typeSpecifier().Bool() != null) {
					pseudoValue = new PseudoValue(null, "bool");
				} else if (varDecCtx.typeSpecifier().String() != null) {
					pseudoValue = new PseudoValue(null, "String");
				} else if (varDecCtx.typeSpecifier().Float() != null) {
					pseudoValue = new PseudoValue(null, "float");
				}

				if (pseudoValue != null && varDecCtx.ConstantKey() != null) {
					pseudoValue.markConst();
				} 
				
				if (varDecInitCtx.Assign() != null) {
					UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(varDecInitCtx.simpleExpression() );
					undeclaredSemCheck.check();

					// may value, you need to check
					TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(pseudoValue, varDecInitCtx.simpleExpression());
					typeMMSemCheck.check();
				} 

				Scope scope = ScopeManager.getInstance().getScope();
				scope.addVariable(varDecInitCtx.IDENTIFIER().getText(), pseudoValue);
			
				System.out.println("lmao found a normie declaration");

			} else if (scopedVarDecCtx.arrayVariableDeclaration() != null) {

				ArrayVariableDeclarationContext arrVarDecCtx = scopedVarDecCtx.arrayVariableDeclaration();
				ArrayVariableDeclarationInitializeContext arrVarDecInitCtx = scopedVarDecCtx.arrayVariableDeclaration().arrayVariableDeclarationInitialize();

				PseudoArray pseudoArray = null;
				if (arrVarDecCtx.arrayTypeSpecifier().typeSpecifier().Int() != null) {
					pseudoArray = PseudoArray.createArray("int", arrVarDecInitCtx.IDENTIFIER().getText());
				} else if (arrVarDecCtx.arrayTypeSpecifier().typeSpecifier().Bool() != null) {
					pseudoArray = PseudoArray.createArray("bool", arrVarDecInitCtx.IDENTIFIER().getText());
				} else if (arrVarDecCtx.arrayTypeSpecifier().typeSpecifier().String() != null) {
					pseudoArray = PseudoArray.createArray("String", arrVarDecInitCtx.IDENTIFIER().getText());
				} else if (arrVarDecCtx.arrayTypeSpecifier().typeSpecifier().Float() != null) {
					pseudoArray = PseudoArray.createArray("float", arrVarDecInitCtx.IDENTIFIER().getText());
				}

				pseudoValue = new PseudoValue(pseudoArray, "array");
				
				if (pseudoValue != null && arrVarDecCtx.ConstantKey() != null) {
					pseudoValue.markConst();
				} 

				if (arrVarDecInitCtx.simpleExpression() != null) {
					TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(pseudoValue, arrVarDecInitCtx.simpleExpression());
					typeMMSemCheck.check();
				} else if (arrVarDecInitCtx.createArrayExpression() != null) {

					TypeSpecifierContext typeSpecifier = arrVarDecInitCtx.createArrayExpression().typeSpecifier();
					
					// if there is create type[]
					
					if ((arrVarDecCtx.arrayTypeSpecifier().typeSpecifier().Int() != null && typeSpecifier.Int() == null) || 
					(arrVarDecCtx.arrayTypeSpecifier().typeSpecifier().Float() != null && typeSpecifier.Float() == null) || 
					(arrVarDecCtx.arrayTypeSpecifier().typeSpecifier().String() != null && typeSpecifier.String() == null) ||
					(arrVarDecCtx.arrayTypeSpecifier().typeSpecifier().Bool() != null && typeSpecifier.Bool() == null) ) {
						Console.log("TypeMismatch Error at " + arrVarDecCtx.getStart().getLine() );
					}	 

				}

				Scope scope = ScopeManager.getInstance().getScope();
				scope.addVariable(arrVarDecInitCtx.IDENTIFIER().getText(), pseudoValue);

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