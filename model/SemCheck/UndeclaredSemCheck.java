package model.semcheck;

import model.objects.*;
import model.Console;
import parser.PSCParser.SimpleExpressionContext;
import parser.PSCParser.MutableContext;
import parser.PSCParser.CallContext;
import parser.PSCParser.ConstantContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class UndeclaredSemCheck implements SemCheck, ParseTreeListener {

	private SimpleExpressionContext simpleCtx;
	private int line;

	public UndeclaredSemCheck(SimpleExpressionContext simpleCtx) {
		this.simpleCtx = simpleCtx;

		Token first = this.simpleCtx.getStart();
		this.line = first.getLine();
	}


    @Override
	public void check() {
		// ParseTreeWalker treeWalker = new ParseTreeWalker();
		// treeWalker.walk(this, this.exprCtx);
	}


	@Override
	public void enterEveryRule(ParserRuleContext ctx) {

		if(ctx instanceof MutableContext) {
			MutableContext mutableCtx = (MutableContext) ctx;

			PseudoValue pseudoValue = ScopeManager.getInstance().getScope().getVariable(mutableCtx.IDENTIFIER().getText());

			if(pseudoValue == null) {
				Console.log("UndeclaredVariable Error at line " + this.line);
			}

		} else if (ctx instanceof CallContext) {

			CallContext callCtx = (CallContext) ctx;
			PseudoFunction pseudoFunction = ScopeManager.getInstance().getFunction(callCtx.IDENTIFIER().getText());

			if(pseudoFunction == null) {
				Console.log("UndeclaredFunction Error at line " + this.line);
			}
		}
	}

}