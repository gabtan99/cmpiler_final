// Generated from grammar/PSC.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ConstantKey=1, Int=2, Float=3, String=4, Bool=5, Main=6, Do=7, Else=8, 
		For=9, If=10, Then=11, Return=12, Void=13, While=14, Func=15, Create=16, 
		Print=17, Scan=18, LeftParen=19, RightParen=20, LeftBracket=21, RightBracket=22, 
		LeftBrace=23, RightBrace=24, Less=25, LessEqual=26, Greater=27, GreaterEqual=28, 
		Plus=29, Minus=30, Star=31, Div=32, AndAnd=33, OrOr=34, NotEqual=35, Not=36, 
		Colon=37, Semi=38, Comma=39, Equal=40, Assign=41, Dot=42, Ellipsis=43, 
		Up=44, Down=45, To=46, Upto=47, Downto=48, StringLiteral=49, INTEGERCONSTANT=50, 
		FLOATCONSTANT=51, BOOLCONSTANT=52, STRINGCONSTANT=53, IDENTIFIER=54, BlockComment=55, 
		LineComment=56, WS=57;
	public static final int
		RULE_program = 0, RULE_mainProgram = 1, RULE_mainProgramLeftParen = 2, 
		RULE_functionDeclarationList = 3, RULE_variableDeclaration = 4, RULE_scopedVariableDeclaration = 5, 
		RULE_variableDeclarationInitialize = 6, RULE_variableDeclarationIdentifier = 7, 
		RULE_typeSpecifier = 8, RULE_arrayTypeSpecifier = 9, RULE_arrayTypeLeftBracket = 10, 
		RULE_arrayVariableDeclaration = 11, RULE_arrayVariableDeclarationInitialize = 12, 
		RULE_arrayVariableDeclarationIdentifier = 13, RULE_typeSpecifierSelector = 14, 
		RULE_functionDeclaration = 15, RULE_params = 16, RULE_paramList = 17, 
		RULE_paramTypeList = 18, RULE_paramDeclarationIdentifier = 19, RULE_statement = 20, 
		RULE_statementList = 21, RULE_expressionStmt = 22, RULE_compoundStmt = 23, 
		RULE_localDeclarations = 24, RULE_scanStmt = 25, RULE_printStmt = 26, 
		RULE_printExpression = 27, RULE_printExpressionLeft = 28, RULE_printParams = 29, 
		RULE_printParamsList = 30, RULE_printParamsSelector = 31, RULE_selectionStmt = 32, 
		RULE_selectionCondition = 33, RULE_selectionLeftParen = 34, RULE_elseSelector = 35, 
		RULE_iterationStmt = 36, RULE_whileStatement = 37, RULE_forStatement = 38, 
		RULE_iterationToStatement = 39, RULE_loopDeclaration = 40, RULE_simpleAssignExpression = 41, 
		RULE_returnStmt = 42, RULE_returnStmtContainer = 43, RULE_assignmentStandaloneExpression = 44, 
		RULE_createArrayExpression = 45, RULE_arrayInitExpression = 46, RULE_arrayInitLeftBracket = 47, 
		RULE_simpleExpression = 48, RULE_andExpression = 49, RULE_unaryRelExpression = 50, 
		RULE_relExpression = 51, RULE_relOperator = 52, RULE_sumExpression = 53, 
		RULE_sumOperator = 54, RULE_mulExpression = 55, RULE_mulOperator = 56, 
		RULE_unaryExpression = 57, RULE_unaryOperator = 58, RULE_factor = 59, 
		RULE_mutable = 60, RULE_mutableLeftBracket = 61, RULE_immutable = 62, 
		RULE_immutableLeftParen = 63, RULE_call = 64, RULE_callLeftParen = 65, 
		RULE_arguments = 66, RULE_argumentList = 67, RULE_constant = 68;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainProgram", "mainProgramLeftParen", "functionDeclarationList", 
			"variableDeclaration", "scopedVariableDeclaration", "variableDeclarationInitialize", 
			"variableDeclarationIdentifier", "typeSpecifier", "arrayTypeSpecifier", 
			"arrayTypeLeftBracket", "arrayVariableDeclaration", "arrayVariableDeclarationInitialize", 
			"arrayVariableDeclarationIdentifier", "typeSpecifierSelector", "functionDeclaration", 
			"params", "paramList", "paramTypeList", "paramDeclarationIdentifier", 
			"statement", "statementList", "expressionStmt", "compoundStmt", "localDeclarations", 
			"scanStmt", "printStmt", "printExpression", "printExpressionLeft", "printParams", 
			"printParamsList", "printParamsSelector", "selectionStmt", "selectionCondition", 
			"selectionLeftParen", "elseSelector", "iterationStmt", "whileStatement", 
			"forStatement", "iterationToStatement", "loopDeclaration", "simpleAssignExpression", 
			"returnStmt", "returnStmtContainer", "assignmentStandaloneExpression", 
			"createArrayExpression", "arrayInitExpression", "arrayInitLeftBracket", 
			"simpleExpression", "andExpression", "unaryRelExpression", "relExpression", 
			"relOperator", "sumExpression", "sumOperator", "mulExpression", "mulOperator", 
			"unaryExpression", "unaryOperator", "factor", "mutable", "mutableLeftBracket", 
			"immutable", "immutableLeftParen", "call", "callLeftParen", "arguments", 
			"argumentList", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'constant'", "'int'", "'float'", "'String'", "'bool'", "'main'", 
			"'do'", "'else'", "'for'", "'if'", "'then'", "'return'", "'void'", "'while'", 
			"'func'", "'create'", "'print'", "'scan'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", 
			"'&&'", "'||'", "'!='", "'!'", "':'", "';'", "','", "'=='", "'='", "'.'", 
			"'...'", "'up'", "'down'", "'to'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ConstantKey", "Int", "Float", "String", "Bool", "Main", "Do", 
			"Else", "For", "If", "Then", "Return", "Void", "While", "Func", "Create", 
			"Print", "Scan", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"Plus", "Minus", "Star", "Div", "AndAnd", "OrOr", "NotEqual", "Not", 
			"Colon", "Semi", "Comma", "Equal", "Assign", "Dot", "Ellipsis", "Up", 
			"Down", "To", "Upto", "Downto", "StringLiteral", "INTEGERCONSTANT", "FLOATCONSTANT", 
			"BOOLCONSTANT", "STRINGCONSTANT", "IDENTIFIER", "BlockComment", "LineComment", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PSC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainProgramContext mainProgram() {
			return getRuleContext(MainProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PSCParser.EOF, 0); }
		public FunctionDeclarationListContext functionDeclarationList() {
			return getRuleContext(FunctionDeclarationListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Func) {
				{
				setState(138);
				functionDeclarationList(0);
				}
			}

			setState(141);
			mainProgram();
			setState(142);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainProgramContext extends ParserRuleContext {
		public MainProgramLeftParenContext mainProgramLeftParen() {
			return getRuleContext(MainProgramLeftParenContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public MainProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterMainProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitMainProgram(this);
		}
	}

	public final MainProgramContext mainProgram() throws RecognitionException {
		MainProgramContext _localctx = new MainProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			mainProgramLeftParen();
			setState(145);
			match(RightParen);
			setState(146);
			compoundStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainProgramLeftParenContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(PSCParser.Main, 0); }
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public MainProgramLeftParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProgramLeftParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterMainProgramLeftParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitMainProgramLeftParen(this);
		}
	}

	public final MainProgramLeftParenContext mainProgramLeftParen() throws RecognitionException {
		MainProgramLeftParenContext _localctx = new MainProgramLeftParenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainProgramLeftParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(Main);
			setState(149);
			match(LeftParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationListContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclarationListContext functionDeclarationList() {
			return getRuleContext(FunctionDeclarationListContext.class,0);
		}
		public FunctionDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterFunctionDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitFunctionDeclarationList(this);
		}
	}

	public final FunctionDeclarationListContext functionDeclarationList() throws RecognitionException {
		return functionDeclarationList(0);
	}

	private FunctionDeclarationListContext functionDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionDeclarationListContext _localctx = new FunctionDeclarationListContext(_ctx, _parentState);
		FunctionDeclarationListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_functionDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			functionDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_functionDeclarationList);
					setState(154);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(155);
					functionDeclaration();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public VariableDeclarationInitializeContext variableDeclarationInitialize() {
			return getRuleContext(VariableDeclarationInitializeContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PSCParser.Semi, 0); }
		public TerminalNode ConstantKey() { return getToken(PSCParser.ConstantKey, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ConstantKey) {
				{
				setState(161);
				match(ConstantKey);
				}
			}

			setState(164);
			typeSpecifier();
			setState(165);
			variableDeclarationInitialize();
			setState(166);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopedVariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArrayVariableDeclarationContext arrayVariableDeclaration() {
			return getRuleContext(ArrayVariableDeclarationContext.class,0);
		}
		public ScopedVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopedVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterScopedVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitScopedVariableDeclaration(this);
		}
	}

	public final ScopedVariableDeclarationContext scopedVariableDeclaration() throws RecognitionException {
		ScopedVariableDeclarationContext _localctx = new ScopedVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scopedVariableDeclaration);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				arrayVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationInitializeContext extends ParserRuleContext {
		public VariableDeclarationIdentifierContext variableDeclarationIdentifier() {
			return getRuleContext(VariableDeclarationIdentifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(PSCParser.Assign, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public VariableDeclarationInitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationInitialize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterVariableDeclarationInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitVariableDeclarationInitialize(this);
		}
	}

	public final VariableDeclarationInitializeContext variableDeclarationInitialize() throws RecognitionException {
		VariableDeclarationInitializeContext _localctx = new VariableDeclarationInitializeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclarationInitialize);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				variableDeclarationIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				variableDeclarationIdentifier();
				setState(174);
				match(Assign);
				setState(175);
				simpleExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public VariableDeclarationIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterVariableDeclarationIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitVariableDeclarationIdentifier(this);
		}
	}

	public final VariableDeclarationIdentifierContext variableDeclarationIdentifier() throws RecognitionException {
		VariableDeclarationIdentifierContext _localctx = new VariableDeclarationIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclarationIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PSCParser.Int, 0); }
		public TerminalNode Bool() { return getToken(PSCParser.Bool, 0); }
		public TerminalNode String() { return getToken(PSCParser.String, 0); }
		public TerminalNode Float() { return getToken(PSCParser.Float, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << String) | (1L << Bool))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeSpecifierContext extends ParserRuleContext {
		public ArrayTypeLeftBracketContext arrayTypeLeftBracket() {
			return getRuleContext(ArrayTypeLeftBracketContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PSCParser.RightBracket, 0); }
		public ArrayTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArrayTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArrayTypeSpecifier(this);
		}
	}

	public final ArrayTypeSpecifierContext arrayTypeSpecifier() throws RecognitionException {
		ArrayTypeSpecifierContext _localctx = new ArrayTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			arrayTypeLeftBracket();
			setState(184);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeLeftBracketContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PSCParser.LeftBracket, 0); }
		public ArrayTypeLeftBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTypeLeftBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArrayTypeLeftBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArrayTypeLeftBracket(this);
		}
	}

	public final ArrayTypeLeftBracketContext arrayTypeLeftBracket() throws RecognitionException {
		ArrayTypeLeftBracketContext _localctx = new ArrayTypeLeftBracketContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayTypeLeftBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			typeSpecifier();
			setState(187);
			match(LeftBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableDeclarationContext extends ParserRuleContext {
		public ArrayTypeSpecifierContext arrayTypeSpecifier() {
			return getRuleContext(ArrayTypeSpecifierContext.class,0);
		}
		public ArrayVariableDeclarationInitializeContext arrayVariableDeclarationInitialize() {
			return getRuleContext(ArrayVariableDeclarationInitializeContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PSCParser.Semi, 0); }
		public TerminalNode ConstantKey() { return getToken(PSCParser.ConstantKey, 0); }
		public ArrayVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArrayVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArrayVariableDeclaration(this);
		}
	}

	public final ArrayVariableDeclarationContext arrayVariableDeclaration() throws RecognitionException {
		ArrayVariableDeclarationContext _localctx = new ArrayVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ConstantKey) {
				{
				setState(189);
				match(ConstantKey);
				}
			}

			setState(192);
			arrayTypeSpecifier();
			setState(193);
			arrayVariableDeclarationInitialize();
			setState(194);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableDeclarationInitializeContext extends ParserRuleContext {
		public ArrayVariableDeclarationIdentifierContext arrayVariableDeclarationIdentifier() {
			return getRuleContext(ArrayVariableDeclarationIdentifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(PSCParser.Assign, 0); }
		public CreateArrayExpressionContext createArrayExpression() {
			return getRuleContext(CreateArrayExpressionContext.class,0);
		}
		public ArrayVariableDeclarationInitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclarationInitialize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArrayVariableDeclarationInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArrayVariableDeclarationInitialize(this);
		}
	}

	public final ArrayVariableDeclarationInitializeContext arrayVariableDeclarationInitialize() throws RecognitionException {
		ArrayVariableDeclarationInitializeContext _localctx = new ArrayVariableDeclarationInitializeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayVariableDeclarationInitialize);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				arrayVariableDeclarationIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				arrayVariableDeclarationIdentifier();
				setState(198);
				match(Assign);
				setState(199);
				createArrayExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableDeclarationIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public ArrayVariableDeclarationIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclarationIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArrayVariableDeclarationIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArrayVariableDeclarationIdentifier(this);
		}
	}

	public final ArrayVariableDeclarationIdentifierContext arrayVariableDeclarationIdentifier() throws RecognitionException {
		ArrayVariableDeclarationIdentifierContext _localctx = new ArrayVariableDeclarationIdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayVariableDeclarationIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierSelectorContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ArrayTypeSpecifierContext arrayTypeSpecifier() {
			return getRuleContext(ArrayTypeSpecifierContext.class,0);
		}
		public TypeSpecifierSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifierSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterTypeSpecifierSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitTypeSpecifierSelector(this);
		}
	}

	public final TypeSpecifierSelectorContext typeSpecifierSelector() throws RecognitionException {
		TypeSpecifierSelectorContext _localctx = new TypeSpecifierSelectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeSpecifierSelector);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				typeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				arrayTypeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Func() { return getToken(PSCParser.Func, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ArrayTypeSpecifierContext arrayTypeSpecifier() {
			return getRuleContext(ArrayTypeSpecifierContext.class,0);
		}
		public TerminalNode Void() { return getToken(PSCParser.Void, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Func);
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(210);
				typeSpecifier();
				}
				break;
			case 2:
				{
				setState(211);
				arrayTypeSpecifier();
				}
				break;
			case 3:
				{
				setState(212);
				match(Void);
				}
				break;
			}
			setState(215);
			match(IDENTIFIER);
			setState(216);
			match(LeftParen);
			setState(217);
			params();
			setState(218);
			match(RightParen);
			setState(219);
			compoundStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case String:
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				paramList(0);
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public ParamTypeListContext paramTypeList() {
			return getRuleContext(ParamTypeListContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PSCParser.Comma, 0); }
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		return paramList(0);
	}

	private ParamListContext paramList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamListContext _localctx = new ParamListContext(_ctx, _parentState);
		ParamListContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_paramList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			paramTypeList();
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_paramList);
					setState(228);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(229);
					match(Comma);
					setState(230);
					paramTypeList();
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamTypeListContext extends ParserRuleContext {
		public TypeSpecifierSelectorContext typeSpecifierSelector() {
			return getRuleContext(TypeSpecifierSelectorContext.class,0);
		}
		public ParamDeclarationIdentifierContext paramDeclarationIdentifier() {
			return getRuleContext(ParamDeclarationIdentifierContext.class,0);
		}
		public ParamTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterParamTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitParamTypeList(this);
		}
	}

	public final ParamTypeListContext paramTypeList() throws RecognitionException {
		ParamTypeListContext _localctx = new ParamTypeListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paramTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			typeSpecifierSelector();
			setState(237);
			paramDeclarationIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDeclarationIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public ParamDeclarationIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDeclarationIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterParamDeclarationIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitParamDeclarationIdentifier(this);
		}
	}

	public final ParamDeclarationIdentifierContext paramDeclarationIdentifier() throws RecognitionException {
		ParamDeclarationIdentifierContext _localctx = new ParamDeclarationIdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_paramDeclarationIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public ScanStmtContext scanStmt() {
			return getRuleContext(ScanStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public SelectionStmtContext selectionStmt() {
			return getRuleContext(SelectionStmtContext.class,0);
		}
		public IterationStmtContext iterationStmt() {
			return getRuleContext(IterationStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				expressionStmt();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				compoundStmt();
				}
				break;
			case Scan:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				scanStmt();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				printStmt();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				selectionStmt();
				}
				break;
			case For:
			case While:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				iterationStmt();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				returnStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		return statementList(0);
	}

	private StatementListContext statementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementListContext _localctx = new StatementListContext(_ctx, _parentState);
		StatementListContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_statementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(251);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementList);
					setState(253);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(254);
					statement();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionStmtContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PSCParser.Semi, 0); }
		public AssignmentStandaloneExpressionContext assignmentStandaloneExpression() {
			return getRuleContext(AssignmentStandaloneExpressionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitExpressionStmt(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(260);
				assignmentStandaloneExpression();
				}
				break;
			case 2:
				{
				setState(261);
				call();
				}
				break;
			}
			setState(264);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStmtContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(PSCParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PSCParser.RightBrace, 0); }
		public List<LocalDeclarationsContext> localDeclarations() {
			return getRuleContexts(LocalDeclarationsContext.class);
		}
		public LocalDeclarationsContext localDeclarations(int i) {
			return getRuleContext(LocalDeclarationsContext.class,i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterCompoundStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitCompoundStmt(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compoundStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(LeftBrace);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ConstantKey) | (1L << Int) | (1L << Float) | (1L << String) | (1L << Bool) | (1L << For) | (1L << If) | (1L << Return) | (1L << While) | (1L << Print) | (1L << Scan) | (1L << LeftBrace) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(269);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ConstantKey:
				case Int:
				case Float:
				case String:
				case Bool:
					{
					setState(267);
					localDeclarations(0);
					}
					break;
				case For:
				case If:
				case Return:
				case While:
				case Print:
				case Scan:
				case LeftBrace:
				case IDENTIFIER:
					{
					setState(268);
					statementList(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalDeclarationsContext extends ParserRuleContext {
		public ScopedVariableDeclarationContext scopedVariableDeclaration() {
			return getRuleContext(ScopedVariableDeclarationContext.class,0);
		}
		public LocalDeclarationsContext localDeclarations() {
			return getRuleContext(LocalDeclarationsContext.class,0);
		}
		public LocalDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterLocalDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitLocalDeclarations(this);
		}
	}

	public final LocalDeclarationsContext localDeclarations() throws RecognitionException {
		return localDeclarations(0);
	}

	private LocalDeclarationsContext localDeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LocalDeclarationsContext _localctx = new LocalDeclarationsContext(_ctx, _parentState);
		LocalDeclarationsContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_localDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(277);
			scopedVariableDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocalDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_localDeclarations);
					setState(279);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(280);
					scopedVariableDeclaration();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ScanStmtContext extends ParserRuleContext {
		public TerminalNode Scan() { return getToken(PSCParser.Scan, 0); }
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(PSCParser.StringLiteral, 0); }
		public TerminalNode Comma() { return getToken(PSCParser.Comma, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(PSCParser.Semi, 0); }
		public ScanStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterScanStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitScanStmt(this);
		}
	}

	public final ScanStmtContext scanStmt() throws RecognitionException {
		ScanStmtContext _localctx = new ScanStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_scanStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(Scan);
			setState(287);
			match(LeftParen);
			setState(288);
			match(StringLiteral);
			setState(289);
			match(Comma);
			setState(290);
			match(IDENTIFIER);
			setState(291);
			match(RightParen);
			setState(292);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(PSCParser.Print, 0); }
		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PSCParser.Semi, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Print);
			setState(295);
			printExpression();
			setState(296);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintExpressionContext extends ParserRuleContext {
		public PrintExpressionLeftContext printExpressionLeft() {
			return getRuleContext(PrintExpressionLeftContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitPrintExpression(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_printExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			printExpressionLeft();
			setState(299);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintExpressionLeftContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public PrintParamsContext printParams() {
			return getRuleContext(PrintParamsContext.class,0);
		}
		public PrintExpressionLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpressionLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterPrintExpressionLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitPrintExpressionLeft(this);
		}
	}

	public final PrintExpressionLeftContext printExpressionLeft() throws RecognitionException {
		PrintExpressionLeftContext _localctx = new PrintExpressionLeftContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_printExpressionLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(LeftParen);
			setState(302);
			printParams();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintParamsContext extends ParserRuleContext {
		public PrintParamsListContext printParamsList() {
			return getRuleContext(PrintParamsListContext.class,0);
		}
		public PrintParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterPrintParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitPrintParams(this);
		}
	}

	public final PrintParamsContext printParams() throws RecognitionException {
		PrintParamsContext _localctx = new PrintParamsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_printParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			printParamsList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintParamsListContext extends ParserRuleContext {
		public PrintParamsSelectorContext printParamsSelector() {
			return getRuleContext(PrintParamsSelectorContext.class,0);
		}
		public PrintParamsListContext printParamsList() {
			return getRuleContext(PrintParamsListContext.class,0);
		}
		public TerminalNode Plus() { return getToken(PSCParser.Plus, 0); }
		public PrintParamsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParamsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterPrintParamsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitPrintParamsList(this);
		}
	}

	public final PrintParamsListContext printParamsList() throws RecognitionException {
		return printParamsList(0);
	}

	private PrintParamsListContext printParamsList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrintParamsListContext _localctx = new PrintParamsListContext(_ctx, _parentState);
		PrintParamsListContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_printParamsList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(307);
			printParamsSelector();
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrintParamsListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_printParamsList);
					setState(309);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(310);
					match(Plus);
					setState(311);
					printParamsSelector();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintParamsSelectorContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(PSCParser.StringLiteral, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public PrintParamsSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParamsSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterPrintParamsSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitPrintParamsSelector(this);
		}
	}

	public final PrintParamsSelectorContext printParamsSelector() throws RecognitionException {
		PrintParamsSelectorContext _localctx = new PrintParamsSelectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_printParamsSelector);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				simpleExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStmtContext extends ParserRuleContext {
		public SelectionConditionContext selectionCondition() {
			return getRuleContext(SelectionConditionContext.class,0);
		}
		public TerminalNode Then() { return getToken(PSCParser.Then, 0); }
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public ElseSelectorContext elseSelector() {
			return getRuleContext(ElseSelectorContext.class,0);
		}
		public SelectionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterSelectionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitSelectionStmt(this);
		}
	}

	public final SelectionStmtContext selectionStmt() throws RecognitionException {
		SelectionStmtContext _localctx = new SelectionStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selectionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			selectionCondition();
			setState(322);
			match(Then);
			setState(323);
			compoundStmt();
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(324);
				elseSelector();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionConditionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PSCParser.If, 0); }
		public SelectionLeftParenContext selectionLeftParen() {
			return getRuleContext(SelectionLeftParenContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
		public SelectionConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterSelectionCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitSelectionCondition(this);
		}
	}

	public final SelectionConditionContext selectionCondition() throws RecognitionException {
		SelectionConditionContext _localctx = new SelectionConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selectionCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(If);
			setState(328);
			selectionLeftParen();
			setState(329);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionLeftParenContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SelectionLeftParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionLeftParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterSelectionLeftParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitSelectionLeftParen(this);
		}
	}

	public final SelectionLeftParenContext selectionLeftParen() throws RecognitionException {
		SelectionLeftParenContext _localctx = new SelectionLeftParenContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selectionLeftParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(LeftParen);
			setState(332);
			simpleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseSelectorContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PSCParser.Else, 0); }
		public TerminalNode Then() { return getToken(PSCParser.Then, 0); }
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public SelectionStmtContext selectionStmt() {
			return getRuleContext(SelectionStmtContext.class,0);
		}
		public ElseSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterElseSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitElseSelector(this);
		}
	}

	public final ElseSelectorContext elseSelector() throws RecognitionException {
		ElseSelectorContext _localctx = new ElseSelectorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseSelector);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(Else);
				setState(335);
				match(Then);
				setState(336);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(Else);
				setState(338);
				selectionStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStmtContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IterationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterIterationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitIterationStmt(this);
		}
	}

	public final IterationStmtContext iterationStmt() throws RecognitionException {
		IterationStmtContext _localctx = new IterationStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_iterationStmt);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				whileStatement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PSCParser.While, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public IterationToStatementContext iterationToStatement() {
			return getRuleContext(IterationToStatementContext.class,0);
		}
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(While);
			setState(346);
			match(IDENTIFIER);
			setState(347);
			iterationToStatement();
			setState(348);
			relExpression();
			setState(349);
			compoundStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PSCParser.For, 0); }
		public LoopDeclarationContext loopDeclaration() {
			return getRuleContext(LoopDeclarationContext.class,0);
		}
		public IterationToStatementContext iterationToStatement() {
			return getRuleContext(IterationToStatementContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(For);
			setState(352);
			loopDeclaration();
			setState(353);
			iterationToStatement();
			setState(354);
			simpleExpression(0);
			setState(355);
			compoundStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationToStatementContext extends ParserRuleContext {
		public TerminalNode Upto() { return getToken(PSCParser.Upto, 0); }
		public TerminalNode Downto() { return getToken(PSCParser.Downto, 0); }
		public IterationToStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationToStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterIterationToStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitIterationToStatement(this);
		}
	}

	public final IterationToStatementContext iterationToStatement() throws RecognitionException {
		IterationToStatementContext _localctx = new IterationToStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_iterationToStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==Upto || _la==Downto) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopDeclarationContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PSCParser.Int, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public SimpleAssignExpressionContext simpleAssignExpression() {
			return getRuleContext(SimpleAssignExpressionContext.class,0);
		}
		public LoopDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterLoopDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitLoopDeclaration(this);
		}
	}

	public final LoopDeclarationContext loopDeclaration() throws RecognitionException {
		LoopDeclarationContext _localctx = new LoopDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_loopDeclaration);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(Int);
				setState(360);
				match(IDENTIFIER);
				setState(361);
				simpleAssignExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(IDENTIFIER);
				setState(363);
				simpleAssignExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleAssignExpressionContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(PSCParser.Assign, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleAssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleAssignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterSimpleAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitSimpleAssignExpression(this);
		}
	}

	public final SimpleAssignExpressionContext simpleAssignExpression() throws RecognitionException {
		SimpleAssignExpressionContext _localctx = new SimpleAssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_simpleAssignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(Assign);
			setState(368);
			simpleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(PSCParser.Return, 0); }
		public ReturnStmtContainerContext returnStmtContainer() {
			return getRuleContext(ReturnStmtContainerContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PSCParser.Semi, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(Return);
			setState(371);
			returnStmtContainer();
			setState(372);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContainerContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ReturnStmtContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmtContainer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterReturnStmtContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitReturnStmtContainer(this);
		}
	}

	public final ReturnStmtContainerContext returnStmtContainer() throws RecognitionException {
		ReturnStmtContainerContext _localctx = new ReturnStmtContainerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_returnStmtContainer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			simpleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStandaloneExpressionContext extends ParserRuleContext {
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(PSCParser.Assign, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public CreateArrayExpressionContext createArrayExpression() {
			return getRuleContext(CreateArrayExpressionContext.class,0);
		}
		public AssignmentStandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStandaloneExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterAssignmentStandaloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitAssignmentStandaloneExpression(this);
		}
	}

	public final AssignmentStandaloneExpressionContext assignmentStandaloneExpression() throws RecognitionException {
		AssignmentStandaloneExpressionContext _localctx = new AssignmentStandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentStandaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			mutable();
			setState(377);
			match(Assign);
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Minus:
			case Not:
			case StringLiteral:
			case INTEGERCONSTANT:
			case FLOATCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				{
				setState(378);
				simpleExpression(0);
				}
				break;
			case Create:
				{
				setState(379);
				createArrayExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateArrayExpressionContext extends ParserRuleContext {
		public TerminalNode Create() { return getToken(PSCParser.Create, 0); }
		public ArrayInitExpressionContext arrayInitExpression() {
			return getRuleContext(ArrayInitExpressionContext.class,0);
		}
		public CreateArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createArrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterCreateArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitCreateArrayExpression(this);
		}
	}

	public final CreateArrayExpressionContext createArrayExpression() throws RecognitionException {
		CreateArrayExpressionContext _localctx = new CreateArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_createArrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(Create);
			setState(383);
			arrayInitExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitExpressionContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ArrayInitLeftBracketContext arrayInitLeftBracket() {
			return getRuleContext(ArrayInitLeftBracketContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PSCParser.RightBracket, 0); }
		public ArrayInitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArrayInitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArrayInitExpression(this);
		}
	}

	public final ArrayInitExpressionContext arrayInitExpression() throws RecognitionException {
		ArrayInitExpressionContext _localctx = new ArrayInitExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arrayInitExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			typeSpecifier();
			setState(386);
			arrayInitLeftBracket();
			setState(387);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitLeftBracketContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(PSCParser.LeftBracket, 0); }
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public ArrayInitLeftBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitLeftBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArrayInitLeftBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArrayInitLeftBracket(this);
		}
	}

	public final ArrayInitLeftBracketContext arrayInitLeftBracket() throws RecognitionException {
		ArrayInitLeftBracketContext _localctx = new ArrayInitLeftBracketContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrayInitLeftBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(LeftBracket);
			setState(390);
			relExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(PSCParser.OrOr, 0); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		return simpleExpression(0);
	}

	private SimpleExpressionContext simpleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, _parentState);
		SimpleExpressionContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_simpleExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(393);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
					setState(395);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(396);
					match(OrOr);
					setState(397);
					andExpression(0);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public UnaryRelExpressionContext unaryRelExpression() {
			return getRuleContext(UnaryRelExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(PSCParser.AndAnd, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			unaryRelExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(406);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(407);
					match(AndAnd);
					setState(408);
					unaryRelExpression();
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryRelExpressionContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(PSCParser.Not, 0); }
		public UnaryRelExpressionContext unaryRelExpression() {
			return getRuleContext(UnaryRelExpressionContext.class,0);
		}
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public UnaryRelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryRelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterUnaryRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitUnaryRelExpression(this);
		}
	}

	public final UnaryRelExpressionContext unaryRelExpression() throws RecognitionException {
		UnaryRelExpressionContext _localctx = new UnaryRelExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unaryRelExpression);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(Not);
				setState(415);
				unaryRelExpression();
				}
				break;
			case LeftParen:
			case Minus:
			case StringLiteral:
			case INTEGERCONSTANT:
			case FLOATCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				relExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpressionContext extends ParserRuleContext {
		public List<SumExpressionContext> sumExpression() {
			return getRuleContexts(SumExpressionContext.class);
		}
		public SumExpressionContext sumExpression(int i) {
			return getRuleContext(SumExpressionContext.class,i);
		}
		public RelOperatorContext relOperator() {
			return getRuleContext(RelOperatorContext.class,0);
		}
		public RelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitRelExpression(this);
		}
	}

	public final RelExpressionContext relExpression() throws RecognitionException {
		RelExpressionContext _localctx = new RelExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_relExpression);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				sumExpression(0);
				setState(420);
				relOperator();
				setState(421);
				sumExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				sumExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOperatorContext extends ParserRuleContext {
		public TerminalNode LessEqual() { return getToken(PSCParser.LessEqual, 0); }
		public TerminalNode Less() { return getToken(PSCParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PSCParser.Greater, 0); }
		public TerminalNode GreaterEqual() { return getToken(PSCParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(PSCParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(PSCParser.NotEqual, 0); }
		public RelOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterRelOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitRelOperator(this);
		}
	}

	public final RelOperatorContext relOperator() throws RecognitionException {
		RelOperatorContext _localctx = new RelOperatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual) | (1L << NotEqual) | (1L << Equal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumExpressionContext extends ParserRuleContext {
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public SumExpressionContext sumExpression() {
			return getRuleContext(SumExpressionContext.class,0);
		}
		public SumOperatorContext sumOperator() {
			return getRuleContext(SumOperatorContext.class,0);
		}
		public SumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterSumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitSumExpression(this);
		}
	}

	public final SumExpressionContext sumExpression() throws RecognitionException {
		return sumExpression(0);
	}

	private SumExpressionContext sumExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumExpressionContext _localctx = new SumExpressionContext(_ctx, _parentState);
		SumExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_sumExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(429);
			mulExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumExpression);
					setState(431);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(432);
					sumOperator();
					setState(433);
					mulExpression(0);
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SumOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(PSCParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PSCParser.Minus, 0); }
		public SumOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterSumOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitSumOperator(this);
		}
	}

	public final SumOperatorContext sumOperator() throws RecognitionException {
		SumOperatorContext _localctx = new SumOperatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sumOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public MulOperatorContext mulOperator() {
			return getRuleContext(MulOperatorContext.class,0);
		}
		public MulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitMulExpression(this);
		}
	}

	public final MulExpressionContext mulExpression() throws RecognitionException {
		return mulExpression(0);
	}

	private MulExpressionContext mulExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExpressionContext _localctx = new MulExpressionContext(_ctx, _parentState);
		MulExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_mulExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(443);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
					setState(445);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(446);
					mulOperator();
					setState(447);
					unaryExpression();
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulOperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(PSCParser.Star, 0); }
		public TerminalNode Div() { return getToken(PSCParser.Div, 0); }
		public MulOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterMulOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitMulOperator(this);
		}
	}

	public final MulOperatorContext mulOperator() throws RecognitionException {
		MulOperatorContext _localctx = new MulOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_mulOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==Star || _la==Div) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unaryExpression);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				unaryOperator();
				setState(457);
				unaryExpression();
				}
				break;
			case LeftParen:
			case StringLiteral:
			case INTEGERCONSTANT:
			case FLOATCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(PSCParser.Minus, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(Minus);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public ImmutableContext immutable() {
			return getRuleContext(ImmutableContext.class,0);
		}
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_factor);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				immutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				mutable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public MutableLeftBracketContext mutableLeftBracket() {
			return getRuleContext(MutableLeftBracketContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PSCParser.RightBracket, 0); }
		public MutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterMutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitMutable(this);
		}
	}

	public final MutableContext mutable() throws RecognitionException {
		MutableContext _localctx = new MutableContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_mutable);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(IDENTIFIER);
				setState(470);
				mutableLeftBracket();
				setState(471);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutableLeftBracketContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(PSCParser.LeftBracket, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public MutableLeftBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutableLeftBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterMutableLeftBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitMutableLeftBracket(this);
		}
	}

	public final MutableLeftBracketContext mutableLeftBracket() throws RecognitionException {
		MutableLeftBracketContext _localctx = new MutableLeftBracketContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_mutableLeftBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(LeftBracket);
			setState(476);
			simpleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmutableContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ImmutableLeftParenContext immutableLeftParen() {
			return getRuleContext(ImmutableLeftParenContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
		public ImmutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterImmutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitImmutable(this);
		}
	}

	public final ImmutableContext immutable() throws RecognitionException {
		ImmutableContext _localctx = new ImmutableContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_immutable);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				call();
				}
				break;
			case StringLiteral:
			case INTEGERCONSTANT:
			case FLOATCONSTANT:
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				constant();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				immutableLeftParen();
				setState(481);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmutableLeftParenContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ImmutableLeftParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutableLeftParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterImmutableLeftParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitImmutableLeftParen(this);
		}
	}

	public final ImmutableLeftParenContext immutableLeftParen() throws RecognitionException {
		ImmutableLeftParenContext _localctx = new ImmutableLeftParenContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_immutableLeftParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(LeftParen);
			setState(486);
			simpleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public CallLeftParenContext callLeftParen() {
			return getRuleContext(CallLeftParenContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(IDENTIFIER);
			setState(489);
			callLeftParen();
			setState(490);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallLeftParenContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallLeftParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callLeftParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterCallLeftParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitCallLeftParen(this);
		}
	}

	public final CallLeftParenContext callLeftParen() throws RecognitionException {
		CallLeftParenContext _localctx = new CallLeftParenContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_callLeftParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(LeftParen);
			setState(493);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_arguments);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Minus:
			case Not:
			case StringLiteral:
			case INTEGERCONSTANT:
			case FLOATCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				argumentList(0);
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PSCParser.Comma, 0); }
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		return argumentList(0);
	}

	private ArgumentListContext argumentList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, _parentState);
		ArgumentListContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_argumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(500);
			simpleExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentList);
					setState(502);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(503);
					match(Comma);
					setState(504);
					simpleExpression(0);
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode BOOLCONSTANT() { return getToken(PSCParser.BOOLCONSTANT, 0); }
		public TerminalNode INTEGERCONSTANT() { return getToken(PSCParser.INTEGERCONSTANT, 0); }
		public TerminalNode StringLiteral() { return getToken(PSCParser.StringLiteral, 0); }
		public TerminalNode FLOATCONSTANT() { return getToken(PSCParser.FLOATCONSTANT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << INTEGERCONSTANT) | (1L << FLOATCONSTANT) | (1L << BOOLCONSTANT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return functionDeclarationList_sempred((FunctionDeclarationListContext)_localctx, predIndex);
		case 17:
			return paramList_sempred((ParamListContext)_localctx, predIndex);
		case 21:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 24:
			return localDeclarations_sempred((LocalDeclarationsContext)_localctx, predIndex);
		case 30:
			return printParamsList_sempred((PrintParamsListContext)_localctx, predIndex);
		case 48:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		case 49:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 53:
			return sumExpression_sempred((SumExpressionContext)_localctx, predIndex);
		case 55:
			return mulExpression_sempred((MulExpressionContext)_localctx, predIndex);
		case 67:
			return argumentList_sempred((ArgumentListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean functionDeclarationList_sempred(FunctionDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean paramList_sempred(ParamListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean localDeclarations_sempred(LocalDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean printParamsList_sempred(PrintParamsListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sumExpression_sempred(SumExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExpression_sempred(MulExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean argumentList_sempred(ArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0203\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\5\2\u008e\n"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\u009f"+
		"\n\5\f\5\16\5\u00a2\13\5\3\6\5\6\u00a5\n\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7"+
		"\u00ad\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00b4\n\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\5\r\u00c1\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00cc\n\16\3\17\3\17\3\20\3\20\5\20\u00d2\n\20\3\21\3\21\3"+
		"\21\3\21\5\21\u00d8\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22"+
		"\u00e2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ea\n\23\f\23\16\23\u00ed"+
		"\13\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00fb\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u0102\n\27\f\27\16\27\u0105"+
		"\13\27\3\30\3\30\5\30\u0109\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u0110\n"+
		"\31\f\31\16\31\u0113\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u011c"+
		"\n\32\f\32\16\32\u011f\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \7 \u013b\n \f \16 \u013e\13 \3!\3!\5!\u0142\n!\3\"\3\"\3\"\3\""+
		"\5\"\u0148\n\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0156\n%\3&\3&\5"+
		"&\u015a\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3"+
		"*\3*\3*\5*\u0170\n*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\5.\u017f\n"+
		".\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u0191\n\62\f\62\16\62\u0194\13\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\7\63\u019c\n\63\f\63\16\63\u019f\13\63\3\64\3\64\3\64\5\64\u01a4"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u01ab\n\65\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u01b6\n\67\f\67\16\67\u01b9\13\67\38\38\39\3"+
		"9\39\39\39\39\39\79\u01c4\n9\f9\169\u01c7\139\3:\3:\3;\3;\3;\3;\5;\u01cf"+
		"\n;\3<\3<\3=\3=\5=\u01d5\n=\3>\3>\3>\3>\3>\5>\u01dc\n>\3?\3?\3?\3@\3@"+
		"\3@\3@\3@\5@\u01e6\n@\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3D\3D\5D\u01f4\nD"+
		"\3E\3E\3E\3E\3E\3E\7E\u01fc\nE\fE\16E\u01ff\13E\3F\3F\3F\2\f\b$,\62>b"+
		"dlp\u0088G\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\2\b\3\2\4\7\3\2\61\62\5\2\33\36%%**\3\2\37 \3\2!\"\3\2\63\66\2\u01e9"+
		"\2\u008d\3\2\2\2\4\u0092\3\2\2\2\6\u0096\3\2\2\2\b\u0099\3\2\2\2\n\u00a4"+
		"\3\2\2\2\f\u00ac\3\2\2\2\16\u00b3\3\2\2\2\20\u00b5\3\2\2\2\22\u00b7\3"+
		"\2\2\2\24\u00b9\3\2\2\2\26\u00bc\3\2\2\2\30\u00c0\3\2\2\2\32\u00cb\3\2"+
		"\2\2\34\u00cd\3\2\2\2\36\u00d1\3\2\2\2 \u00d3\3\2\2\2\"\u00e1\3\2\2\2"+
		"$\u00e3\3\2\2\2&\u00ee\3\2\2\2(\u00f1\3\2\2\2*\u00fa\3\2\2\2,\u00fc\3"+
		"\2\2\2.\u0108\3\2\2\2\60\u010c\3\2\2\2\62\u0116\3\2\2\2\64\u0120\3\2\2"+
		"\2\66\u0128\3\2\2\28\u012c\3\2\2\2:\u012f\3\2\2\2<\u0132\3\2\2\2>\u0134"+
		"\3\2\2\2@\u0141\3\2\2\2B\u0143\3\2\2\2D\u0149\3\2\2\2F\u014d\3\2\2\2H"+
		"\u0155\3\2\2\2J\u0159\3\2\2\2L\u015b\3\2\2\2N\u0161\3\2\2\2P\u0167\3\2"+
		"\2\2R\u016f\3\2\2\2T\u0171\3\2\2\2V\u0174\3\2\2\2X\u0178\3\2\2\2Z\u017a"+
		"\3\2\2\2\\\u0180\3\2\2\2^\u0183\3\2\2\2`\u0187\3\2\2\2b\u018a\3\2\2\2"+
		"d\u0195\3\2\2\2f\u01a3\3\2\2\2h\u01aa\3\2\2\2j\u01ac\3\2\2\2l\u01ae\3"+
		"\2\2\2n\u01ba\3\2\2\2p\u01bc\3\2\2\2r\u01c8\3\2\2\2t\u01ce\3\2\2\2v\u01d0"+
		"\3\2\2\2x\u01d4\3\2\2\2z\u01db\3\2\2\2|\u01dd\3\2\2\2~\u01e5\3\2\2\2\u0080"+
		"\u01e7\3\2\2\2\u0082\u01ea\3\2\2\2\u0084\u01ee\3\2\2\2\u0086\u01f3\3\2"+
		"\2\2\u0088\u01f5\3\2\2\2\u008a\u0200\3\2\2\2\u008c\u008e\5\b\5\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\5\4"+
		"\3\2\u0090\u0091\7\2\2\3\u0091\3\3\2\2\2\u0092\u0093\5\6\4\2\u0093\u0094"+
		"\7\26\2\2\u0094\u0095\5\60\31\2\u0095\5\3\2\2\2\u0096\u0097\7\b\2\2\u0097"+
		"\u0098\7\25\2\2\u0098\7\3\2\2\2\u0099\u009a\b\5\1\2\u009a\u009b\5 \21"+
		"\2\u009b\u00a0\3\2\2\2\u009c\u009d\f\3\2\2\u009d\u009f\5 \21\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\t\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\3\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8"+
		"\5\16\b\2\u00a8\u00a9\7(\2\2\u00a9\13\3\2\2\2\u00aa\u00ad\5\n\6\2\u00ab"+
		"\u00ad\5\30\r\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\r\3\2\2"+
		"\2\u00ae\u00b4\5\20\t\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\7+\2\2\u00b1"+
		"\u00b2\5b\62\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2"+
		"\2\2\u00b4\17\3\2\2\2\u00b5\u00b6\78\2\2\u00b6\21\3\2\2\2\u00b7\u00b8"+
		"\t\2\2\2\u00b8\23\3\2\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\7\30\2\2\u00bb"+
		"\25\3\2\2\2\u00bc\u00bd\5\22\n\2\u00bd\u00be\7\27\2\2\u00be\27\3\2\2\2"+
		"\u00bf\u00c1\7\3\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4\5\32\16\2\u00c4\u00c5\7(\2"+
		"\2\u00c5\31\3\2\2\2\u00c6\u00cc\5\34\17\2\u00c7\u00c8\5\34\17\2\u00c8"+
		"\u00c9\7+\2\2\u00c9\u00ca\5\\/\2\u00ca\u00cc\3\2\2\2\u00cb\u00c6\3\2\2"+
		"\2\u00cb\u00c7\3\2\2\2\u00cc\33\3\2\2\2\u00cd\u00ce\78\2\2\u00ce\35\3"+
		"\2\2\2\u00cf\u00d2\5\22\n\2\u00d0\u00d2\5\24\13\2\u00d1\u00cf\3\2\2\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\37\3\2\2\2\u00d3\u00d7\7\21\2\2\u00d4\u00d8"+
		"\5\22\n\2\u00d5\u00d8\5\24\13\2\u00d6\u00d8\7\17\2\2\u00d7\u00d4\3\2\2"+
		"\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\78\2\2\u00da\u00db\7\25\2\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\7\26\2\2"+
		"\u00dd\u00de\5\60\31\2\u00de!\3\2\2\2\u00df\u00e2\5$\23\2\u00e0\u00e2"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2#\3\2\2\2\u00e3"+
		"\u00e4\b\23\1\2\u00e4\u00e5\5&\24\2\u00e5\u00eb\3\2\2\2\u00e6\u00e7\f"+
		"\4\2\2\u00e7\u00e8\7)\2\2\u00e8\u00ea\5&\24\2\u00e9\u00e6\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec%\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\5(\25\2\u00f0\'"+
		"\3\2\2\2\u00f1\u00f2\78\2\2\u00f2)\3\2\2\2\u00f3\u00fb\5.\30\2\u00f4\u00fb"+
		"\5\60\31\2\u00f5\u00fb\5\64\33\2\u00f6\u00fb\5\66\34\2\u00f7\u00fb\5B"+
		"\"\2\u00f8\u00fb\5J&\2\u00f9\u00fb\5V,\2\u00fa\u00f3\3\2\2\2\u00fa\u00f4"+
		"\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb+\3\2\2\2\u00fc\u00fd\b\27\1\2"+
		"\u00fd\u00fe\5*\26\2\u00fe\u0103\3\2\2\2\u00ff\u0100\f\3\2\2\u0100\u0102"+
		"\5*\26\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104-\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0109\5Z.\2\u0107"+
		"\u0109\5\u0082B\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\7(\2\2\u010b/\3\2\2\2\u010c\u0111\7\31\2\2\u010d"+
		"\u0110\5\62\32\2\u010e\u0110\5,\27\2\u010f\u010d\3\2\2\2\u010f\u010e\3"+
		"\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\32\2\2\u0115\61\3\2\2"+
		"\2\u0116\u0117\b\32\1\2\u0117\u0118\5\f\7\2\u0118\u011d\3\2\2\2\u0119"+
		"\u011a\f\3\2\2\u011a\u011c\5\f\7\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\63\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u0120\u0121\7\24\2\2\u0121\u0122\7\25\2\2\u0122\u0123\7\63\2"+
		"\2\u0123\u0124\7)\2\2\u0124\u0125\78\2\2\u0125\u0126\7\26\2\2\u0126\u0127"+
		"\7(\2\2\u0127\65\3\2\2\2\u0128\u0129\7\23\2\2\u0129\u012a\58\35\2\u012a"+
		"\u012b\7(\2\2\u012b\67\3\2\2\2\u012c\u012d\5:\36\2\u012d\u012e\7\26\2"+
		"\2\u012e9\3\2\2\2\u012f\u0130\7\25\2\2\u0130\u0131\5<\37\2\u0131;\3\2"+
		"\2\2\u0132\u0133\5> \2\u0133=\3\2\2\2\u0134\u0135\b \1\2\u0135\u0136\5"+
		"@!\2\u0136\u013c\3\2\2\2\u0137\u0138\f\4\2\2\u0138\u0139\7\37\2\2\u0139"+
		"\u013b\5@!\2\u013a\u0137\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2"+
		"\2\u013c\u013d\3\2\2\2\u013d?\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0142"+
		"\7\63\2\2\u0140\u0142\5b\62\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2"+
		"\u0142A\3\2\2\2\u0143\u0144\5D#\2\u0144\u0145\7\r\2\2\u0145\u0147\5\60"+
		"\31\2\u0146\u0148\5H%\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"C\3\2\2\2\u0149\u014a\7\f\2\2\u014a\u014b\5F$\2\u014b\u014c\7\26\2\2\u014c"+
		"E\3\2\2\2\u014d\u014e\7\25\2\2\u014e\u014f\5b\62\2\u014fG\3\2\2\2\u0150"+
		"\u0151\7\n\2\2\u0151\u0152\7\r\2\2\u0152\u0156\5\60\31\2\u0153\u0154\7"+
		"\n\2\2\u0154\u0156\5B\"\2\u0155\u0150\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"I\3\2\2\2\u0157\u015a\5L\'\2\u0158\u015a\5N(\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015aK\3\2\2\2\u015b\u015c\7\20\2\2\u015c\u015d\78\2\2"+
		"\u015d\u015e\5P)\2\u015e\u015f\5h\65\2\u015f\u0160\5\60\31\2\u0160M\3"+
		"\2\2\2\u0161\u0162\7\13\2\2\u0162\u0163\5R*\2\u0163\u0164\5P)\2\u0164"+
		"\u0165\5b\62\2\u0165\u0166\5\60\31\2\u0166O\3\2\2\2\u0167\u0168\t\3\2"+
		"\2\u0168Q\3\2\2\2\u0169\u016a\7\4\2\2\u016a\u016b\78\2\2\u016b\u0170\5"+
		"T+\2\u016c\u016d\78\2\2\u016d\u0170\5T+\2\u016e\u0170\78\2\2\u016f\u0169"+
		"\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016e\3\2\2\2\u0170S\3\2\2\2\u0171"+
		"\u0172\7+\2\2\u0172\u0173\5b\62\2\u0173U\3\2\2\2\u0174\u0175\7\16\2\2"+
		"\u0175\u0176\5X-\2\u0176\u0177\7(\2\2\u0177W\3\2\2\2\u0178\u0179\5b\62"+
		"\2\u0179Y\3\2\2\2\u017a\u017b\5z>\2\u017b\u017e\7+\2\2\u017c\u017f\5b"+
		"\62\2\u017d\u017f\5\\/\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f"+
		"[\3\2\2\2\u0180\u0181\7\22\2\2\u0181\u0182\5^\60\2\u0182]\3\2\2\2\u0183"+
		"\u0184\5\22\n\2\u0184\u0185\5`\61\2\u0185\u0186\7\30\2\2\u0186_\3\2\2"+
		"\2\u0187\u0188\7\27\2\2\u0188\u0189\5h\65\2\u0189a\3\2\2\2\u018a\u018b"+
		"\b\62\1\2\u018b\u018c\5d\63\2\u018c\u0192\3\2\2\2\u018d\u018e\f\3\2\2"+
		"\u018e\u018f\7$\2\2\u018f\u0191\5d\63\2\u0190\u018d\3\2\2\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193c\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\b\63\1\2\u0196\u0197\5f\64\2\u0197\u019d\3"+
		"\2\2\2\u0198\u0199\f\3\2\2\u0199\u019a\7#\2\2\u019a\u019c\5f\64\2\u019b"+
		"\u0198\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019ee\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7&\2\2\u01a1\u01a4"+
		"\5f\64\2\u01a2\u01a4\5h\65\2\u01a3\u01a0\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"g\3\2\2\2\u01a5\u01a6\5l\67\2\u01a6\u01a7\5j\66\2\u01a7\u01a8\5l\67\2"+
		"\u01a8\u01ab\3\2\2\2\u01a9\u01ab\5l\67\2\u01aa\u01a5\3\2\2\2\u01aa\u01a9"+
		"\3\2\2\2\u01abi\3\2\2\2\u01ac\u01ad\t\4\2\2\u01adk\3\2\2\2\u01ae\u01af"+
		"\b\67\1\2\u01af\u01b0\5p9\2\u01b0\u01b7\3\2\2\2\u01b1\u01b2\f\4\2\2\u01b2"+
		"\u01b3\5n8\2\u01b3\u01b4\5p9\2\u01b4\u01b6\3\2\2\2\u01b5\u01b1\3\2\2\2"+
		"\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8m\3"+
		"\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\t\5\2\2\u01bbo\3\2\2\2\u01bc\u01bd"+
		"\b9\1\2\u01bd\u01be\5t;\2\u01be\u01c5\3\2\2\2\u01bf\u01c0\f\4\2\2\u01c0"+
		"\u01c1\5r:\2\u01c1\u01c2\5t;\2\u01c2\u01c4\3\2\2\2\u01c3\u01bf\3\2\2\2"+
		"\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6q\3"+
		"\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\t\6\2\2\u01c9s\3\2\2\2\u01ca\u01cb"+
		"\5v<\2\u01cb\u01cc\5t;\2\u01cc\u01cf\3\2\2\2\u01cd\u01cf\5x=\2\u01ce\u01ca"+
		"\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cfu\3\2\2\2\u01d0\u01d1\7 \2\2\u01d1w"+
		"\3\2\2\2\u01d2\u01d5\5~@\2\u01d3\u01d5\5z>\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5y\3\2\2\2\u01d6\u01dc\78\2\2\u01d7\u01d8\78\2\2\u01d8"+
		"\u01d9\5|?\2\u01d9\u01da\7\30\2\2\u01da\u01dc\3\2\2\2\u01db\u01d6\3\2"+
		"\2\2\u01db\u01d7\3\2\2\2\u01dc{\3\2\2\2\u01dd\u01de\7\27\2\2\u01de\u01df"+
		"\5b\62\2\u01df}\3\2\2\2\u01e0\u01e6\5\u0082B\2\u01e1\u01e6\5\u008aF\2"+
		"\u01e2\u01e3\5\u0080A\2\u01e3\u01e4\7\26\2\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01e0\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e6\177\3\2\2"+
		"\2\u01e7\u01e8\7\25\2\2\u01e8\u01e9\5b\62\2\u01e9\u0081\3\2\2\2\u01ea"+
		"\u01eb\78\2\2\u01eb\u01ec\5\u0084C\2\u01ec\u01ed\7\26\2\2\u01ed\u0083"+
		"\3\2\2\2\u01ee\u01ef\7\25\2\2\u01ef\u01f0\5\u0086D\2\u01f0\u0085\3\2\2"+
		"\2\u01f1\u01f4\5\u0088E\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4\u0087\3\2\2\2\u01f5\u01f6\bE\1\2\u01f6\u01f7\5b\62"+
		"\2\u01f7\u01fd\3\2\2\2\u01f8\u01f9\f\3\2\2\u01f9\u01fa\7)\2\2\u01fa\u01fc"+
		"\5b\62\2\u01fb\u01f8\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0089\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\t\7"+
		"\2\2\u0201\u008b\3\2\2\2&\u008d\u00a0\u00a4\u00ac\u00b3\u00c0\u00cb\u00d1"+
		"\u00d7\u00e1\u00eb\u00fa\u0103\u0108\u010f\u0111\u011d\u013c\u0141\u0147"+
		"\u0155\u0159\u016f\u017e\u0192\u019d\u01a3\u01aa\u01b7\u01c5\u01ce\u01d4"+
		"\u01db\u01e5\u01f3\u01fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}