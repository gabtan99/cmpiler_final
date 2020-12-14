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
		public List<FunctionDeclarationListContext> functionDeclarationList() {
			return getRuleContexts(FunctionDeclarationListContext.class);
		}
		public FunctionDeclarationListContext functionDeclarationList(int i) {
			return getRuleContext(FunctionDeclarationListContext.class,i);
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
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Func) {
					{
					setState(144);
					functionDeclarationList(0);
					}
				}

				setState(147);
				match(EOF);
				notifyErrorListeners("Missing main() function required to run programs.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Func) {
					{
					setState(149);
					functionDeclarationList(0);
					}
				}

				setState(152);
				mainProgram();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Func) {
					{
					setState(153);
					functionDeclarationList(0);
					}
				}

				setState(156);
				match(EOF);
				notifyErrorListeners("Function declarations should be made before the main() function.");
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				mainProgramLeftParen();
				setState(162);
				match(RightParen);
				setState(163);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				mainProgramLeftParen();
				notifyErrorListeners("Expecting ')' after '('.");
				setState(167);
				compoundStmt();
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(Main);
				setState(172);
				match(LeftParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(Main);
				notifyErrorListeners("Expected '(' after main.");
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
			setState(178);
			functionDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_functionDeclarationList);
					setState(180);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(181);
					functionDeclaration();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ConstantKey) {
					{
					setState(187);
					match(ConstantKey);
					}
				}

				setState(190);
				typeSpecifier();
				setState(191);
				variableDeclarationInitialize();
				setState(192);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ConstantKey) {
					{
					setState(194);
					match(ConstantKey);
					}
				}

				setState(197);
				typeSpecifier();
				setState(198);
				variableDeclarationInitialize();
				notifyErrorListeners("Missing semicolon ';'.");
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				variableDeclarationIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				variableDeclarationIdentifier();
				setState(209);
				match(Assign);
				setState(210);
				simpleExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				variableDeclarationIdentifier();
				notifyErrorListeners("Missing assignment '=' operator.");
				setState(214);
				simpleExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				simpleExpression(0);
				notifyErrorListeners("Consider adding variable declarator to complete the declaration.");
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
			setState(221);
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
			setState(223);
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
		public List<TerminalNode> RightBracket() { return getTokens(PSCParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(PSCParser.RightBracket, i);
		}
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
			int _alt;
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				arrayTypeLeftBracket();
				setState(226);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				arrayTypeLeftBracket();
				notifyErrorListeners("Expecting a closing bracket ']'.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				arrayTypeLeftBracket();
				setState(232);
				match(RightBracket);
				setState(234); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(233);
						match(RightBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(236); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Extra bracket/s found.");
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
			setState(242);
			typeSpecifier();
			setState(243);
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ConstantKey) {
					{
					setState(245);
					match(ConstantKey);
					}
				}

				setState(248);
				arrayTypeSpecifier();
				setState(249);
				arrayVariableDeclarationInitialize();
				setState(250);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing semicolon ';'.");
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ConstantKey) {
					{
					setState(253);
					match(ConstantKey);
					}
				}

				setState(256);
				arrayTypeSpecifier();
				setState(257);
				arrayVariableDeclarationInitialize();
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				arrayVariableDeclarationIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				arrayVariableDeclarationIdentifier();
				setState(263);
				match(Assign);
				setState(264);
				createArrayExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				arrayVariableDeclarationIdentifier();
				notifyErrorListeners("Missing assignment '=' operator.");
				setState(268);
				createArrayExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				createArrayExpression();
				notifyErrorListeners("Consider adding array variable declarator to complete the declaration.");
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
			setState(275);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				typeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PSCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PSCParser.IDENTIFIER, i);
		}
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<ArrayTypeSpecifierContext> arrayTypeSpecifier() {
			return getRuleContexts(ArrayTypeSpecifierContext.class);
		}
		public ArrayTypeSpecifierContext arrayTypeSpecifier(int i) {
			return getRuleContext(ArrayTypeSpecifierContext.class,i);
		}
		public List<TerminalNode> Void() { return getTokens(PSCParser.Void); }
		public TerminalNode Void(int i) {
			return getToken(PSCParser.Void, i);
		}
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
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(Func);
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(282);
					typeSpecifier();
					}
					break;
				case 2:
					{
					setState(283);
					arrayTypeSpecifier();
					}
					break;
				case 3:
					{
					setState(284);
					match(Void);
					}
					break;
				}
				setState(287);
				match(IDENTIFIER);
				setState(288);
				match(LeftParen);
				setState(289);
				params();
				setState(290);
				match(RightParen);
				setState(291);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(Func);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(294);
					typeSpecifier();
					}
					break;
				case 2:
					{
					setState(295);
					arrayTypeSpecifier();
					}
					break;
				case 3:
					{
					setState(296);
					match(Void);
					}
					break;
				}
				notifyErrorListeners("Missing function name.");
				setState(300);
				match(LeftParen);
				setState(301);
				params();
				setState(302);
				match(RightParen);
				setState(303);
				compoundStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(Func);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(306);
					typeSpecifier();
					}
					break;
				case 2:
					{
					setState(307);
					arrayTypeSpecifier();
					}
					break;
				case 3:
					{
					setState(308);
					match(Void);
					}
					break;
				}
				notifyErrorListeners("Function cannot have multiple return types.");
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(312);
						typeSpecifier();
						}
						break;
					case 2:
						{
						setState(313);
						arrayTypeSpecifier();
						}
						break;
					case 3:
						{
						setState(314);
						match(Void);
						}
						break;
					}
					}
					setState(317); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << String) | (1L << Bool) | (1L << Void))) != 0) );
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(319);
					match(IDENTIFIER);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(LeftParen);
				setState(326);
				params();
				setState(327);
				match(RightParen);
				setState(328);
				compoundStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(Func);
				notifyErrorListeners("Missing function return type.");
				setState(332);
				match(IDENTIFIER);
				setState(333);
				match(LeftParen);
				setState(334);
				params();
				setState(335);
				match(RightParen);
				setState(336);
				compoundStmt();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamListContext> paramList() {
			return getRuleContexts(ParamListContext.class);
		}
		public ParamListContext paramList(int i) {
			return getRuleContext(ParamListContext.class,i);
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
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				paramList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				paramList(0);
				notifyErrorListeners("Multiple declarations should be separated by commas ','.");
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(343);
					paramList(0);
					}
					}
					setState(346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << String) | (1L << Bool))) != 0) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			setState(352);
			paramTypeList();
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_paramList);
					setState(354);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(355);
					match(Comma);
					setState(356);
					paramTypeList();
					}
					} 
				}
				setState(361);
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
			setState(362);
			typeSpecifierSelector();
			setState(363);
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
			setState(365);
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
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semi:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				expressionStmt();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				compoundStmt();
				}
				break;
			case Scan:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				scanStmt();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				printStmt();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
				selectionStmt();
				}
				break;
			case For:
			case While:
				enterOuterAlt(_localctx, 6);
				{
				setState(372);
				iterationStmt();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 7);
				{
				setState(373);
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
			setState(377);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementList);
					setState(379);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(380);
					statement();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(386);
					assignmentStandaloneExpression();
					}
					break;
				case 2:
					{
					setState(387);
					call();
					}
					break;
				}
				setState(390);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(392);
					assignmentStandaloneExpression();
					}
					break;
				case 2:
					{
					setState(393);
					call();
					}
					break;
				}
				notifyErrorListeners("Missing semicolon ';'.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(Semi);
				notifyErrorListeners("Extraneous semicolon ';' found.");
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

	public static class CompoundStmtContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(PSCParser.LeftBrace, 0); }
		public List<TerminalNode> RightBrace() { return getTokens(PSCParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(PSCParser.RightBrace, i);
		}
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
			int _alt;
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(LeftBrace);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ConstantKey) | (1L << Int) | (1L << Float) | (1L << String) | (1L << Bool) | (1L << For) | (1L << If) | (1L << Return) | (1L << While) | (1L << Print) | (1L << Scan) | (1L << LeftBrace) | (1L << Semi) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ConstantKey:
					case Int:
					case Float:
					case String:
					case Bool:
						{
						setState(403);
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
					case Semi:
					case IDENTIFIER:
						{
						setState(404);
						statementList(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(410);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(LeftBrace);
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(414);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ConstantKey:
						case Int:
						case Float:
						case String:
						case Bool:
							{
							setState(412);
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
						case Semi:
						case IDENTIFIER:
							{
							setState(413);
							statementList(0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(418);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				notifyErrorListeners("Missing closing bracket.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(LeftBrace);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ConstantKey) | (1L << Int) | (1L << Float) | (1L << String) | (1L << Bool) | (1L << For) | (1L << If) | (1L << Return) | (1L << While) | (1L << Print) | (1L << Scan) | (1L << LeftBrace) | (1L << Semi) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(423);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ConstantKey:
					case Int:
					case Float:
					case String:
					case Bool:
						{
						setState(421);
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
					case Semi:
					case IDENTIFIER:
						{
						setState(422);
						statementList(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
				match(RightBrace);
				setState(430); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(429);
						match(RightBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(432); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Extra bracket found.");
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
			setState(438);
			scopedVariableDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocalDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_localDeclarations);
					setState(440);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(441);
					scopedVariableDeclaration();
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(Scan);
				setState(448);
				match(LeftParen);
				setState(449);
				match(StringLiteral);
				setState(450);
				match(Comma);
				setState(451);
				match(IDENTIFIER);
				setState(452);
				match(RightParen);
				setState(453);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(Scan);
				setState(455);
				match(LeftParen);
				setState(456);
				match(StringLiteral);
				setState(457);
				match(Comma);
				setState(458);
				match(IDENTIFIER);
				setState(459);
				match(RightParen);
				notifyErrorListeners("Missing semicolon ';'.");
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
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(Print);
				setState(464);
				printExpression();
				setState(465);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(Print);
				notifyErrorListeners("Missing parenthesis and print parameters for complete print statement.");
				setState(469);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(Print);
				setState(471);
				printExpression();
				notifyErrorListeners("Missing semicolon ';'.");
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

	public static class PrintExpressionContext extends ParserRuleContext {
		public PrintExpressionLeftContext printExpressionLeft() {
			return getRuleContext(PrintExpressionLeftContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PSCParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PSCParser.RightParen, i);
		}
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
			int _alt;
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				printExpressionLeft();
				setState(477);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				printExpressionLeft();
				setState(480);
				match(RightParen);
				setState(482); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(481);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(484); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant closing parenthesis')'.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				printExpressionLeft();
				notifyErrorListeners("Expecting a closing parenthesis ')'.");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(LeftParen);
				setState(495);
				printParams();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				printParams();
				notifyErrorListeners("Expecting '(' after print.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				match(LeftParen);
				notifyErrorListeners("Expecting at least one parameter for printing.");
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

	public static class PrintParamsContext extends ParserRuleContext {
		public List<PrintParamsListContext> printParamsList() {
			return getRuleContexts(PrintParamsListContext.class);
		}
		public PrintParamsListContext printParamsList(int i) {
			return getRuleContext(PrintParamsListContext.class,i);
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
			int _alt;
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				printParamsList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Multiple print parameters should be concatenated by plus symbols '+'. Unless you meant this to be a string literal, then missing double quotes");
				setState(505);
				printParamsList(0);
				setState(507); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(506);
						printParamsList(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(509); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PrintParamsListContext extends ParserRuleContext {
		public PrintParamsSelectorContext printParamsSelector() {
			return getRuleContext(PrintParamsSelectorContext.class,0);
		}
		public TerminalNode Plus() { return getToken(PSCParser.Plus, 0); }
		public PrintParamsListContext printParamsList() {
			return getRuleContext(PrintParamsListContext.class,0);
		}
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
			setState(518);
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
				setState(514);
				printParamsSelector();
				}
				break;
			case Plus:
				{
				notifyErrorListeners("Extraneous '+' found / Expecting another print parameter.");
				setState(516);
				match(Plus);
				setState(517);
				printParamsList(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(526);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new PrintParamsListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_printParamsList);
						setState(520);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(521);
						match(Plus);
						setState(522);
						printParamsSelector();
						}
						break;
					case 2:
						{
						_localctx = new PrintParamsListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_printParamsList);
						setState(523);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(524);
						match(Plus);
						notifyErrorListeners("Extraneous '+' found / Expecting another print parameter.");
						}
						break;
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
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
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				selectionCondition();
				setState(536);
				match(Then);
				setState(537);
				compoundStmt();
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(538);
					elseSelector();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				selectionCondition();
				notifyErrorListeners("Missing 'then' keyword.");
				setState(543);
				compoundStmt();
				setState(545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(544);
					elseSelector();
					}
					break;
				}
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

	public static class SelectionConditionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PSCParser.If, 0); }
		public SelectionLeftParenContext selectionLeftParen() {
			return getRuleContext(SelectionLeftParenContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PSCParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PSCParser.RightParen, i);
		}
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
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(If);
				setState(550);
				selectionLeftParen();
				setState(551);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(If);
				setState(554);
				selectionLeftParen();
				setState(555);
				match(RightParen);
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(556);
					match(RightParen);
					}
					}
					setState(559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				notifyErrorListeners("Redundant closing parenthesis')'.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				match(If);
				setState(564);
				selectionLeftParen();
				notifyErrorListeners("Expecting a closing parenthesis ')'.");
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
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(LeftParen);
				setState(570);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				simpleExpression(0);
				notifyErrorListeners("Expected '(' after if.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(LeftParen);
				notifyErrorListeners("Expecting an expression for evaluation.");
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
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(Else);
				setState(579);
				match(Then);
				setState(580);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(Else);
				setState(582);
				selectionStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				match(Else);
				notifyErrorListeners("Missing 'then' keyword after 'else'.");
				setState(585);
				compoundStmt();
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
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				whileStatement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
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
			setState(592);
			match(While);
			setState(593);
			match(IDENTIFIER);
			setState(594);
			iterationToStatement();
			setState(595);
			relExpression();
			setState(596);
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
			setState(598);
			match(For);
			setState(599);
			loopDeclaration();
			setState(600);
			iterationToStatement();
			setState(601);
			simpleExpression(0);
			setState(602);
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
		public Token option;
		public TerminalNode Upto() { return getToken(PSCParser.Upto, 0); }
		public TerminalNode Downto() { return getToken(PSCParser.Downto, 0); }
		public TerminalNode Up() { return getToken(PSCParser.Up, 0); }
		public TerminalNode Down() { return getToken(PSCParser.Down, 0); }
		public TerminalNode To() { return getToken(PSCParser.To, 0); }
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
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Upto:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(Upto);
				}
				break;
			case Downto:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(Downto);
				}
				break;
			case Up:
			case Down:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				((IterationToStatementContext)_localctx).option = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
					((IterationToStatementContext)_localctx).option = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				notifyErrorListeners("Expecting to after '" + (((IterationToStatementContext)_localctx).option!=null?((IterationToStatementContext)_localctx).option.getText():null) + "' keyword.");
				}
				break;
			case To:
				enterOuterAlt(_localctx, 4);
				{
				notifyErrorListeners("Expecting to 'up' or 'down' keyword.");
				setState(609);
				match(To);
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
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(Int);
				setState(613);
				match(IDENTIFIER);
				setState(614);
				simpleAssignExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				match(Int);
				setState(616);
				match(IDENTIFIER);
				notifyErrorListeners("Expecting assignment expression.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				match(IDENTIFIER);
				setState(619);
				simpleAssignExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(620);
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
			setState(623);
			match(Assign);
			setState(624);
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
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(Return);
				setState(627);
				returnStmtContainer();
				setState(628);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(Return);
				setState(631);
				returnStmtContainer();
				notifyErrorListeners("Missing semicolon ';' after return statement.");
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

	public static class ReturnStmtContainerContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<ArrayTypeSpecifierContext> arrayTypeSpecifier() {
			return getRuleContexts(ArrayTypeSpecifierContext.class);
		}
		public ArrayTypeSpecifierContext arrayTypeSpecifier(int i) {
			return getRuleContext(ArrayTypeSpecifierContext.class,i);
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
			int _alt;
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Expecting an expression or identifier in return statement.");
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(640);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
						case 1:
							{
							setState(638);
							typeSpecifier();
							}
							break;
						case 2:
							{
							setState(639);
							arrayTypeSpecifier();
							}
							break;
						}
						} 
					}
					setState(644);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
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
			setState(647);
			mutable();
			setState(648);
			match(Assign);
			setState(651);
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
				setState(649);
				simpleExpression(0);
				}
				break;
			case Create:
				{
				setState(650);
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
			setState(653);
			match(Create);
			setState(654);
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
		public List<TerminalNode> RightBracket() { return getTokens(PSCParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(PSCParser.RightBracket, i);
		}
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
			int _alt;
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				typeSpecifier();
				setState(657);
				arrayInitLeftBracket();
				setState(658);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				typeSpecifier();
				setState(661);
				arrayInitLeftBracket();
				setState(662);
				match(RightBracket);
				setState(664); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(663);
						match(RightBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(666); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant closing bracket ']'.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				typeSpecifier();
				setState(671);
				arrayInitLeftBracket();
				notifyErrorListeners("Expecting a closing bracket ']'.");
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
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(LeftBracket);
				setState(677);
				relExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(LeftBracket);
				notifyErrorListeners("Expecting an expression for declaring array sizes.");
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
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
			setState(683);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(696);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(685);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(686);
						match(OrOr);
						setState(687);
						andExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(688);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(690); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(689);
								andExpression(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(692); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						notifyErrorListeners("Expecting a proper operator somewhere between these.");
						}
						break;
					}
					} 
				}
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
			setState(702);
			unaryRelExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(704);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(705);
					match(AndAnd);
					setState(706);
					unaryRelExpression();
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(Not);
				setState(713);
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
				setState(714);
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
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				sumExpression(0);
				setState(718);
				relOperator();
				setState(719);
				sumExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
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
			setState(724);
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
			setState(727);
			mulExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumExpression);
					setState(729);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(730);
					sumOperator();
					setState(731);
					mulExpression(0);
					}
					} 
				}
				setState(737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
			setState(738);
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
			setState(741);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
					setState(743);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(744);
					mulOperator();
					setState(745);
					unaryExpression();
					}
					} 
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
			setState(752);
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
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				unaryOperator();
				setState(755);
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
				setState(757);
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
			setState(760);
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
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				immutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
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
		public List<TerminalNode> RightBracket() { return getTokens(PSCParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(PSCParser.RightBracket, i);
		}
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
			int _alt;
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(IDENTIFIER);
				setState(768);
				mutableLeftBracket();
				setState(769);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				match(IDENTIFIER);
				setState(772);
				mutableLeftBracket();
				setState(773);
				match(RightBracket);
				setState(775); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(774);
						match(RightBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(777); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant closing bracket ']'.");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(781);
				match(IDENTIFIER);
				setState(782);
				mutableLeftBracket();
				notifyErrorListeners("Expecting a closing bracket ']'.");
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
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				match(LeftBracket);
				setState(788);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(LeftBracket);
				notifyErrorListeners("Expecting an expression for array indices.");
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
		public List<TerminalNode> RightParen() { return getTokens(PSCParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PSCParser.RightParen, i);
		}
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
			int _alt;
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				immutableLeftParen();
				setState(796);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(798);
				immutableLeftParen();
				setState(799);
				match(RightParen);
				setState(801); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(800);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(803); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant closing parenthesis')'.");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(807);
				immutableLeftParen();
				notifyErrorListeners("Expecting a closing parenthesis ')'.");
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
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(LeftParen);
				setState(813);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				match(LeftParen);
				notifyErrorListeners("Redundant parenthesis pair, expecting expression after '('.");
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public List<CallLeftParenContext> callLeftParen() {
			return getRuleContexts(CallLeftParenContext.class);
		}
		public CallLeftParenContext callLeftParen(int i) {
			return getRuleContext(CallLeftParenContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(PSCParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PSCParser.RightParen, i);
		}
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
			int _alt;
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(IDENTIFIER);
				setState(819);
				callLeftParen();
				setState(820);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				match(IDENTIFIER);
				setState(823);
				callLeftParen();
				setState(824);
				match(RightParen);
				setState(828); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(825);
						callLeftParen();
						setState(826);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(830); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant parenthesis.");
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
			setState(836);
			match(LeftParen);
			setState(837);
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
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
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
		int _la;
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				argumentList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				argumentList(0);
				notifyErrorListeners("Multiple function arguments, if there are more than 1, should be separated by commas ','.");
				setState(843); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(842);
					argumentList(0);
					}
					}
					setState(845); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Minus) | (1L << Not) | (1L << StringLiteral) | (1L << INTEGERCONSTANT) | (1L << FLOATCONSTANT) | (1L << BOOLCONSTANT) | (1L << IDENTIFIER))) != 0) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			setState(851);
			simpleExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentList);
					setState(853);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(854);
					match(Comma);
					setState(855);
					simpleExpression(0);
					}
					} 
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
			setState(861);
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
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sumExpression_sempred(SumExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExpression_sempred(MulExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean argumentList_sempred(ArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0362\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\5\2\u008e\n"+
		"\2\3\2\3\2\3\2\3\2\5\2\u0094\n\2\3\2\3\2\3\2\5\2\u0099\n\2\3\2\3\2\5\2"+
		"\u009d\n\2\3\2\3\2\3\2\5\2\u00a2\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u00ac\n\3\3\4\3\4\3\4\3\4\5\4\u00b2\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u00b9"+
		"\n\5\f\5\16\5\u00bc\13\5\3\6\5\6\u00bf\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c6"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u00cc\n\6\3\7\3\7\5\7\u00d0\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00de\n\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00ed\n\13\r\13\16\13\u00ee"+
		"\3\13\3\13\5\13\u00f3\n\13\3\f\3\f\3\f\3\r\5\r\u00f9\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0101\n\r\3\r\3\r\3\r\5\r\u0106\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0114\n\16\3\17\3\17\3\20"+
		"\3\20\5\20\u011a\n\20\3\21\3\21\3\21\3\21\5\21\u0120\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012c\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0138\n\21\3\21\3\21\3\21\3\21"+
		"\6\21\u013e\n\21\r\21\16\21\u013f\3\21\7\21\u0143\n\21\f\21\16\21\u0146"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0155\n\21\3\22\3\22\3\22\3\22\6\22\u015b\n\22\r\22\16\22\u015c"+
		"\3\22\5\22\u0160\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0168\n\23\f"+
		"\23\16\23\u016b\13\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0179\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u0180\n\27\f"+
		"\27\16\27\u0183\13\27\3\30\3\30\5\30\u0187\n\30\3\30\3\30\3\30\3\30\5"+
		"\30\u018d\n\30\3\30\3\30\3\30\3\30\5\30\u0193\n\30\3\31\3\31\3\31\7\31"+
		"\u0198\n\31\f\31\16\31\u019b\13\31\3\31\3\31\3\31\3\31\7\31\u01a1\n\31"+
		"\f\31\16\31\u01a4\13\31\3\31\3\31\3\31\3\31\7\31\u01aa\n\31\f\31\16\31"+
		"\u01ad\13\31\3\31\3\31\6\31\u01b1\n\31\r\31\16\31\u01b2\3\31\5\31\u01b6"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u01bd\n\32\f\32\16\32\u01c0\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01d0\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01dd\n\34\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u01e5\n\35\r\35\16"+
		"\35\u01e6\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01ef\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u01f8\n\36\3\37\3\37\3\37\3\37\6\37\u01fe\n"+
		"\37\r\37\16\37\u01ff\5\37\u0202\n\37\3 \3 \3 \3 \3 \5 \u0209\n \3 \3 "+
		"\3 \3 \3 \3 \7 \u0211\n \f \16 \u0214\13 \3!\3!\5!\u0218\n!\3\"\3\"\3"+
		"\"\3\"\5\"\u021e\n\"\3\"\3\"\3\"\3\"\5\"\u0224\n\"\5\"\u0226\n\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\6#\u0230\n#\r#\16#\u0231\3#\3#\3#\3#\3#\3#\5#\u023a"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\5$\u0243\n$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u024d"+
		"\n%\3&\3&\5&\u0251\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\5)\u0265\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0270\n*\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u027d\n,\3-\3-\3-\3-\7-\u0283\n-\f-\16"+
		"-\u0286\13-\5-\u0288\n-\3.\3.\3.\3.\5.\u028e\n.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\6\60\u029b\n\60\r\60\16\60\u029c\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u02a5\n\60\3\61\3\61\3\61\3\61\5\61\u02ab\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\6\62\u02b5\n\62\r\62\16\62\u02b6"+
		"\3\62\3\62\7\62\u02bb\n\62\f\62\16\62\u02be\13\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\7\63\u02c6\n\63\f\63\16\63\u02c9\13\63\3\64\3\64\3\64\5\64"+
		"\u02ce\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u02d5\n\65\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\7\67\u02e0\n\67\f\67\16\67\u02e3\13\67\3"+
		"8\38\39\39\39\39\39\39\39\79\u02ee\n9\f9\169\u02f1\139\3:\3:\3;\3;\3;"+
		"\3;\5;\u02f9\n;\3<\3<\3=\3=\5=\u02ff\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\6>"+
		"\u030a\n>\r>\16>\u030b\3>\3>\3>\3>\3>\3>\5>\u0314\n>\3?\3?\3?\3?\5?\u031a"+
		"\n?\3@\3@\3@\3@\3@\3@\3@\3@\6@\u0324\n@\r@\16@\u0325\3@\3@\3@\3@\3@\5"+
		"@\u032d\n@\3A\3A\3A\3A\5A\u0333\nA\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\6B\u033f"+
		"\nB\rB\16B\u0340\3B\3B\5B\u0345\nB\3C\3C\3C\3D\3D\3D\3D\6D\u034e\nD\r"+
		"D\16D\u034f\3D\5D\u0353\nD\3E\3E\3E\3E\3E\3E\7E\u035b\nE\fE\16E\u035e"+
		"\13E\3F\3F\3F\2\f\b$,\62>bdlp\u0088G\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\2\b\3\2\4\7\3\2./\5\2\33\36%%**\3\2\37"+
		" \3\2!\"\3\2\63\66\2\u03a0\2\u00a1\3\2\2\2\4\u00ab\3\2\2\2\6\u00b1\3\2"+
		"\2\2\b\u00b3\3\2\2\2\n\u00cb\3\2\2\2\f\u00cf\3\2\2\2\16\u00dd\3\2\2\2"+
		"\20\u00df\3\2\2\2\22\u00e1\3\2\2\2\24\u00f2\3\2\2\2\26\u00f4\3\2\2\2\30"+
		"\u0105\3\2\2\2\32\u0113\3\2\2\2\34\u0115\3\2\2\2\36\u0119\3\2\2\2 \u0154"+
		"\3\2\2\2\"\u015f\3\2\2\2$\u0161\3\2\2\2&\u016c\3\2\2\2(\u016f\3\2\2\2"+
		"*\u0178\3\2\2\2,\u017a\3\2\2\2.\u0192\3\2\2\2\60\u01b5\3\2\2\2\62\u01b7"+
		"\3\2\2\2\64\u01cf\3\2\2\2\66\u01dc\3\2\2\28\u01ee\3\2\2\2:\u01f7\3\2\2"+
		"\2<\u0201\3\2\2\2>\u0208\3\2\2\2@\u0217\3\2\2\2B\u0225\3\2\2\2D\u0239"+
		"\3\2\2\2F\u0242\3\2\2\2H\u024c\3\2\2\2J\u0250\3\2\2\2L\u0252\3\2\2\2N"+
		"\u0258\3\2\2\2P\u0264\3\2\2\2R\u026f\3\2\2\2T\u0271\3\2\2\2V\u027c\3\2"+
		"\2\2X\u0287\3\2\2\2Z\u0289\3\2\2\2\\\u028f\3\2\2\2^\u02a4\3\2\2\2`\u02aa"+
		"\3\2\2\2b\u02ac\3\2\2\2d\u02bf\3\2\2\2f\u02cd\3\2\2\2h\u02d4\3\2\2\2j"+
		"\u02d6\3\2\2\2l\u02d8\3\2\2\2n\u02e4\3\2\2\2p\u02e6\3\2\2\2r\u02f2\3\2"+
		"\2\2t\u02f8\3\2\2\2v\u02fa\3\2\2\2x\u02fe\3\2\2\2z\u0313\3\2\2\2|\u0319"+
		"\3\2\2\2~\u032c\3\2\2\2\u0080\u0332\3\2\2\2\u0082\u0344\3\2\2\2\u0084"+
		"\u0346\3\2\2\2\u0086\u0352\3\2\2\2\u0088\u0354\3\2\2\2\u008a\u035f\3\2"+
		"\2\2\u008c\u008e\5\b\5\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\5\4\3\2\u0090\u0091\7\2\2\3\u0091\u00a2\3\2"+
		"\2\2\u0092\u0094\5\b\5\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\7\2\2\3\u0096\u00a2\b\2\1\2\u0097\u0099\5\b"+
		"\5\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\5\4\3\2\u009b\u009d\5\b\5\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\2\2\3\u009f\u00a0\b\2\1\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u008d\3\2\2\2\u00a1\u0093\3\2\2\2\u00a1\u0098\3\2"+
		"\2\2\u00a2\3\3\2\2\2\u00a3\u00a4\5\6\4\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6"+
		"\5\60\31\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\5\6\4\2\u00a8\u00a9\b\3\1\2"+
		"\u00a9\u00aa\5\60\31\2\u00aa\u00ac\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a7"+
		"\3\2\2\2\u00ac\5\3\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00b2\7\25\2\2\u00af"+
		"\u00b0\7\b\2\2\u00b0\u00b2\b\4\1\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\7\3\2\2\2\u00b3\u00b4\b\5\1\2\u00b4\u00b5\5 \21\2\u00b5\u00ba"+
		"\3\2\2\2\u00b6\u00b7\f\3\2\2\u00b7\u00b9\5 \21\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\t\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\3\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2\5\16\b\2"+
		"\u00c2\u00c3\7(\2\2\u00c3\u00cc\3\2\2\2\u00c4\u00c6\7\3\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\5\22\n\2"+
		"\u00c8\u00c9\5\16\b\2\u00c9\u00ca\b\6\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00be"+
		"\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cc\13\3\2\2\2\u00cd\u00d0\5\n\6\2\u00ce"+
		"\u00d0\5\30\r\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\r\3\2\2"+
		"\2\u00d1\u00de\5\20\t\2\u00d2\u00d3\5\20\t\2\u00d3\u00d4\7+\2\2\u00d4"+
		"\u00d5\5b\62\2\u00d5\u00de\3\2\2\2\u00d6\u00d7\5\20\t\2\u00d7\u00d8\b"+
		"\b\1\2\u00d8\u00d9\5b\62\2\u00d9\u00de\3\2\2\2\u00da\u00db\5b\62\2\u00db"+
		"\u00dc\b\b\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d1\3\2\2\2\u00dd\u00d2\3\2"+
		"\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\17\3\2\2\2\u00df\u00e0"+
		"\78\2\2\u00e0\21\3\2\2\2\u00e1\u00e2\t\2\2\2\u00e2\23\3\2\2\2\u00e3\u00e4"+
		"\5\26\f\2\u00e4\u00e5\7\30\2\2\u00e5\u00f3\3\2\2\2\u00e6\u00e7\5\26\f"+
		"\2\u00e7\u00e8\b\13\1\2\u00e8\u00f3\3\2\2\2\u00e9\u00ea\5\26\f\2\u00ea"+
		"\u00ec\7\30\2\2\u00eb\u00ed\7\30\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3"+
		"\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\b\13\1\2\u00f1\u00f3\3\2\2\2\u00f2\u00e3\3\2\2\2\u00f2\u00e6\3"+
		"\2\2\2\u00f2\u00e9\3\2\2\2\u00f3\25\3\2\2\2\u00f4\u00f5\5\22\n\2\u00f5"+
		"\u00f6\7\27\2\2\u00f6\27\3\2\2\2\u00f7\u00f9\7\3\2\2\u00f8\u00f7\3\2\2"+
		"\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\5\24\13\2\u00fb"+
		"\u00fc\5\32\16\2\u00fc\u00fd\7(\2\2\u00fd\u0106\3\2\2\2\u00fe\u0100\b"+
		"\r\1\2\u00ff\u0101\7\3\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\5\24\13\2\u0103\u0104\5\32\16\2\u0104\u0106"+
		"\3\2\2\2\u0105\u00f8\3\2\2\2\u0105\u00fe\3\2\2\2\u0106\31\3\2\2\2\u0107"+
		"\u0114\5\34\17\2\u0108\u0109\5\34\17\2\u0109\u010a\7+\2\2\u010a\u010b"+
		"\5\\/\2\u010b\u0114\3\2\2\2\u010c\u010d\5\34\17\2\u010d\u010e\b\16\1\2"+
		"\u010e\u010f\5\\/\2\u010f\u0114\3\2\2\2\u0110\u0111\5\\/\2\u0111\u0112"+
		"\b\16\1\2\u0112\u0114\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u0108\3\2\2\2"+
		"\u0113\u010c\3\2\2\2\u0113\u0110\3\2\2\2\u0114\33\3\2\2\2\u0115\u0116"+
		"\78\2\2\u0116\35\3\2\2\2\u0117\u011a\5\22\n\2\u0118\u011a\5\24\13\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\37\3\2\2\2\u011b\u011f\7\21\2"+
		"\2\u011c\u0120\5\22\n\2\u011d\u0120\5\24\13\2\u011e\u0120\7\17\2\2\u011f"+
		"\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\78\2\2\u0122\u0123\7\25\2\2\u0123\u0124\5\"\22\2\u0124"+
		"\u0125\7\26\2\2\u0125\u0126\5\60\31\2\u0126\u0155\3\2\2\2\u0127\u012b"+
		"\7\21\2\2\u0128\u012c\5\22\n\2\u0129\u012c\5\24\13\2\u012a\u012c\7\17"+
		"\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\b\21\1\2\u012e\u012f\7\25\2\2\u012f\u0130\5"+
		"\"\22\2\u0130\u0131\7\26\2\2\u0131\u0132\5\60\31\2\u0132\u0155\3\2\2\2"+
		"\u0133\u0137\7\21\2\2\u0134\u0138\5\22\n\2\u0135\u0138\5\24\13\2\u0136"+
		"\u0138\7\17\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013d\b\21\1\2\u013a\u013e\5\22\n\2\u013b"+
		"\u013e\5\24\13\2\u013c\u013e\7\17\2\2\u013d\u013a\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0144\3\2\2\2\u0141\u0143\78\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\25\2\2\u0148\u0149\5"+
		"\"\22\2\u0149\u014a\7\26\2\2\u014a\u014b\5\60\31\2\u014b\u0155\3\2\2\2"+
		"\u014c\u014d\7\21\2\2\u014d\u014e\b\21\1\2\u014e\u014f\78\2\2\u014f\u0150"+
		"\7\25\2\2\u0150\u0151\5\"\22\2\u0151\u0152\7\26\2\2\u0152\u0153\5\60\31"+
		"\2\u0153\u0155\3\2\2\2\u0154\u011b\3\2\2\2\u0154\u0127\3\2\2\2\u0154\u0133"+
		"\3\2\2\2\u0154\u014c\3\2\2\2\u0155!\3\2\2\2\u0156\u0160\5$\23\2\u0157"+
		"\u0158\5$\23\2\u0158\u015a\b\22\1\2\u0159\u015b\5$\23\2\u015a\u0159\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0157\3\2"+
		"\2\2\u015f\u015e\3\2\2\2\u0160#\3\2\2\2\u0161\u0162\b\23\1\2\u0162\u0163"+
		"\5&\24\2\u0163\u0169\3\2\2\2\u0164\u0165\f\4\2\2\u0165\u0166\7)\2\2\u0166"+
		"\u0168\5&\24\2\u0167\u0164\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a%\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d"+
		"\5\36\20\2\u016d\u016e\5(\25\2\u016e\'\3\2\2\2\u016f\u0170\78\2\2\u0170"+
		")\3\2\2\2\u0171\u0179\5.\30\2\u0172\u0179\5\60\31\2\u0173\u0179\5\64\33"+
		"\2\u0174\u0179\5\66\34\2\u0175\u0179\5B\"\2\u0176\u0179\5J&\2\u0177\u0179"+
		"\5V,\2\u0178\u0171\3\2\2\2\u0178\u0172\3\2\2\2\u0178\u0173\3\2\2\2\u0178"+
		"\u0174\3\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2"+
		"\2\2\u0179+\3\2\2\2\u017a\u017b\b\27\1\2\u017b\u017c\5*\26\2\u017c\u0181"+
		"\3\2\2\2\u017d\u017e\f\3\2\2\u017e\u0180\5*\26\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182-\3\2\2\2"+
		"\u0183\u0181\3\2\2\2\u0184\u0187\5Z.\2\u0185\u0187\5\u0082B\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7(\2\2\u0189"+
		"\u0193\3\2\2\2\u018a\u018d\5Z.\2\u018b\u018d\5\u0082B\2\u018c\u018a\3"+
		"\2\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\b\30\1\2\u018f"+
		"\u0193\3\2\2\2\u0190\u0191\7(\2\2\u0191\u0193\b\30\1\2\u0192\u0186\3\2"+
		"\2\2\u0192\u018c\3\2\2\2\u0192\u0190\3\2\2\2\u0193/\3\2\2\2\u0194\u0199"+
		"\7\31\2\2\u0195\u0198\5\62\32\2\u0196\u0198\5,\27\2\u0197\u0195\3\2\2"+
		"\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01b6\7\32\2\2"+
		"\u019d\u01a2\7\31\2\2\u019e\u01a1\5\62\32\2\u019f\u01a1\5,\27\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01b6\b\31\1\2\u01a6\u01ab\7\31\2\2\u01a7\u01aa\5\62\32\2\u01a8\u01aa"+
		"\5,\27\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae\u01b0\7\32\2\2\u01af\u01b1\7\32\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b6\b\31\1\2\u01b5\u0194\3\2\2\2\u01b5\u019d\3\2\2\2\u01b5"+
		"\u01a6\3\2\2\2\u01b6\61\3\2\2\2\u01b7\u01b8\b\32\1\2\u01b8\u01b9\5\f\7"+
		"\2\u01b9\u01be\3\2\2\2\u01ba\u01bb\f\3\2\2\u01bb\u01bd\5\f\7\2\u01bc\u01ba"+
		"\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\63\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7\24\2\2\u01c2\u01c3\7\25"+
		"\2\2\u01c3\u01c4\7\63\2\2\u01c4\u01c5\7)\2\2\u01c5\u01c6\78\2\2\u01c6"+
		"\u01c7\7\26\2\2\u01c7\u01d0\7(\2\2\u01c8\u01c9\7\24\2\2\u01c9\u01ca\7"+
		"\25\2\2\u01ca\u01cb\7\63\2\2\u01cb\u01cc\7)\2\2\u01cc\u01cd\78\2\2\u01cd"+
		"\u01ce\7\26\2\2\u01ce\u01d0\b\33\1\2\u01cf\u01c1\3\2\2\2\u01cf\u01c8\3"+
		"\2\2\2\u01d0\65\3\2\2\2\u01d1\u01d2\7\23\2\2\u01d2\u01d3\58\35\2\u01d3"+
		"\u01d4\7(\2\2\u01d4\u01dd\3\2\2\2\u01d5\u01d6\7\23\2\2\u01d6\u01d7\b\34"+
		"\1\2\u01d7\u01dd\7(\2\2\u01d8\u01d9\7\23\2\2\u01d9\u01da\58\35\2\u01da"+
		"\u01db\b\34\1\2\u01db\u01dd\3\2\2\2\u01dc\u01d1\3\2\2\2\u01dc\u01d5\3"+
		"\2\2\2\u01dc\u01d8\3\2\2\2\u01dd\67\3\2\2\2\u01de\u01df\5:\36\2\u01df"+
		"\u01e0\7\26\2\2\u01e0\u01ef\3\2\2\2\u01e1\u01e2\5:\36\2\u01e2\u01e4\7"+
		"\26\2\2\u01e3\u01e5\7\26\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\b\35"+
		"\1\2\u01e9\u01ef\3\2\2\2\u01ea\u01eb\5:\36\2\u01eb\u01ec\b\35\1\2\u01ec"+
		"\u01ef\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01de\3\2\2\2\u01ee\u01e1\3\2"+
		"\2\2\u01ee\u01ea\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef9\3\2\2\2\u01f0\u01f1"+
		"\7\25\2\2\u01f1\u01f8\5<\37\2\u01f2\u01f3\5<\37\2\u01f3\u01f4\b\36\1\2"+
		"\u01f4\u01f8\3\2\2\2\u01f5\u01f6\7\25\2\2\u01f6\u01f8\b\36\1\2\u01f7\u01f0"+
		"\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8;\3\2\2\2\u01f9"+
		"\u0202\5> \2\u01fa\u01fb\b\37\1\2\u01fb\u01fd\5> \2\u01fc\u01fe\5> \2"+
		"\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01f9\3\2\2\2\u0201\u01fa\3\2\2\2\u0202"+
		"=\3\2\2\2\u0203\u0204\b \1\2\u0204\u0209\5@!\2\u0205\u0206\b \1\2\u0206"+
		"\u0207\7\37\2\2\u0207\u0209\5> \3\u0208\u0203\3\2\2\2\u0208\u0205\3\2"+
		"\2\2\u0209\u0212\3\2\2\2\u020a\u020b\f\6\2\2\u020b\u020c\7\37\2\2\u020c"+
		"\u0211\5@!\2\u020d\u020e\f\4\2\2\u020e\u020f\7\37\2\2\u020f\u0211\b \1"+
		"\2\u0210\u020a\3\2\2\2\u0210\u020d\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213?\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u0218\7\63\2\2\u0216\u0218\5b\62\2\u0217\u0215\3\2\2\2\u0217\u0216\3"+
		"\2\2\2\u0218A\3\2\2\2\u0219\u021a\5D#\2\u021a\u021b\7\r\2\2\u021b\u021d"+
		"\5\60\31\2\u021c\u021e\5H%\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0226\3\2\2\2\u021f\u0220\5D#\2\u0220\u0221\b\"\1\2\u0221\u0223\5\60"+
		"\31\2\u0222\u0224\5H%\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0226\3\2\2\2\u0225\u0219\3\2\2\2\u0225\u021f\3\2\2\2\u0226C\3\2\2\2"+
		"\u0227\u0228\7\f\2\2\u0228\u0229\5F$\2\u0229\u022a\7\26\2\2\u022a\u023a"+
		"\3\2\2\2\u022b\u022c\7\f\2\2\u022c\u022d\5F$\2\u022d\u022f\7\26\2\2\u022e"+
		"\u0230\7\26\2\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3"+
		"\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\b#\1\2\u0234"+
		"\u023a\3\2\2\2\u0235\u0236\7\f\2\2\u0236\u0237\5F$\2\u0237\u0238\b#\1"+
		"\2\u0238\u023a\3\2\2\2\u0239\u0227\3\2\2\2\u0239\u022b\3\2\2\2\u0239\u0235"+
		"\3\2\2\2\u023aE\3\2\2\2\u023b\u023c\7\25\2\2\u023c\u0243\5b\62\2\u023d"+
		"\u023e\5b\62\2\u023e\u023f\b$\1\2\u023f\u0243\3\2\2\2\u0240\u0241\7\25"+
		"\2\2\u0241\u0243\b$\1\2\u0242\u023b\3\2\2\2\u0242\u023d\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243G\3\2\2\2\u0244\u0245\7\n\2\2\u0245\u0246\7\r\2\2"+
		"\u0246\u024d\5\60\31\2\u0247\u0248\7\n\2\2\u0248\u024d\5B\"\2\u0249\u024a"+
		"\7\n\2\2\u024a\u024b\b%\1\2\u024b\u024d\5\60\31\2\u024c\u0244\3\2\2\2"+
		"\u024c\u0247\3\2\2\2\u024c\u0249\3\2\2\2\u024dI\3\2\2\2\u024e\u0251\5"+
		"L\'\2\u024f\u0251\5N(\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251"+
		"K\3\2\2\2\u0252\u0253\7\20\2\2\u0253\u0254\78\2\2\u0254\u0255\5P)\2\u0255"+
		"\u0256\5h\65\2\u0256\u0257\5\60\31\2\u0257M\3\2\2\2\u0258\u0259\7\13\2"+
		"\2\u0259\u025a\5R*\2\u025a\u025b\5P)\2\u025b\u025c\5b\62\2\u025c\u025d"+
		"\5\60\31\2\u025dO\3\2\2\2\u025e\u0265\7\61\2\2\u025f\u0265\7\62\2\2\u0260"+
		"\u0261\t\3\2\2\u0261\u0265\b)\1\2\u0262\u0263\b)\1\2\u0263\u0265\7\60"+
		"\2\2\u0264\u025e\3\2\2\2\u0264\u025f\3\2\2\2\u0264\u0260\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0265Q\3\2\2\2\u0266\u0267\7\4\2\2\u0267\u0268\78\2\2\u0268"+
		"\u0270\5T+\2\u0269\u026a\7\4\2\2\u026a\u026b\78\2\2\u026b\u0270\b*\1\2"+
		"\u026c\u026d\78\2\2\u026d\u0270\5T+\2\u026e\u0270\78\2\2\u026f\u0266\3"+
		"\2\2\2\u026f\u0269\3\2\2\2\u026f\u026c\3\2\2\2\u026f\u026e\3\2\2\2\u0270"+
		"S\3\2\2\2\u0271\u0272\7+\2\2\u0272\u0273\5b\62\2\u0273U\3\2\2\2\u0274"+
		"\u0275\7\16\2\2\u0275\u0276\5X-\2\u0276\u0277\7(\2\2\u0277\u027d\3\2\2"+
		"\2\u0278\u0279\7\16\2\2\u0279\u027a\5X-\2\u027a\u027b\b,\1\2\u027b\u027d"+
		"\3\2\2\2\u027c\u0274\3\2\2\2\u027c\u0278\3\2\2\2\u027dW\3\2\2\2\u027e"+
		"\u0288\5b\62\2\u027f\u0284\b-\1\2\u0280\u0283\5\22\n\2\u0281\u0283\5\24"+
		"\13\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283\u0286\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2"+
		"\2\2\u0287\u027e\3\2\2\2\u0287\u027f\3\2\2\2\u0288Y\3\2\2\2\u0289\u028a"+
		"\5z>\2\u028a\u028d\7+\2\2\u028b\u028e\5b\62\2\u028c\u028e\5\\/\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e[\3\2\2\2\u028f\u0290\7\22\2\2"+
		"\u0290\u0291\5^\60\2\u0291]\3\2\2\2\u0292\u0293\5\22\n\2\u0293\u0294\5"+
		"`\61\2\u0294\u0295\7\30\2\2\u0295\u02a5\3\2\2\2\u0296\u0297\5\22\n\2\u0297"+
		"\u0298\5`\61\2\u0298\u029a\7\30\2\2\u0299\u029b\7\30\2\2\u029a\u0299\3"+
		"\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u029f\b\60\1\2\u029f\u02a5\3\2\2\2\u02a0\u02a1\5"+
		"\22\n\2\u02a1\u02a2\5`\61\2\u02a2\u02a3\b\60\1\2\u02a3\u02a5\3\2\2\2\u02a4"+
		"\u0292\3\2\2\2\u02a4\u0296\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a5_\3\2\2\2"+
		"\u02a6\u02a7\7\27\2\2\u02a7\u02ab\5h\65\2\u02a8\u02a9\7\27\2\2\u02a9\u02ab"+
		"\b\61\1\2\u02aa\u02a6\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aba\3\2\2\2\u02ac"+
		"\u02ad\b\62\1\2\u02ad\u02ae\5d\63\2\u02ae\u02bc\3\2\2\2\u02af\u02b0\f"+
		"\4\2\2\u02b0\u02b1\7$\2\2\u02b1\u02bb\5d\63\2\u02b2\u02b4\f\3\2\2\u02b3"+
		"\u02b5\5d\63\2\u02b4\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b4\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\b\62\1\2\u02b9"+
		"\u02bb\3\2\2\2\u02ba\u02af\3\2\2\2\u02ba\u02b2\3\2\2\2\u02bb\u02be\3\2"+
		"\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bdc\3\2\2\2\u02be\u02bc"+
		"\3\2\2\2\u02bf\u02c0\b\63\1\2\u02c0\u02c1\5f\64\2\u02c1\u02c7\3\2\2\2"+
		"\u02c2\u02c3\f\3\2\2\u02c3\u02c4\7#\2\2\u02c4\u02c6\5f\64\2\u02c5\u02c2"+
		"\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"e\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7&\2\2\u02cb\u02ce\5f\64\2\u02cc"+
		"\u02ce\5h\65\2\u02cd\u02ca\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ceg\3\2\2\2"+
		"\u02cf\u02d0\5l\67\2\u02d0\u02d1\5j\66\2\u02d1\u02d2\5l\67\2\u02d2\u02d5"+
		"\3\2\2\2\u02d3\u02d5\5l\67\2\u02d4\u02cf\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5"+
		"i\3\2\2\2\u02d6\u02d7\t\4\2\2\u02d7k\3\2\2\2\u02d8\u02d9\b\67\1\2\u02d9"+
		"\u02da\5p9\2\u02da\u02e1\3\2\2\2\u02db\u02dc\f\4\2\2\u02dc\u02dd\5n8\2"+
		"\u02dd\u02de\5p9\2\u02de\u02e0\3\2\2\2\u02df\u02db\3\2\2\2\u02e0\u02e3"+
		"\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2m\3\2\2\2\u02e3"+
		"\u02e1\3\2\2\2\u02e4\u02e5\t\5\2\2\u02e5o\3\2\2\2\u02e6\u02e7\b9\1\2\u02e7"+
		"\u02e8\5t;\2\u02e8\u02ef\3\2\2\2\u02e9\u02ea\f\4\2\2\u02ea\u02eb\5r:\2"+
		"\u02eb\u02ec\5t;\2\u02ec\u02ee\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ee\u02f1"+
		"\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0q\3\2\2\2\u02f1"+
		"\u02ef\3\2\2\2\u02f2\u02f3\t\6\2\2\u02f3s\3\2\2\2\u02f4\u02f5\5v<\2\u02f5"+
		"\u02f6\5t;\2\u02f6\u02f9\3\2\2\2\u02f7\u02f9\5x=\2\u02f8\u02f4\3\2\2\2"+
		"\u02f8\u02f7\3\2\2\2\u02f9u\3\2\2\2\u02fa\u02fb\7 \2\2\u02fbw\3\2\2\2"+
		"\u02fc\u02ff\5~@\2\u02fd\u02ff\5z>\2\u02fe\u02fc\3\2\2\2\u02fe\u02fd\3"+
		"\2\2\2\u02ffy\3\2\2\2\u0300\u0314\78\2\2\u0301\u0302\78\2\2\u0302\u0303"+
		"\5|?\2\u0303\u0304\7\30\2\2\u0304\u0314\3\2\2\2\u0305\u0306\78\2\2\u0306"+
		"\u0307\5|?\2\u0307\u0309\7\30\2\2\u0308\u030a\7\30\2\2\u0309\u0308\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u030e\b>\1\2\u030e\u0314\3\2\2\2\u030f\u0310\78\2"+
		"\2\u0310\u0311\5|?\2\u0311\u0312\b>\1\2\u0312\u0314\3\2\2\2\u0313\u0300"+
		"\3\2\2\2\u0313\u0301\3\2\2\2\u0313\u0305\3\2\2\2\u0313\u030f\3\2\2\2\u0314"+
		"{\3\2\2\2\u0315\u0316\7\27\2\2\u0316\u031a\5b\62\2\u0317\u0318\7\27\2"+
		"\2\u0318\u031a\b?\1\2\u0319\u0315\3\2\2\2\u0319\u0317\3\2\2\2\u031a}\3"+
		"\2\2\2\u031b\u032d\5\u0082B\2\u031c\u032d\5\u008aF\2\u031d\u031e\5\u0080"+
		"A\2\u031e\u031f\7\26\2\2\u031f\u032d\3\2\2\2\u0320\u0321\5\u0080A\2\u0321"+
		"\u0323\7\26\2\2\u0322\u0324\7\26\2\2\u0323\u0322\3\2\2\2\u0324\u0325\3"+
		"\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0328\b@\1\2\u0328\u032d\3\2\2\2\u0329\u032a\5\u0080A\2\u032a\u032b\b"+
		"@\1\2\u032b\u032d\3\2\2\2\u032c\u031b\3\2\2\2\u032c\u031c\3\2\2\2\u032c"+
		"\u031d\3\2\2\2\u032c\u0320\3\2\2\2\u032c\u0329\3\2\2\2\u032d\177\3\2\2"+
		"\2\u032e\u032f\7\25\2\2\u032f\u0333\5b\62\2\u0330\u0331\7\25\2\2\u0331"+
		"\u0333\bA\1\2\u0332\u032e\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0081\3\2"+
		"\2\2\u0334\u0335\78\2\2\u0335\u0336\5\u0084C\2\u0336\u0337\7\26\2\2\u0337"+
		"\u0345\3\2\2\2\u0338\u0339\78\2\2\u0339\u033a\5\u0084C\2\u033a\u033e\7"+
		"\26\2\2\u033b\u033c\5\u0084C\2\u033c\u033d\7\26\2\2\u033d\u033f\3\2\2"+
		"\2\u033e\u033b\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\bB\1\2\u0343\u0345\3\2\2\2\u0344"+
		"\u0334\3\2\2\2\u0344\u0338\3\2\2\2\u0345\u0083\3\2\2\2\u0346\u0347\7\25"+
		"\2\2\u0347\u0348\5\u0086D\2\u0348\u0085\3\2\2\2\u0349\u0353\5\u0088E\2"+
		"\u034a\u034b\5\u0088E\2\u034b\u034d\bD\1\2\u034c\u034e\5\u0088E\2\u034d"+
		"\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0353\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0349\3\2\2\2\u0352"+
		"\u034a\3\2\2\2\u0352\u0351\3\2\2\2\u0353\u0087\3\2\2\2\u0354\u0355\bE"+
		"\1\2\u0355\u0356\5b\62\2\u0356\u035c\3\2\2\2\u0357\u0358\f\3\2\2\u0358"+
		"\u0359\7)\2\2\u0359\u035b\5b\62\2\u035a\u0357\3\2\2\2\u035b\u035e\3\2"+
		"\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0089\3\2\2\2\u035e"+
		"\u035c\3\2\2\2\u035f\u0360\t\7\2\2\u0360\u008b\3\2\2\2`\u008d\u0093\u0098"+
		"\u009c\u00a1\u00ab\u00b1\u00ba\u00be\u00c5\u00cb\u00cf\u00dd\u00ee\u00f2"+
		"\u00f8\u0100\u0105\u0113\u0119\u011f\u012b\u0137\u013d\u013f\u0144\u0154"+
		"\u015c\u015f\u0169\u0178\u0181\u0186\u018c\u0192\u0197\u0199\u01a0\u01a2"+
		"\u01a9\u01ab\u01b2\u01b5\u01be\u01cf\u01dc\u01e6\u01ee\u01f7\u01ff\u0201"+
		"\u0208\u0210\u0212\u0217\u021d\u0223\u0225\u0231\u0239\u0242\u024c\u0250"+
		"\u0264\u026f\u027c\u0282\u0284\u0287\u028d\u029c\u02a4\u02aa\u02b6\u02ba"+
		"\u02bc\u02c7\u02cd\u02d4\u02e1\u02ef\u02f8\u02fe\u030b\u0313\u0319\u0325"+
		"\u032c\u0332\u0340\u0344\u034f\u0352\u035c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}