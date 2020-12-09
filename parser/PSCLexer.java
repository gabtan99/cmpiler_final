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
		Plus=29, Minus=30, Star=31, Div=32, AndAnd=33, OrOr=34, Not=35, Colon=36, 
		Semi=37, Comma=38, Assign=39, Equal=40, NotEqual=41, Dot=42, Ellipsis=43, 
		Up=44, Down=45, To=46, Upto=47, Downto=48, True=49, False=50, DoubleQuotation=51, 
		StringLiteral=52, INTEGERCONSTANT=53, FLOATCONSTANT=54, BOOLCONSTANT=55, 
		STRINGCONSTANT=56, IDENTIFIER=57, BlockComment=58, LineComment=59, WS=60;
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
			"Minus", "Star", "Div", "AndAnd", "OrOr", "Not", "Colon", "Semi", "Comma", 
			"Assign", "Equal", "NotEqual", "Dot", "Ellipsis", "Up", "Down", "To", 
			"Upto", "Downto", "True", "False", "DoubleQuotation", "NonDigit", "Digit", 
			"DigitSequence", "FloatSuffix", "FractionalConstant", "DecimalFloatingConstant", 
			"EscapeSequence", "SimpleEscapeSequence", "SChar", "SCharSequence", "StringLiteral", 
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
			"'&&'", "'||'", "'!'", "':'", "';'", "','", "'='", "'=='", "'!='", "'.'", 
			"'...'", "'up'", "'down'", "'to'", null, null, "'T'", "'F'", "'\"'"
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
			"To", "Upto", "Downto", "True", "False", "DoubleQuotation", "StringLiteral", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*"+
		"\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\6\67"+
		"\u0147\n\67\r\67\16\67\u0148\38\38\39\59\u014e\n9\39\39\39\39\39\59\u0155"+
		"\n9\3:\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\5=\u0166\n=\3>\6>\u0169"+
		"\n>\r>\16>\u016a\3?\3?\5?\u016f\n?\3?\3?\3@\3@\3A\3A\3B\3B\5B\u0179\n"+
		"B\3C\3C\3D\3D\3D\7D\u0180\nD\fD\16D\u0183\13D\3E\3E\3E\3E\7E\u0189\nE"+
		"\fE\16E\u018c\13E\3E\3E\3E\3E\3E\3F\3F\3F\3F\7F\u0197\nF\fF\16F\u019a"+
		"\13F\3F\3F\3G\6G\u019f\nG\rG\16G\u01a0\3G\3G\3\u018a\2H\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m\2o\2q\2s\2u\2w\2"+
		"y\2{\2}\66\177\67\u00818\u00839\u0085:\u0087;\u0089<\u008b=\u008d>\3\2"+
		"\b\5\2C\\aac|\3\2\62;\f\2$$))AA^^cdhhppttvvxx\6\2\f\f\17\17$$^^\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\2\u01a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\3\u008f\3\2\2\2\5\u0098\3\2\2\2\7\u009c\3\2\2\2\t\u00a2\3\2\2\2\13"+
		"\u00a9\3\2\2\2\r\u00ae\3\2\2\2\17\u00b3\3\2\2\2\21\u00b6\3\2\2\2\23\u00bb"+
		"\3\2\2\2\25\u00bf\3\2\2\2\27\u00c2\3\2\2\2\31\u00c7\3\2\2\2\33\u00ce\3"+
		"\2\2\2\35\u00d3\3\2\2\2\37\u00d9\3\2\2\2!\u00de\3\2\2\2#\u00e5\3\2\2\2"+
		"%\u00eb\3\2\2\2\'\u00f0\3\2\2\2)\u00f2\3\2\2\2+\u00f4\3\2\2\2-\u00f6\3"+
		"\2\2\2/\u00f8\3\2\2\2\61\u00fa\3\2\2\2\63\u00fc\3\2\2\2\65\u00fe\3\2\2"+
		"\2\67\u0101\3\2\2\29\u0103\3\2\2\2;\u0106\3\2\2\2=\u0108\3\2\2\2?\u010a"+
		"\3\2\2\2A\u010c\3\2\2\2C\u010e\3\2\2\2E\u0111\3\2\2\2G\u0114\3\2\2\2I"+
		"\u0116\3\2\2\2K\u0118\3\2\2\2M\u011a\3\2\2\2O\u011c\3\2\2\2Q\u011e\3\2"+
		"\2\2S\u0121\3\2\2\2U\u0124\3\2\2\2W\u0126\3\2\2\2Y\u012a\3\2\2\2[\u012d"+
		"\3\2\2\2]\u0132\3\2\2\2_\u0135\3\2\2\2a\u0138\3\2\2\2c\u013b\3\2\2\2e"+
		"\u013d\3\2\2\2g\u013f\3\2\2\2i\u0141\3\2\2\2k\u0143\3\2\2\2m\u0146\3\2"+
		"\2\2o\u014a\3\2\2\2q\u0154\3\2\2\2s\u0156\3\2\2\2u\u0159\3\2\2\2w\u015b"+
		"\3\2\2\2y\u0165\3\2\2\2{\u0168\3\2\2\2}\u016c\3\2\2\2\177\u0172\3\2\2"+
		"\2\u0081\u0174\3\2\2\2\u0083\u0178\3\2\2\2\u0085\u017a\3\2\2\2\u0087\u017c"+
		"\3\2\2\2\u0089\u0184\3\2\2\2\u008b\u0192\3\2\2\2\u008d\u019e\3\2\2\2\u008f"+
		"\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091\u0092\7p\2\2\u0092\u0093\7u\2\2"+
		"\u0093\u0094\7v\2\2\u0094\u0095\7c\2\2\u0095\u0096\7p\2\2\u0096\u0097"+
		"\7v\2\2\u0097\4\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b"+
		"\7v\2\2\u009b\6\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\7n\2\2\u009e\u009f"+
		"\7q\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7v\2\2\u00a1\b\3\2\2\2\u00a2\u00a3"+
		"\7U\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7i\2\2\u00a8\n\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa"+
		"\u00ab\7q\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7n\2\2\u00ad\f\3\2\2\2\u00ae"+
		"\u00af\7o\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2"+
		"\u00b2\16\3\2\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7q\2\2\u00b5\20\3\2\2"+
		"\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\22\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7h\2\2\u00c1\26"+
		"\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd\32\3\2\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7"+
		"k\2\2\u00d1\u00d2\7f\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5"+
		"\7j\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8"+
		"\36\3\2\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7p\2\2\u00dc"+
		"\u00dd\7e\2\2\u00dd \3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7g\2\2"+
		"\u00e4\"\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7k"+
		"\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7v\2\2\u00ea$\3\2\2\2\u00eb\u00ec"+
		"\7u\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7p\2\2\u00ef"+
		"&\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7+\2\2\u00f3*"+
		"\3\2\2\2\u00f4\u00f5\7]\2\2\u00f5,\3\2\2\2\u00f6\u00f7\7_\2\2\u00f7.\3"+
		"\2\2\2\u00f8\u00f9\7}\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7\177\2\2\u00fb"+
		"\62\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd\64\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff"+
		"\u0100\7?\2\2\u0100\66\3\2\2\2\u0101\u0102\7@\2\2\u01028\3\2\2\2\u0103"+
		"\u0104\7@\2\2\u0104\u0105\7?\2\2\u0105:\3\2\2\2\u0106\u0107\7-\2\2\u0107"+
		"<\3\2\2\2\u0108\u0109\7/\2\2\u0109>\3\2\2\2\u010a\u010b\7,\2\2\u010b@"+
		"\3\2\2\2\u010c\u010d\7\61\2\2\u010dB\3\2\2\2\u010e\u010f\7(\2\2\u010f"+
		"\u0110\7(\2\2\u0110D\3\2\2\2\u0111\u0112\7~\2\2\u0112\u0113\7~\2\2\u0113"+
		"F\3\2\2\2\u0114\u0115\7#\2\2\u0115H\3\2\2\2\u0116\u0117\7<\2\2\u0117J"+
		"\3\2\2\2\u0118\u0119\7=\2\2\u0119L\3\2\2\2\u011a\u011b\7.\2\2\u011bN\3"+
		"\2\2\2\u011c\u011d\7?\2\2\u011dP\3\2\2\2\u011e\u011f\7?\2\2\u011f\u0120"+
		"\7?\2\2\u0120R\3\2\2\2\u0121\u0122\7#\2\2\u0122\u0123\7?\2\2\u0123T\3"+
		"\2\2\2\u0124\u0125\7\60\2\2\u0125V\3\2\2\2\u0126\u0127\7\60\2\2\u0127"+
		"\u0128\7\60\2\2\u0128\u0129\7\60\2\2\u0129X\3\2\2\2\u012a\u012b\7w\2\2"+
		"\u012b\u012c\7r\2\2\u012cZ\3\2\2\2\u012d\u012e\7f\2\2\u012e\u012f\7q\2"+
		"\2\u012f\u0130\7y\2\2\u0130\u0131\7p\2\2\u0131\\\3\2\2\2\u0132\u0133\7"+
		"v\2\2\u0133\u0134\7q\2\2\u0134^\3\2\2\2\u0135\u0136\5Y-\2\u0136\u0137"+
		"\5]/\2\u0137`\3\2\2\2\u0138\u0139\5[.\2\u0139\u013a\5]/\2\u013ab\3\2\2"+
		"\2\u013b\u013c\7V\2\2\u013cd\3\2\2\2\u013d\u013e\7H\2\2\u013ef\3\2\2\2"+
		"\u013f\u0140\7$\2\2\u0140h\3\2\2\2\u0141\u0142\t\2\2\2\u0142j\3\2\2\2"+
		"\u0143\u0144\t\3\2\2\u0144l\3\2\2\2\u0145\u0147\5k\66\2\u0146\u0145\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"n\3\2\2\2\u014a\u014b\7h\2\2\u014bp\3\2\2\2\u014c\u014e\5m\67\2\u014d"+
		"\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\60"+
		"\2\2\u0150\u0155\5m\67\2\u0151\u0152\5m\67\2\u0152\u0153\7\60\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u014d\3\2\2\2\u0154\u0151\3\2\2\2\u0155r\3\2\2\2"+
		"\u0156\u0157\5q9\2\u0157\u0158\5o8\2\u0158t\3\2\2\2\u0159\u015a\5w<\2"+
		"\u015av\3\2\2\2\u015b\u015c\7^\2\2\u015c\u015d\t\4\2\2\u015dx\3\2\2\2"+
		"\u015e\u0166\n\5\2\2\u015f\u0166\5u;\2\u0160\u0161\7^\2\2\u0161\u0166"+
		"\7\f\2\2\u0162\u0163\7^\2\2\u0163\u0164\7\17\2\2\u0164\u0166\7\f\2\2\u0165"+
		"\u015e\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0162\3\2"+
		"\2\2\u0166z\3\2\2\2\u0167\u0169\5y=\2\u0168\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b|\3\2\2\2\u016c"+
		"\u016e\5g\64\2\u016d\u016f\5{>\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2"+
		"\2\u016f\u0170\3\2\2\2\u0170\u0171\5g\64\2\u0171~\3\2\2\2\u0172\u0173"+
		"\5m\67\2\u0173\u0080\3\2\2\2\u0174\u0175\5s:\2\u0175\u0082\3\2\2\2\u0176"+
		"\u0179\5c\62\2\u0177\u0179\5e\63\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2"+
		"\2\2\u0179\u0084\3\2\2\2\u017a\u017b\5}?\2\u017b\u0086\3\2\2\2\u017c\u0181"+
		"\5i\65\2\u017d\u0180\5i\65\2\u017e\u0180\5k\66\2\u017f\u017d\3\2\2\2\u017f"+
		"\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0088\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7\61\2\2\u0185"+
		"\u0186\7,\2\2\u0186\u018a\3\2\2\2\u0187\u0189\13\2\2\2\u0188\u0187\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7,\2\2\u018e\u018f\7\61"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0191\bE\2\2\u0191\u008a\3\2\2\2\u0192"+
		"\u0193\7\61\2\2\u0193\u0194\7\61\2\2\u0194\u0198\3\2\2\2\u0195\u0197\n"+
		"\6\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\bF"+
		"\2\2\u019c\u008c\3\2\2\2\u019d\u019f\t\7\2\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a3\bG\2\2\u01a3\u008e\3\2\2\2\17\2\u0148\u014d\u0154\u0165"+
		"\u016a\u016e\u0178\u017f\u0181\u018a\u0198\u01a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}