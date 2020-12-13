// Generated from grammar/PSC.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ConstantKey=1, Int=2, Float=3, String=4, Bool=5, MAIN=6, Do=7, Else=8, 
		For=9, If=10, Then=11, Return=12, Void=13, While=14, Func=15, Create=16, 
		Print=17, Scan=18, LeftParen=19, RightParen=20, LeftBracket=21, RightBracket=22, 
		LeftBrace=23, RightBrace=24, Less=25, LessEqual=26, Greater=27, GreaterEqual=28, 
		Plus=29, Minus=30, Star=31, Div=32, AndAnd=33, OrOr=34, Not=35, Colon=36, 
		Semi=37, Comma=38, Assign=39, Equal=40, NotEqual=41, Dot=42, Ellipsis=43, 
		Up=44, Down=45, To=46, StringLiteral=47, INTEGERCONSTANT=48, FLOATCONSTANT=49, 
		BOOLCONSTANT=50, STRINGCONSTANT=51, IDENTIFIER=52, BlockComment=53, LineComment=54, 
		WS=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ConstantKey", "Int", "Float", "String", "Bool", "MAIN", "Do", "Else", 
			"For", "If", "Then", "Return", "Void", "While", "Func", "Create", "Print", 
			"Scan", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "Plus", 
			"Minus", "Star", "Div", "AndAnd", "OrOr", "Not", "Colon", "Semi", "Comma", 
			"Assign", "Equal", "NotEqual", "Dot", "Ellipsis", "Up", "Down", "To", 
			"NonDigit", "DoubleQuotation", "Digit", "DigitSequence", "FloatSuffix", 
			"FractionalConstant", "DecimalFloatingConstant", "EscapeSequence", "SimpleEscapeSequence", 
			"SChar", "SCharSequence", "StringLiteral", "INTEGERCONSTANT", "FLOATCONSTANT", 
			"BOOLCONSTANT", "STRINGCONSTANT", "IDENTIFIER", "BlockComment", "LineComment", 
			"WS"
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
			null, "ConstantKey", "Int", "Float", "String", "Bool", "MAIN", "Do", 
			"Else", "For", "If", "Then", "Return", "Void", "While", "Func", "Create", 
			"Print", "Scan", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"Plus", "Minus", "Star", "Div", "AndAnd", "OrOr", "Not", "Colon", "Semi", 
			"Comma", "Assign", "Equal", "NotEqual", "Dot", "Ellipsis", "Up", "Down", 
			"To", "StringLiteral", "INTEGERCONSTANT", "FLOATCONSTANT", "BOOLCONSTANT", 
			"STRINGCONSTANT", "IDENTIFIER", "BlockComment", "LineComment", "WS"
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


	public PSCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PSC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0197\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\6\63\u0135"+
		"\n\63\r\63\16\63\u0136\3\64\3\64\3\65\5\65\u013c\n\65\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u0143\n\65\3\66\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3"+
		"9\39\39\39\59\u0154\n9\3:\6:\u0157\n:\r:\16:\u0158\3;\3;\7;\u015d\n;\f"+
		";\16;\u0160\13;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\5?\u016c\n?\3?\3?\3@\3@"+
		"\3@\7@\u0173\n@\f@\16@\u0176\13@\3A\3A\3A\3A\7A\u017c\nA\fA\16A\u017f"+
		"\13A\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u018a\nB\fB\16B\u018d\13B\3B\3B\3C"+
		"\6C\u0192\nC\rC\16C\u0193\3C\3C\3\u017d\2D\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\61w\62y\63{\64}\65\177"+
		"\66\u0081\67\u00838\u00859\3\2\t\5\2C\\aac|\3\2\62;\f\2$$))AA^^cdhhpp"+
		"ttvvxx\6\2\f\f\17\17$$^^\4\2HHVV\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0199"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2u\3\2\2\2\2w\3"+
		"\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2"+
		"\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u0090\3\2\2\2\7\u0094"+
		"\3\2\2\2\t\u009a\3\2\2\2\13\u00a1\3\2\2\2\r\u00a6\3\2\2\2\17\u00ab\3\2"+
		"\2\2\21\u00ae\3\2\2\2\23\u00b3\3\2\2\2\25\u00b7\3\2\2\2\27\u00ba\3\2\2"+
		"\2\31\u00bf\3\2\2\2\33\u00c6\3\2\2\2\35\u00cb\3\2\2\2\37\u00d1\3\2\2\2"+
		"!\u00d6\3\2\2\2#\u00dd\3\2\2\2%\u00e3\3\2\2\2\'\u00e8\3\2\2\2)\u00ea\3"+
		"\2\2\2+\u00ec\3\2\2\2-\u00ee\3\2\2\2/\u00f0\3\2\2\2\61\u00f2\3\2\2\2\63"+
		"\u00f4\3\2\2\2\65\u00f6\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u0100\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E"+
		"\u0109\3\2\2\2G\u010c\3\2\2\2I\u010e\3\2\2\2K\u0110\3\2\2\2M\u0112\3\2"+
		"\2\2O\u0114\3\2\2\2Q\u0116\3\2\2\2S\u0119\3\2\2\2U\u011c\3\2\2\2W\u011e"+
		"\3\2\2\2Y\u0122\3\2\2\2[\u0125\3\2\2\2]\u012a\3\2\2\2_\u012d\3\2\2\2a"+
		"\u012f\3\2\2\2c\u0131\3\2\2\2e\u0134\3\2\2\2g\u0138\3\2\2\2i\u0142\3\2"+
		"\2\2k\u0144\3\2\2\2m\u0147\3\2\2\2o\u0149\3\2\2\2q\u0153\3\2\2\2s\u0156"+
		"\3\2\2\2u\u015a\3\2\2\2w\u0163\3\2\2\2y\u0165\3\2\2\2{\u0167\3\2\2\2}"+
		"\u0169\3\2\2\2\177\u016f\3\2\2\2\u0081\u0177\3\2\2\2\u0083\u0185\3\2\2"+
		"\2\u0085\u0191\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a"+
		"\7p\2\2\u008a\u008b\7u\2\2\u008b\u008c\7v\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\4\3\2\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7p\2\2\u0092\u0093\7v\2\2\u0093\6\3\2\2\2\u0094\u0095\7h\2\2\u0095"+
		"\u0096\7n\2\2\u0096\u0097\7q\2\2\u0097\u0098\7c\2\2\u0098\u0099\7v\2\2"+
		"\u0099\b\3\2\2\2\u009a\u009b\7U\2\2\u009b\u009c\7v\2\2\u009c\u009d\7t"+
		"\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7i\2\2\u00a0\n"+
		"\3\2\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\f\3\2\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\16\3\2\2\2\u00ab\u00ac\7f\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4"+
		"\u00b5\7q\2\2\u00b5\u00b6\7t\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7h\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7j\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7t\2\2"+
		"\u00c4\u00c5\7p\2\2\u00c5\32\3\2\2\2\u00c6\u00c7\7x\2\2\u00c7\u00c8\7"+
		"q\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7f\2\2\u00ca\34\3\2\2\2\u00cb\u00cc"+
		"\7y\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7w\2\2\u00d3"+
		"\u00d4\7p\2\2\u00d4\u00d5\7e\2\2\u00d5 \3\2\2\2\u00d6\u00d7\7e\2\2\u00d7"+
		"\u00d8\7t\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7v\2\2"+
		"\u00db\u00dc\7g\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7t"+
		"\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2$\3"+
		"\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7c\2\2\u00e6"+
		"\u00e7\7p\2\2\u00e7&\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9(\3\2\2\2\u00ea\u00eb"+
		"\7+\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7]\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7"+
		"_\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7}\2\2\u00f1\60\3\2\2\2\u00f2\u00f3\7"+
		"\177\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\64\3\2\2\2\u00f6\u00f7"+
		"\7>\2\2\u00f7\u00f8\7?\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa8"+
		"\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7?\2\2\u00fd:\3\2\2\2\u00fe\u00ff"+
		"\7-\2\2\u00ff<\3\2\2\2\u0100\u0101\7/\2\2\u0101>\3\2\2\2\u0102\u0103\7"+
		",\2\2\u0103@\3\2\2\2\u0104\u0105\7\61\2\2\u0105B\3\2\2\2\u0106\u0107\7"+
		"(\2\2\u0107\u0108\7(\2\2\u0108D\3\2\2\2\u0109\u010a\7~\2\2\u010a\u010b"+
		"\7~\2\2\u010bF\3\2\2\2\u010c\u010d\7#\2\2\u010dH\3\2\2\2\u010e\u010f\7"+
		"<\2\2\u010fJ\3\2\2\2\u0110\u0111\7=\2\2\u0111L\3\2\2\2\u0112\u0113\7."+
		"\2\2\u0113N\3\2\2\2\u0114\u0115\7?\2\2\u0115P\3\2\2\2\u0116\u0117\7?\2"+
		"\2\u0117\u0118\7?\2\2\u0118R\3\2\2\2\u0119\u011a\7#\2\2\u011a\u011b\7"+
		"?\2\2\u011bT\3\2\2\2\u011c\u011d\7\60\2\2\u011dV\3\2\2\2\u011e\u011f\7"+
		"\60\2\2\u011f\u0120\7\60\2\2\u0120\u0121\7\60\2\2\u0121X\3\2\2\2\u0122"+
		"\u0123\7w\2\2\u0123\u0124\7r\2\2\u0124Z\3\2\2\2\u0125\u0126\7f\2\2\u0126"+
		"\u0127\7q\2\2\u0127\u0128\7y\2\2\u0128\u0129\7p\2\2\u0129\\\3\2\2\2\u012a"+
		"\u012b\7v\2\2\u012b\u012c\7q\2\2\u012c^\3\2\2\2\u012d\u012e\t\2\2\2\u012e"+
		"`\3\2\2\2\u012f\u0130\7$\2\2\u0130b\3\2\2\2\u0131\u0132\t\3\2\2\u0132"+
		"d\3\2\2\2\u0133\u0135\5c\62\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2"+
		"\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137f\3\2\2\2\u0138\u0139\7"+
		"h\2\2\u0139h\3\2\2\2\u013a\u013c\5e\63\2\u013b\u013a\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\60\2\2\u013e\u0143\5e\63\2"+
		"\u013f\u0140\5e\63\2\u0140\u0141\7\60\2\2\u0141\u0143\3\2\2\2\u0142\u013b"+
		"\3\2\2\2\u0142\u013f\3\2\2\2\u0143j\3\2\2\2\u0144\u0145\5i\65\2\u0145"+
		"\u0146\5g\64\2\u0146l\3\2\2\2\u0147\u0148\5o8\2\u0148n\3\2\2\2\u0149\u014a"+
		"\7^\2\2\u014a\u014b\t\4\2\2\u014bp\3\2\2\2\u014c\u0154\n\5\2\2\u014d\u0154"+
		"\5m\67\2\u014e\u014f\7^\2\2\u014f\u0154\7\f\2\2\u0150\u0151\7^\2\2\u0151"+
		"\u0152\7\17\2\2\u0152\u0154\7\f\2\2\u0153\u014c\3\2\2\2\u0153\u014d\3"+
		"\2\2\2\u0153\u014e\3\2\2\2\u0153\u0150\3\2\2\2\u0154r\3\2\2\2\u0155\u0157"+
		"\5q9\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159t\3\2\2\2\u015a\u015e\5a\61\2\u015b\u015d\5s:\2\u015c"+
		"\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\5a\61\2\u0162"+
		"v\3\2\2\2\u0163\u0164\5e\63\2\u0164x\3\2\2\2\u0165\u0166\5k\66\2\u0166"+
		"z\3\2\2\2\u0167\u0168\t\6\2\2\u0168|\3\2\2\2\u0169\u016b\5a\61\2\u016a"+
		"\u016c\5s:\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2"+
		"\2\u016d\u016e\5a\61\2\u016e~\3\2\2\2\u016f\u0174\5_\60\2\u0170\u0173"+
		"\5_\60\2\u0171\u0173\5c\62\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0080\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7\61\2\2\u0178\u0179\7,\2\2\u0179"+
		"\u017d\3\2\2\2\u017a\u017c\13\2\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3"+
		"\2\2\2\u017d\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0181\7,\2\2\u0181\u0182\7\61\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\bA\2\2\u0184\u0082\3\2\2\2\u0185\u0186\7\61\2\2\u0186"+
		"\u0187\7\61\2\2\u0187\u018b\3\2\2\2\u0188\u018a\n\7\2\2\u0189\u0188\3"+
		"\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\bB\2\2\u018f\u0084\3\2"+
		"\2\2\u0190\u0192\t\b\2\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\bC"+
		"\2\2\u0196\u0086\3\2\2\2\17\2\u0136\u013b\u0142\u0153\u0158\u015e\u016b"+
		"\u0172\u0174\u017d\u018b\u0193\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}