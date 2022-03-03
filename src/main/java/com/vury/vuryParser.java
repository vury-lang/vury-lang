package com.vury;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vuryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ASSIGN_T=3, EQUALS_T=4, SEMICOLON_T=5, COLON_T=6, SQUOTE_T=7, 
		DQUOTE_T=8, LQUOTE_T=9, PLUS_T=10, MINUS_T=11, LPAREN_T=12, RPAREN_T=13, 
		LCURLY_T=14, RCURLY_T=15, COMMA_T=16, VALUE_T=17, IDENTIFIABLE_T=18, STRING_T=19, 
		INTEGER_T=20, WS_T=21;
	public static final int
		RULE_callArgsDefT = 0, RULE_callArgsT = 1, RULE_operatorT = 2, RULE_expressionT = 3, 
		RULE_variableT = 4, RULE_functionT = 5, RULE_statement = 6, RULE_file = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"callArgsDefT", "callArgsT", "operatorT", "expressionT", "variableT", 
			"functionT", "statement", "file"
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

	@Override
	public String getGrammarFileName() { return "grammar/vury.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public vuryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CallArgsDefTContext extends ParserRuleContext {
		public TerminalNode LPAREN_T() { return getToken(vuryParser.LPAREN_T, 0); }
		public TerminalNode RPAREN_T() { return getToken(vuryParser.RPAREN_T, 0); }
		public List<TerminalNode> IDENTIFIABLE_T() { return getTokens(vuryParser.IDENTIFIABLE_T); }
		public TerminalNode IDENTIFIABLE_T(int i) {
			return getToken(vuryParser.IDENTIFIABLE_T, i);
		}
		public List<TerminalNode> COLON_T() { return getTokens(vuryParser.COLON_T); }
		public TerminalNode COLON_T(int i) {
			return getToken(vuryParser.COLON_T, i);
		}
		public List<TerminalNode> COMMA_T() { return getTokens(vuryParser.COMMA_T); }
		public TerminalNode COMMA_T(int i) {
			return getToken(vuryParser.COMMA_T, i);
		}
		public CallArgsDefTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgsDefT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).enterCallArgsDefT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).exitCallArgsDefT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vuryVisitor ) return ((vuryVisitor<? extends T>)visitor).visitCallArgsDefT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgsDefTContext callArgsDefT() throws RecognitionException {
		CallArgsDefTContext _localctx = new CallArgsDefTContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_callArgsDefT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(LPAREN_T);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIABLE_T) {
				{
				setState(17);
				match(IDENTIFIABLE_T);
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON_T) {
					{
					setState(18);
					match(COLON_T);
					setState(19);
					match(IDENTIFIABLE_T);
					}
				}

				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_T) {
					{
					{
					setState(22);
					match(COMMA_T);
					setState(23);
					match(IDENTIFIABLE_T);
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON_T) {
						{
						setState(24);
						match(COLON_T);
						setState(25);
						match(IDENTIFIABLE_T);
						}
					}

					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(35);
			match(RPAREN_T);
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

	public static class CallArgsTContext extends ParserRuleContext {
		public TerminalNode LPAREN_T() { return getToken(vuryParser.LPAREN_T, 0); }
		public TerminalNode RPAREN_T() { return getToken(vuryParser.RPAREN_T, 0); }
		public List<ExpressionTContext> expressionT() {
			return getRuleContexts(ExpressionTContext.class);
		}
		public ExpressionTContext expressionT(int i) {
			return getRuleContext(ExpressionTContext.class,i);
		}
		public List<TerminalNode> COMMA_T() { return getTokens(vuryParser.COMMA_T); }
		public TerminalNode COMMA_T(int i) {
			return getToken(vuryParser.COMMA_T, i);
		}
		public CallArgsTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgsT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).enterCallArgsT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).exitCallArgsT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vuryVisitor ) return ((vuryVisitor<? extends T>)visitor).visitCallArgsT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgsTContext callArgsT() throws RecognitionException {
		CallArgsTContext _localctx = new CallArgsTContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_callArgsT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LPAREN_T);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN_T) | (1L << VALUE_T) | (1L << IDENTIFIABLE_T))) != 0)) {
				{
				setState(38);
				expressionT(0);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_T) {
					{
					{
					setState(39);
					match(COMMA_T);
					setState(40);
					expressionT(0);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(48);
			match(RPAREN_T);
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

	public static class OperatorTContext extends ParserRuleContext {
		public TerminalNode PLUS_T() { return getToken(vuryParser.PLUS_T, 0); }
		public TerminalNode MINUS_T() { return getToken(vuryParser.MINUS_T, 0); }
		public OperatorTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).enterOperatorT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).exitOperatorT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vuryVisitor ) return ((vuryVisitor<? extends T>)visitor).visitOperatorT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorTContext operatorT() throws RecognitionException {
		OperatorTContext _localctx = new OperatorTContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operatorT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==PLUS_T || _la==MINUS_T) ) {
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

	public static class ExpressionTContext extends ParserRuleContext {
		public TerminalNode VALUE_T() { return getToken(vuryParser.VALUE_T, 0); }
		public TerminalNode IDENTIFIABLE_T() { return getToken(vuryParser.IDENTIFIABLE_T, 0); }
		public CallArgsTContext callArgsT() {
			return getRuleContext(CallArgsTContext.class,0);
		}
		public TerminalNode LPAREN_T() { return getToken(vuryParser.LPAREN_T, 0); }
		public List<ExpressionTContext> expressionT() {
			return getRuleContexts(ExpressionTContext.class);
		}
		public ExpressionTContext expressionT(int i) {
			return getRuleContext(ExpressionTContext.class,i);
		}
		public TerminalNode RPAREN_T() { return getToken(vuryParser.RPAREN_T, 0); }
		public OperatorTContext operatorT() {
			return getRuleContext(OperatorTContext.class,0);
		}
		public ExpressionTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).enterExpressionT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).exitExpressionT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vuryVisitor ) return ((vuryVisitor<? extends T>)visitor).visitExpressionT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionTContext expressionT() throws RecognitionException {
		return expressionT(0);
	}

	private ExpressionTContext expressionT(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionTContext _localctx = new ExpressionTContext(_ctx, _parentState);
		ExpressionTContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressionT, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_T:
				{
				setState(53);
				match(VALUE_T);
				}
				break;
			case IDENTIFIABLE_T:
				{
				setState(54);
				match(IDENTIFIABLE_T);
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(55);
					callArgsT();
					}
					break;
				}
				}
				break;
			case LPAREN_T:
				{
				setState(58);
				match(LPAREN_T);
				setState(59);
				expressionT(0);
				setState(60);
				match(RPAREN_T);
				setState(61);
				operatorT();
				setState(62);
				expressionT(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionTContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionT);
						setState(66);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(67);
						operatorT();
						setState(68);
						match(VALUE_T);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionTContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionT);
						setState(70);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(71);
						operatorT();
						setState(72);
						match(LPAREN_T);
						setState(73);
						expressionT(0);
						setState(74);
						match(RPAREN_T);
						}
						break;
					}
					} 
				}
				setState(80);
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

	public static class VariableTContext extends ParserRuleContext {
		public TerminalNode IDENTIFIABLE_T() { return getToken(vuryParser.IDENTIFIABLE_T, 0); }
		public TerminalNode ASSIGN_T() { return getToken(vuryParser.ASSIGN_T, 0); }
		public ExpressionTContext expressionT() {
			return getRuleContext(ExpressionTContext.class,0);
		}
		public VariableTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).enterVariableT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).exitVariableT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vuryVisitor ) return ((vuryVisitor<? extends T>)visitor).visitVariableT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTContext variableT() throws RecognitionException {
		VariableTContext _localctx = new VariableTContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			match(IDENTIFIABLE_T);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_T) {
				{
				setState(83);
				match(ASSIGN_T);
				setState(84);
				expressionT(0);
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

	public static class FunctionTContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIABLE_T() { return getTokens(vuryParser.IDENTIFIABLE_T); }
		public TerminalNode IDENTIFIABLE_T(int i) {
			return getToken(vuryParser.IDENTIFIABLE_T, i);
		}
		public TerminalNode LCURLY_T() { return getToken(vuryParser.LCURLY_T, 0); }
		public TerminalNode RCURLY_T() { return getToken(vuryParser.RCURLY_T, 0); }
		public CallArgsDefTContext callArgsDefT() {
			return getRuleContext(CallArgsDefTContext.class,0);
		}
		public TerminalNode COLON_T() { return getToken(vuryParser.COLON_T, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).enterFunctionT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).exitFunctionT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vuryVisitor ) return ((vuryVisitor<? extends T>)visitor).visitFunctionT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTContext functionT() throws RecognitionException {
		FunctionTContext _localctx = new FunctionTContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__1);
			setState(88);
			match(IDENTIFIABLE_T);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN_T) {
				{
				setState(89);
				callArgsDefT();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON_T) {
				{
				setState(92);
				match(COLON_T);
				setState(93);
				match(IDENTIFIABLE_T);
				}
			}

			setState(96);
			match(LCURLY_T);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LPAREN_T) | (1L << VALUE_T) | (1L << IDENTIFIABLE_T))) != 0)) {
				{
				{
				setState(97);
				statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(RCURLY_T);
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
		public VariableTContext variableT() {
			return getRuleContext(VariableTContext.class,0);
		}
		public ExpressionTContext expressionT() {
			return getRuleContext(ExpressionTContext.class,0);
		}
		public FunctionTContext functionT() {
			return getRuleContext(FunctionTContext.class,0);
		}
		public TerminalNode SEMICOLON_T() { return getToken(vuryParser.SEMICOLON_T, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vuryVisitor ) return ((vuryVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(105);
				variableT();
				}
				break;
			case LPAREN_T:
			case VALUE_T:
			case IDENTIFIABLE_T:
				{
				setState(106);
				expressionT(0);
				}
				break;
			case T__1:
				{
				setState(107);
				functionT();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON_T) {
				{
				setState(110);
				match(SEMICOLON_T);
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(111);
					statement();
					}
					break;
				}
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

	public static class FileContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vuryListener ) ((vuryListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vuryVisitor ) return ((vuryVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LPAREN_T) | (1L << VALUE_T) | (1L << IDENTIFIABLE_T))) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			return expressionT_sempred((ExpressionTContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionT_sempred(ExpressionTContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\2\3\2\3\2\3\2\5\2\35\n\2\7\2\37\n\2\f\2\16\2\"\13\2\5\2$\n\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\5\3\61\n\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5;\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\6\3\6\3\6"+
		"\3\6\5\6X\n\6\3\7\3\7\3\7\5\7]\n\7\3\7\3\7\5\7a\n\7\3\7\3\7\7\7e\n\7\f"+
		"\7\16\7h\13\7\3\7\3\7\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\5\bs\n\b\5\bu\n\b\3"+
		"\t\7\tx\n\t\f\t\16\t{\13\t\3\t\2\3\b\n\2\4\6\b\n\f\16\20\2\3\3\2\f\r\2"+
		"\u0088\2\22\3\2\2\2\4\'\3\2\2\2\6\64\3\2\2\2\bB\3\2\2\2\nS\3\2\2\2\fY"+
		"\3\2\2\2\16n\3\2\2\2\20y\3\2\2\2\22#\7\16\2\2\23\26\7\24\2\2\24\25\7\b"+
		"\2\2\25\27\7\24\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27 \3\2\2\2\30\31\7\22"+
		"\2\2\31\34\7\24\2\2\32\33\7\b\2\2\33\35\7\24\2\2\34\32\3\2\2\2\34\35\3"+
		"\2\2\2\35\37\3\2\2\2\36\30\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2"+
		"!$\3\2\2\2\" \3\2\2\2#\23\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\17\2\2&\3\3"+
		"\2\2\2\'\60\7\16\2\2(-\5\b\5\2)*\7\22\2\2*,\5\b\5\2+)\3\2\2\2,/\3\2\2"+
		"\2-+\3\2\2\2-.\3\2\2\2.\61\3\2\2\2/-\3\2\2\2\60(\3\2\2\2\60\61\3\2\2\2"+
		"\61\62\3\2\2\2\62\63\7\17\2\2\63\5\3\2\2\2\64\65\t\2\2\2\65\7\3\2\2\2"+
		"\66\67\b\5\1\2\67C\7\23\2\28:\7\24\2\29;\5\4\3\2:9\3\2\2\2:;\3\2\2\2;"+
		"C\3\2\2\2<=\7\16\2\2=>\5\b\5\2>?\7\17\2\2?@\5\6\4\2@A\5\b\5\3AC\3\2\2"+
		"\2B\66\3\2\2\2B8\3\2\2\2B<\3\2\2\2CP\3\2\2\2DE\f\5\2\2EF\5\6\4\2FG\7\23"+
		"\2\2GO\3\2\2\2HI\f\4\2\2IJ\5\6\4\2JK\7\16\2\2KL\5\b\5\2LM\7\17\2\2MO\3"+
		"\2\2\2ND\3\2\2\2NH\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\t\3\2\2\2RP"+
		"\3\2\2\2ST\7\3\2\2TW\7\24\2\2UV\7\5\2\2VX\5\b\5\2WU\3\2\2\2WX\3\2\2\2"+
		"X\13\3\2\2\2YZ\7\4\2\2Z\\\7\24\2\2[]\5\2\2\2\\[\3\2\2\2\\]\3\2\2\2]`\3"+
		"\2\2\2^_\7\b\2\2_a\7\24\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bf\7\20\2\2c"+
		"e\5\16\b\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2"+
		"ij\7\21\2\2j\r\3\2\2\2ko\5\n\6\2lo\5\b\5\2mo\5\f\7\2nk\3\2\2\2nl\3\2\2"+
		"\2nm\3\2\2\2ot\3\2\2\2pr\7\7\2\2qs\5\16\b\2rq\3\2\2\2rs\3\2\2\2su\3\2"+
		"\2\2tp\3\2\2\2tu\3\2\2\2u\17\3\2\2\2vx\5\16\b\2wv\3\2\2\2x{\3\2\2\2yw"+
		"\3\2\2\2yz\3\2\2\2z\21\3\2\2\2{y\3\2\2\2\24\26\34 #-\60:BNPW\\`fnrty";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}