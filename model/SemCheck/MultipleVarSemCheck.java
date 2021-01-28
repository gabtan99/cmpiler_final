package model.semcheck;

import model.objects.*;
import model.Console;
import parser.PSCParser.VariableDeclarationIdentifierContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class MultipleVarSemCheck implements SemCheck, ParseTreeListener {

	private VariableDeclarationIdentifierContext varIdCtx;
	private int line;

	public MultipleVarSemCheck (VariableDeclarationIdentifierContext varIdCtx) {
		this.varIdCtx = varIdCtx;

		Token first = this.varIdCtx.getStart();
		this.line = first.getLine();
	}

    @Override
	public void check() {
		// ParseTreeWalker treeWalker = new ParseTreeWalker();
		// treeWalker.walk(this, this.exprCtx);
	}


	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if(ctx instanceof VariableDeclarationIdentifierContext) {
			VariableDeclarationIdentifierContext varDecCtx = (VariableDeclarationIdentifierContext) ctx;
			
			if (ScopeManager.getInstance().searchMyScope(varDecCtx.IDENTIFIER().getText()) != null) {
				Console.log("MultipleVarDeclaration Error at " + this.line);
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