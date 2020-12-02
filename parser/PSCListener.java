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
}