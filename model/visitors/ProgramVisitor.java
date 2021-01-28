package model.visitors;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.ProgramContext;
import parser.PSCParser.FunctionDeclarationContext;
import parser.PSCParser.MainProgramContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.ScopeManager;

public class ProgramVisitor implements ParseTreeListener {

    public ProgramVisitor() {}

    public void visit(ProgramContext ctx) {
        ScopeManager.getInstance();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, ctx);
    }

    @Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if(ctx instanceof FunctionDeclarationContext) {
            FunctionDeclarationContext funcCtx = (FunctionDeclarationContext) ctx;

			FuncDeclaratorVisitor visitor = new FuncDeclaratorVisitor();
            visitor.visit(funcCtx);
		} else if (ctx instanceof MainProgramContext) {
            MainProgramContext mainCtx = (MainProgramContext) ctx;

            MainVisitor visitor = new MainVisitor();
            visitor.visit(mainCtx);
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