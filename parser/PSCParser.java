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
		Plus=29, Minus=30, Star=31, Div=32, AndAnd=33, OrOr=34, Not=35, Colon=36, 
		Semi=37, Comma=38, Assign=39, Equal=40, NotEqual=41, Dot=42, Ellipsis=43, 
		Up=44, Down=45, To=46, RelOperator=47, Upto=48, Downto=49, StringLiteral=50, 
		INTEGERCONSTANT=51, FLOATCONSTANT=52, BOOLCONSTANT=53, STRINGCONSTANT=54, 
		IDENTIFIER=55, BlockComment=56, LineComment=57, WS=58;
	public static final int
		RULE_program = 0, RULE_mainProgram = 1, RULE_mainProgramLeftParen = 2, 
		RULE_declarationList = 3, RULE_declaration = 4, RULE_functionDeclarationList = 5, 
		RULE_variableDeclaration = 6, RULE_scopedVariableDeclaration = 7, RULE_variableDeclarationItems = 8, 
		RULE_variableDeclarationList = 9, RULE_variableDeclarationInitialize = 10, 
		RULE_variableDeclarationIdentifier = 11, RULE_typeSpecifier = 12, RULE_arrayTypeSpecifier = 13, 
		RULE_arrayVariableDeclaration = 14, RULE_arrayVariableDeclarationItems = 15, 
		RULE_arrayVariableDeclarationList = 16, RULE_arrayVariableDeclarationInitialize = 17, 
		RULE_arrayVariableDeclarationIdentifier = 18, RULE_typeSpecifierSelector = 19, 
		RULE_functionDeclaration = 20, RULE_params = 21, RULE_paramList = 22, 
		RULE_paramTypeList = 23, RULE_paramDeclarationIdentifier = 24, RULE_statement = 25, 
		RULE_statementList = 26, RULE_expressionStmt = 27, RULE_compoundStmt = 28, 
		RULE_localDeclarations = 29, RULE_scanStmt = 30, RULE_printStmt = 31, 
		RULE_printParams = 32, RULE_printParamsList = 33, RULE_printParamsSelector = 34, 
		RULE_selectionStmt = 35, RULE_selectionCondition = 36, RULE_selectionLeftParen = 37, 
		RULE_elseSelector = 38, RULE_iterationStmt = 39, RULE_whileStatement = 40, 
		RULE_forStatement = 41, RULE_iterationToStatement = 42, RULE_loopDeclaration = 43, 
		RULE_simpleAssignExpression = 44, RULE_returnStmt = 45, RULE_assignmentStandaloneExpression = 46, 
		RULE_createArrayExpression = 47, RULE_arrayInitExpression = 48, RULE_arrayInitLeftBracket = 49, 
		RULE_simpleExpression = 50, RULE_andExpression = 51, RULE_unaryRelExpression = 52, 
		RULE_relExpression = 53, RULE_sumExpression = 54, RULE_sumOperator = 55, 
		RULE_mulExpression = 56, RULE_mulOperator = 57, RULE_unaryExpression = 58, 
		RULE_unaryOperator = 59, RULE_factor = 60, RULE_mutable = 61, RULE_mutableLeftBracket = 62, 
		RULE_immutable = 63, RULE_immutableLeftParen = 64, RULE_call = 65, RULE_callLeftParen = 66, 
		RULE_arguments = 67, RULE_argumentList = 68, RULE_constant = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainProgram", "mainProgramLeftParen", "declarationList", 
			"declaration", "functionDeclarationList", "variableDeclaration", "scopedVariableDeclaration", 
			"variableDeclarationItems", "variableDeclarationList", "variableDeclarationInitialize", 
			"variableDeclarationIdentifier", "typeSpecifier", "arrayTypeSpecifier", 
			"arrayVariableDeclaration", "arrayVariableDeclarationItems", "arrayVariableDeclarationList", 
			"arrayVariableDeclarationInitialize", "arrayVariableDeclarationIdentifier", 
			"typeSpecifierSelector", "functionDeclaration", "params", "paramList", 
			"paramTypeList", "paramDeclarationIdentifier", "statement", "statementList", 
			"expressionStmt", "compoundStmt", "localDeclarations", "scanStmt", "printStmt", 
			"printParams", "printParamsList", "printParamsSelector", "selectionStmt", 
			"selectionCondition", "selectionLeftParen", "elseSelector", "iterationStmt", 
			"whileStatement", "forStatement", "iterationToStatement", "loopDeclaration", 
			"simpleAssignExpression", "returnStmt", "assignmentStandaloneExpression", 
			"createArrayExpression", "arrayInitExpression", "arrayInitLeftBracket", 
			"simpleExpression", "andExpression", "unaryRelExpression", "relExpression", 
			"sumExpression", "sumOperator", "mulExpression", "mulOperator", "unaryExpression", 
			"unaryOperator", "factor", "mutable", "mutableLeftBracket", "immutable", 
			"immutableLeftParen", "call", "callLeftParen", "arguments", "argumentList", 
			"constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'constant'", "'int'", "'float'", "'String'", "'bool'", "'main'", 
			"'do'", "'else'", "'for'", "'if'", "'then'", "'return'", "'void'", "'while'", 
			"'func'", "'create'", "'print'", "'scan'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", 
			"'&&'", "'||'", "'!'", "':'", "';'", "','", "'='", "'=='", "'!='", "'.'", 
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
			"Plus", "Minus", "Star", "Div", "AndAnd", "OrOr", "Not", "Colon", "Semi", 
			"Comma", "Assign", "Equal", "NotEqual", "Dot", "Ellipsis", "Up", "Down", 
			"To", "RelOperator", "Upto", "Downto", "StringLiteral", "INTEGERCONSTANT", 
			"FLOATCONSTANT", "BOOLCONSTANT", "STRINGCONSTANT", "IDENTIFIER", "BlockComment", 
			"LineComment", "WS"
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Func) {
					{
					setState(140);
					functionDeclarationList(0);
					}
				}

				setState(143);
				mainProgram();
				setState(144);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Func) {
					{
					setState(146);
					functionDeclarationList(0);
					}
				}

				setState(149);
				match(EOF);
				notifyErrorListeners("Missing main() function required to run programs.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Func) {
					{
					setState(151);
					functionDeclarationList(0);
					}
				}

				setState(154);
				mainProgram();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Func) {
					{
					setState(155);
					functionDeclarationList(0);
					}
				}

				setState(158);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				mainProgramLeftParen();
				setState(164);
				match(RightParen);
				setState(165);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				mainProgramLeftParen();
				notifyErrorListeners("Expecting ')' after '('.");
				setState(169);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(Main);
				setState(174);
				match(LeftParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
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

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(182);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(183);
					declaration();
					}
					} 
				}
				setState(188);
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

	public static class DeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArrayVariableDeclarationContext arrayVariableDeclaration() {
			return getRuleContext(ArrayVariableDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_functionDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			functionDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_functionDeclarationList);
					setState(196);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(197);
					functionDeclaration();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public VariableDeclarationItemsContext variableDeclarationItems() {
			return getRuleContext(VariableDeclarationItemsContext.class,0);
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
		enterRule(_localctx, 12, RULE_variableDeclaration);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ConstantKey) {
					{
					setState(203);
					match(ConstantKey);
					}
				}

				setState(206);
				typeSpecifier();
				setState(207);
				variableDeclarationItems();
				setState(208);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing semicolon ';'.");
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ConstantKey) {
					{
					setState(211);
					match(ConstantKey);
					}
				}

				setState(214);
				typeSpecifier();
				setState(215);
				variableDeclarationItems();
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
		enterRule(_localctx, 14, RULE_scopedVariableDeclaration);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
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

	public static class VariableDeclarationItemsContext extends ParserRuleContext {
		public List<VariableDeclarationListContext> variableDeclarationList() {
			return getRuleContexts(VariableDeclarationListContext.class);
		}
		public VariableDeclarationListContext variableDeclarationList(int i) {
			return getRuleContext(VariableDeclarationListContext.class,i);
		}
		public VariableDeclarationItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterVariableDeclarationItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitVariableDeclarationItems(this);
		}
	}

	public final VariableDeclarationItemsContext variableDeclarationItems() throws RecognitionException {
		VariableDeclarationItemsContext _localctx = new VariableDeclarationItemsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclarationItems);
		try {
			int _alt;
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				variableDeclarationList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				variableDeclarationList(0);
				notifyErrorListeners("Multiple declarations should be separated by commas ','.");
				setState(227); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(226);
						variableDeclarationList(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(229); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VariableDeclarationInitializeContext variableDeclarationInitialize() {
			return getRuleContext(VariableDeclarationInitializeContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PSCParser.Comma, 0); }
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		return variableDeclarationList(0);
	}

	private VariableDeclarationListContext variableDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, _parentState);
		VariableDeclarationListContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_variableDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(234);
			variableDeclarationInitialize();
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableDeclarationList);
					setState(236);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(237);
					match(Comma);
					setState(238);
					variableDeclarationInitialize();
					}
					} 
				}
				setState(243);
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
		enterRule(_localctx, 20, RULE_variableDeclarationInitialize);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				variableDeclarationIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				variableDeclarationIdentifier();
				setState(246);
				match(Assign);
				setState(247);
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
		enterRule(_localctx, 22, RULE_variableDeclarationIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 24, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PSCParser.LeftBracket, 0); }
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
		enterRule(_localctx, 26, RULE_arrayTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			typeSpecifier();
			setState(256);
			match(LeftBracket);
			setState(257);
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

	public static class ArrayVariableDeclarationContext extends ParserRuleContext {
		public ArrayTypeSpecifierContext arrayTypeSpecifier() {
			return getRuleContext(ArrayTypeSpecifierContext.class,0);
		}
		public ArrayVariableDeclarationItemsContext arrayVariableDeclarationItems() {
			return getRuleContext(ArrayVariableDeclarationItemsContext.class,0);
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
		enterRule(_localctx, 28, RULE_arrayVariableDeclaration);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ConstantKey) {
					{
					setState(259);
					match(ConstantKey);
					}
				}

				setState(262);
				arrayTypeSpecifier();
				setState(263);
				arrayVariableDeclarationItems();
				setState(264);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing semicolon ';'.");
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ConstantKey) {
					{
					setState(267);
					match(ConstantKey);
					}
				}

				setState(270);
				arrayTypeSpecifier();
				setState(271);
				arrayVariableDeclarationItems();
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

	public static class ArrayVariableDeclarationItemsContext extends ParserRuleContext {
		public List<ArrayVariableDeclarationListContext> arrayVariableDeclarationList() {
			return getRuleContexts(ArrayVariableDeclarationListContext.class);
		}
		public ArrayVariableDeclarationListContext arrayVariableDeclarationList(int i) {
			return getRuleContext(ArrayVariableDeclarationListContext.class,i);
		}
		public ArrayVariableDeclarationItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclarationItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArrayVariableDeclarationItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArrayVariableDeclarationItems(this);
		}
	}

	public final ArrayVariableDeclarationItemsContext arrayVariableDeclarationItems() throws RecognitionException {
		ArrayVariableDeclarationItemsContext _localctx = new ArrayVariableDeclarationItemsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayVariableDeclarationItems);
		try {
			int _alt;
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				arrayVariableDeclarationList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				arrayVariableDeclarationList(0);
				setState(278); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(277);
						arrayVariableDeclarationList(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(280); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Multiple declarations should be separated by commas ','.");
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

	public static class ArrayVariableDeclarationListContext extends ParserRuleContext {
		public ArrayVariableDeclarationInitializeContext arrayVariableDeclarationInitialize() {
			return getRuleContext(ArrayVariableDeclarationInitializeContext.class,0);
		}
		public ArrayVariableDeclarationListContext arrayVariableDeclarationList() {
			return getRuleContext(ArrayVariableDeclarationListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PSCParser.Comma, 0); }
		public ArrayVariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterArrayVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitArrayVariableDeclarationList(this);
		}
	}

	public final ArrayVariableDeclarationListContext arrayVariableDeclarationList() throws RecognitionException {
		return arrayVariableDeclarationList(0);
	}

	private ArrayVariableDeclarationListContext arrayVariableDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArrayVariableDeclarationListContext _localctx = new ArrayVariableDeclarationListContext(_ctx, _parentState);
		ArrayVariableDeclarationListContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_arrayVariableDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287);
			arrayVariableDeclarationInitialize();
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayVariableDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arrayVariableDeclarationList);
					setState(289);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(290);
					match(Comma);
					setState(291);
					arrayVariableDeclarationInitialize();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 34, RULE_arrayVariableDeclarationInitialize);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				arrayVariableDeclarationIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				arrayVariableDeclarationIdentifier();
				setState(299);
				match(Assign);
				setState(300);
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
		enterRule(_localctx, 36, RULE_arrayVariableDeclarationIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 38, RULE_typeSpecifierSelector);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				typeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
		enterRule(_localctx, 40, RULE_functionDeclaration);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(Func);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(311);
					typeSpecifier();
					}
					break;
				case 2:
					{
					setState(312);
					arrayTypeSpecifier();
					}
					break;
				case 3:
					{
					setState(313);
					match(Void);
					}
					break;
				}
				setState(316);
				match(IDENTIFIER);
				setState(317);
				match(LeftParen);
				setState(318);
				params();
				setState(319);
				match(RightParen);
				setState(320);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(Func);
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(323);
					typeSpecifier();
					}
					break;
				case 2:
					{
					setState(324);
					arrayTypeSpecifier();
					}
					break;
				case 3:
					{
					setState(325);
					match(Void);
					}
					break;
				}
				notifyErrorListeners("Missing function name.");
				setState(329);
				match(LeftParen);
				setState(330);
				params();
				setState(331);
				match(RightParen);
				setState(332);
				compoundStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(Func);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(335);
					typeSpecifier();
					}
					break;
				case 2:
					{
					setState(336);
					arrayTypeSpecifier();
					}
					break;
				case 3:
					{
					setState(337);
					match(Void);
					}
					break;
				}
				notifyErrorListeners("Function cannot have multiple return types.");
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(344);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(341);
						typeSpecifier();
						}
						break;
					case 2:
						{
						setState(342);
						arrayTypeSpecifier();
						}
						break;
					case 3:
						{
						setState(343);
						match(Void);
						}
						break;
					}
					}
					setState(346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << String) | (1L << Bool) | (1L << Void))) != 0) );
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(348);
					match(IDENTIFIER);
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				match(LeftParen);
				setState(355);
				params();
				setState(356);
				match(RightParen);
				setState(357);
				compoundStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				match(Func);
				notifyErrorListeners("Missing function return type.");
				setState(361);
				match(IDENTIFIER);
				setState(362);
				match(LeftParen);
				setState(363);
				params();
				setState(364);
				match(RightParen);
				setState(365);
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
		enterRule(_localctx, 42, RULE_params);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				paramList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				paramList(0);
				notifyErrorListeners("Multiple declarations should be separated by commas ','.");
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(372);
					paramList(0);
					}
					}
					setState(375); 
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_paramList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(381);
			paramTypeList();
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_paramList);
					setState(383);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(384);
					match(Comma);
					setState(385);
					paramTypeList();
					}
					} 
				}
				setState(390);
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
		enterRule(_localctx, 46, RULE_paramTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			typeSpecifierSelector();
			setState(392);
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
		enterRule(_localctx, 48, RULE_paramDeclarationIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semi:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				expressionStmt();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				compoundStmt();
				}
				break;
			case Scan:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				scanStmt();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				printStmt();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				selectionStmt();
				}
				break;
			case For:
			case While:
				enterOuterAlt(_localctx, 6);
				{
				setState(401);
				iterationStmt();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 7);
				{
				setState(402);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_statementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(406);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementList);
					setState(408);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(409);
					statement();
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 54, RULE_expressionStmt);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(415);
					assignmentStandaloneExpression();
					}
					break;
				case 2:
					{
					setState(416);
					call();
					}
					break;
				}
				setState(419);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing semicolon ';'.");
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(422);
					assignmentStandaloneExpression();
					}
					break;
				case 2:
					{
					setState(423);
					call();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
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
		enterRule(_localctx, 56, RULE_compoundStmt);
		int _la;
		try {
			int _alt;
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(LeftBrace);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ConstantKey) | (1L << Int) | (1L << Float) | (1L << String) | (1L << Bool) | (1L << For) | (1L << If) | (1L << Return) | (1L << While) | (1L << Print) | (1L << Scan) | (1L << LeftBrace) | (1L << Semi) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(433);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ConstantKey:
					case Int:
					case Float:
					case String:
					case Bool:
						{
						setState(431);
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
						setState(432);
						statementList(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(LeftBrace);
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(442);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ConstantKey:
						case Int:
						case Float:
						case String:
						case Bool:
							{
							setState(440);
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
							setState(441);
							statementList(0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(446);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				notifyErrorListeners("Missing closing bracket.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(LeftBrace);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ConstantKey) | (1L << Int) | (1L << Float) | (1L << String) | (1L << Bool) | (1L << For) | (1L << If) | (1L << Return) | (1L << While) | (1L << Print) | (1L << Scan) | (1L << LeftBrace) | (1L << Semi) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(451);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ConstantKey:
					case Int:
					case Float:
					case String:
					case Bool:
						{
						setState(449);
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
						setState(450);
						statementList(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
				match(RightBrace);
				setState(458); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(457);
						match(RightBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(460); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_localDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(466);
			scopedVariableDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocalDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_localDeclarations);
					setState(468);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(469);
					scopedVariableDeclaration();
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 60, RULE_scanStmt);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(Scan);
				setState(476);
				match(LeftParen);
				setState(477);
				match(StringLiteral);
				setState(478);
				match(Comma);
				setState(479);
				match(IDENTIFIER);
				setState(480);
				match(RightParen);
				setState(481);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing semicolon ';'.");
				setState(483);
				match(Scan);
				setState(484);
				match(LeftParen);
				setState(485);
				match(StringLiteral);
				setState(486);
				match(Comma);
				setState(487);
				match(IDENTIFIER);
				setState(488);
				match(RightParen);
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
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public PrintParamsContext printParams() {
			return getRuleContext(PrintParamsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
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
		enterRule(_localctx, 62, RULE_printStmt);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(Print);
				setState(492);
				match(LeftParen);
				setState(493);
				printParams();
				setState(494);
				match(RightParen);
				setState(495);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing semicolon ';'.");
				setState(498);
				match(Print);
				setState(499);
				match(LeftParen);
				setState(500);
				printParams();
				setState(501);
				match(RightParen);
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
		enterRule(_localctx, 64, RULE_printParams);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				printParamsList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Multiple print parameters should be concatenated by plus symbols '+'. Unless you meant this to be a string literal, then missing double quotes");
				setState(507);
				printParamsList(0);
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(508);
					printParamsList(0);
					}
					}
					setState(511); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << StringLiteral) | (1L << INTEGERCONSTANT) | (1L << FLOATCONSTANT) | (1L << BOOLCONSTANT) | (1L << IDENTIFIER))) != 0) );
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_printParamsList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
				setState(516);
				printParamsSelector();
				}
				break;
			case Plus:
				{
				notifyErrorListeners("Extraneous '+' found / Expecting another print parameter.");
				setState(518);
				match(Plus);
				setState(519);
				printParamsList(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(528);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new PrintParamsListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_printParamsList);
						setState(522);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(523);
						match(Plus);
						setState(524);
						printParamsSelector();
						}
						break;
					case 2:
						{
						_localctx = new PrintParamsListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_printParamsList);
						setState(525);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(526);
						match(Plus);
						notifyErrorListeners("Extraneous '+' found / Expecting another print parameter.");
						}
						break;
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		enterRule(_localctx, 68, RULE_printParamsSelector);
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
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
		enterRule(_localctx, 70, RULE_selectionStmt);
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				selectionCondition();
				setState(538);
				match(Then);
				setState(539);
				compoundStmt();
				setState(541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(540);
					elseSelector();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				selectionCondition();
				notifyErrorListeners("Missing 'then' keyword.");
				setState(545);
				compoundStmt();
				setState(547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(546);
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
		enterRule(_localctx, 72, RULE_selectionCondition);
		int _la;
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(If);
				setState(552);
				selectionLeftParen();
				setState(553);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(If);
				setState(556);
				selectionLeftParen();
				setState(557);
				match(RightParen);
				setState(559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(558);
					match(RightParen);
					}
					}
					setState(561); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				notifyErrorListeners("Redundant closing parenthesis')'.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
				match(If);
				setState(566);
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
		enterRule(_localctx, 74, RULE_selectionLeftParen);
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(LeftParen);
				setState(572);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				simpleExpression(0);
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
		enterRule(_localctx, 76, RULE_elseSelector);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
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
		enterRule(_localctx, 78, RULE_iterationStmt);
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
		enterRule(_localctx, 80, RULE_whileStatement);
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
		enterRule(_localctx, 82, RULE_forStatement);
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
		enterRule(_localctx, 84, RULE_iterationToStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
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
		enterRule(_localctx, 86, RULE_loopDeclaration);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(Int);
				setState(607);
				match(IDENTIFIER);
				setState(608);
				simpleAssignExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				match(Int);
				setState(610);
				match(IDENTIFIER);
				notifyErrorListeners("Expecting assignment expression.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				match(IDENTIFIER);
				setState(613);
				simpleAssignExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
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
		enterRule(_localctx, 88, RULE_simpleAssignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(Assign);
			setState(618);
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
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode Semi() { return getToken(PSCParser.Semi, 0); }
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
		enterRule(_localctx, 90, RULE_returnStmt);
		int _la;
		try {
			int _alt;
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				match(Return);
				setState(621);
				simpleExpression(0);
				setState(622);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				match(Return);
				notifyErrorListeners("Expecting an expression or identifier in return statement.");
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << String) | (1L << Bool))) != 0)) {
					{
					setState(628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(626);
						typeSpecifier();
						}
						break;
					case 2:
						{
						setState(627);
						arrayTypeSpecifier();
						}
						break;
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(633);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				match(Return);
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(638);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(635);
							simpleExpression(0);
							}
							break;
						case 2:
							{
							setState(636);
							typeSpecifier();
							}
							break;
						case 3:
							{
							setState(637);
							arrayTypeSpecifier();
							}
							break;
						}
						} 
					}
					setState(642);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
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
		enterRule(_localctx, 92, RULE_assignmentStandaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			mutable();
			setState(647);
			match(Assign);
			setState(650);
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
				setState(648);
				simpleExpression(0);
				}
				break;
			case Create:
				{
				setState(649);
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
		enterRule(_localctx, 94, RULE_createArrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(Create);
			setState(653);
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
		enterRule(_localctx, 96, RULE_arrayInitExpression);
		try {
			int _alt;
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				typeSpecifier();
				setState(656);
				arrayInitLeftBracket();
				setState(657);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				typeSpecifier();
				setState(660);
				arrayInitLeftBracket();
				setState(661);
				match(RightBracket);
				setState(663); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(662);
						match(RightBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(665); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant closing bracket ']'.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				typeSpecifier();
				setState(670);
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
		enterRule(_localctx, 98, RULE_arrayInitLeftBracket);
		try {
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				match(LeftBracket);
				setState(676);
				relExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_simpleExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(682);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
					setState(684);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(685);
					match(OrOr);
					setState(686);
					andExpression(0);
					}
					} 
				}
				setState(691);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(693);
			unaryRelExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(695);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(696);
					match(AndAnd);
					setState(697);
					unaryRelExpression();
					}
					} 
				}
				setState(702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		enterRule(_localctx, 104, RULE_unaryRelExpression);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(Not);
				setState(704);
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
				setState(705);
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
		public TerminalNode RelOperator() { return getToken(PSCParser.RelOperator, 0); }
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
		enterRule(_localctx, 106, RULE_relExpression);
		try {
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				sumExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				sumExpression(0);
				setState(710);
				match(RelOperator);
				setState(711);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_sumExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(716);
			mulExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumExpression);
					setState(718);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(719);
					sumOperator();
					setState(720);
					mulExpression(0);
					}
					} 
				}
				setState(726);
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
		enterRule(_localctx, 110, RULE_sumOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_mulExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(730);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
					setState(732);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(733);
					mulOperator();
					setState(734);
					unaryExpression();
					}
					} 
				}
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		enterRule(_localctx, 114, RULE_mulOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
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
		enterRule(_localctx, 116, RULE_unaryExpression);
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				unaryOperator();
				setState(744);
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
				setState(746);
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
		enterRule(_localctx, 118, RULE_unaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
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
		enterRule(_localctx, 120, RULE_factor);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				immutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
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
		enterRule(_localctx, 122, RULE_mutable);
		try {
			int _alt;
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(IDENTIFIER);
				setState(757);
				mutableLeftBracket();
				setState(758);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				match(IDENTIFIER);
				setState(761);
				mutableLeftBracket();
				setState(762);
				match(RightBracket);
				setState(764); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(763);
						match(RightBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(766); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant closing bracket ']'.");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				match(IDENTIFIER);
				setState(771);
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
		enterRule(_localctx, 124, RULE_mutableLeftBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(LeftBracket);
			setState(777);
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
		enterRule(_localctx, 126, RULE_immutable);
		try {
			int _alt;
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
				immutableLeftParen();
				setState(782);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(784);
				immutableLeftParen();
				setState(785);
				match(RightParen);
				setState(787); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(786);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(789); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Redundant closing parenthesis')'.");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(793);
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
		enterRule(_localctx, 128, RULE_immutableLeftParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(LeftParen);
			setState(799);
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
		enterRule(_localctx, 130, RULE_call);
		try {
			int _alt;
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				match(IDENTIFIER);
				setState(802);
				callLeftParen();
				setState(803);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				match(IDENTIFIER);
				setState(806);
				callLeftParen();
				setState(807);
				match(RightParen);
				setState(811); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(808);
						callLeftParen();
						setState(809);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(813); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		enterRule(_localctx, 132, RULE_callLeftParen);
		try {
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				match(LeftParen);
				setState(820);
				arguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Expecting an opening parenthesis '(' after function identifier.");
				setState(822);
				arguments();
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
		enterRule(_localctx, 134, RULE_arguments);
		int _la;
		try {
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				argumentList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				argumentList(0);
				notifyErrorListeners("Multiple function arguments, if there are more than 1, should be separated by commas ','.");
				setState(829); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(828);
					argumentList(0);
					}
					}
					setState(831); 
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_argumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(837);
			simpleExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(844);
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
					setState(839);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(840);
					match(Comma);
					setState(841);
					simpleExpression(0);
					}
					} 
				}
				setState(846);
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
		enterRule(_localctx, 138, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
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
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		case 5:
			return functionDeclarationList_sempred((FunctionDeclarationListContext)_localctx, predIndex);
		case 9:
			return variableDeclarationList_sempred((VariableDeclarationListContext)_localctx, predIndex);
		case 16:
			return arrayVariableDeclarationList_sempred((ArrayVariableDeclarationListContext)_localctx, predIndex);
		case 22:
			return paramList_sempred((ParamListContext)_localctx, predIndex);
		case 26:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 29:
			return localDeclarations_sempred((LocalDeclarationsContext)_localctx, predIndex);
		case 33:
			return printParamsList_sempred((PrintParamsListContext)_localctx, predIndex);
		case 50:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		case 51:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 54:
			return sumExpression_sempred((SumExpressionContext)_localctx, predIndex);
		case 56:
			return mulExpression_sempred((MulExpressionContext)_localctx, predIndex);
		case 68:
			return argumentList_sempred((ArgumentListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean functionDeclarationList_sempred(FunctionDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean variableDeclarationList_sempred(VariableDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arrayVariableDeclarationList_sempred(ArrayVariableDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean paramList_sempred(ParamListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean localDeclarations_sempred(LocalDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean printParamsList_sempred(PrintParamsListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sumExpression_sempred(SumExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExpression_sempred(MulExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean argumentList_sempred(ArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0354\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\5\2\u0090"+
		"\n\2\3\2\3\2\3\2\3\2\5\2\u0096\n\2\3\2\3\2\3\2\5\2\u009b\n\2\3\2\3\2\5"+
		"\2\u009f\n\2\3\2\3\2\3\2\5\2\u00a4\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\u00ae\n\3\3\4\3\4\3\4\3\4\5\4\u00b4\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u00bb"+
		"\n\5\f\5\16\5\u00be\13\5\3\6\3\6\5\6\u00c2\n\6\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00c9\n\7\f\7\16\7\u00cc\13\7\3\b\5\b\u00cf\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00d7\n\b\3\b\3\b\3\b\5\b\u00dc\n\b\3\t\3\t\5\t\u00e0\n\t\3\n\3"+
		"\n\3\n\3\n\6\n\u00e6\n\n\r\n\16\n\u00e7\5\n\u00ea\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00f2\n\13\f\13\16\13\u00f5\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00fc\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\5\20\u0107"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u010f\n\20\3\20\3\20\3\20\5\20"+
		"\u0114\n\20\3\21\3\21\3\21\6\21\u0119\n\21\r\21\16\21\u011a\3\21\3\21"+
		"\5\21\u011f\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0127\n\22\f\22\16"+
		"\22\u012a\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u0131\n\23\3\24\3\24\3\25"+
		"\3\25\5\25\u0137\n\25\3\26\3\26\3\26\3\26\5\26\u013d\n\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0149\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0155\n\26\3\26\3\26\3\26\3\26"+
		"\6\26\u015b\n\26\r\26\16\26\u015c\3\26\7\26\u0160\n\26\f\26\16\26\u0163"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0172\n\26\3\27\3\27\3\27\3\27\6\27\u0178\n\27\r\27\16\27\u0179"+
		"\3\27\5\27\u017d\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0185\n\30\f"+
		"\30\16\30\u0188\13\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0196\n\33\3\34\3\34\3\34\3\34\3\34\7\34\u019d\n\34\f"+
		"\34\16\34\u01a0\13\34\3\35\3\35\5\35\u01a4\n\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u01ab\n\35\3\35\3\35\5\35\u01af\n\35\3\36\3\36\3\36\7\36\u01b4"+
		"\n\36\f\36\16\36\u01b7\13\36\3\36\3\36\3\36\3\36\7\36\u01bd\n\36\f\36"+
		"\16\36\u01c0\13\36\3\36\3\36\3\36\3\36\7\36\u01c6\n\36\f\36\16\36\u01c9"+
		"\13\36\3\36\3\36\6\36\u01cd\n\36\r\36\16\36\u01ce\3\36\5\36\u01d2\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u01d9\n\37\f\37\16\37\u01dc\13\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01ec\n \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u01fa\n!\3\"\3\"\3\"\3\"\6\"\u0200\n\"\r\"\16\"\u0201"+
		"\5\"\u0204\n\"\3#\3#\3#\3#\3#\5#\u020b\n#\3#\3#\3#\3#\3#\3#\7#\u0213\n"+
		"#\f#\16#\u0216\13#\3$\3$\5$\u021a\n$\3%\3%\3%\3%\5%\u0220\n%\3%\3%\3%"+
		"\3%\5%\u0226\n%\5%\u0228\n%\3&\3&\3&\3&\3&\3&\3&\3&\6&\u0232\n&\r&\16"+
		"&\u0233\3&\3&\3&\3&\3&\3&\5&\u023c\n&\3\'\3\'\3\'\3\'\3\'\5\'\u0243\n"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u024d\n(\3)\3)\5)\u0251\n)\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u026a\n-\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0277\n/\f/\16/\u027a\13/\3/\3/\3/"+
		"\3/\3/\7/\u0281\n/\f/\16/\u0284\13/\3/\5/\u0287\n/\3\60\3\60\3\60\3\60"+
		"\5\60\u028d\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\6\62\u029a\n\62\r\62\16\62\u029b\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02a4"+
		"\n\62\3\63\3\63\3\63\3\63\5\63\u02aa\n\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\7\64\u02b2\n\64\f\64\16\64\u02b5\13\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\7\65\u02bd\n\65\f\65\16\65\u02c0\13\65\3\66\3\66\3\66\5\66\u02c5\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u02cc\n\67\38\38\38\38\38\38\38\78\u02d5"+
		"\n8\f8\168\u02d8\138\39\39\3:\3:\3:\3:\3:\3:\3:\7:\u02e3\n:\f:\16:\u02e6"+
		"\13:\3;\3;\3<\3<\3<\3<\5<\u02ee\n<\3=\3=\3>\3>\5>\u02f4\n>\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\6?\u02ff\n?\r?\16?\u0300\3?\3?\3?\3?\3?\3?\5?\u0309\n"+
		"?\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\6A\u0316\nA\rA\16A\u0317\3A\3A\3A\3"+
		"A\3A\5A\u031f\nA\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\6C\u032e\nC\r"+
		"C\16C\u032f\3C\3C\5C\u0334\nC\3D\3D\3D\3D\5D\u033a\nD\3E\3E\3E\3E\6E\u0340"+
		"\nE\rE\16E\u0341\3E\5E\u0345\nE\3F\3F\3F\3F\3F\3F\7F\u034d\nF\fF\16F\u0350"+
		"\13F\3G\3G\3G\2\17\b\f\24\".\66<Dfhnr\u008aH\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2\7\3\2\4\7\3\2\62\63\3\2"+
		"\37 \3\2!\"\3\2\64\67\2\u0387\2\u00a3\3\2\2\2\4\u00ad\3\2\2\2\6\u00b3"+
		"\3\2\2\2\b\u00b5\3\2\2\2\n\u00c1\3\2\2\2\f\u00c3\3\2\2\2\16\u00db\3\2"+
		"\2\2\20\u00df\3\2\2\2\22\u00e9\3\2\2\2\24\u00eb\3\2\2\2\26\u00fb\3\2\2"+
		"\2\30\u00fd\3\2\2\2\32\u00ff\3\2\2\2\34\u0101\3\2\2\2\36\u0113\3\2\2\2"+
		" \u011e\3\2\2\2\"\u0120\3\2\2\2$\u0130\3\2\2\2&\u0132\3\2\2\2(\u0136\3"+
		"\2\2\2*\u0171\3\2\2\2,\u017c\3\2\2\2.\u017e\3\2\2\2\60\u0189\3\2\2\2\62"+
		"\u018c\3\2\2\2\64\u0195\3\2\2\2\66\u0197\3\2\2\28\u01ae\3\2\2\2:\u01d1"+
		"\3\2\2\2<\u01d3\3\2\2\2>\u01eb\3\2\2\2@\u01f9\3\2\2\2B\u0203\3\2\2\2D"+
		"\u020a\3\2\2\2F\u0219\3\2\2\2H\u0227\3\2\2\2J\u023b\3\2\2\2L\u0242\3\2"+
		"\2\2N\u024c\3\2\2\2P\u0250\3\2\2\2R\u0252\3\2\2\2T\u0258\3\2\2\2V\u025e"+
		"\3\2\2\2X\u0269\3\2\2\2Z\u026b\3\2\2\2\\\u0286\3\2\2\2^\u0288\3\2\2\2"+
		"`\u028e\3\2\2\2b\u02a3\3\2\2\2d\u02a9\3\2\2\2f\u02ab\3\2\2\2h\u02b6\3"+
		"\2\2\2j\u02c4\3\2\2\2l\u02cb\3\2\2\2n\u02cd\3\2\2\2p\u02d9\3\2\2\2r\u02db"+
		"\3\2\2\2t\u02e7\3\2\2\2v\u02ed\3\2\2\2x\u02ef\3\2\2\2z\u02f3\3\2\2\2|"+
		"\u0308\3\2\2\2~\u030a\3\2\2\2\u0080\u031e\3\2\2\2\u0082\u0320\3\2\2\2"+
		"\u0084\u0333\3\2\2\2\u0086\u0339\3\2\2\2\u0088\u0344\3\2\2\2\u008a\u0346"+
		"\3\2\2\2\u008c\u0351\3\2\2\2\u008e\u0090\5\f\7\2\u008f\u008e\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\5\4\3\2\u0092\u0093\7\2"+
		"\2\3\u0093\u00a4\3\2\2\2\u0094\u0096\5\f\7\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\2\2\3\u0098\u00a4\b\2"+
		"\1\2\u0099\u009b\5\f\7\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\5\4\3\2\u009d\u009f\5\f\7\2\u009e\u009d\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\2\2\3\u00a1"+
		"\u00a2\b\2\1\2\u00a2\u00a4\3\2\2\2\u00a3\u008f\3\2\2\2\u00a3\u0095\3\2"+
		"\2\2\u00a3\u009a\3\2\2\2\u00a4\3\3\2\2\2\u00a5\u00a6\5\6\4\2\u00a6\u00a7"+
		"\7\26\2\2\u00a7\u00a8\5:\36\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\5\6\4\2"+
		"\u00aa\u00ab\b\3\1\2\u00ab\u00ac\5:\36\2\u00ac\u00ae\3\2\2\2\u00ad\u00a5"+
		"\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\5\3\2\2\2\u00af\u00b0\7\b\2\2\u00b0"+
		"\u00b4\7\25\2\2\u00b1\u00b2\7\b\2\2\u00b2\u00b4\b\4\1\2\u00b3\u00af\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\7\3\2\2\2\u00b5\u00b6\b\5\1\2\u00b6\u00b7"+
		"\5\n\6\2\u00b7\u00bc\3\2\2\2\u00b8\u00b9\f\3\2\2\u00b9\u00bb\5\n\6\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\t\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\5\16\b\2\u00c0\u00c2"+
		"\5\36\20\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\13\3\2\2\2\u00c3"+
		"\u00c4\b\7\1\2\u00c4\u00c5\5*\26\2\u00c5\u00ca\3\2\2\2\u00c6\u00c7\f\3"+
		"\2\2\u00c7\u00c9\5*\26\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\r\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cd\u00cf\7\3\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\5\32\16\2\u00d1\u00d2\5\22\n\2\u00d2\u00d3\7\'\2"+
		"\2\u00d3\u00dc\3\2\2\2\u00d4\u00d6\b\b\1\2\u00d5\u00d7\7\3\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\5\32\16\2"+
		"\u00d9\u00da\5\22\n\2\u00da\u00dc\3\2\2\2\u00db\u00ce\3\2\2\2\u00db\u00d4"+
		"\3\2\2\2\u00dc\17\3\2\2\2\u00dd\u00e0\5\16\b\2\u00de\u00e0\5\36\20\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\21\3\2\2\2\u00e1\u00ea\5\24\13"+
		"\2\u00e2\u00e3\5\24\13\2\u00e3\u00e5\b\n\1\2\u00e4\u00e6\5\24\13\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e2\3\2\2\2\u00ea"+
		"\23\3\2\2\2\u00eb\u00ec\b\13\1\2\u00ec\u00ed\5\26\f\2\u00ed\u00f3\3\2"+
		"\2\2\u00ee\u00ef\f\3\2\2\u00ef\u00f0\7(\2\2\u00f0\u00f2\5\26\f\2\u00f1"+
		"\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\25\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fc\5\30\r\2\u00f7\u00f8"+
		"\5\30\r\2\u00f8\u00f9\7)\2\2\u00f9\u00fa\5f\64\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc\27\3\2\2\2\u00fd\u00fe\79\2\2"+
		"\u00fe\31\3\2\2\2\u00ff\u0100\t\2\2\2\u0100\33\3\2\2\2\u0101\u0102\5\32"+
		"\16\2\u0102\u0103\7\27\2\2\u0103\u0104\7\30\2\2\u0104\35\3\2\2\2\u0105"+
		"\u0107\7\3\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0109\5\34\17\2\u0109\u010a\5 \21\2\u010a\u010b\7\'\2\2\u010b"+
		"\u0114\3\2\2\2\u010c\u010e\b\20\1\2\u010d\u010f\7\3\2\2\u010e\u010d\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5\34\17\2\u0111"+
		"\u0112\5 \21\2\u0112\u0114\3\2\2\2\u0113\u0106\3\2\2\2\u0113\u010c\3\2"+
		"\2\2\u0114\37\3\2\2\2\u0115\u011f\5\"\22\2\u0116\u0118\5\"\22\2\u0117"+
		"\u0119\5\"\22\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\21\1\2\u011d"+
		"\u011f\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0116\3\2\2\2\u011f!\3\2\2\2"+
		"\u0120\u0121\b\22\1\2\u0121\u0122\5$\23\2\u0122\u0128\3\2\2\2\u0123\u0124"+
		"\f\4\2\2\u0124\u0125\7(\2\2\u0125\u0127\5$\23\2\u0126\u0123\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129#\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012b\u0131\5&\24\2\u012c\u012d\5&\24\2\u012d\u012e"+
		"\7)\2\2\u012e\u012f\5`\61\2\u012f\u0131\3\2\2\2\u0130\u012b\3\2\2\2\u0130"+
		"\u012c\3\2\2\2\u0131%\3\2\2\2\u0132\u0133\79\2\2\u0133\'\3\2\2\2\u0134"+
		"\u0137\5\32\16\2\u0135\u0137\5\34\17\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137)\3\2\2\2\u0138\u013c\7\21\2\2\u0139\u013d\5\32\16\2\u013a"+
		"\u013d\5\34\17\2\u013b\u013d\7\17\2\2\u013c\u0139\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\79\2\2\u013f"+
		"\u0140\7\25\2\2\u0140\u0141\5,\27\2\u0141\u0142\7\26\2\2\u0142\u0143\5"+
		":\36\2\u0143\u0172\3\2\2\2\u0144\u0148\7\21\2\2\u0145\u0149\5\32\16\2"+
		"\u0146\u0149\5\34\17\2\u0147\u0149\7\17\2\2\u0148\u0145\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b\26"+
		"\1\2\u014b\u014c\7\25\2\2\u014c\u014d\5,\27\2\u014d\u014e\7\26\2\2\u014e"+
		"\u014f\5:\36\2\u014f\u0172\3\2\2\2\u0150\u0154\7\21\2\2\u0151\u0155\5"+
		"\32\16\2\u0152\u0155\5\34\17\2\u0153\u0155\7\17\2\2\u0154\u0151\3\2\2"+
		"\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015a"+
		"\b\26\1\2\u0157\u015b\5\32\16\2\u0158\u015b\5\34\17\2\u0159\u015b\7\17"+
		"\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0161\3\2"+
		"\2\2\u015e\u0160\79\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0164\u0165\7\25\2\2\u0165\u0166\5,\27\2\u0166\u0167\7\26\2\2\u0167"+
		"\u0168\5:\36\2\u0168\u0172\3\2\2\2\u0169\u016a\7\21\2\2\u016a\u016b\b"+
		"\26\1\2\u016b\u016c\79\2\2\u016c\u016d\7\25\2\2\u016d\u016e\5,\27\2\u016e"+
		"\u016f\7\26\2\2\u016f\u0170\5:\36\2\u0170\u0172\3\2\2\2\u0171\u0138\3"+
		"\2\2\2\u0171\u0144\3\2\2\2\u0171\u0150\3\2\2\2\u0171\u0169\3\2\2\2\u0172"+
		"+\3\2\2\2\u0173\u017d\5.\30\2\u0174\u0175\5.\30\2\u0175\u0177\b\27\1\2"+
		"\u0176\u0178\5.\30\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u0173\3\2\2\2\u017c\u0174\3\2\2\2\u017c\u017b\3\2\2\2\u017d-\3\2\2\2"+
		"\u017e\u017f\b\30\1\2\u017f\u0180\5\60\31\2\u0180\u0186\3\2\2\2\u0181"+
		"\u0182\f\4\2\2\u0182\u0183\7(\2\2\u0183\u0185\5\60\31\2\u0184\u0181\3"+
		"\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"/\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\5(\25\2\u018a\u018b\5\62\32"+
		"\2\u018b\61\3\2\2\2\u018c\u018d\79\2\2\u018d\63\3\2\2\2\u018e\u0196\5"+
		"8\35\2\u018f\u0196\5:\36\2\u0190\u0196\5> \2\u0191\u0196\5@!\2\u0192\u0196"+
		"\5H%\2\u0193\u0196\5P)\2\u0194\u0196\5\\/\2\u0195\u018e\3\2\2\2\u0195"+
		"\u018f\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0195\u0192\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\65\3\2\2\2\u0197\u0198"+
		"\b\34\1\2\u0198\u0199\5\64\33\2\u0199\u019e\3\2\2\2\u019a\u019b\f\3\2"+
		"\2\u019b\u019d\5\64\33\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\67\3\2\2\2\u01a0\u019e\3\2\2"+
		"\2\u01a1\u01a4\5^\60\2\u01a2\u01a4\5\u0084C\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7\'\2\2\u01a6\u01af\3\2"+
		"\2\2\u01a7\u01aa\b\35\1\2\u01a8\u01ab\5^\60\2\u01a9\u01ab\5\u0084C\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01af\3\2\2\2\u01ac\u01ad\7\'"+
		"\2\2\u01ad\u01af\b\35\1\2\u01ae\u01a3\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af9\3\2\2\2\u01b0\u01b5\7\31\2\2\u01b1\u01b4\5<\37\2"+
		"\u01b2\u01b4\5\66\34\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01d2\7\32\2\2\u01b9\u01be\7\31\2\2\u01ba\u01bd\5"+
		"<\37\2\u01bb\u01bd\5\66\34\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c1\u01d2\b\36\1\2\u01c2\u01c7\7\31\2\2\u01c3"+
		"\u01c6\5<\37\2\u01c4\u01c6\5\66\34\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3"+
		"\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\7\32\2\2\u01cb\u01cd\7"+
		"\32\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\b\36\1\2\u01d1\u01b0\3"+
		"\2\2\2\u01d1\u01b9\3\2\2\2\u01d1\u01c2\3\2\2\2\u01d2;\3\2\2\2\u01d3\u01d4"+
		"\b\37\1\2\u01d4\u01d5\5\20\t\2\u01d5\u01da\3\2\2\2\u01d6\u01d7\f\3\2\2"+
		"\u01d7\u01d9\5\20\t\2\u01d8\u01d6\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db=\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01de\7\24\2\2\u01de\u01df\7\25\2\2\u01df\u01e0\7\64\2\2\u01e0\u01e1"+
		"\7(\2\2\u01e1\u01e2\79\2\2\u01e2\u01e3\7\26\2\2\u01e3\u01ec\7\'\2\2\u01e4"+
		"\u01e5\b \1\2\u01e5\u01e6\7\24\2\2\u01e6\u01e7\7\25\2\2\u01e7\u01e8\7"+
		"\64\2\2\u01e8\u01e9\7(\2\2\u01e9\u01ea\79\2\2\u01ea\u01ec\7\26\2\2\u01eb"+
		"\u01dd\3\2\2\2\u01eb\u01e4\3\2\2\2\u01ec?\3\2\2\2\u01ed\u01ee\7\23\2\2"+
		"\u01ee\u01ef\7\25\2\2\u01ef\u01f0\5B\"\2\u01f0\u01f1\7\26\2\2\u01f1\u01f2"+
		"\7\'\2\2\u01f2\u01fa\3\2\2\2\u01f3\u01f4\b!\1\2\u01f4\u01f5\7\23\2\2\u01f5"+
		"\u01f6\7\25\2\2\u01f6\u01f7\5B\"\2\u01f7\u01f8\7\26\2\2\u01f8\u01fa\3"+
		"\2\2\2\u01f9\u01ed\3\2\2\2\u01f9\u01f3\3\2\2\2\u01faA\3\2\2\2\u01fb\u0204"+
		"\5D#\2\u01fc\u01fd\b\"\1\2\u01fd\u01ff\5D#\2\u01fe\u0200\5D#\2\u01ff\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0204\3\2\2\2\u0203\u01fb\3\2\2\2\u0203\u01fc\3\2\2\2\u0204C\3\2\2\2"+
		"\u0205\u0206\b#\1\2\u0206\u020b\5F$\2\u0207\u0208\b#\1\2\u0208\u0209\7"+
		"\37\2\2\u0209\u020b\5D#\3\u020a\u0205\3\2\2\2\u020a\u0207\3\2\2\2\u020b"+
		"\u0214\3\2\2\2\u020c\u020d\f\6\2\2\u020d\u020e\7\37\2\2\u020e\u0213\5"+
		"F$\2\u020f\u0210\f\4\2\2\u0210\u0211\7\37\2\2\u0211\u0213\b#\1\2\u0212"+
		"\u020c\3\2\2\2\u0212\u020f\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215E\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u021a"+
		"\7\64\2\2\u0218\u021a\5f\64\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2"+
		"\u021aG\3\2\2\2\u021b\u021c\5J&\2\u021c\u021d\7\r\2\2\u021d\u021f\5:\36"+
		"\2\u021e\u0220\5N(\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0228"+
		"\3\2\2\2\u0221\u0222\5J&\2\u0222\u0223\b%\1\2\u0223\u0225\5:\36\2\u0224"+
		"\u0226\5N(\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2"+
		"\2\u0227\u021b\3\2\2\2\u0227\u0221\3\2\2\2\u0228I\3\2\2\2\u0229\u022a"+
		"\7\f\2\2\u022a\u022b\5L\'\2\u022b\u022c\7\26\2\2\u022c\u023c\3\2\2\2\u022d"+
		"\u022e\7\f\2\2\u022e\u022f\5L\'\2\u022f\u0231\7\26\2\2\u0230\u0232\7\26"+
		"\2\2\u0231\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0231\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\b&\1\2\u0236\u023c\3\2"+
		"\2\2\u0237\u0238\7\f\2\2\u0238\u0239\5L\'\2\u0239\u023a\b&\1\2\u023a\u023c"+
		"\3\2\2\2\u023b\u0229\3\2\2\2\u023b\u022d\3\2\2\2\u023b\u0237\3\2\2\2\u023c"+
		"K\3\2\2\2\u023d\u023e\7\25\2\2\u023e\u0243\5f\64\2\u023f\u0240\5f\64\2"+
		"\u0240\u0241\b\'\1\2\u0241\u0243\3\2\2\2\u0242\u023d\3\2\2\2\u0242\u023f"+
		"\3\2\2\2\u0243M\3\2\2\2\u0244\u0245\7\n\2\2\u0245\u0246\7\r\2\2\u0246"+
		"\u024d\5:\36\2\u0247\u0248\7\n\2\2\u0248\u024d\5H%\2\u0249\u024a\7\n\2"+
		"\2\u024a\u024b\b(\1\2\u024b\u024d\5:\36\2\u024c\u0244\3\2\2\2\u024c\u0247"+
		"\3\2\2\2\u024c\u0249\3\2\2\2\u024dO\3\2\2\2\u024e\u0251\5R*\2\u024f\u0251"+
		"\5T+\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251Q\3\2\2\2\u0252\u0253"+
		"\7\20\2\2\u0253\u0254\79\2\2\u0254\u0255\5V,\2\u0255\u0256\5l\67\2\u0256"+
		"\u0257\5:\36\2\u0257S\3\2\2\2\u0258\u0259\7\13\2\2\u0259\u025a\5X-\2\u025a"+
		"\u025b\5V,\2\u025b\u025c\5f\64\2\u025c\u025d\5:\36\2\u025dU\3\2\2\2\u025e"+
		"\u025f\t\3\2\2\u025fW\3\2\2\2\u0260\u0261\7\4\2\2\u0261\u0262\79\2\2\u0262"+
		"\u026a\5Z.\2\u0263\u0264\7\4\2\2\u0264\u0265\79\2\2\u0265\u026a\b-\1\2"+
		"\u0266\u0267\79\2\2\u0267\u026a\5Z.\2\u0268\u026a\79\2\2\u0269\u0260\3"+
		"\2\2\2\u0269\u0263\3\2\2\2\u0269\u0266\3\2\2\2\u0269\u0268\3\2\2\2\u026a"+
		"Y\3\2\2\2\u026b\u026c\7)\2\2\u026c\u026d\5f\64\2\u026d[\3\2\2\2\u026e"+
		"\u026f\7\16\2\2\u026f\u0270\5f\64\2\u0270\u0271\7\'\2\2\u0271\u0287\3"+
		"\2\2\2\u0272\u0273\7\16\2\2\u0273\u0278\b/\1\2\u0274\u0277\5\32\16\2\u0275"+
		"\u0277\5\34\17\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277\u027a\3"+
		"\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a"+
		"\u0278\3\2\2\2\u027b\u0287\7\'\2\2\u027c\u0282\7\16\2\2\u027d\u0281\5"+
		"f\64\2\u027e\u0281\5\32\16\2\u027f\u0281\5\34\17\2\u0280\u027d\3\2\2\2"+
		"\u0280\u027e\3\2\2\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0282\3\2\2\2\u0285"+
		"\u0287\b/\1\2\u0286\u026e\3\2\2\2\u0286\u0272\3\2\2\2\u0286\u027c\3\2"+
		"\2\2\u0287]\3\2\2\2\u0288\u0289\5|?\2\u0289\u028c\7)\2\2\u028a\u028d\5"+
		"f\64\2\u028b\u028d\5`\61\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d"+
		"_\3\2\2\2\u028e\u028f\7\22\2\2\u028f\u0290\5b\62\2\u0290a\3\2\2\2\u0291"+
		"\u0292\5\32\16\2\u0292\u0293\5d\63\2\u0293\u0294\7\30\2\2\u0294\u02a4"+
		"\3\2\2\2\u0295\u0296\5\32\16\2\u0296\u0297\5d\63\2\u0297\u0299\7\30\2"+
		"\2\u0298\u029a\7\30\2\2\u0299\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\b\62"+
		"\1\2\u029e\u02a4\3\2\2\2\u029f\u02a0\5\32\16\2\u02a0\u02a1\5d\63\2\u02a1"+
		"\u02a2\b\62\1\2\u02a2\u02a4\3\2\2\2\u02a3\u0291\3\2\2\2\u02a3\u0295\3"+
		"\2\2\2\u02a3\u029f\3\2\2\2\u02a4c\3\2\2\2\u02a5\u02a6\7\27\2\2\u02a6\u02aa"+
		"\5l\67\2\u02a7\u02a8\7\27\2\2\u02a8\u02aa\b\63\1\2\u02a9\u02a5\3\2\2\2"+
		"\u02a9\u02a7\3\2\2\2\u02aae\3\2\2\2\u02ab\u02ac\b\64\1\2\u02ac\u02ad\5"+
		"h\65\2\u02ad\u02b3\3\2\2\2\u02ae\u02af\f\3\2\2\u02af\u02b0\7$\2\2\u02b0"+
		"\u02b2\5h\65\2\u02b1\u02ae\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2"+
		"\2\2\u02b3\u02b4\3\2\2\2\u02b4g\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7"+
		"\b\65\1\2\u02b7\u02b8\5j\66\2\u02b8\u02be\3\2\2\2\u02b9\u02ba\f\3\2\2"+
		"\u02ba\u02bb\7#\2\2\u02bb\u02bd\5j\66\2\u02bc\u02b9\3\2\2\2\u02bd\u02c0"+
		"\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bfi\3\2\2\2\u02c0"+
		"\u02be\3\2\2\2\u02c1\u02c2\7%\2\2\u02c2\u02c5\5j\66\2\u02c3\u02c5\5l\67"+
		"\2\u02c4\u02c1\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5k\3\2\2\2\u02c6\u02cc"+
		"\5n8\2\u02c7\u02c8\5n8\2\u02c8\u02c9\7\61\2\2\u02c9\u02ca\5n8\2\u02ca"+
		"\u02cc\3\2\2\2\u02cb\u02c6\3\2\2\2\u02cb\u02c7\3\2\2\2\u02ccm\3\2\2\2"+
		"\u02cd\u02ce\b8\1\2\u02ce\u02cf\5r:\2\u02cf\u02d6\3\2\2\2\u02d0\u02d1"+
		"\f\4\2\2\u02d1\u02d2\5p9\2\u02d2\u02d3\5r:\2\u02d3\u02d5\3\2\2\2\u02d4"+
		"\u02d0\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2"+
		"\2\2\u02d7o\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\t\4\2\2\u02daq\3\2"+
		"\2\2\u02db\u02dc\b:\1\2\u02dc\u02dd\5v<\2\u02dd\u02e4\3\2\2\2\u02de\u02df"+
		"\f\4\2\2\u02df\u02e0\5t;\2\u02e0\u02e1\5v<\2\u02e1\u02e3\3\2\2\2\u02e2"+
		"\u02de\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2"+
		"\2\2\u02e5s\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e8\t\5\2\2\u02e8u\3\2"+
		"\2\2\u02e9\u02ea\5x=\2\u02ea\u02eb\5v<\2\u02eb\u02ee\3\2\2\2\u02ec\u02ee"+
		"\5z>\2\u02ed\u02e9\3\2\2\2\u02ed\u02ec\3\2\2\2\u02eew\3\2\2\2\u02ef\u02f0"+
		"\7 \2\2\u02f0y\3\2\2\2\u02f1\u02f4\5\u0080A\2\u02f2\u02f4\5|?\2\u02f3"+
		"\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4{\3\2\2\2\u02f5\u0309\79\2\2\u02f6"+
		"\u02f7\79\2\2\u02f7\u02f8\5~@\2\u02f8\u02f9\7\30\2\2\u02f9\u0309\3\2\2"+
		"\2\u02fa\u02fb\79\2\2\u02fb\u02fc\5~@\2\u02fc\u02fe\7\30\2\2\u02fd\u02ff"+
		"\7\30\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u02fe\3\2\2\2"+
		"\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\b?\1\2\u0303\u0309"+
		"\3\2\2\2\u0304\u0305\79\2\2\u0305\u0306\5~@\2\u0306\u0307\b?\1\2\u0307"+
		"\u0309\3\2\2\2\u0308\u02f5\3\2\2\2\u0308\u02f6\3\2\2\2\u0308\u02fa\3\2"+
		"\2\2\u0308\u0304\3\2\2\2\u0309}\3\2\2\2\u030a\u030b\7\27\2\2\u030b\u030c"+
		"\5f\64\2\u030c\177\3\2\2\2\u030d\u031f\5\u0084C\2\u030e\u031f\5\u008c"+
		"G\2\u030f\u0310\5\u0082B\2\u0310\u0311\7\26\2\2\u0311\u031f\3\2\2\2\u0312"+
		"\u0313\5\u0082B\2\u0313\u0315\7\26\2\2\u0314\u0316\7\26\2\2\u0315\u0314"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031a\bA\1\2\u031a\u031f\3\2\2\2\u031b\u031c\5\u0082"+
		"B\2\u031c\u031d\bA\1\2\u031d\u031f\3\2\2\2\u031e\u030d\3\2\2\2\u031e\u030e"+
		"\3\2\2\2\u031e\u030f\3\2\2\2\u031e\u0312\3\2\2\2\u031e\u031b\3\2\2\2\u031f"+
		"\u0081\3\2\2\2\u0320\u0321\7\25\2\2\u0321\u0322\5f\64\2\u0322\u0083\3"+
		"\2\2\2\u0323\u0324\79\2\2\u0324\u0325\5\u0086D\2\u0325\u0326\7\26\2\2"+
		"\u0326\u0334\3\2\2\2\u0327\u0328\79\2\2\u0328\u0329\5\u0086D\2\u0329\u032d"+
		"\7\26\2\2\u032a\u032b\5\u0086D\2\u032b\u032c\7\26\2\2\u032c\u032e\3\2"+
		"\2\2\u032d\u032a\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u032d\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\bC\1\2\u0332\u0334\3\2"+
		"\2\2\u0333\u0323\3\2\2\2\u0333\u0327\3\2\2\2\u0334\u0085\3\2\2\2\u0335"+
		"\u0336\7\25\2\2\u0336\u033a\5\u0088E\2\u0337\u0338\bD\1\2\u0338\u033a"+
		"\5\u0088E\2\u0339\u0335\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u0087\3\2\2"+
		"\2\u033b\u0345\5\u008aF\2\u033c\u033d\5\u008aF\2\u033d\u033f\bE\1\2\u033e"+
		"\u0340\5\u008aF\2\u033f\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u033f"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0345\3\2\2\2\u0344"+
		"\u033b\3\2\2\2\u0344\u033c\3\2\2\2\u0344\u0343\3\2\2\2\u0345\u0089\3\2"+
		"\2\2\u0346\u0347\bF\1\2\u0347\u0348\5f\64\2\u0348\u034e\3\2\2\2\u0349"+
		"\u034a\f\3\2\2\u034a\u034b\7(\2\2\u034b\u034d\5f\64\2\u034c\u0349\3\2"+
		"\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u008b\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0352\t\6\2\2\u0352\u008d\3\2"+
		"\2\2`\u008f\u0095\u009a\u009e\u00a3\u00ad\u00b3\u00bc\u00c1\u00ca\u00ce"+
		"\u00d6\u00db\u00df\u00e7\u00e9\u00f3\u00fb\u0106\u010e\u0113\u011a\u011e"+
		"\u0128\u0130\u0136\u013c\u0148\u0154\u015a\u015c\u0161\u0171\u0179\u017c"+
		"\u0186\u0195\u019e\u01a3\u01aa\u01ae\u01b3\u01b5\u01bc\u01be\u01c5\u01c7"+
		"\u01ce\u01d1\u01da\u01eb\u01f9\u0201\u0203\u020a\u0212\u0214\u0219\u021f"+
		"\u0225\u0227\u0233\u023b\u0242\u024c\u0250\u0269\u0276\u0278\u0280\u0282"+
		"\u0286\u028c\u029b\u02a3\u02a9\u02b3\u02be\u02c4\u02cb\u02d6\u02e4\u02ed"+
		"\u02f3\u0300\u0308\u0317\u031e\u032f\u0333\u0339\u0341\u0344\u034e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}