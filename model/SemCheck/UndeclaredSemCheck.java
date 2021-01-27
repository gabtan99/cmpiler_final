package model.semcheck;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class UndeclaredSemCheck implements SemCheck, ParseTreeListener {

    @Override
	public void verify() {
		// ParseTreeWalker treeWalker = new ParseTreeWalker();
		// treeWalker.walk(this, this.exprCtx);
	}
}