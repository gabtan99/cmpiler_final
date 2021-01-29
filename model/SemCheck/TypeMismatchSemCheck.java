package model.semcheck;

import model.objects.*;
import model.Console;
import parser.PSCParser.SimpleExpressionContext;
import parser.PSCParser.ConstantContext;
import parser.PSCParser.MutableContext;
import parser.PSCParser.CallContext;
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
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.exprCtx);
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
		} else if (ctx instanceof MutableContext) {
			MutableContext mutCtx = (MutableContext) ctx;
			if (mutCtx.LeftBracket() == null){
				PseudoValue pv = ScopeManager.getInstance().searchMyScopeVariable(mutCtx.IDENTIFIER().getText());

				if( pv != null) {
					if(this.pseudoValue.getPrimitiveType() == PrimitiveType.ARRAY) {
						if (pv.getPrimitiveType() != PrimitiveType.ARRAY) {
							String msg = "Expected array at " + this.line;
							Console.log(errorTemplate + msg);
						} else {
							PseudoArray pa = (PseudoArray)this.pseudoValue.getValue();
							PseudoArray pa1 = (PseudoArray)pv.getValue();
							if(pa.getPrimitiveType() == PrimitiveType.BOOLEAN && pa1.getPrimitiveType() != PrimitiveType.BOOLEAN) {
								String msg = "Expected boolean array at " + this.line;
								Console.log(errorTemplate + msg);
							}
							else if(pa.getPrimitiveType() == PrimitiveType.INT && pa1.getPrimitiveType() != PrimitiveType.INT) {
								String msg = "Expected integer array at " + this.line;
								Console.log(errorTemplate + msg);
							}
							else if(pa.getPrimitiveType() == PrimitiveType.FLOAT && pa1.getPrimitiveType() != PrimitiveType.FLOAT) {
								String msg = "Expected float array at " + this.line;
								Console.log(errorTemplate + msg);
							}
							else if(pa.getPrimitiveType() == PrimitiveType.STRING && pa1.getPrimitiveType() != PrimitiveType.STRING) {
								String msg = "Expected String array at " + this.line;
								Console.log(errorTemplate + msg);
							}
						}
						
					}
					else if(this.pseudoValue.getPrimitiveType() == PrimitiveType.BOOLEAN && pv.getPrimitiveType() != PrimitiveType.BOOLEAN) {
						String msg = "Expected boolean at " + this.line;
						Console.log(errorTemplate + msg);
					}
					else if(this.pseudoValue.getPrimitiveType() == PrimitiveType.INT && pv.getPrimitiveType() != PrimitiveType.INT) {
						String msg = "Expected integer at " + this.line;
						Console.log(errorTemplate + msg);
					}
					else if(this.pseudoValue.getPrimitiveType() == PrimitiveType.FLOAT && pv.getPrimitiveType() != PrimitiveType.FLOAT) {
						String msg = "Expected float at " + this.line;
						Console.log(errorTemplate + msg);
					}
					else if(this.pseudoValue.getPrimitiveType() == PrimitiveType.STRING && pv.getPrimitiveType() != PrimitiveType.STRING) {
						String msg = "Expected String at " + this.line;
						Console.log(errorTemplate + msg);
					}
				}
			}

		} else if (ctx instanceof CallContext) {

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