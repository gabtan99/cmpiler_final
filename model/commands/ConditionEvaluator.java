package model.commands;

import parser.PSCParser.SimpleExpressionContext;

import model.*;
import model.objects.*;
import model.semcheck.*;

public class ConditionEvaluator {

	// public static boolean evaluateCondition() {
		
		// ExpressionContext conditionExprCtx = parExprCtx.expression();
		
		// //catch rules if the if value has direct boolean flags
		// if(conditionExprCtx.getText().contains("(true)")) {
		// 	return true;
		// }
		// else if(conditionExprCtx.getText().contains("(false)")) {
		// 	return false;
		// }
		
		// EvaluationCommand evaluationCommand = new EvaluationCommand(conditionExprCtx);
		// evaluationCommand.execute();
		
		// int result = evaluationCommand.getResult().intValue();
		
		// //Console.log("Evaluating: " +conditionExprCtx.getText() + " Result: " +result);
		
		// return (result == 1);
	// }
	
	// public static boolean evaluateCondition() {
		
		// //catch rules if the if value has direct boolean flags
		// if(conditionExprCtx.getText().contains("(true)")) {
		// 	return true;
		// }
		// else if(conditionExprCtx.getText().contains("(false)")) {
		// 	return false;
		// }
		
		// EvaluationCommand evaluationCommand = new EvaluationCommand(conditionExprCtx);
		// evaluationCommand.execute();
		
		// int result = evaluationCommand.getResult().intValue();
		
		// return (result == 1);
	// }
}