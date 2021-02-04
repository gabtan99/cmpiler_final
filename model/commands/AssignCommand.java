package model.commands;

import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import parser.PSCParser.SimpleExpressionContext;
import parser.PSCParser.MutableContext;
import parser.PSCParser.ConstantContext;
import model.*;
import model.objects.*;
import model.semcheck.*;

public class AssignCommand implements Command, ParseTreeListener{

    private Scope scope; 
    private TerminalNode id;
    private MutableContext mutableCtx;
    private SimpleExpressionContext rhsCtx;
    private EvaluateCommand evalCommand;
    private String builder = "";
    private List<String> excluded = new ArrayList<>();
    
    public AssignCommand(MutableContext mutableCtx, SimpleExpressionContext rhsCtx) {
        this.rhsCtx = rhsCtx;
        this.id = mutableCtx.IDENTIFIER();
        this.mutableCtx = mutableCtx;
        this.scope = ScopeManager.getInstance().getScope();

        UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(rhsCtx);
        undeclaredSemCheck.check();

        PseudoValue pseudoValue = scope.getVariableAllScope(id.getText());

        if (mutableCtx.LeftBracket() != null && pseudoValue.getPrimitiveType() != PrimitiveType.ARRAY) {
            Console.log("Variable is not an array.", mutableCtx.getStart().getLine());
        }

        if (pseudoValue.getPrimitiveType() != PrimitiveType.ARRAY) {
            ConstantSemCheck constSemCheck = new ConstantSemCheck(this.id);
            constSemCheck.check();
        }

        if(mutableCtx.LeftBracket() != null && pseudoValue.getPrimitiveType() == PrimitiveType.ARRAY ) {

            PseudoArray pa = (PseudoArray) pseudoValue.getValue();
            
            TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(new PseudoValue(null, pa.getPrimitiveType()), rhsCtx);
            typeMMSemCheck.check();
        } else {
            // check if rhs is compatible with id type
            TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(pseudoValue, rhsCtx);
            typeMMSemCheck.check();
        }
       
        

        evalCommand = new EvaluateCommand(rhsCtx);
    }

    @Override
    public void execute() {
        
        if (mutableCtx.LeftBracket() != null) { // if an array
            
            EvaluateCommand arrEvalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
            arrEvalCommand.execute(); // lhs

            int arrIndex = arrEvalCommand.getEvaluated().intValue();

            PseudoValue pseudoValue = scope.getVariableAllScope(id.getText());
            System.out.println(pseudoValue.getValue().toString());
            PseudoArray pseudoArray = (PseudoArray) pseudoValue.getValue();

            if (pseudoArray.getPrimitiveType() == PrimitiveType.STRING) {
                ParseTreeWalker treeWalker = new ParseTreeWalker();
                treeWalker.walk(this, this.rhsCtx);

                if (pseudoArray.isInitialized()) {
                    PseudoValue curValue = pseudoArray.getValueAt(arrIndex);
                
                    if (curValue != null) {
                        curValue.setValue(this.builder);
                        pseudoArray.updateValueAt(curValue, arrIndex);
                    } else {
                        Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }
                    
                } else {
                    Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }
                
            } else {
                evalCommand.execute();  // rhs
                BigDecimal result = evalCommand.getEvaluated();

                if (pseudoArray.isInitialized()) {
                    PseudoValue curValue = pseudoArray.getValueAt(arrIndex);
                
                    if (curValue != null) {
                        Util.assignValue(curValue, result);
                        pseudoArray.updateValueAt(curValue, arrIndex);
                    } else {
                        Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }
                    
                } else {
                    Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }
            }
            
            

        } else { // if normal variable
            
            PseudoValue pseudoValue = scope.getVariableAllScope(id.getText());
            if (pseudoValue.getPrimitiveType() == PrimitiveType.STRING) {
                ParseTreeWalker treeWalker = new ParseTreeWalker();
                treeWalker.walk(this, this.rhsCtx);
                
                pseudoValue.setValue(builder);
            } else {
                evalCommand.execute();
                Util.assignValue(pseudoValue, evalCommand.getEvaluated());
            }
        }
        
    }

    
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

        if (ctx instanceof MutableContext) { ///str = str + arr[i]
            MutableContext mutableCtx  = (MutableContext) ctx;
            if (mutableCtx.LeftBracket() != null) { // if an array
                excluded.add(mutableCtx.getText());
                EvaluateCommand arrEvalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
                arrEvalCommand.execute(); // rhs
    
                int arrIndex = arrEvalCommand.getEvaluated().intValue();
    
                PseudoValue pseudoValue = scope.getVariableAllScope(mutableCtx.IDENTIFIER().getText());
                PseudoArray pseudoArray = (PseudoArray) pseudoValue.getValue();
    
                if (pseudoArray.isInitialized()) {
                    PseudoValue curValue = pseudoArray.getValueAt(arrIndex);
                
                    if (curValue != null) {
                        this.builder += curValue.getValue().toString();
                    } else {
                        Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }
                    
                } else {
                    Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }
                
                
            } else {
                PseudoValue pseudoValue = scope.getVariableAllScope(mutableCtx.IDENTIFIER().getText());
                if (!isInExcluded(mutableCtx.getText())){
                    this.builder += pseudoValue.getValue().toString();
                }
            }
            
        } else if (ctx instanceof ConstantContext) {
            ConstantContext constCtx  = (ConstantContext) ctx;
            if (!isInExcluded(constCtx.getText())){
                if (constCtx.StringLiteral()!= null) {
                    this.builder += constCtx.StringLiteral().getText().replaceAll("^\"+|\"+$", "");
                } else {
                    this.builder += constCtx.getText();
                } 
            }
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
    
    private boolean isInExcluded (String s) {
		boolean found = false;
		for (String ex: excluded){
			if (ex.contains(s)) {
				return true;
			}
		}
		return found;
	}



}