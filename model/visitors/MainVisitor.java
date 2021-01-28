package model.visitors;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.MainProgramContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.ScopeManager;

public class MainVisitor implements ParseTreeListener {

    public MainVisitor() {}

    public void visit(MainProgramContext ctx) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, ctx);
    }

    @Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if(ctx instanceof MainProgramContext) {
            System.out.println("lmao found main");
            // block visitor
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