package model.visitors;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.ParamsContext;
import parser.PSCParser.ParameterContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.objects.*;
import model.ScopeManager;
import model.Scope;
import model.semcheck.MultipleFuncSemCheck;

public class ParameterVisitor implements ParseTreeListener {

    private PseudoFunction func;

    public ParameterVisitor(PseudoFunction func) {
        this.func = func;
    }

    public void visit(List<ParameterContext> params) {
        
        for (ParameterContext p : params) {
            System.out.println(p.IDENTIFIER().getText());
        }
        
    
        // ParseTreeWalker walker = new ParseTreeWalker();
        // walker.walk(this, ctx);
    }

    @Override
	public void enterEveryRule(ParserRuleContext ctx) {

        if (ctx instanceof ParamsContext) {
            
        }

	    System.out.println("Pumasok ako");
		
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