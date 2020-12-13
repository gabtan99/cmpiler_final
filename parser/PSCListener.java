// Generated from grammar/PSC.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSCParser}.
 */
public interface PSCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PSCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PSCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(PSCParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(PSCParser.MainProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(PSCParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(PSCParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PSCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PSCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#functionDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationList(PSCParser.FunctionDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#functionDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationList(PSCParser.FunctionDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PSCParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PSCParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#scopedVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterScopedVariableDeclaration(PSCParser.ScopedVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#scopedVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitScopedVariableDeclaration(PSCParser.ScopedVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#variableDeclarationItems}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationItems(PSCParser.VariableDeclarationItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#variableDeclarationItems}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationItems(PSCParser.VariableDeclarationItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(PSCParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(PSCParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#variableDeclarationInitialize}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationInitialize(PSCParser.VariableDeclarationInitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#variableDeclarationInitialize}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationInitialize(PSCParser.VariableDeclarationInitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#variableDeclarationIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationIdentifier(PSCParser.VariableDeclarationIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#variableDeclarationIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationIdentifier(PSCParser.VariableDeclarationIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(PSCParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(PSCParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#arrayTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeSpecifier(PSCParser.ArrayTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#arrayTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeSpecifier(PSCParser.ArrayTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclaration(PSCParser.ArrayVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclaration(PSCParser.ArrayVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#arrayVariableDeclarationItems}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclarationItems(PSCParser.ArrayVariableDeclarationItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#arrayVariableDeclarationItems}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclarationItems(PSCParser.ArrayVariableDeclarationItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#arrayVariableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclarationList(PSCParser.ArrayVariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#arrayVariableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclarationList(PSCParser.ArrayVariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#arrayVariableDeclarationInitialize}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclarationInitialize(PSCParser.ArrayVariableDeclarationInitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#arrayVariableDeclarationInitialize}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclarationInitialize(PSCParser.ArrayVariableDeclarationInitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#arrayVariableDeclarationIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclarationIdentifier(PSCParser.ArrayVariableDeclarationIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#arrayVariableDeclarationIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclarationIdentifier(PSCParser.ArrayVariableDeclarationIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#typeSpecifierSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifierSelector(PSCParser.TypeSpecifierSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#typeSpecifierSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifierSelector(PSCParser.TypeSpecifierSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PSCParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PSCParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PSCParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PSCParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(PSCParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(PSCParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#paramTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParamTypeList(PSCParser.ParamTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#paramTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParamTypeList(PSCParser.ParamTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#paramDeclarationIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclarationIdentifier(PSCParser.ParamDeclarationIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#paramDeclarationIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclarationIdentifier(PSCParser.ParamDeclarationIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PSCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PSCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(PSCParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(PSCParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(PSCParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(PSCParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(PSCParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(PSCParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#localDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclarations(PSCParser.LocalDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#localDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclarations(PSCParser.LocalDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#scanStmt}.
	 * @param ctx the parse tree
	 */
	void enterScanStmt(PSCParser.ScanStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#scanStmt}.
	 * @param ctx the parse tree
	 */
	void exitScanStmt(PSCParser.ScanStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(PSCParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(PSCParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#printParams}.
	 * @param ctx the parse tree
	 */
	void enterPrintParams(PSCParser.PrintParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#printParams}.
	 * @param ctx the parse tree
	 */
	void exitPrintParams(PSCParser.PrintParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#printParamsList}.
	 * @param ctx the parse tree
	 */
	void enterPrintParamsList(PSCParser.PrintParamsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#printParamsList}.
	 * @param ctx the parse tree
	 */
	void exitPrintParamsList(PSCParser.PrintParamsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#printParamsSelector}.
	 * @param ctx the parse tree
	 */
	void enterPrintParamsSelector(PSCParser.PrintParamsSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#printParamsSelector}.
	 * @param ctx the parse tree
	 */
	void exitPrintParamsSelector(PSCParser.PrintParamsSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#selectionStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStmt(PSCParser.SelectionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#selectionStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStmt(PSCParser.SelectionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#elseSelector}.
	 * @param ctx the parse tree
	 */
	void enterElseSelector(PSCParser.ElseSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#elseSelector}.
	 * @param ctx the parse tree
	 */
	void exitElseSelector(PSCParser.ElseSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#iterationStmt}.
	 * @param ctx the parse tree
	 */
	void enterIterationStmt(PSCParser.IterationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#iterationStmt}.
	 * @param ctx the parse tree
	 */
	void exitIterationStmt(PSCParser.IterationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PSCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PSCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PSCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PSCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#loopDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLoopDeclaration(PSCParser.LoopDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#loopDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLoopDeclaration(PSCParser.LoopDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PSCParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PSCParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PSCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PSCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(PSCParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(PSCParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#createArrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterCreateArrayExpression(PSCParser.CreateArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#createArrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitCreateArrayExpression(PSCParser.CreateArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#arrayInitExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitExpression(PSCParser.ArrayInitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#arrayInitExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitExpression(PSCParser.ArrayInitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PSCParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PSCParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(PSCParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(PSCParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRelExpression(PSCParser.UnaryRelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRelExpression(PSCParser.UnaryRelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpression(PSCParser.RelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpression(PSCParser.RelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#relOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelOperator(PSCParser.RelOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#relOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelOperator(PSCParser.RelOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void enterSumExpression(PSCParser.SumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void exitSumExpression(PSCParser.SumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#sumOperator}.
	 * @param ctx the parse tree
	 */
	void enterSumOperator(PSCParser.SumOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#sumOperator}.
	 * @param ctx the parse tree
	 */
	void exitSumOperator(PSCParser.SumOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(PSCParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(PSCParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void enterMulOperator(PSCParser.MulOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void exitMulOperator(PSCParser.MulOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(PSCParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(PSCParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(PSCParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(PSCParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PSCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PSCParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterMutable(PSCParser.MutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitMutable(PSCParser.MutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#immutable}.
	 * @param ctx the parse tree
	 */
	void enterImmutable(PSCParser.ImmutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#immutable}.
	 * @param ctx the parse tree
	 */
	void exitImmutable(PSCParser.ImmutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(PSCParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(PSCParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(PSCParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(PSCParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PSCParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PSCParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PSCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PSCParser.ConstantContext ctx);
}