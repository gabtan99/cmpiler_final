package model.visitors;

import parser.PSCParser.CompoundStmtContext;
import parser.PSCParser.CompoundStmtBodyContext;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;
import model.ScopeManager;

public class CompoundVisitor  {

    public CompoundVisitor() { }

    public void visit(CompoundStmtContext ctx) {
		
		List<CompoundStmtBodyContext> stmtList = ctx.compoundStmtBody();
        
		for (CompoundStmtBodyContext stmt : stmtList) {

			if (stmt.scopedVariableDeclaration() != null) {
				
				System.out.println("Found local dec");
				VarDeclaratorVisitor visitor = new VarDeclaratorVisitor();
				visitor.visit(stmt.scopedVariableDeclaration());
			} else if (stmt.statement() != null) {
				
				System.out.println("Found statement !");
				StatementVisitor visitor = new StatementVisitor();
				visitor.visit(stmt.statement());
			}
		}

		ScopeManager.getInstance().goToParent();
		System.out.println("Closed scope");
    }
    
}