package model.semcheck;

import model.objects.*;
import model.Console;
import parser.PSCParser.MutableContext;
import parser.PSCParser.SimpleExpressionContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.*;

public class ConstantSemCheck implements SemCheck, ParseTreeListener {

	private MutableContext mutableCtx;
	private int line;

	public ConstantSemCheck(MutableContext mutableCtx) {
		this.mutableCtx = mutableCtx;

		Token first = this.mutableCtx.getStart();
		this.line = first.getLine();
	}


    @Override
	public void check() {
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.mutableCtx);
	}


	@Override
	public void enterEveryRule(ParserRuleContext ctx) {

		if(ctx instanceof MutableContext) {
			MutableContext mutableCtx = (MutableContext) ctx;
			if(mutableCtx.LeftBracket() == null) { 
				PseudoValue pseudoValue = ScopeManager.getInstance().searchMyScopeVariable(mutableCtx.IDENTIFIER().getText());

				if (pseudoValue != null && pseudoValue.isConst()) {
					Console.log("ConstantReassignment Error ", this.line);
				}
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