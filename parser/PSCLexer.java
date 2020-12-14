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
		ConstantKey=1, Int=2, Float=3, String=4, Bool=5, Main=6, Do=7, Else=8, 
		For=9, If=10, Then=11, Return=12, Void=13, While=14, Func=15, Create=16, 
		Print=17, Scan=18, LeftParen=19, RightParen=20, LeftBracket=21, RightBracket=22, 
		LeftBrace=23, RightBrace=24, Less=25, LessEqual=26, Greater=27, GreaterEqual=28, 
		Plus=29, Minus=30, Star=31, Div=32, AndAnd=33, OrOr=34, NotEqual=35, Not=36, 
		Colon=37, Semi=38, Comma=39, Equal=40, Assign=41, Dot=42, Ellipsis=43, 
		Up=44, Down=45, To=46, Upto=47, Downto=48, StringLiteral=49, INTEGERCONSTANT=50, 
		FLOATCONSTANT=51, BOOLCONSTANT=52, STRINGCONSTANT=53, IDENTIFIER=54, BlockComment=55, 
		LineComment=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ConstantKey", "Int", "Float", "String", "Bool", "Main", "Do", "Else", 
			"For", "If", "Then", "Return", "Void", "While", "Func", "Create", "Print", 
			"Scan", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "Plus", 
			"Minus", "Star", "Div", "AndAnd", "OrOr", "NotEqual", "Not", "Colon", 
			"Semi", "Comma", "Equal", "Assign", "Dot", "Ellipsis", "Up", "Down", 
			"To", "NonDigit", "DoubleQuotation", "Digit", "DigitSequence", "FloatSuffix", 
			"FractionalConstant", "DecimalFloatingConstant", "EscapeSequence", "SimpleEscapeSequence", 
			"SChar", "SCharSequence", "Space", "Upto", "Downto", "StringLiteral", 
			"INTEGERCONSTANT", "FLOATCONSTANT", "BOOLCONSTANT", "STRINGCONSTANT", 
			"IDENTIFIER", "BlockComment", "LineComment", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01af\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\6\63\u013b\n\63\r\63\16\63\u013c\3\64\3\64\3\65\5\65\u0142"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u0149\n\65\3\66\3\66\3\66\3\67\3\67"+
		"\38\38\38\39\39\39\39\39\39\39\59\u015a\n9\3:\6:\u015d\n:\r:\16:\u015e"+
		"\3;\3;\3<\3<\6<\u0165\n<\r<\16<\u0166\3<\3<\3=\3=\6=\u016d\n=\r=\16=\u016e"+
		"\3=\3=\3>\3>\7>\u0175\n>\f>\16>\u0178\13>\3>\3>\3?\3?\3@\3@\3A\3A\3B\3"+
		"B\5B\u0184\nB\3B\3B\3C\3C\3C\7C\u018b\nC\fC\16C\u018e\13C\3D\3D\3D\3D"+
		"\7D\u0194\nD\fD\16D\u0197\13D\3D\3D\3D\3D\3D\3E\3E\3E\3E\7E\u01a2\nE\f"+
		"E\16E\u01a5\13E\3E\3E\3F\6F\u01aa\nF\rF\16F\u01ab\3F\3F\3\u0195\2G\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2"+
		"w\61y\62{\63}\64\177\65\u0081\66\u0083\67\u00858\u00879\u0089:\u008b;"+
		"\3\2\n\5\2C\\aac|\3\2\62;\f\2$$))AA^^cdhhppttvvxx\6\2\f\f\17\17$$^^\3"+
		"\2\"\"\4\2HHVV\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u01b2\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2"+
		"\5\u0096\3\2\2\2\7\u009a\3\2\2\2\t\u00a0\3\2\2\2\13\u00a7\3\2\2\2\r\u00ac"+
		"\3\2\2\2\17\u00b1\3\2\2\2\21\u00b4\3\2\2\2\23\u00b9\3\2\2\2\25\u00bd\3"+
		"\2\2\2\27\u00c0\3\2\2\2\31\u00c5\3\2\2\2\33\u00cc\3\2\2\2\35\u00d1\3\2"+
		"\2\2\37\u00d7\3\2\2\2!\u00dc\3\2\2\2#\u00e3\3\2\2\2%\u00e9\3\2\2\2\'\u00ee"+
		"\3\2\2\2)\u00f0\3\2\2\2+\u00f2\3\2\2\2-\u00f4\3\2\2\2/\u00f6\3\2\2\2\61"+
		"\u00f8\3\2\2\2\63\u00fa\3\2\2\2\65\u00fc\3\2\2\2\67\u00ff\3\2\2\29\u0101"+
		"\3\2\2\2;\u0104\3\2\2\2=\u0106\3\2\2\2?\u0108\3\2\2\2A\u010a\3\2\2\2C"+
		"\u010c\3\2\2\2E\u010f\3\2\2\2G\u0112\3\2\2\2I\u0115\3\2\2\2K\u0117\3\2"+
		"\2\2M\u0119\3\2\2\2O\u011b\3\2\2\2Q\u011d\3\2\2\2S\u0120\3\2\2\2U\u0122"+
		"\3\2\2\2W\u0124\3\2\2\2Y\u0128\3\2\2\2[\u012b\3\2\2\2]\u0130\3\2\2\2_"+
		"\u0133\3\2\2\2a\u0135\3\2\2\2c\u0137\3\2\2\2e\u013a\3\2\2\2g\u013e\3\2"+
		"\2\2i\u0148\3\2\2\2k\u014a\3\2\2\2m\u014d\3\2\2\2o\u014f\3\2\2\2q\u0159"+
		"\3\2\2\2s\u015c\3\2\2\2u\u0160\3\2\2\2w\u0162\3\2\2\2y\u016a\3\2\2\2{"+
		"\u0172\3\2\2\2}\u017b\3\2\2\2\177\u017d\3\2\2\2\u0081\u017f\3\2\2\2\u0083"+
		"\u0181\3\2\2\2\u0085\u0187\3\2\2\2\u0087\u018f\3\2\2\2\u0089\u019d\3\2"+
		"\2\2\u008b\u01a9\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7p\2\2\u0090\u0091\7u\2\2\u0091\u0092\7v\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095\4\3\2\2\2\u0096\u0097\7k\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7v\2\2\u0099\6\3\2\2\2\u009a\u009b\7h\2\2\u009b"+
		"\u009c\7n\2\2\u009c\u009d\7q\2\2\u009d\u009e\7c\2\2\u009e\u009f\7v\2\2"+
		"\u009f\b\3\2\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t"+
		"\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7i\2\2\u00a6\n"+
		"\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"\u00ab\7n\2\2\u00ab\f\3\2\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7c\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\20\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8\22\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba"+
		"\u00bb\7q\2\2\u00bb\u00bc\7t\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7h\2\2\u00bf\26\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7j\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3\u00c4\7p\2\2\u00c4\30\3\2\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7t\2\2"+
		"\u00ca\u00cb\7p\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce\7"+
		"q\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7f\2\2\u00d0\34\3\2\2\2\u00d1\u00d2"+
		"\7y\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7w\2\2\u00d9"+
		"\u00da\7p\2\2\u00da\u00db\7e\2\2\u00db \3\2\2\2\u00dc\u00dd\7e\2\2\u00dd"+
		"\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7v\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7t"+
		"\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2\u00e8$\3"+
		"\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7c\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed&\3\2\2\2\u00ee\u00ef\7*\2\2\u00ef(\3\2\2\2\u00f0\u00f1"+
		"\7+\2\2\u00f1*\3\2\2\2\u00f2\u00f3\7]\2\2\u00f3,\3\2\2\2\u00f4\u00f5\7"+
		"_\2\2\u00f5.\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7\60\3\2\2\2\u00f8\u00f9\7"+
		"\177\2\2\u00f9\62\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb\64\3\2\2\2\u00fc\u00fd"+
		"\7>\2\2\u00fd\u00fe\7?\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7@\2\2\u01008"+
		"\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103\7?\2\2\u0103:\3\2\2\2\u0104\u0105"+
		"\7-\2\2\u0105<\3\2\2\2\u0106\u0107\7/\2\2\u0107>\3\2\2\2\u0108\u0109\7"+
		",\2\2\u0109@\3\2\2\2\u010a\u010b\7\61\2\2\u010bB\3\2\2\2\u010c\u010d\7"+
		"(\2\2\u010d\u010e\7(\2\2\u010eD\3\2\2\2\u010f\u0110\7~\2\2\u0110\u0111"+
		"\7~\2\2\u0111F\3\2\2\2\u0112\u0113\7#\2\2\u0113\u0114\7?\2\2\u0114H\3"+
		"\2\2\2\u0115\u0116\7#\2\2\u0116J\3\2\2\2\u0117\u0118\7<\2\2\u0118L\3\2"+
		"\2\2\u0119\u011a\7=\2\2\u011aN\3\2\2\2\u011b\u011c\7.\2\2\u011cP\3\2\2"+
		"\2\u011d\u011e\7?\2\2\u011e\u011f\7?\2\2\u011fR\3\2\2\2\u0120\u0121\7"+
		"?\2\2\u0121T\3\2\2\2\u0122\u0123\7\60\2\2\u0123V\3\2\2\2\u0124\u0125\7"+
		"\60\2\2\u0125\u0126\7\60\2\2\u0126\u0127\7\60\2\2\u0127X\3\2\2\2\u0128"+
		"\u0129\7w\2\2\u0129\u012a\7r\2\2\u012aZ\3\2\2\2\u012b\u012c\7f\2\2\u012c"+
		"\u012d\7q\2\2\u012d\u012e\7y\2\2\u012e\u012f\7p\2\2\u012f\\\3\2\2\2\u0130"+
		"\u0131\7v\2\2\u0131\u0132\7q\2\2\u0132^\3\2\2\2\u0133\u0134\t\2\2\2\u0134"+
		"`\3\2\2\2\u0135\u0136\7$\2\2\u0136b\3\2\2\2\u0137\u0138\t\3\2\2\u0138"+
		"d\3\2\2\2\u0139\u013b\5c\62\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013df\3\2\2\2\u013e\u013f\7"+
		"h\2\2\u013fh\3\2\2\2\u0140\u0142\5e\63\2\u0141\u0140\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\60\2\2\u0144\u0149\5e\63\2"+
		"\u0145\u0146\5e\63\2\u0146\u0147\7\60\2\2\u0147\u0149\3\2\2\2\u0148\u0141"+
		"\3\2\2\2\u0148\u0145\3\2\2\2\u0149j\3\2\2\2\u014a\u014b\5i\65\2\u014b"+
		"\u014c\5g\64\2\u014cl\3\2\2\2\u014d\u014e\5o8\2\u014en\3\2\2\2\u014f\u0150"+
		"\7^\2\2\u0150\u0151\t\4\2\2\u0151p\3\2\2\2\u0152\u015a\n\5\2\2\u0153\u015a"+
		"\5m\67\2\u0154\u0155\7^\2\2\u0155\u015a\7\f\2\2\u0156\u0157\7^\2\2\u0157"+
		"\u0158\7\17\2\2\u0158\u015a\7\f\2\2\u0159\u0152\3\2\2\2\u0159\u0153\3"+
		"\2\2\2\u0159\u0154\3\2\2\2\u0159\u0156\3\2\2\2\u015ar\3\2\2\2\u015b\u015d"+
		"\5q9\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015ft\3\2\2\2\u0160\u0161\t\6\2\2\u0161v\3\2\2\2\u0162"+
		"\u0164\5Y-\2\u0163\u0165\5u;\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2"+
		"\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169"+
		"\5]/\2\u0169x\3\2\2\2\u016a\u016c\5[.\2\u016b\u016d\5u;\2\u016c\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\5]/\2\u0171z\3\2\2\2\u0172\u0176\5a\61\2\u0173"+
		"\u0175\5s:\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2"+
		"\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a"+
		"\5a\61\2\u017a|\3\2\2\2\u017b\u017c\5e\63\2\u017c~\3\2\2\2\u017d\u017e"+
		"\5k\66\2\u017e\u0080\3\2\2\2\u017f\u0180\t\7\2\2\u0180\u0082\3\2\2\2\u0181"+
		"\u0183\5a\61\2\u0182\u0184\5s:\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2"+
		"\2\u0184\u0185\3\2\2\2\u0185\u0186\5a\61\2\u0186\u0084\3\2\2\2\u0187\u018c"+
		"\5_\60\2\u0188\u018b\5_\60\2\u0189\u018b\5c\62\2\u018a\u0188\3\2\2\2\u018a"+
		"\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u0086\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\61\2\2\u0190"+
		"\u0191\7,\2\2\u0191\u0195\3\2\2\2\u0192\u0194\13\2\2\2\u0193\u0192\3\2"+
		"\2\2\u0194\u0197\3\2\2\2\u0195\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7,\2\2\u0199\u019a\7\61"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019c\bD\2\2\u019c\u0088\3\2\2\2\u019d"+
		"\u019e\7\61\2\2\u019e\u019f\7\61\2\2\u019f\u01a3\3\2\2\2\u01a0\u01a2\n"+
		"\b\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\bE"+
		"\2\2\u01a7\u008a\3\2\2\2\u01a8\u01aa\t\t\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01ae\bF\2\2\u01ae\u008c\3\2\2\2\21\2\u013c\u0141\u0148\u0159"+
		"\u015e\u0166\u016e\u0176\u0183\u018a\u018c\u0195\u01a3\u01ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}