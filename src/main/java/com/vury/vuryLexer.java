package com.vury;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vuryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ASSIGN_T=3, EQUALS_T=4, SEMICOLON_T=5, COLON_T=6, SQUOTE_T=7, 
		DQUOTE_T=8, LQUOTE_T=9, PLUS_T=10, MINUS_T=11, LPAREN_T=12, RPAREN_T=13, 
		LCURLY_T=14, RCURLY_T=15, COMMA_T=16, VALUE_T=17, IDENTIFIABLE_T=18, STRING_T=19, 
		INTEGER_T=20, WS_T=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "ESCAPE_F", "IDENTIFIABLE_F", "DIGIT_F", "ASSIGN_T", 
			"EQUALS_T", "SEMICOLON_T", "COLON_T", "SQUOTE_T", "DQUOTE_T", "LQUOTE_T", 
			"PLUS_T", "MINUS_T", "LPAREN_T", "RPAREN_T", "LCURLY_T", "RCURLY_T", 
			"COMMA_T", "VALUE_T", "IDENTIFIABLE_T", "STRING_T", "INTEGER_T", "WS_T"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'variable'", "'function'", "'='", "'=='", "';'", "':'", "'''", 
			"'\"'", "'`'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ASSIGN_T", "EQUALS_T", "SEMICOLON_T", "COLON_T", "SQUOTE_T", 
			"DQUOTE_T", "LQUOTE_T", "PLUS_T", "MINUS_T", "LPAREN_T", "RPAREN_T", 
			"LCURLY_T", "RCURLY_T", "COMMA_T", "VALUE_T", "IDENTIFIABLE_T", "STRING_T", 
			"INTEGER_T", "WS_T"
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


	public vuryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammar/vury.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\5\25"+
		"r\n\25\3\26\6\26u\n\26\r\26\16\26v\3\26\6\26z\n\26\r\26\16\26{\5\26~\n"+
		"\26\3\27\3\27\7\27\u0082\n\27\f\27\16\27\u0085\13\27\3\27\3\27\3\30\6"+
		"\30\u008a\n\30\r\30\16\30\u008b\3\31\3\31\3\31\3\31\4I\u0083\2\32\3\3"+
		"\5\4\7\2\t\2\13\2\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!"+
		"\17#\20%\21\'\22)\23+\24-\25/\26\61\27\3\2\5\6\2\62;C\\aac|\3\2\62;\5"+
		"\2\f\f\17\17\"\"\2\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\3\63\3\2\2\2\5<\3\2\2\2\7E\3\2\2\2\tN\3\2\2\2\13P\3\2\2\2\rR\3\2\2"+
		"\2\17T\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2"+
		"\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%k\3\2\2\2"+
		"\'m\3\2\2\2)q\3\2\2\2+}\3\2\2\2-\177\3\2\2\2/\u0089\3\2\2\2\61\u008d\3"+
		"\2\2\2\63\64\7x\2\2\64\65\7c\2\2\65\66\7t\2\2\66\67\7k\2\2\678\7c\2\2"+
		"89\7d\2\29:\7n\2\2:;\7g\2\2;\4\3\2\2\2<=\7h\2\2=>\7w\2\2>?\7p\2\2?@\7"+
		"e\2\2@A\7v\2\2AB\7k\2\2BC\7q\2\2CD\7p\2\2D\6\3\2\2\2EI\5\31\r\2FH\13\2"+
		"\2\2GF\3\2\2\2HK\3\2\2\2IJ\3\2\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\5\31"+
		"\r\2M\b\3\2\2\2NO\t\2\2\2O\n\3\2\2\2PQ\t\3\2\2Q\f\3\2\2\2RS\7?\2\2S\16"+
		"\3\2\2\2TU\7?\2\2UV\7?\2\2V\20\3\2\2\2WX\7=\2\2X\22\3\2\2\2YZ\7<\2\2Z"+
		"\24\3\2\2\2[\\\7)\2\2\\\26\3\2\2\2]^\7$\2\2^\30\3\2\2\2_`\7b\2\2`\32\3"+
		"\2\2\2ab\7-\2\2b\34\3\2\2\2cd\7/\2\2d\36\3\2\2\2ef\7*\2\2f \3\2\2\2gh"+
		"\7+\2\2h\"\3\2\2\2ij\7}\2\2j$\3\2\2\2kl\7\177\2\2l&\3\2\2\2mn\7.\2\2n"+
		"(\3\2\2\2or\5/\30\2pr\5-\27\2qo\3\2\2\2qp\3\2\2\2r*\3\2\2\2su\5\t\5\2"+
		"ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w~\3\2\2\2xz\5\7\4\2yx\3\2\2\2"+
		"z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}t\3\2\2\2}y\3\2\2\2~,\3\2\2\2"+
		"\177\u0083\5\27\f\2\u0080\u0082\13\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\5\27\f\2\u0087.\3\2\2\2\u0088\u008a\5\13\6"+
		"\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\60\3\2\2\2\u008d\u008e\t\4\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\b\31\2\2\u0090\62\3\2\2\2\n\2Iqv{}\u0083\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}