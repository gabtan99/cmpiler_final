package model.visitors;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.ProgramContext;
import parser.PSCParser.TypeSpecifierContext;
import parser.PSCParser.FunctionDeclarationContext;
import parser.PSCParser.ParamsContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.ScopeManager;
import model.Scope;
import model.semcheck.MultipleFuncSemCheck;
import model.objects.*;

public class FuncDeclaratorVisitor implements ParseTreeListener {

    private PseudoFunction func = new PseudoFunction();

    public FuncDeclaratorVisitor() { }

    public void visit(FunctionDeclarationContext ctx) {
        
        ScopeManager sm = ScopeManager.getInstance();
        

        MultipleFuncSemCheck checker = new MultipleFuncSemCheck(ctx);
        checker.check();

        String id = ctx.IDENTIFIER().getText();
        func.setName(id);

        if (ctx.typeSpecifier() != null) {
            TypeSpecifierContext typeCtx = ctx.typeSpecifier();
            if (typeCtx.Bool()!= null){

            }
        } else if (ctx.arrayTypeSpecifier() != null) {

        } else if (ctx.Void() != null) {
            func.setReturnType(FunctionType.VOID);
        }

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, ctx);
    }

    @Override
	public void enterEveryRule(ParserRuleContext ctx) {

        if (ctx instanceof ParamsContext) {
            ParamsContext paramsCtx = (ParamsContext) ctx;
            ParameterVisitor visitor = new ParameterVisitor(func);
            visitor.visit(paramsCtx.parameter());
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