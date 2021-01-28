package model.semcheck;

import model.objects.*;
import model.Console;
import parser.PSCParser.ArgumentListContext;
import parser.PSCParser.ArgumentsContext;
import parser.PSCParser.SimpleExpressionContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;


public class ParameterCountSemCheck implements SemCheck {
	
	private PseudoFunction pseudoFunction;
	private List<SimpleExpressionContext> exprCtxList;
	private int line;

	public ParameterCountSemCheck(PseudoFunction pseudoFunction, ArgumentsContext argsCtx) {
		this.pseudoFunction = pseudoFunction;

		if (argsCtx.argumentList() != null) {
			this.exprCtxList = argsCtx.argumentList().simpleExpression();
		}

		this.line = argsCtx.getStart().getLine();
	}

    @Override
	public void check() {
		
		if (this.pseudoFunction == null) {
			return;
		} else if (this.exprCtxList == null && this.pseudoFunction.getParameterCount() != 0) {
			Console.log("ParameterMismatch Error at line " + this.line);
		} else if (this.exprCtxList != null && this.pseudoFunction.getParameterCount() != this.exprCtxList.size() ) {
			Console.log("ParameterMismatch Error at line " + this.line);
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