package model.visitors;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PSCParser.ProgramContext;
import parser.PSCParser.TypeSpecifierContext;
import parser.PSCParser.ArrayTypeSpecifierContext;
import parser.PSCParser.FunctionDeclarationContext;
import parser.PSCParser.CompoundStmtContext;
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
    private boolean openedScope = false;

    public FuncDeclaratorVisitor() { }

    public void visit(FunctionDeclarationContext ctx) {
        
        ScopeManager sm = ScopeManager.getInstance();
        
        MultipleFuncSemCheck checker = new MultipleFuncSemCheck(ctx);
        checker.check();

        String id = ctx.IDENTIFIER().getText();
        func.setName(id);

        if (ctx.typeSpecifier() != null) {
            TypeSpecifierContext typeCtx = ctx.typeSpecifier();
            if (typeCtx.Int()!= null){
                func.setReturnType(FunctionType.INT);
            } else if (typeCtx.Bool()!= null){
                func.setReturnType(FunctionType.BOOLEAN);
            } else if (typeCtx.String()!= null){
                func.setReturnType(FunctionType.STRING);
            } else if (typeCtx.Float()!= null){
                func.setReturnType(FunctionType.FLOAT);
            }
        } else if (ctx.arrayTypeSpecifier() != null) {
            TypeSpecifierContext typeCtx = ctx.arrayTypeSpecifier().typeSpecifier();
            if (typeCtx.Int()!= null){
                func.setReturnType(FunctionType.INT, 1);
            } else if (typeCtx.Bool()!= null){
                func.setReturnType(FunctionType.BOOLEAN, 1);
            } else if (typeCtx.String()!= null){
                func.setReturnType(FunctionType.STRING, 1);
            } else if (typeCtx.Float()!= null){
                func.setReturnType(FunctionType.FLOAT, 1);
            }
        } else if (ctx.Void() != null) {
            func.setReturnType(FunctionType.VOID);
        }

        sm.addFunction(id, func);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, ctx);
    }

    @Override
	public void enterEveryRule(ParserRuleContext ctx) {

        if (ctx instanceof ParamsContext) {
            ParamsContext paramsCtx = (ParamsContext) ctx;

            func.getLocalScope().setParent(ScopeManager.getInstance().getScope());
            ScopeManager.getInstance().setScope(func.getLocalScope());

            if (paramsCtx.parameter() != null) {
                ParameterVisitor visitor = new ParameterVisitor(func);
                visitor.visit(paramsCtx.parameter());
            } 


        } else if (ctx instanceof CompoundStmtContext && !openedScope) {
            openedScope = true;

            CompoundStmtContext compoundCtx = (CompoundStmtContext) ctx;
		    System.out.println("Opened function scope");

            CompoundVisitor visitor = new CompoundVisitor();
			visitor.visit(compoundCtx);
        
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