package model.semcheck;


import model.objects.*;
import model.Console;
import parser.PSCParser.SimpleExpressionContext;
import parser.PSCParser.ConstantContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class KeywordUseSemCheck implements SemCheck, ParseTreeListener {

	private SimpleExpressionContext exprCtx;
	private int line;

	public ConstantSemCheck(SimpleExpressionContext exprCtx) {
		this.exprCtx = exprCtx;

		Token first = this.exprCtx.getStart();
		this.line = first.getLine();
	}

	

    @Override
	public void verify() {
		// ParseTreeWalker treeWalker = new ParseTreeWalker();
		// treeWalker.walk(this, this.exprCtx);
	}
}