package model.semcheck;

import model.objects.*;
import model.Console;
import parser.PSCParser.SimpleExpressionContext;
import parser.PSCParser.ConstantContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.*;


public class TypeMismatchSemCheck implements SemCheck, ParseTreeListener {

    private static final String errorTemplate = "TypeMismatch error:  ";

    private PseudoValue pseudoValue;
    private SimpleExpressionContext exprCtx;
    private int line;

    public TypeMismatchSemCheck(PseudoValue pseudoValue, SimpleExpressionContext exprCtx) {
        this.pseudoValue = pseudoValue;
        this.exprCtx = exprCtx;

        Token first = exprCtx.getStart();
        this.line = first.getLine();
    }

    @Override
	public void check() {
		// ParseTreeWalker treeWalker = new ParseTreeWalker();
		// treeWalker.walk(this, this.exprCtx);
	}


    @Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if(ctx instanceof ConstantContext) {

			if(this.pseudoValue == null) {
				return;
			}

			ConstantContext constCtx = (ConstantContext) ctx;
			String expressionString = constCtx.getText();
			
			if(this.pseudoValue.getPrimitiveType() == PrimitiveType.ARRAY) {
				
			}
			else if(this.pseudoValue.getPrimitiveType() == PrimitiveType.BOOLEAN) {
				if(constCtx.BOOLCONSTANT() == null) {
					String msg = "Expected boolean at " + this.line;
					Console.log(errorTemplate + msg);
				}
			}
			else if(this.pseudoValue.getPrimitiveType() == PrimitiveType.INT) {
				if(constCtx.INTEGERCONSTANT() == null) {
					String msg = "Expected int at " + this.line;
					Console.log(errorTemplate + msg);
				}
			}
			else if(this.pseudoValue.getPrimitiveType() == PrimitiveType.FLOAT) {
				if(constCtx.FLOATCONSTANT() == null) {
					String msg = "Expected float at " + this.line;
					Console.log(errorTemplate + msg);
				}
			}
			else if(this.pseudoValue.getPrimitiveType() == PrimitiveType.STRING) {
				if(constCtx.StringLiteral() == null) {
					String msg = "Expected string at " + this.line;
					Console.log(errorTemplate + msg);
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