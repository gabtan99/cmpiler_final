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
		Up=44, Down=45, To=46, DoubleQuote=47, Upto=48, Downto=49, StringLiteral=50, 
		INTEGERCONSTANT=51, FLOATCONSTANT=52, BOOLCONSTANT=53, STRINGCONSTANT=54, 
		IDENTIFIER=55, BlockComment=56, LineComment=57, WS=58;
	public static final int
		RULE_program = 0, RULE_mainProgram = 1, RULE_variableDeclaration = 2, 
		RULE_scopedVariableDeclaration = 3, RULE_variableDeclarationInitialize = 4, 
		RULE_typeSpecifier = 5, RULE_arrayTypeSpecifier = 6, RULE_arrayVariableDeclaration = 7, 
		RULE_arrayVariableDeclarationInitialize = 8, RULE_typeSpecifierSelector = 9, 
		RULE_functionDeclaration = 10, RULE_params = 11, RULE_parameter = 12, 
		RULE_statement = 13, RULE_expressionStmt = 14, RULE_compoundStmt = 15, 
		RULE_compoundStmtBody = 16, RULE_scanStmt = 17, RULE_printStmt = 18, RULE_printParams = 19, 
		RULE_printParamsSelector = 20, RULE_selectionStmt = 21, RULE_elseSelector = 22, 
		RULE_iterationStmt = 23, RULE_whileStatement = 24, RULE_forStatement = 25, 
		RULE_iterationToStatement = 26, RULE_loopDeclaration = 27, RULE_returnStmt = 28, 
		RULE_assignmentStandaloneExpression = 29, RULE_createArrayExpression = 30, 
		RULE_simpleExpression = 31, RULE_andExpression = 32, RULE_unaryRelExpression = 33, 
		RULE_relExpression = 34, RULE_relOperator = 35, RULE_sumExpression = 36, 
		RULE_sumOperator = 37, RULE_mulExpression = 38, RULE_mulOperator = 39, 
		RULE_unaryExpression = 40, RULE_unaryOperator = 41, RULE_factor = 42, 
		RULE_mutable = 43, RULE_immutable = 44, RULE_call = 45, RULE_arguments = 46, 
		RULE_constant = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainProgram", "variableDeclaration", "scopedVariableDeclaration", 
			"variableDeclarationInitialize", "typeSpecifier", "arrayTypeSpecifier", 
			"arrayVariableDeclaration", "arrayVariableDeclarationInitialize", "typeSpecifierSelector", 
			"functionDeclaration", "params", "parameter", "statement", "expressionStmt", 
			"compoundStmt", "compoundStmtBody", "scanStmt", "printStmt", "printParams", 
			"printParamsSelector", "selectionStmt", "elseSelector", "iterationStmt", 
			"whileStatement", "forStatement", "iterationToStatement", "loopDeclaration", 
			"returnStmt", "assignmentStandaloneExpression", "createArrayExpression", 
			"simpleExpression", "andExpression", "unaryRelExpression", "relExpression", 
			"relOperator", "sumExpression", "sumOperator", "mulExpression", "mulOperator", 
			"unaryExpression", "unaryOperator", "factor", "mutable", "immutable", 
			"call", "arguments", "constant"
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
			"'...'", "'up'", "'down'", "'to'", "'\"'"
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
			"Down", "To", "DoubleQuote", "Upto", "Downto", "StringLiteral", "INTEGERCONSTANT", 
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
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Func) {
				{
				{
				setState(96);
				functionDeclaration();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			mainProgram();
			setState(103);
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
		public TerminalNode Main() { return getToken(PSCParser.Main, 0); }
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
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
			setState(105);
			match(Main);
			setState(106);
			match(LeftParen);
			setState(107);
			match(RightParen);
			setState(108);
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
		enterRule(_localctx, 4, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ConstantKey) {
				{
				setState(110);
				match(ConstantKey);
				}
			}

			setState(113);
			typeSpecifier();
			setState(114);
			variableDeclarationInitialize();
			setState(115);
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
		enterRule(_localctx, 6, RULE_scopedVariableDeclaration);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
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
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 8, RULE_variableDeclarationInitialize);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(IDENTIFIER);
				setState(123);
				match(Assign);
				setState(124);
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
		enterRule(_localctx, 10, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		enterRule(_localctx, 12, RULE_arrayTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			typeSpecifier();
			setState(130);
			match(LeftBracket);
			setState(131);
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
		enterRule(_localctx, 14, RULE_arrayVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ConstantKey) {
				{
				setState(133);
				match(ConstantKey);
				}
			}

			setState(136);
			arrayTypeSpecifier();
			setState(137);
			arrayVariableDeclarationInitialize();
			setState(138);
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
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public TerminalNode Assign() { return getToken(PSCParser.Assign, 0); }
		public CreateArrayExpressionContext createArrayExpression() {
			return getRuleContext(CreateArrayExpressionContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
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
		enterRule(_localctx, 16, RULE_arrayVariableDeclarationInitialize);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(IDENTIFIER);
				setState(142);
				match(Assign);
				setState(143);
				createArrayExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(IDENTIFIER);
				setState(145);
				match(Assign);
				setState(146);
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
		enterRule(_localctx, 18, RULE_typeSpecifierSelector);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				typeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
		enterRule(_localctx, 20, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Func);
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(154);
				typeSpecifier();
				}
				break;
			case 2:
				{
				setState(155);
				arrayTypeSpecifier();
				}
				break;
			case 3:
				{
				setState(156);
				match(Void);
				}
				break;
			}
			setState(159);
			match(IDENTIFIER);
			setState(160);
			match(LeftParen);
			setState(161);
			params();
			setState(162);
			match(RightParen);
			setState(163);
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PSCParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PSCParser.Comma, i);
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
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case String:
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				parameter();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(166);
					match(Comma);
					setState(167);
					parameter();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeSpecifierSelectorContext typeSpecifierSelector() {
			return getRuleContext(TypeSpecifierSelectorContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			typeSpecifierSelector();
			setState(177);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				expressionStmt();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				compoundStmt();
				}
				break;
			case Scan:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				scanStmt();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				printStmt();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				selectionStmt();
				}
				break;
			case For:
			case While:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				iterationStmt();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
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
		enterRule(_localctx, 28, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(188);
				assignmentStandaloneExpression();
				}
				break;
			case 2:
				{
				setState(189);
				call();
				}
				break;
			}
			setState(192);
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
		public List<CompoundStmtBodyContext> compoundStmtBody() {
			return getRuleContexts(CompoundStmtBodyContext.class);
		}
		public CompoundStmtBodyContext compoundStmtBody(int i) {
			return getRuleContext(CompoundStmtBodyContext.class,i);
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
		enterRule(_localctx, 30, RULE_compoundStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LeftBrace);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ConstantKey) | (1L << Int) | (1L << Float) | (1L << String) | (1L << Bool) | (1L << For) | (1L << If) | (1L << Return) | (1L << While) | (1L << Print) | (1L << Scan) | (1L << LeftBrace) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(195);
				compoundStmtBody();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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

	public static class CompoundStmtBodyContext extends ParserRuleContext {
		public ScopedVariableDeclarationContext scopedVariableDeclaration() {
			return getRuleContext(ScopedVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CompoundStmtBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmtBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterCompoundStmtBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitCompoundStmtBody(this);
		}
	}

	public final CompoundStmtBodyContext compoundStmtBody() throws RecognitionException {
		CompoundStmtBodyContext _localctx = new CompoundStmtBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compoundStmtBody);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ConstantKey:
			case Int:
			case Float:
			case String:
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				scopedVariableDeclaration();
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
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				statement();
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
		enterRule(_localctx, 34, RULE_scanStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(Scan);
			setState(208);
			match(LeftParen);
			setState(209);
			match(StringLiteral);
			setState(210);
			match(Comma);
			setState(211);
			match(IDENTIFIER);
			setState(212);
			match(RightParen);
			setState(213);
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
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public PrintParamsContext printParams() {
			return getRuleContext(PrintParamsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(PSCParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(PSCParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(PSCParser.StringLiteral, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PSCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PSCParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 36, RULE_printStmt);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(Print);
				setState(216);
				match(LeftParen);
				setState(217);
				printParams();
				setState(218);
				match(RightParen);
				setState(219);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(Print);
				setState(222);
				match(LeftParen);
				{
				setState(223);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					_la = _input.LA(1);
					if ( !(_la==StringLiteral || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral || _la==IDENTIFIER );
				}
				notifyErrorListeners("Missing quotation marks for these print parameters.");
				setState(230);
				match(RightParen);
				setState(231);
				match(Semi);
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
		public List<PrintParamsSelectorContext> printParamsSelector() {
			return getRuleContexts(PrintParamsSelectorContext.class);
		}
		public PrintParamsSelectorContext printParamsSelector(int i) {
			return getRuleContext(PrintParamsSelectorContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(PSCParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(PSCParser.Plus, i);
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
		enterRule(_localctx, 38, RULE_printParams);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				printParamsSelector();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Plus) {
					{
					{
					setState(235);
					match(Plus);
					setState(236);
					printParamsSelector();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				printParamsSelector();
				setState(243);
				match(Plus);
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(244);
					printParamsSelector();
					setState(245);
					match(Plus);
					}
					}
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral || _la==IDENTIFIER );
				notifyErrorListeners("Extra '+' symbols found.");
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

	public static class PrintParamsSelectorContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(PSCParser.StringLiteral, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 40, RULE_printParamsSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==IDENTIFIER) ) {
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

	public static class SelectionStmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PSCParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PSCParser.RightParen, 0); }
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
		enterRule(_localctx, 42, RULE_selectionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(If);
			setState(259);
			match(LeftParen);
			setState(260);
			simpleExpression(0);
			setState(261);
			match(RightParen);
			setState(262);
			match(Then);
			setState(263);
			compoundStmt();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(264);
				elseSelector();
				}
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
		enterRule(_localctx, 44, RULE_elseSelector);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(Else);
				setState(268);
				match(Then);
				setState(269);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(Else);
				setState(271);
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
		enterRule(_localctx, 46, RULE_iterationStmt);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				whileStatement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
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
		enterRule(_localctx, 48, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(While);
			setState(279);
			match(IDENTIFIER);
			setState(280);
			iterationToStatement();
			setState(281);
			relExpression();
			setState(282);
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
		enterRule(_localctx, 50, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(For);
			setState(285);
			loopDeclaration();
			setState(286);
			iterationToStatement();
			setState(287);
			simpleExpression(0);
			setState(288);
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
		public Token g;
		public TerminalNode Upto() { return getToken(PSCParser.Upto, 0); }
		public TerminalNode Downto() { return getToken(PSCParser.Downto, 0); }
		public TerminalNode Up() { return getToken(PSCParser.Up, 0); }
		public TerminalNode Down() { return getToken(PSCParser.Down, 0); }
		public TerminalNode To() { return getToken(PSCParser.To, 0); }
		public TerminalNode StringLiteral() { return getToken(PSCParser.StringLiteral, 0); }
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
		enterRule(_localctx, 52, RULE_iterationToStatement);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Upto:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(Upto);
				}
				break;
			case Downto:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(Downto);
				}
				break;
			case Up:
			case Down:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				((IterationToStatementContext)_localctx).g = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
					((IterationToStatementContext)_localctx).g = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				notifyErrorListeners("Missing 'to' after " + (((IterationToStatementContext)_localctx).g!=null?((IterationToStatementContext)_localctx).g.getText():null) + ".");
				}
				break;
			case To:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(To);
				notifyErrorListeners("Missing 'up' or 'down' in iteration statement.");
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(StringLiteral);
				notifyErrorListeners("Incorrect iterator. Should be 'up to' or 'down to");
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
		public TerminalNode Assign() { return getToken(PSCParser.Assign, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
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
		enterRule(_localctx, 54, RULE_loopDeclaration);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(Int);
				setState(301);
				match(IDENTIFIER);
				setState(302);
				match(Assign);
				setState(303);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(Int);
				setState(305);
				match(IDENTIFIER);
				notifyErrorListeners("Newly declared variables in loops needs to be assigned to a value immediately.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(IDENTIFIER);
				setState(308);
				match(Assign);
				setState(309);
				simpleExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(PSCParser.Return, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
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
		enterRule(_localctx, 56, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Return);
			setState(314);
			simpleExpression(0);
			setState(315);
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
		enterRule(_localctx, 58, RULE_assignmentStandaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			mutable();
			setState(318);
			match(Assign);
			setState(321);
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
				setState(319);
				simpleExpression(0);
				}
				break;
			case Create:
				{
				setState(320);
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
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PSCParser.LeftBracket, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PSCParser.RightBracket, 0); }
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
		enterRule(_localctx, 60, RULE_createArrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(Create);
			setState(324);
			typeSpecifier();
			setState(325);
			match(LeftBracket);
			setState(326);
			simpleExpression(0);
			setState(327);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_simpleExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(330);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(332);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(333);
						match(OrOr);
						setState(334);
						andExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(335);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(337); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(336);
								simpleExpression(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(339); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						notifyErrorListeners("Missing valid operators.");
						}
						break;
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(349);
			unaryRelExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(351);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(352);
					match(AndAnd);
					setState(353);
					unaryRelExpression();
					}
					} 
				}
				setState(358);
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
		enterRule(_localctx, 66, RULE_unaryRelExpression);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(Not);
				setState(360);
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
				setState(361);
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
		public TerminalNode Assign() { return getToken(PSCParser.Assign, 0); }
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
		enterRule(_localctx, 68, RULE_relExpression);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				sumExpression(0);
				setState(365);
				relOperator();
				setState(366);
				sumExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				sumExpression(0);
				setState(369);
				match(Assign);
				notifyErrorListeners("Wrong relational operator '='. Should be '=='.");
				setState(371);
				sumExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
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
		enterRule(_localctx, 70, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		public SumOperatorContext g;
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public SumExpressionContext sumExpression() {
			return getRuleContext(SumExpressionContext.class,0);
		}
		public List<SumOperatorContext> sumOperator() {
			return getRuleContexts(SumOperatorContext.class);
		}
		public SumOperatorContext sumOperator(int i) {
			return getRuleContext(SumOperatorContext.class,i);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_sumExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(379);
			mulExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(395);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new SumExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sumExpression);
						setState(381);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(382);
						sumOperator();
						setState(383);
						mulExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SumExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sumExpression);
						setState(385);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(386);
						sumOperator();
						setState(388); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(387);
								((SumExpressionContext)_localctx).g = sumOperator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(390); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(392);
						mulExpression(0);
						notifyErrorListeners("An extra '" + (((SumExpressionContext)_localctx).g!=null?_input.getText(((SumExpressionContext)_localctx).g.start,((SumExpressionContext)_localctx).g.stop):null) + "' operator is found. Remove this.");
						}
						break;
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 74, RULE_sumOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		public MulOperatorContext g;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public List<MulOperatorContext> mulOperator() {
			return getRuleContexts(MulOperatorContext.class);
		}
		public MulOperatorContext mulOperator(int i) {
			return getRuleContext(MulOperatorContext.class,i);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_mulExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(403);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
						setState(405);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(406);
						mulOperator();
						setState(407);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MulExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
						setState(409);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(410);
						mulOperator();
						setState(412); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(411);
							((MulExpressionContext)_localctx).g = mulOperator();
							}
							}
							setState(414); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Star || _la==Div );
						setState(416);
						unaryExpression();
						notifyErrorListeners("An extra '" + (((MulExpressionContext)_localctx).g!=null?_input.getText(((MulExpressionContext)_localctx).g.start,((MulExpressionContext)_localctx).g.stop):null) + "' operator is found. Remove this.");
						}
						break;
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 78, RULE_mulOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 80, RULE_unaryExpression);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				unaryOperator();
				setState(427);
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
				setState(429);
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
		enterRule(_localctx, 82, RULE_unaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		enterRule(_localctx, 84, RULE_factor);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				immutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
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
		public TerminalNode LeftBracket() { return getToken(PSCParser.LeftBracket, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
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
		enterRule(_localctx, 86, RULE_mutable);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(IDENTIFIER);
				setState(440);
				match(LeftBracket);
				setState(441);
				simpleExpression(0);
				setState(442);
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

	public static class ImmutableContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
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
		enterRule(_localctx, 88, RULE_immutable);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				call();
				}
				break;
			case StringLiteral:
			case INTEGERCONSTANT:
			case FLOATCONSTANT:
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				constant();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(LeftParen);
				setState(449);
				simpleExpression(0);
				setState(450);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSCParser.IDENTIFIER, 0); }
		public TerminalNode LeftParen() { return getToken(PSCParser.LeftParen, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		enterRule(_localctx, 90, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(IDENTIFIER);
			setState(455);
			match(LeftParen);
			setState(456);
			arguments();
			setState(457);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PSCParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PSCParser.Comma, i);
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
		enterRule(_localctx, 92, RULE_arguments);
		int _la;
		try {
			setState(468);
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
				setState(459);
				simpleExpression(0);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(460);
					match(Comma);
					setState(461);
					simpleExpression(0);
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 94, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
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
		case 31:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		case 32:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 36:
			return sumExpression_sempred((SumExpressionContext)_localctx, predIndex);
		case 38:
			return mulExpression_sempred((MulExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sumExpression_sempred(SumExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExpression_sempred(MulExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\5\4r\n\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\5\5z\n\5\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\5"+
		"\t\u0089\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0096\n\n"+
		"\3\13\3\13\5\13\u009a\n\13\3\f\3\f\3\f\3\f\5\f\u00a0\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\7\r\u00ab\n\r\f\r\16\r\u00ae\13\r\3\r\5\r\u00b1"+
		"\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd\n\17"+
		"\3\20\3\20\5\20\u00c1\n\20\3\20\3\20\3\21\3\21\7\21\u00c7\n\21\f\21\16"+
		"\21\u00ca\13\21\3\21\3\21\3\22\3\22\5\22\u00d0\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\6\24\u00e4\n\24\r\24\16\24\u00e5\3\24\3\24\3\24\5\24\u00eb\n\24\3\25"+
		"\3\25\3\25\7\25\u00f0\n\25\f\25\16\25\u00f3\13\25\3\25\3\25\3\25\3\25"+
		"\3\25\6\25\u00fa\n\25\r\25\16\25\u00fb\3\25\3\25\3\25\5\25\u0101\n\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010c\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0113\n\30\3\31\3\31\5\31\u0117\n\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u012d\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u013a\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\5\37\u0144\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\6!\u0154"+
		"\n!\r!\16!\u0155\3!\3!\7!\u015a\n!\f!\16!\u015d\13!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\7\"\u0165\n\"\f\"\16\"\u0168\13\"\3#\3#\3#\5#\u016d\n#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u0179\n$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\6&\u0187\n&\r&\16&\u0188\3&\3&\3&\7&\u018e\n&\f&\16&\u0191\13&\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\6(\u019f\n(\r(\16(\u01a0\3(\3(\3(\7("+
		"\u01a6\n(\f(\16(\u01a9\13(\3)\3)\3*\3*\3*\3*\5*\u01b1\n*\3+\3+\3,\3,\5"+
		",\u01b7\n,\3-\3-\3-\3-\3-\3-\5-\u01bf\n-\3.\3.\3.\3.\3.\3.\5.\u01c7\n"+
		".\3/\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u01d1\n\60\f\60\16\60\u01d4\13\60"+
		"\3\60\5\60\u01d7\n\60\3\61\3\61\3\61\2\6@BJN\62\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\t\3\2\4\7"+
		"\4\2\64\6499\3\2./\5\2\33\36%%**\3\2\37 \3\2!\"\3\2\64\67\2\u01e4\2e\3"+
		"\2\2\2\4k\3\2\2\2\6q\3\2\2\2\by\3\2\2\2\n\177\3\2\2\2\f\u0081\3\2\2\2"+
		"\16\u0083\3\2\2\2\20\u0088\3\2\2\2\22\u0095\3\2\2\2\24\u0099\3\2\2\2\26"+
		"\u009b\3\2\2\2\30\u00b0\3\2\2\2\32\u00b2\3\2\2\2\34\u00bc\3\2\2\2\36\u00c0"+
		"\3\2\2\2 \u00c4\3\2\2\2\"\u00cf\3\2\2\2$\u00d1\3\2\2\2&\u00ea\3\2\2\2"+
		"(\u0100\3\2\2\2*\u0102\3\2\2\2,\u0104\3\2\2\2.\u0112\3\2\2\2\60\u0116"+
		"\3\2\2\2\62\u0118\3\2\2\2\64\u011e\3\2\2\2\66\u012c\3\2\2\28\u0139\3\2"+
		"\2\2:\u013b\3\2\2\2<\u013f\3\2\2\2>\u0145\3\2\2\2@\u014b\3\2\2\2B\u015e"+
		"\3\2\2\2D\u016c\3\2\2\2F\u0178\3\2\2\2H\u017a\3\2\2\2J\u017c\3\2\2\2L"+
		"\u0192\3\2\2\2N\u0194\3\2\2\2P\u01aa\3\2\2\2R\u01b0\3\2\2\2T\u01b2\3\2"+
		"\2\2V\u01b6\3\2\2\2X\u01be\3\2\2\2Z\u01c6\3\2\2\2\\\u01c8\3\2\2\2^\u01d6"+
		"\3\2\2\2`\u01d8\3\2\2\2bd\5\26\f\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2fh\3\2\2\2ge\3\2\2\2hi\5\4\3\2ij\7\2\2\3j\3\3\2\2\2kl\7\b\2\2lm\7"+
		"\25\2\2mn\7\26\2\2no\5 \21\2o\5\3\2\2\2pr\7\3\2\2qp\3\2\2\2qr\3\2\2\2"+
		"rs\3\2\2\2st\5\f\7\2tu\5\n\6\2uv\7(\2\2v\7\3\2\2\2wz\5\6\4\2xz\5\20\t"+
		"\2yw\3\2\2\2yx\3\2\2\2z\t\3\2\2\2{\u0080\79\2\2|}\79\2\2}~\7+\2\2~\u0080"+
		"\5@!\2\177{\3\2\2\2\177|\3\2\2\2\u0080\13\3\2\2\2\u0081\u0082\t\2\2\2"+
		"\u0082\r\3\2\2\2\u0083\u0084\5\f\7\2\u0084\u0085\7\27\2\2\u0085\u0086"+
		"\7\30\2\2\u0086\17\3\2\2\2\u0087\u0089\7\3\2\2\u0088\u0087\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5\16\b\2\u008b\u008c\5"+
		"\22\n\2\u008c\u008d\7(\2\2\u008d\21\3\2\2\2\u008e\u0096\79\2\2\u008f\u0090"+
		"\79\2\2\u0090\u0091\7+\2\2\u0091\u0096\5> \2\u0092\u0093\79\2\2\u0093"+
		"\u0094\7+\2\2\u0094\u0096\5@!\2\u0095\u008e\3\2\2\2\u0095\u008f\3\2\2"+
		"\2\u0095\u0092\3\2\2\2\u0096\23\3\2\2\2\u0097\u009a\5\f\7\2\u0098\u009a"+
		"\5\16\b\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\25\3\2\2\2\u009b"+
		"\u009f\7\21\2\2\u009c\u00a0\5\f\7\2\u009d\u00a0\5\16\b\2\u009e\u00a0\7"+
		"\17\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\79\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\5\30"+
		"\r\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6\5 \21\2\u00a6\27\3\2\2\2\u00a7\u00ac"+
		"\5\32\16\2\u00a8\u00a9\7)\2\2\u00a9\u00ab\5\32\16\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b3\5\24\13\2\u00b3\u00b4\79\2"+
		"\2\u00b4\33\3\2\2\2\u00b5\u00bd\5\36\20\2\u00b6\u00bd\5 \21\2\u00b7\u00bd"+
		"\5$\23\2\u00b8\u00bd\5&\24\2\u00b9\u00bd\5,\27\2\u00ba\u00bd\5\60\31\2"+
		"\u00bb\u00bd\5:\36\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7"+
		"\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00c1\5<\37\2\u00bf\u00c1\5\\/\2"+
		"\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3"+
		"\7(\2\2\u00c3\37\3\2\2\2\u00c4\u00c8\7\31\2\2\u00c5\u00c7\5\"\22\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\32\2\2\u00cc"+
		"!\3\2\2\2\u00cd\u00d0\5\b\5\2\u00ce\u00d0\5\34\17\2\u00cf\u00cd\3\2\2"+
		"\2\u00cf\u00ce\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3"+
		"\7\25\2\2\u00d3\u00d4\7\64\2\2\u00d4\u00d5\7)\2\2\u00d5\u00d6\79\2\2\u00d6"+
		"\u00d7\7\26\2\2\u00d7\u00d8\7(\2\2\u00d8%\3\2\2\2\u00d9\u00da\7\23\2\2"+
		"\u00da\u00db\7\25\2\2\u00db\u00dc\5(\25\2\u00dc\u00dd\7\26\2\2\u00dd\u00de"+
		"\7(\2\2\u00de\u00eb\3\2\2\2\u00df\u00e0\7\23\2\2\u00e0\u00e1\7\25\2\2"+
		"\u00e1\u00e3\t\3\2\2\u00e2\u00e4\t\3\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\b\24\1\2\u00e8\u00e9\7\26\2\2\u00e9\u00eb\7(\2\2\u00ea\u00d9\3"+
		"\2\2\2\u00ea\u00df\3\2\2\2\u00eb\'\3\2\2\2\u00ec\u00f1\5*\26\2\u00ed\u00ee"+
		"\7\37\2\2\u00ee\u00f0\5*\26\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u0101\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f5\5*\26\2\u00f5\u00f9\7\37\2\2\u00f6\u00f7\5*\26\2"+
		"\u00f7\u00f8\7\37\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\b\25\1\2\u00fe\u0101\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00ec\3"+
		"\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00ff\3\2\2\2\u0101)\3\2\2\2\u0102\u0103"+
		"\t\3\2\2\u0103+\3\2\2\2\u0104\u0105\7\f\2\2\u0105\u0106\7\25\2\2\u0106"+
		"\u0107\5@!\2\u0107\u0108\7\26\2\2\u0108\u0109\7\r\2\2\u0109\u010b\5 \21"+
		"\2\u010a\u010c\5.\30\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c-"+
		"\3\2\2\2\u010d\u010e\7\n\2\2\u010e\u010f\7\r\2\2\u010f\u0113\5 \21\2\u0110"+
		"\u0111\7\n\2\2\u0111\u0113\5,\27\2\u0112\u010d\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113/\3\2\2\2\u0114\u0117\5\62\32\2\u0115\u0117\5\64\33\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\61\3\2\2\2\u0118\u0119\7\20\2"+
		"\2\u0119\u011a\79\2\2\u011a\u011b\5\66\34\2\u011b\u011c\5F$\2\u011c\u011d"+
		"\5 \21\2\u011d\63\3\2\2\2\u011e\u011f\7\13\2\2\u011f\u0120\58\35\2\u0120"+
		"\u0121\5\66\34\2\u0121\u0122\5@!\2\u0122\u0123\5 \21\2\u0123\65\3\2\2"+
		"\2\u0124\u012d\7\62\2\2\u0125\u012d\7\63\2\2\u0126\u0127\t\4\2\2\u0127"+
		"\u012d\b\34\1\2\u0128\u0129\7\60\2\2\u0129\u012d\b\34\1\2\u012a\u012b"+
		"\7\64\2\2\u012b\u012d\b\34\1\2\u012c\u0124\3\2\2\2\u012c\u0125\3\2\2\2"+
		"\u012c\u0126\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u012a\3\2\2\2\u012d\67"+
		"\3\2\2\2\u012e\u012f\7\4\2\2\u012f\u0130\79\2\2\u0130\u0131\7+\2\2\u0131"+
		"\u013a\5@!\2\u0132\u0133\7\4\2\2\u0133\u0134\79\2\2\u0134\u013a\b\35\1"+
		"\2\u0135\u0136\79\2\2\u0136\u0137\7+\2\2\u0137\u013a\5@!\2\u0138\u013a"+
		"\79\2\2\u0139\u012e\3\2\2\2\u0139\u0132\3\2\2\2\u0139\u0135\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a9\3\2\2\2\u013b\u013c\7\16\2\2\u013c\u013d\5@!\2\u013d"+
		"\u013e\7(\2\2\u013e;\3\2\2\2\u013f\u0140\5X-\2\u0140\u0143\7+\2\2\u0141"+
		"\u0144\5@!\2\u0142\u0144\5> \2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2"+
		"\u0144=\3\2\2\2\u0145\u0146\7\22\2\2\u0146\u0147\5\f\7\2\u0147\u0148\7"+
		"\27\2\2\u0148\u0149\5@!\2\u0149\u014a\7\30\2\2\u014a?\3\2\2\2\u014b\u014c"+
		"\b!\1\2\u014c\u014d\5B\"\2\u014d\u015b\3\2\2\2\u014e\u014f\f\4\2\2\u014f"+
		"\u0150\7$\2\2\u0150\u015a\5B\"\2\u0151\u0153\f\3\2\2\u0152\u0154\5@!\2"+
		"\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b!\1\2\u0158\u015a\3\2\2\2\u0159"+
		"\u014e\3\2\2\2\u0159\u0151\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015cA\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f"+
		"\b\"\1\2\u015f\u0160\5D#\2\u0160\u0166\3\2\2\2\u0161\u0162\f\3\2\2\u0162"+
		"\u0163\7#\2\2\u0163\u0165\5D#\2\u0164\u0161\3\2\2\2\u0165\u0168\3\2\2"+
		"\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167C\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0169\u016a\7&\2\2\u016a\u016d\5D#\2\u016b\u016d\5F$\2\u016c"+
		"\u0169\3\2\2\2\u016c\u016b\3\2\2\2\u016dE\3\2\2\2\u016e\u016f\5J&\2\u016f"+
		"\u0170\5H%\2\u0170\u0171\5J&\2\u0171\u0179\3\2\2\2\u0172\u0173\5J&\2\u0173"+
		"\u0174\7+\2\2\u0174\u0175\b$\1\2\u0175\u0176\5J&\2\u0176\u0179\3\2\2\2"+
		"\u0177\u0179\5J&\2\u0178\u016e\3\2\2\2\u0178\u0172\3\2\2\2\u0178\u0177"+
		"\3\2\2\2\u0179G\3\2\2\2\u017a\u017b\t\5\2\2\u017bI\3\2\2\2\u017c\u017d"+
		"\b&\1\2\u017d\u017e\5N(\2\u017e\u018f\3\2\2\2\u017f\u0180\f\5\2\2\u0180"+
		"\u0181\5L\'\2\u0181\u0182\5N(\2\u0182\u018e\3\2\2\2\u0183\u0184\f\4\2"+
		"\2\u0184\u0186\5L\'\2\u0185\u0187\5L\'\2\u0186\u0185\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\5N(\2\u018b\u018c\b&\1\2\u018c\u018e\3\2\2\2\u018d\u017f\3\2\2"+
		"\2\u018d\u0183\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190K\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\t\6\2\2\u0193"+
		"M\3\2\2\2\u0194\u0195\b(\1\2\u0195\u0196\5R*\2\u0196\u01a7\3\2\2\2\u0197"+
		"\u0198\f\5\2\2\u0198\u0199\5P)\2\u0199\u019a\5R*\2\u019a\u01a6\3\2\2\2"+
		"\u019b\u019c\f\4\2\2\u019c\u019e\5P)\2\u019d\u019f\5P)\2\u019e\u019d\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\5R*\2\u01a3\u01a4\b(\1\2\u01a4\u01a6\3\2\2"+
		"\2\u01a5\u0197\3\2\2\2\u01a5\u019b\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8O\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ab\t\7\2\2\u01abQ\3\2\2\2\u01ac\u01ad\5T+\2\u01ad\u01ae\5R*\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01b1\5V,\2\u01b0\u01ac\3\2\2\2\u01b0\u01af\3\2\2"+
		"\2\u01b1S\3\2\2\2\u01b2\u01b3\7 \2\2\u01b3U\3\2\2\2\u01b4\u01b7\5Z.\2"+
		"\u01b5\u01b7\5X-\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7W\3\2"+
		"\2\2\u01b8\u01bf\79\2\2\u01b9\u01ba\79\2\2\u01ba\u01bb\7\27\2\2\u01bb"+
		"\u01bc\5@!\2\u01bc\u01bd\7\30\2\2\u01bd\u01bf\3\2\2\2\u01be\u01b8\3\2"+
		"\2\2\u01be\u01b9\3\2\2\2\u01bfY\3\2\2\2\u01c0\u01c7\5\\/\2\u01c1\u01c7"+
		"\5`\61\2\u01c2\u01c3\7\25\2\2\u01c3\u01c4\5@!\2\u01c4\u01c5\7\26\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c2\3\2"+
		"\2\2\u01c7[\3\2\2\2\u01c8\u01c9\79\2\2\u01c9\u01ca\7\25\2\2\u01ca\u01cb"+
		"\5^\60\2\u01cb\u01cc\7\26\2\2\u01cc]\3\2\2\2\u01cd\u01d2\5@!\2\u01ce\u01cf"+
		"\7)\2\2\u01cf\u01d1\5@!\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d7\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01cd\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"_\3\2\2\2\u01d8\u01d9\t\b\2\2\u01d9a\3\2\2\2-eqy\177\u0088\u0095\u0099"+
		"\u009f\u00ac\u00b0\u00bc\u00c0\u00c8\u00cf\u00e5\u00ea\u00f1\u00fb\u0100"+
		"\u010b\u0112\u0116\u012c\u0139\u0143\u0155\u0159\u015b\u0166\u016c\u0178"+
		"\u0188\u018d\u018f\u01a0\u01a5\u01a7\u01b0\u01b6\u01be\u01c6\u01d2\u01d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}