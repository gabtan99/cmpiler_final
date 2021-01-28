package model.semcheck;

import model.objects.*;
import model.Console;
import parser.PSCParser.FunctionDeclarationContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.*;


public class MultipleFuncSemCheck implements SemCheck {

	private FunctionDeclarationContext funcIdCtx;
	private int line;

	public MultipleFuncSemCheck(FunctionDeclarationContext funcIdCtx) {
		this.funcIdCtx = funcIdCtx;

		Token first = funcIdCtx.getStart();
		this.line = first.getLine();
	}

    @Override
	public void check() {

		if (funcIdCtx.IDENTIFIER() != null) {
			PseudoFunction pseudoFunction = ScopeManager.getInstance().getFunction(funcIdCtx.IDENTIFIER().getText());

			if (pseudoFunction != null) {
				Console.log("MultipleFuncDeclaration error at " + this.line);
			}
		}

	}

}