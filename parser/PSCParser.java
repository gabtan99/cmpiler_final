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
		RESERVED_WORD=1, BOOLEAN=2, ID=3, STRING=4, NUMBER=5, OP_ADD_EQ=6, OP_SUB_EQ=7, 
		OP_MULT_EQ=8, OP_DIV_EQ=9, OP_ADD=10, OP_SUB=11, OP_MULT=12, OP_DIV=13, 
		OP_ASSIGN=14, OP_EQ=15, OP_GREATER_THAN=16, OP_LESS_THAN=17, OP_GREATER_EQ_THAN=18, 
		OP_LESS_EQ_THAN=19, GROUP_SYMB_OPEN=20, GROUP_SYMB_CLOSE=21, BRACKET_OPEN=22, 
		BRACKET_CLOSE=23, BRACE_OPEN=24, BRACE_CLOSE=25, REF=26, SEPARATOR=27, 
		COMMENT=28, WS=29;
	public static final int
		RULE_r = 0, RULE_declr = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "declr", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'+='", "'-='", "'*='", "'/='", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'=='", "'>'", "'<'", "'>='", "'<='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RESERVED_WORD", "BOOLEAN", "ID", "STRING", "NUMBER", "OP_ADD_EQ", 
			"OP_SUB_EQ", "OP_MULT_EQ", "OP_DIV_EQ", "OP_ADD", "OP_SUB", "OP_MULT", 
			"OP_DIV", "OP_ASSIGN", "OP_EQ", "OP_GREATER_THAN", "OP_LESS_THAN", "OP_GREATER_EQ_THAN", 
			"OP_LESS_EQ_THAN", "GROUP_SYMB_OPEN", "GROUP_SYMB_CLOSE", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "BRACE_OPEN", "BRACE_CLOSE", "REF", "SEPARATOR", "COMMENT", 
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

	public static class RContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PSCParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<DeclrContext> declr() {
			return getRuleContexts(DeclrContext.class);
		}
		public DeclrContext declr(int i) {
			return getRuleContext(DeclrContext.class,i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(8);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(6);
					expr(0);
					}
					break;
				case 2:
					{
					setState(7);
					declr();
					}
					break;
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << GROUP_SYMB_OPEN))) != 0) );
			setState(12);
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

	public static class DeclrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PSCParser.ID, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(PSCParser.OP_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterDeclr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitDeclr(this);
		}
	}

	public final DeclrContext declr() throws RecognitionException {
		DeclrContext _localctx = new DeclrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(ID);
			setState(15);
			match(OP_ASSIGN);
			setState(16);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode GROUP_SYMB_OPEN() { return getToken(PSCParser.GROUP_SYMB_OPEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GROUP_SYMB_CLOSE() { return getToken(PSCParser.GROUP_SYMB_CLOSE, 0); }
		public TerminalNode NUMBER() { return getToken(PSCParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(PSCParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(PSCParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(PSCParser.ID, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(PSCParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(PSCParser.SEPARATOR, i);
		}
		public TerminalNode OP_MULT() { return getToken(PSCParser.OP_MULT, 0); }
		public TerminalNode OP_DIV() { return getToken(PSCParser.OP_DIV, 0); }
		public TerminalNode OP_ADD() { return getToken(PSCParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(PSCParser.OP_SUB, 0); }
		public TerminalNode OP_GREATER_EQ_THAN() { return getToken(PSCParser.OP_GREATER_EQ_THAN, 0); }
		public TerminalNode OP_LESS_EQ_THAN() { return getToken(PSCParser.OP_LESS_EQ_THAN, 0); }
		public TerminalNode OP_GREATER_THAN() { return getToken(PSCParser.OP_GREATER_THAN, 0); }
		public TerminalNode OP_LESS_THAN() { return getToken(PSCParser.OP_LESS_THAN, 0); }
		public TerminalNode OP_EQ() { return getToken(PSCParser.OP_EQ, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSCListener ) ((PSCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(19);
				match(GROUP_SYMB_OPEN);
				setState(20);
				expr(0);
				setState(21);
				match(GROUP_SYMB_CLOSE);
				}
				break;
			case 2:
				{
				setState(23);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(24);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(25);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(26);
				match(ID);
				}
				break;
			case 6:
				{
				setState(27);
				match(GROUP_SYMB_OPEN);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << GROUP_SYMB_OPEN))) != 0)) {
					{
					{
					setState(28);
					expr(0);
					setState(31); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(29);
						match(SEPARATOR);
						setState(30);
						expr(0);
						}
						}
						setState(33); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEPARATOR );
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				match(GROUP_SYMB_CLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(44);
						match(OP_MULT);
						setState(45);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(47);
						match(OP_DIV);
						setState(48);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(49);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(50);
						match(OP_ADD);
						setState(51);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(52);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(53);
						match(OP_SUB);
						setState(54);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(55);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(56);
						match(OP_GREATER_EQ_THAN);
						setState(57);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(59);
						match(OP_LESS_EQ_THAN);
						setState(60);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(62);
						match(OP_GREATER_THAN);
						setState(63);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(65);
						match(OP_LESS_THAN);
						setState(66);
						expr(9);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(68);
						match(OP_EQ);
						setState(69);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\"\n\4\r\4\16\4#\7\4"+
		"&\n\4\f\4\16\4)\13\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4I\n\4\f\4\16\4L\13\4\3\4\2\3\6\5\2\4\6\2\2\2\\\2\n\3\2\2\2\4\20"+
		"\3\2\2\2\6+\3\2\2\2\b\13\5\6\4\2\t\13\5\4\3\2\n\b\3\2\2\2\n\t\3\2\2\2"+
		"\13\f\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\16\3\2\2\2\16\17\7\2\2\3\17\3"+
		"\3\2\2\2\20\21\7\5\2\2\21\22\7\20\2\2\22\23\5\6\4\2\23\5\3\2\2\2\24\25"+
		"\b\4\1\2\25\26\7\26\2\2\26\27\5\6\4\2\27\30\7\27\2\2\30,\3\2\2\2\31,\7"+
		"\7\2\2\32,\7\6\2\2\33,\7\4\2\2\34,\7\5\2\2\35\'\7\26\2\2\36!\5\6\4\2\37"+
		" \7\35\2\2 \"\5\6\4\2!\37\3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2"+
		"\2\2%\36\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2"+
		"*,\7\27\2\2+\24\3\2\2\2+\31\3\2\2\2+\32\3\2\2\2+\33\3\2\2\2+\34\3\2\2"+
		"\2+\35\3\2\2\2,J\3\2\2\2-.\f\21\2\2./\7\16\2\2/I\5\6\4\22\60\61\f\20\2"+
		"\2\61\62\7\17\2\2\62I\5\6\4\21\63\64\f\17\2\2\64\65\7\f\2\2\65I\5\6\4"+
		"\20\66\67\f\16\2\2\678\7\r\2\28I\5\6\4\179:\f\r\2\2:;\7\24\2\2;I\5\6\4"+
		"\16<=\f\f\2\2=>\7\25\2\2>I\5\6\4\r?@\f\13\2\2@A\7\22\2\2AI\5\6\4\fBC\f"+
		"\n\2\2CD\7\23\2\2DI\5\6\4\13EF\f\t\2\2FG\7\21\2\2GI\5\6\4\nH-\3\2\2\2"+
		"H\60\3\2\2\2H\63\3\2\2\2H\66\3\2\2\2H9\3\2\2\2H<\3\2\2\2H?\3\2\2\2HB\3"+
		"\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\7\3\2\2\2LJ\3\2\2\2\t"+
		"\n\f#\'+HJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}