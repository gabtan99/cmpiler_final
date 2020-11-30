// Generated from grammar/PSC.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSCParser}.
 */
public interface PSCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(PSCParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(PSCParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(PSCParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(PSCParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(PSCParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(PSCParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(PSCParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(PSCParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(PSCParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(PSCParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(PSCParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(PSCParser.ArgumentExpressionListContext ctx);
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
	 * Enter a parse tree produced by {@link PSCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(PSCParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(PSCParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PSCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PSCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PSCParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PSCParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(PSCParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(PSCParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(PSCParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(PSCParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(PSCParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(PSCParser.EqualityExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link PSCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(PSCParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(PSCParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(PSCParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(PSCParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(PSCParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(PSCParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(PSCParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(PSCParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(PSCParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(PSCParser.ConditionalExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link PSCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(PSCParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(PSCParser.AssignmentOperatorContext ctx);
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
	 * Enter a parse tree produced by {@link PSCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(PSCParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(PSCParser.ConstantExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link PSCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(PSCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(PSCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(PSCParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(PSCParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(PSCParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(PSCParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(PSCParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(PSCParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(PSCParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(PSCParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(PSCParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(PSCParser.StorageClassSpecifierContext ctx);
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
	 * Enter a parse tree produced by {@link PSCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(PSCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(PSCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(PSCParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(PSCParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(PSCParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(PSCParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(PSCParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(PSCParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(PSCParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(PSCParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(PSCParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(PSCParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(PSCParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(PSCParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(PSCParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(PSCParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(PSCParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(PSCParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(PSCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(PSCParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(PSCParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(PSCParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(PSCParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(PSCParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(PSCParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(PSCParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(PSCParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(PSCParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(PSCParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(PSCParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(PSCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(PSCParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(PSCParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(PSCParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(PSCParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(PSCParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(PSCParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(PSCParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(PSCParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(PSCParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(PSCParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(PSCParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(PSCParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(PSCParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(PSCParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(PSCParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(PSCParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(PSCParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(PSCParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(PSCParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PSCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PSCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(PSCParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(PSCParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PSCParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PSCParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(PSCParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(PSCParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(PSCParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(PSCParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(PSCParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(PSCParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(PSCParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(PSCParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(PSCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(PSCParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(PSCParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(PSCParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(PSCParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(PSCParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(PSCParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(PSCParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(PSCParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(PSCParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(PSCParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(PSCParser.StaticAssertDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link PSCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(PSCParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(PSCParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PSCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PSCParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(PSCParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(PSCParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(PSCParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(PSCParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(PSCParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(PSCParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(PSCParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(PSCParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(PSCParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(PSCParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(PSCParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(PSCParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(PSCParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(PSCParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(PSCParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(PSCParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(PSCParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(PSCParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(PSCParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(PSCParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(PSCParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(PSCParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(PSCParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(PSCParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PSCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PSCParser.FunctionDefinitionContext ctx);
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
}