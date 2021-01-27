package model.semcheck;

import model.objects.*;
import model.Console;
import parser.PSCParser.MutableContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class ConstantSemCheck implements SemCheck, ParseTreeListener {

	private MutableContext mutableCtx;
	private int line;

	public ConstantSemCheck(MutableContext mutableCtx) {
		this.mutableCtx = mutableCtx;

		Token first = this.mutableCtx.getStart();
		this.line = first.getLine();
	}


    @Override
	public void verify() {
		// ParseTreeWalker treeWalker = new ParseTreeWalker();
		// treeWalker.walk(this, this.exprCtx);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {

		if(ctx instanceof MutableContext) {
			MutableContext mutableCtx = (MutableContext) ctx;
			if(mutableCtx.LeftBracket() == null) { 

				PseudoValue pseudoValue = ScopeManager.getInstance().getScope().getVariable(mutableCtx.IDENTIFIER().getText());

				if (pseudoValue != null && pseudoValue.isConst()) {
					Console.log("ConstantReassignment Error at line " + this.line );
				}
			}
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}
}