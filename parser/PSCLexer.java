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
		Plus=29, Minus=30, Star=31, Div=32, Modulo=33, AndAnd=34, OrOr=35, NotEqual=36, 
		Not=37, Colon=38, Semi=39, Comma=40, Equal=41, Assign=42, Dot=43, Ellipsis=44, 
		Up=45, Down=46, To=47, DoubleQuote=48, Upto=49, Downto=50, StringLiteral=51, 
		INTEGERCONSTANT=52, FLOATCONSTANT=53, BOOLCONSTANT=54, STRINGCONSTANT=55, 
		IDENTIFIER=56, BlockComment=57, LineComment=58, WS=59;
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
			"Minus", "Star", "Div", "Modulo", "AndAnd", "OrOr", "NotEqual", "Not", 
			"Colon", "Semi", "Comma", "Equal", "Assign", "Dot", "Ellipsis", "Up", 
			"Down", "To", "DoubleQuote", "NonDigit", "DoubleQuotation", "Digit", 
			"DigitSequence", "FloatSuffix", "FractionalConstant", "DecimalFloatingConstant", 
			"EscapeSequence", "SimpleEscapeSequence", "SChar", "SCharSequence", "Space", 
			"Upto", "Downto", "StringLiteral", "INTEGERCONSTANT", "FLOATCONSTANT", 
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
			"'%'", "'&&'", "'||'", "'!='", "'!'", "':'", "';'", "','", "'=='", "'='", 
			"'.'", "'...'", "'up'", "'down'", "'to'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ConstantKey", "Int", "Float", "String", "Bool", "Main", "Do", 
			"Else", "For", "If", "Then", "Return", "Void", "While", "Func", "Create", 
			"Print", "Scan", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"Plus", "Minus", "Star", "Div", "Modulo", "AndAnd", "OrOr", "NotEqual", 
			"Not", "Colon", "Semi", "Comma", "Equal", "Assign", "Dot", "Ellipsis", 
			"Up", "Down", "To", "DoubleQuote", "Upto", "Downto", "StringLiteral", 
			"INTEGERCONSTANT", "FLOATCONSTANT", "BOOLCONSTANT", "STRINGCONSTANT", 
			"IDENTIFIER", "BlockComment", "LineComment", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\6\65\u0143\n\65\r\65\16"+
		"\65\u0144\3\66\3\66\3\67\5\67\u014a\n\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u0151\n\67\38\38\38\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\5;\u0162\n;\3"+
		"<\6<\u0165\n<\r<\16<\u0166\3=\3=\3>\3>\6>\u016d\n>\r>\16>\u016e\3>\3>"+
		"\3?\3?\6?\u0175\n?\r?\16?\u0176\3?\3?\3@\3@\7@\u017d\n@\f@\16@\u0180\13"+
		"@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\5D\u018c\nD\3D\3D\3E\3E\3E\7E\u0193\n"+
		"E\fE\16E\u0196\13E\3F\3F\3F\3F\7F\u019c\nF\fF\16F\u019f\13F\3F\3F\3F\3"+
		"F\3F\3G\3G\3G\3G\7G\u01aa\nG\fG\16G\u01ad\13G\3G\3G\3H\6H\u01b2\nH\rH"+
		"\16H\u01b3\3H\3H\3\u019d\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\63}\64\177\65\u0081\66\u0083"+
		"\67\u00858\u00879\u0089:\u008b;\u008d<\u008f=\3\2\n\5\2C\\aac|\3\2\62"+
		";\f\2$$))AA^^cdhhppttvvxx\6\2\f\f\17\17$$^^\3\2\"\"\4\2HHVV\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\2\u01ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2"+
		"\2\5\u009a\3\2\2\2\7\u009e\3\2\2\2\t\u00a4\3\2\2\2\13\u00ab\3\2\2\2\r"+
		"\u00b0\3\2\2\2\17\u00b5\3\2\2\2\21\u00b8\3\2\2\2\23\u00bd\3\2\2\2\25\u00c1"+
		"\3\2\2\2\27\u00c4\3\2\2\2\31\u00c9\3\2\2\2\33\u00d0\3\2\2\2\35\u00d5\3"+
		"\2\2\2\37\u00db\3\2\2\2!\u00e0\3\2\2\2#\u00e7\3\2\2\2%\u00ed\3\2\2\2\'"+
		"\u00f2\3\2\2\2)\u00f4\3\2\2\2+\u00f6\3\2\2\2-\u00f8\3\2\2\2/\u00fa\3\2"+
		"\2\2\61\u00fc\3\2\2\2\63\u00fe\3\2\2\2\65\u0100\3\2\2\2\67\u0103\3\2\2"+
		"\29\u0105\3\2\2\2;\u0108\3\2\2\2=\u010a\3\2\2\2?\u010c\3\2\2\2A\u010e"+
		"\3\2\2\2C\u0110\3\2\2\2E\u0112\3\2\2\2G\u0115\3\2\2\2I\u0118\3\2\2\2K"+
		"\u011b\3\2\2\2M\u011d\3\2\2\2O\u011f\3\2\2\2Q\u0121\3\2\2\2S\u0123\3\2"+
		"\2\2U\u0126\3\2\2\2W\u0128\3\2\2\2Y\u012a\3\2\2\2[\u012e\3\2\2\2]\u0131"+
		"\3\2\2\2_\u0136\3\2\2\2a\u0139\3\2\2\2c\u013b\3\2\2\2e\u013d\3\2\2\2g"+
		"\u013f\3\2\2\2i\u0142\3\2\2\2k\u0146\3\2\2\2m\u0150\3\2\2\2o\u0152\3\2"+
		"\2\2q\u0155\3\2\2\2s\u0157\3\2\2\2u\u0161\3\2\2\2w\u0164\3\2\2\2y\u0168"+
		"\3\2\2\2{\u016a\3\2\2\2}\u0172\3\2\2\2\177\u017a\3\2\2\2\u0081\u0183\3"+
		"\2\2\2\u0083\u0185\3\2\2\2\u0085\u0187\3\2\2\2\u0087\u0189\3\2\2\2\u0089"+
		"\u018f\3\2\2\2\u008b\u0197\3\2\2\2\u008d\u01a5\3\2\2\2\u008f\u01b1\3\2"+
		"\2\2\u0091\u0092\7e\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094\u0095"+
		"\7u\2\2\u0095\u0096\7v\2\2\u0096\u0097\7c\2\2\u0097\u0098\7p\2\2\u0098"+
		"\u0099\7v\2\2\u0099\4\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7v\2\2\u009d\6\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7n\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7v\2\2\u00a3\b\3\2\2\2\u00a4"+
		"\u00a5\7U\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7k\2\2"+
		"\u00a8\u00a9\7p\2\2\u00a9\u00aa\7i\2\2\u00aa\n\3\2\2\2\u00ab\u00ac\7d"+
		"\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7n\2\2\u00af\f"+
		"\3\2\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\16\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\20\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\22\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7q\2\2\u00bf"+
		"\u00c0\7t\2\2\u00c0\24\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7h\2\2\u00c3"+
		"\26\3\2\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7p\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7v\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7p\2\2"+
		"\u00cf\32\3\2\2\2\u00d0\u00d1\7x\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7"+
		"k\2\2\u00d3\u00d4\7f\2\2\u00d4\34\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7"+
		"\7j\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\36\3\2\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7e\2\2\u00df \3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7g\2\2"+
		"\u00e6\"\3\2\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7k"+
		"\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec$\3\2\2\2\u00ed\u00ee"+
		"\7u\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1"+
		"&\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3(\3\2\2\2\u00f4\u00f5\7+\2\2\u00f5*"+
		"\3\2\2\2\u00f6\u00f7\7]\2\2\u00f7,\3\2\2\2\u00f8\u00f9\7_\2\2\u00f9.\3"+
		"\2\2\2\u00fa\u00fb\7}\2\2\u00fb\60\3\2\2\2\u00fc\u00fd\7\177\2\2\u00fd"+
		"\62\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\64\3\2\2\2\u0100\u0101\7>\2\2\u0101"+
		"\u0102\7?\2\2\u0102\66\3\2\2\2\u0103\u0104\7@\2\2\u01048\3\2\2\2\u0105"+
		"\u0106\7@\2\2\u0106\u0107\7?\2\2\u0107:\3\2\2\2\u0108\u0109\7-\2\2\u0109"+
		"<\3\2\2\2\u010a\u010b\7/\2\2\u010b>\3\2\2\2\u010c\u010d\7,\2\2\u010d@"+
		"\3\2\2\2\u010e\u010f\7\61\2\2\u010fB\3\2\2\2\u0110\u0111\7\'\2\2\u0111"+
		"D\3\2\2\2\u0112\u0113\7(\2\2\u0113\u0114\7(\2\2\u0114F\3\2\2\2\u0115\u0116"+
		"\7~\2\2\u0116\u0117\7~\2\2\u0117H\3\2\2\2\u0118\u0119\7#\2\2\u0119\u011a"+
		"\7?\2\2\u011aJ\3\2\2\2\u011b\u011c\7#\2\2\u011cL\3\2\2\2\u011d\u011e\7"+
		"<\2\2\u011eN\3\2\2\2\u011f\u0120\7=\2\2\u0120P\3\2\2\2\u0121\u0122\7."+
		"\2\2\u0122R\3\2\2\2\u0123\u0124\7?\2\2\u0124\u0125\7?\2\2\u0125T\3\2\2"+
		"\2\u0126\u0127\7?\2\2\u0127V\3\2\2\2\u0128\u0129\7\60\2\2\u0129X\3\2\2"+
		"\2\u012a\u012b\7\60\2\2\u012b\u012c\7\60\2\2\u012c\u012d\7\60\2\2\u012d"+
		"Z\3\2\2\2\u012e\u012f\7w\2\2\u012f\u0130\7r\2\2\u0130\\\3\2\2\2\u0131"+
		"\u0132\7f\2\2\u0132\u0133\7q\2\2\u0133\u0134\7y\2\2\u0134\u0135\7p\2\2"+
		"\u0135^\3\2\2\2\u0136\u0137\7v\2\2\u0137\u0138\7q\2\2\u0138`\3\2\2\2\u0139"+
		"\u013a\7$\2\2\u013ab\3\2\2\2\u013b\u013c\t\2\2\2\u013cd\3\2\2\2\u013d"+
		"\u013e\7$\2\2\u013ef\3\2\2\2\u013f\u0140\t\3\2\2\u0140h\3\2\2\2\u0141"+
		"\u0143\5g\64\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145j\3\2\2\2\u0146\u0147\7h\2\2\u0147l\3\2"+
		"\2\2\u0148\u014a\5i\65\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\7\60\2\2\u014c\u0151\5i\65\2\u014d\u014e\5"+
		"i\65\2\u014e\u014f\7\60\2\2\u014f\u0151\3\2\2\2\u0150\u0149\3\2\2\2\u0150"+
		"\u014d\3\2\2\2\u0151n\3\2\2\2\u0152\u0153\5m\67\2\u0153\u0154\5k\66\2"+
		"\u0154p\3\2\2\2\u0155\u0156\5s:\2\u0156r\3\2\2\2\u0157\u0158\7^\2\2\u0158"+
		"\u0159\t\4\2\2\u0159t\3\2\2\2\u015a\u0162\n\5\2\2\u015b\u0162\5q9\2\u015c"+
		"\u015d\7^\2\2\u015d\u0162\7\f\2\2\u015e\u015f\7^\2\2\u015f\u0160\7\17"+
		"\2\2\u0160\u0162\7\f\2\2\u0161\u015a\3\2\2\2\u0161\u015b\3\2\2\2\u0161"+
		"\u015c\3\2\2\2\u0161\u015e\3\2\2\2\u0162v\3\2\2\2\u0163\u0165\5u;\2\u0164"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167x\3\2\2\2\u0168\u0169\t\6\2\2\u0169z\3\2\2\2\u016a\u016c\5["+
		".\2\u016b\u016d\5y=\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5_\60\2\u0171"+
		"|\3\2\2\2\u0172\u0174\5]/\2\u0173\u0175\5y=\2\u0174\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u0179\5_\60\2\u0179~\3\2\2\2\u017a\u017e\5e\63\2\u017b\u017d"+
		"\5w<\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\5e"+
		"\63\2\u0182\u0080\3\2\2\2\u0183\u0184\5i\65\2\u0184\u0082\3\2\2\2\u0185"+
		"\u0186\5o8\2\u0186\u0084\3\2\2\2\u0187\u0188\t\7\2\2\u0188\u0086\3\2\2"+
		"\2\u0189\u018b\5e\63\2\u018a\u018c\5w<\2\u018b\u018a\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\5e\63\2\u018e\u0088\3\2\2\2\u018f"+
		"\u0194\5c\62\2\u0190\u0193\5c\62\2\u0191\u0193\5g\64\2\u0192\u0190\3\2"+
		"\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u008a\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\7\61"+
		"\2\2\u0198\u0199\7,\2\2\u0199\u019d\3\2\2\2\u019a\u019c\13\2\2\2\u019b"+
		"\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019e\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7,\2\2\u01a1"+
		"\u01a2\7\61\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\bF\2\2\u01a4\u008c\3\2"+
		"\2\2\u01a5\u01a6\7\61\2\2\u01a6\u01a7\7\61\2\2\u01a7\u01ab\3\2\2\2\u01a8"+
		"\u01aa\n\b\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01af\bG\2\2\u01af\u008e\3\2\2\2\u01b0\u01b2\t\t\2\2\u01b1\u01b0\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\bH\2\2\u01b6\u0090\3\2\2\2\21\2\u0144\u0149"+
		"\u0150\u0161\u0166\u016e\u0176\u017e\u018b\u0192\u0194\u019d\u01ab\u01b3"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}