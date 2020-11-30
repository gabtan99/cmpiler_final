// Generated from grammar/PSC.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSCParser}.
 */
public interface PSCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSCParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(PSCParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(PSCParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#declr}.
	 * @param ctx the parse tree
	 */
	void enterDeclr(PSCParser.DeclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#declr}.
	 * @param ctx the parse tree
	 */
	void exitDeclr(PSCParser.DeclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PSCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PSCParser.ExprContext ctx);
}