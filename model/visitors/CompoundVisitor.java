package model.visitors;

import parser.PSCParser.CompoundStmtContext;
import parser.PSCParser.CompoundStmtBodyContext;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;
import model.ScopeManager;

public class CompoundVisitor  {

    public CompoundVisitor() {

	}

    public void visit(CompoundStmtContext ctx) {
		
		System.out.println("lmao found a block HAHAHAHHAHA");
		List<CompoundStmtBodyContext> stmtList = ctx.compoundStmtBody();
        
		for (CompoundStmtBodyContext stmt : stmtList) {
			if (stmt.scopedVariableDeclaration() != null) {
				
				VarDeclaratorVisitor visitor = new VarDeclaratorVisitor();
				visitor.visit(stmt.scopedVariableDeclaration());
				System.out.println("Found local dec");
			} else if (stmt.statement() != null) {
				System.out.println("Found statement !");
			}
		}

		ScopeManager.getInstance().goToParent();
		System.out.println("Closed scope");
    }
    
}