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
		RESERVED_WORD=1, BOOLEAN=2, ID=3, STRING=4, NUMBER=5, OP_ADD_EQ=6, OP_SUB_EQ=7, 
		OP_MULT_EQ=8, OP_DIV_EQ=9, OP_ADD=10, OP_SUB=11, OP_MULT=12, OP_DIV=13, 
		OP_ASSIGN=14, OP_EQ=15, OP_GREATER_THAN=16, OP_LESS_THAN=17, OP_GREATER_EQ_THAN=18, 
		OP_LESS_EQ_THAN=19, GROUP_SYMB_OPEN=20, GROUP_SYMB_CLOSE=21, BRACKET_OPEN=22, 
		BRACKET_CLOSE=23, BRACE_OPEN=24, BRACE_CLOSE=25, REF=26, SEPARATOR=27, 
		COMMENT=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RESERVED_WORD", "BOOLEAN", "ID", "STRING", "NUMBER", "OP_ADD_EQ", "OP_SUB_EQ", 
			"OP_MULT_EQ", "OP_DIV_EQ", "OP_ADD", "OP_SUB", "OP_MULT", "OP_DIV", "OP_ASSIGN", 
			"OP_EQ", "OP_GREATER_THAN", "OP_LESS_THAN", "OP_GREATER_EQ_THAN", "OP_LESS_EQ_THAN", 
			"GROUP_SYMB_OPEN", "GROUP_SYMB_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"BRACE_OPEN", "BRACE_CLOSE", "REF", "SEPARATOR", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u012d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b3\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\u00be\n\3\3\4\3\4\7\4\u00c2\n\4\f\4\16\4\u00c5\13\4"+
		"\3\5\3\5\7\5\u00c9\n\5\f\5\16\5\u00cc\13\5\3\5\3\5\3\5\7\5\u00d1\n\5\f"+
		"\5\16\5\u00d4\13\5\3\5\5\5\u00d7\n\5\3\6\5\6\u00da\n\6\3\6\6\6\u00dd\n"+
		"\6\r\6\16\6\u00de\3\6\3\6\6\6\u00e3\n\6\r\6\16\6\u00e4\5\6\u00e7\n\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u0120\n\35\f\35"+
		"\16\35\u0123\13\35\3\35\3\35\3\36\6\36\u0128\n\36\r\36\16\36\u0129\3\36"+
		"\3\36\4\u00ca\u00d2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37\3\2\t\3\2c|\6\2\62;C\\aac|\3\2//\3\2\62;\3\2\60"+
		"\60\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0150\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3\u00b2\3\2\2\2\5\u00bd"+
		"\3\2\2\2\7\u00bf\3\2\2\2\t\u00d6\3\2\2\2\13\u00d9\3\2\2\2\r\u00e8\3\2"+
		"\2\2\17\u00eb\3\2\2\2\21\u00ee\3\2\2\2\23\u00f1\3\2\2\2\25\u00f4\3\2\2"+
		"\2\27\u00f6\3\2\2\2\31\u00f8\3\2\2\2\33\u00fa\3\2\2\2\35\u00fc\3\2\2\2"+
		"\37\u00fe\3\2\2\2!\u0101\3\2\2\2#\u0103\3\2\2\2%\u0105\3\2\2\2\'\u0108"+
		"\3\2\2\2)\u010b\3\2\2\2+\u010d\3\2\2\2-\u010f\3\2\2\2/\u0111\3\2\2\2\61"+
		"\u0113\3\2\2\2\63\u0115\3\2\2\2\65\u0117\3\2\2\2\67\u0119\3\2\2\29\u011b"+
		"\3\2\2\2;\u0127\3\2\2\2=>\7k\2\2>\u00b3\7h\2\2?@\7g\2\2@A\7n\2\2AB\7u"+
		"\2\2B\u00b3\7g\2\2CD\7g\2\2DE\7n\2\2EF\7k\2\2F\u00b3\7h\2\2GH\7h\2\2H"+
		"I\7q\2\2I\u00b3\7t\2\2JK\7f\2\2KL\7g\2\2L\u00b3\7h\2\2MN\7y\2\2NO\7j\2"+
		"\2OP\7k\2\2PQ\7n\2\2Q\u00b3\7g\2\2RS\7k\2\2S\u00b3\7p\2\2TU\7k\2\2UV\7"+
		"o\2\2VW\7r\2\2WX\7q\2\2XY\7t\2\2Y\u00b3\7v\2\2Z[\7h\2\2[\\\7t\2\2\\]\7"+
		"q\2\2]\u00b3\7o\2\2^_\7t\2\2_`\7g\2\2`a\7p\2\2ab\7f\2\2bc\7g\2\2c\u00b3"+
		"\7t\2\2de\7t\2\2ef\7g\2\2fg\7v\2\2gh\7w\2\2hi\7t\2\2i\u00b3\7p\2\2jk\7"+
		"R\2\2kl\7c\2\2lm\7i\2\2m\u00b3\7g\2\2no\7J\2\2op\7g\2\2pq\7c\2\2q\u00b3"+
		"\7f\2\2rs\7D\2\2st\7q\2\2tu\7f\2\2u\u00b3\7{\2\2vw\7J\2\2wx\7g\2\2xy\7"+
		"c\2\2yz\7f\2\2z{\7g\2\2{\u00b3\7t\2\2|}\7D\2\2}~\7w\2\2~\177\7v\2\2\177"+
		"\u0080\7v\2\2\u0080\u0081\7q\2\2\u0081\u00b3\7p\2\2\u0082\u0083\7C\2\2"+
		"\u0083\u0084\7p\2\2\u0084\u0085\7e\2\2\u0085\u0086\7j\2\2\u0086\u0087"+
		"\7q\2\2\u0087\u00b3\7t\2\2\u0088\u0089\7F\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u00b3\7x\2\2\u008b\u008c\7U\2\2\u008c\u008d\7r\2\2\u008d\u008e\7c\2\2"+
		"\u008e\u00b3\7p\2\2\u008f\u0090\7N\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u00b3\7v\2\2\u0093\u0094\7K\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7r\2\2\u0096\u0097\7w\2\2\u0097\u00b3\7v\2\2\u0098\u0099\7R\2\2"+
		"\u0099\u009a\7c\2\2\u009a\u009b\7t\2\2\u009b\u009c\7c\2\2\u009c\u009d"+
		"\7i\2\2\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7r\2\2\u00a0"+
		"\u00b3\7j\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7c\2\2"+
		"\u00a4\u00a5\7i\2\2\u00a5\u00b3\7g\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a8"+
		"\7c\2\2\u00a8\u00b3\7x\2\2\u00a9\u00aa\7H\2\2\u00aa\u00ab\7q\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00b3\7o\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7c\2\2"+
		"\u00af\u00b0\7d\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b3\7g\2\2\u00b2=\3\2\2"+
		"\2\u00b2?\3\2\2\2\u00b2C\3\2\2\2\u00b2G\3\2\2\2\u00b2J\3\2\2\2\u00b2M"+
		"\3\2\2\2\u00b2R\3\2\2\2\u00b2T\3\2\2\2\u00b2Z\3\2\2\2\u00b2^\3\2\2\2\u00b2"+
		"d\3\2\2\2\u00b2j\3\2\2\2\u00b2n\3\2\2\2\u00b2r\3\2\2\2\u00b2v\3\2\2\2"+
		"\u00b2|\3\2\2\2\u00b2\u0082\3\2\2\2\u00b2\u0088\3\2\2\2\u00b2\u008b\3"+
		"\2\2\2\u00b2\u008f\3\2\2\2\u00b2\u0093\3\2\2\2\u00b2\u0098\3\2\2\2\u00b2"+
		"\u00a1\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ad\3\2"+
		"\2\2\u00b3\4\3\2\2\2\u00b4\u00b5\7V\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7"+
		"\7w\2\2\u00b7\u00be\7g\2\2\u00b8\u00b9\7H\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00be\7g\2\2\u00bd\u00b4\3\2\2"+
		"\2\u00bd\u00b8\3\2\2\2\u00be\6\3\2\2\2\u00bf\u00c3\t\2\2\2\u00c0\u00c2"+
		"\t\3\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\b\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00ca\7$\2\2"+
		"\u00c7\u00c9\13\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00d7\7$\2\2\u00ce\u00d2\7)\2\2\u00cf\u00d1\13\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7)\2\2\u00d6\u00c6\3\2"+
		"\2\2\u00d6\u00ce\3\2\2\2\u00d7\n\3\2\2\2\u00d8\u00da\t\4\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\t\5\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e6\3\2\2\2\u00e0\u00e2\t\6\2\2\u00e1\u00e3\t\5\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\f\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\7?\2\2\u00ea\16\3\2\2\2\u00eb"+
		"\u00ec\7/\2\2\u00ec\u00ed\7?\2\2\u00ed\20\3\2\2\2\u00ee\u00ef\7,\2\2\u00ef"+
		"\u00f0\7?\2\2\u00f0\22\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\7?\2\2"+
		"\u00f3\24\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5\26\3\2\2\2\u00f6\u00f7\7/\2"+
		"\2\u00f7\30\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9\32\3\2\2\2\u00fa\u00fb\7"+
		"\61\2\2\u00fb\34\3\2\2\2\u00fc\u00fd\7?\2\2\u00fd\36\3\2\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ff\u0100\7?\2\2\u0100 \3\2\2\2\u0101\u0102\7@\2\2\u0102\"\3"+
		"\2\2\2\u0103\u0104\7>\2\2\u0104$\3\2\2\2\u0105\u0106\7@\2\2\u0106\u0107"+
		"\7?\2\2\u0107&\3\2\2\2\u0108\u0109\7>\2\2\u0109\u010a\7?\2\2\u010a(\3"+
		"\2\2\2\u010b\u010c\7*\2\2\u010c*\3\2\2\2\u010d\u010e\7+\2\2\u010e,\3\2"+
		"\2\2\u010f\u0110\7]\2\2\u0110.\3\2\2\2\u0111\u0112\7_\2\2\u0112\60\3\2"+
		"\2\2\u0113\u0114\7}\2\2\u0114\62\3\2\2\2\u0115\u0116\7\177\2\2\u0116\64"+
		"\3\2\2\2\u0117\u0118\7\60\2\2\u0118\66\3\2\2\2\u0119\u011a\7.\2\2\u011a"+
		"8\3\2\2\2\u011b\u011c\7/\2\2\u011c\u011d\7/\2\2\u011d\u0121\3\2\2\2\u011e"+
		"\u0120\n\7\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\b\35\2\2\u0125:\3\2\2\2\u0126\u0128\t\b\2\2\u0127\u0126\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\b\36\2\2\u012c<\3\2\2\2\17\2\u00b2\u00bd\u00c3\u00ca"+
		"\u00d2\u00d6\u00d9\u00de\u00e4\u00e6\u0121\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}