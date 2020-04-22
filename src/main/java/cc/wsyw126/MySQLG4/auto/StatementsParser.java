// Generated from /Users/yangjunpeng/Documents/project/MySQLG4/antlr/Statements.g4 by ANTLR 4.7.2
package cc.wsyw126.MySQLG4.auto;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StatementsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, STAR=4, LB=5, RB=6, WHERE=7, SELECT=8, COUNT=9, 
		COUNTSUM=10, INSERT=11, DELETE=12, INTO=13, VALUES=14, FROM=15, LIMIT=16, 
		TS=17, STARTTS=18, ENDTS=19, IS=20, NULL=21, NOT=22, AND=23, OR=24, LESSEQUAL=25, 
		LESS=26, GREATEREQUAL=27, GREATER=28, NOTEQUAL=29, EQUAL=30, IN=31, NOTIN=32, 
		BETWEEN=33, NOTBETWEEN=34, ISNULL=35, ISNOTNULL=36, TEXT=37, WS=38;
	public static final int
		RULE_prog = 0, RULE_insertc = 1, RULE_selectc = 2, RULE_deletec = 3, RULE_countc = 4, 
		RULE_wherec = 5, RULE_conditionc = 6, RULE_selectCidList = 7, RULE_cidList = 8, 
		RULE_cid = 9, RULE_constantList = 10, RULE_constant2List = 11, RULE_constant3List = 12, 
		RULE_constant2 = 13, RULE_limitexp = 14, RULE_tablename = 15, RULE_constant = 16, 
		RULE_var = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "insertc", "selectc", "deletec", "countc", "wherec", "conditionc", 
			"selectCidList", "cidList", "cid", "constantList", "constant2List", "constant3List", 
			"constant2", "limitexp", "tablename", "constant", "var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\"'", "'#'", "'*'", "'('", "')'", "'where'", "'select'", 
			"'count'", "'countsum'", "'insert'", "'delete'", "'into'", "'values'", 
			"'from'", "'limit'", "'ts'", "'startTS'", "'endTS'", "'is'", "'null'", 
			"'not'", "'and'", "'or'", null, null, null, null, null, null, "'in'", 
			"'notin'", "'between'", "'notbetween'", "'isnull'", "'isnotnull'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STAR", "LB", "RB", "WHERE", "SELECT", "COUNT", 
			"COUNTSUM", "INSERT", "DELETE", "INTO", "VALUES", "FROM", "LIMIT", "TS", 
			"STARTTS", "ENDTS", "IS", "NULL", "NOT", "AND", "OR", "LESSEQUAL", "LESS", 
			"GREATEREQUAL", "GREATER", "NOTEQUAL", "EQUAL", "IN", "NOTIN", "BETWEEN", 
			"NOTBETWEEN", "ISNULL", "ISNOTNULL", "TEXT", "WS"
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
	public String getGrammarFileName() { return "Statements.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StatementsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectclContext extends ProgContext {
		public SelectcContext selectc() {
			return getRuleContext(SelectcContext.class,0);
		}
		public SelectclContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitSelectcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertclContext extends ProgContext {
		public InsertcContext insertc() {
			return getRuleContext(InsertcContext.class,0);
		}
		public InsertclContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitInsertcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountclContext extends ProgContext {
		public CountcContext countc() {
			return getRuleContext(CountcContext.class,0);
		}
		public CountclContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitCountcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteclContext extends ProgContext {
		public DeletecContext deletec() {
			return getRuleContext(DeletecContext.class,0);
		}
		public DeleteclContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitDeletecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new SelectclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				selectc();
				}
				break;
			case COUNT:
				_localctx = new CountclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				countc();
				}
				break;
			case INSERT:
				_localctx = new InsertclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				insertc();
				}
				break;
			case DELETE:
				_localctx = new DeleteclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				deletec();
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

	public static class InsertcContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(StatementsParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(StatementsParser.INTO, 0); }
		public TablenameContext tablename() {
			return getRuleContext(TablenameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(StatementsParser.VALUES, 0); }
		public Constant3ListContext constant3List() {
			return getRuleContext(Constant3ListContext.class,0);
		}
		public CidListContext cidList() {
			return getRuleContext(CidListContext.class,0);
		}
		public InsertcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitInsertc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertcContext insertc() throws RecognitionException {
		InsertcContext _localctx = new InsertcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insertc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(INSERT);
			setState(43);
			match(INTO);
			setState(44);
			tablename();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(45);
				cidList();
				}
			}

			setState(48);
			match(VALUES);
			setState(49);
			constant3List();
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

	public static class SelectcContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(StatementsParser.SELECT, 0); }
		public SelectCidListContext selectCidList() {
			return getRuleContext(SelectCidListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(StatementsParser.FROM, 0); }
		public TablenameContext tablename() {
			return getRuleContext(TablenameContext.class,0);
		}
		public WherecContext wherec() {
			return getRuleContext(WherecContext.class,0);
		}
		public LimitexpContext limitexp() {
			return getRuleContext(LimitexpContext.class,0);
		}
		public SelectcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitSelectc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectcContext selectc() throws RecognitionException {
		SelectcContext _localctx = new SelectcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(SELECT);
			setState(52);
			selectCidList();
			setState(53);
			match(FROM);
			setState(54);
			tablename();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(55);
				wherec();
				}
			}

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(58);
				limitexp();
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

	public static class DeletecContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(StatementsParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(StatementsParser.FROM, 0); }
		public TablenameContext tablename() {
			return getRuleContext(TablenameContext.class,0);
		}
		public SelectCidListContext selectCidList() {
			return getRuleContext(SelectCidListContext.class,0);
		}
		public WherecContext wherec() {
			return getRuleContext(WherecContext.class,0);
		}
		public DeletecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deletec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitDeletec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeletecContext deletec() throws RecognitionException {
		DeletecContext _localctx = new DeletecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deletec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(DELETE);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << LB) | (1L << TEXT))) != 0)) {
				{
				setState(62);
				selectCidList();
				}
			}

			setState(65);
			match(FROM);
			setState(66);
			tablename();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(67);
				wherec();
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

	public static class CountcContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(StatementsParser.COUNT, 0); }
		public WherecContext wherec() {
			return getRuleContext(WherecContext.class,0);
		}
		public CountcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitCountc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountcContext countc() throws RecognitionException {
		CountcContext _localctx = new CountcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_countc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(COUNT);
			setState(71);
			wherec();
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

	public static class WherecContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(StatementsParser.WHERE, 0); }
		public ConditioncContext conditionc() {
			return getRuleContext(ConditioncContext.class,0);
		}
		public WherecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wherec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitWherec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WherecContext wherec() throws RecognitionException {
		WherecContext _localctx = new WherecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wherec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(WHERE);
			setState(74);
			conditionc(0);
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

	public static class ConditioncContext extends ParserRuleContext {
		public ConditioncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionc; }
	 
		public ConditioncContext() { }
		public void copyFrom(ConditioncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotequalvarContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode NOTEQUAL() { return getToken(StatementsParser.NOTEQUAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NotequalvarContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitNotequalvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessequalvarContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode LESSEQUAL() { return getToken(StatementsParser.LESSEQUAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LessequalvarContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitLessequalvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotbetweenvarContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode NOTBETWEEN() { return getToken(StatementsParser.NOTBETWEEN, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode AND() { return getToken(StatementsParser.AND, 0); }
		public NotbetweenvarContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitNotbetweenvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndconditionContext extends ConditioncContext {
		public List<ConditioncContext> conditionc() {
			return getRuleContexts(ConditioncContext.class);
		}
		public ConditioncContext conditionc(int i) {
			return getRuleContext(ConditioncContext.class,i);
		}
		public TerminalNode AND() { return getToken(StatementsParser.AND, 0); }
		public AndconditionContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitAndcondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterequalconstantContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode GREATEREQUAL() { return getToken(StatementsParser.GREATEREQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public GreaterequalconstantContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitGreaterequalconstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualvarContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(StatementsParser.EQUAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public EqualvarContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitEqualvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterconstantContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(StatementsParser.GREATER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public GreaterconstantContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitGreaterconstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenvarContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(StatementsParser.BETWEEN, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode AND() { return getToken(StatementsParser.AND, 0); }
		public BetweenvarContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitBetweenvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenconstantContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(StatementsParser.BETWEEN, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode AND() { return getToken(StatementsParser.AND, 0); }
		public BetweenconstantContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitBetweenconstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsnotnullcContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode ISNOTNULL() { return getToken(StatementsParser.ISNOTNULL, 0); }
		public IsnotnullcContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitIsnotnullc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InconstantlistContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode IN() { return getToken(StatementsParser.IN, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public InconstantlistContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitInconstantlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotbetweenconstantContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode NOTBETWEEN() { return getToken(StatementsParser.NOTBETWEEN, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode AND() { return getToken(StatementsParser.AND, 0); }
		public NotbetweenconstantContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitNotbetweenconstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotinconstantlistContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode NOTIN() { return getToken(StatementsParser.NOTIN, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NotinconstantlistContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitNotinconstantlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrconditionContext extends ConditioncContext {
		public List<ConditioncContext> conditionc() {
			return getRuleContexts(ConditioncContext.class);
		}
		public ConditioncContext conditionc(int i) {
			return getRuleContext(ConditioncContext.class,i);
		}
		public TerminalNode OR() { return getToken(StatementsParser.OR, 0); }
		public OrconditionContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitOrcondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsnullcContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode ISNULL() { return getToken(StatementsParser.ISNULL, 0); }
		public IsnullcContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitIsnullc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualconstantContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(StatementsParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public EqualconstantContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitEqualconstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterequalvarContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode GREATEREQUAL() { return getToken(StatementsParser.GREATEREQUAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public GreaterequalvarContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitGreaterequalvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessvarContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode LESS() { return getToken(StatementsParser.LESS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LessvarContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitLessvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotequalconstantContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode NOTEQUAL() { return getToken(StatementsParser.NOTEQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public NotequalconstantContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitNotequalconstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvarlistContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode IN() { return getToken(StatementsParser.IN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public InvarlistContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitInvarlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessconstantContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode LESS() { return getToken(StatementsParser.LESS, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LessconstantContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitLessconstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionwrapperContext extends ConditioncContext {
		public TerminalNode LB() { return getToken(StatementsParser.LB, 0); }
		public ConditioncContext conditionc() {
			return getRuleContext(ConditioncContext.class,0);
		}
		public TerminalNode RB() { return getToken(StatementsParser.RB, 0); }
		public ConditionwrapperContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitConditionwrapper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotinvarlistContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode NOTIN() { return getToken(StatementsParser.NOTIN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NotinvarlistContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitNotinvarlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessequalconstantContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode LESSEQUAL() { return getToken(StatementsParser.LESSEQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LessequalconstantContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitLessequalconstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreatervarContext extends ConditioncContext {
		public CidContext cid() {
			return getRuleContext(CidContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(StatementsParser.GREATER, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public GreatervarContext(ConditioncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitGreatervar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditioncContext conditionc() throws RecognitionException {
		return conditionc(0);
	}

	private ConditioncContext conditionc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditioncContext _localctx = new ConditioncContext(_ctx, _parentState);
		ConditioncContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_conditionc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ConditionwrapperContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(LB);
				setState(78);
				conditionc(0);
				setState(79);
				match(RB);
				}
				break;
			case 2:
				{
				_localctx = new EqualconstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				cid();
				setState(82);
				match(EQUAL);
				setState(83);
				constant();
				}
				break;
			case 3:
				{
				_localctx = new EqualvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				cid();
				setState(86);
				match(EQUAL);
				setState(87);
				var();
				}
				break;
			case 4:
				{
				_localctx = new LessconstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				cid();
				setState(90);
				match(LESS);
				setState(91);
				constant();
				}
				break;
			case 5:
				{
				_localctx = new LessvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				cid();
				setState(94);
				match(LESS);
				setState(95);
				var();
				}
				break;
			case 6:
				{
				_localctx = new GreaterconstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				cid();
				setState(98);
				match(GREATER);
				setState(99);
				constant();
				}
				break;
			case 7:
				{
				_localctx = new GreatervarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				cid();
				setState(102);
				match(GREATER);
				setState(103);
				var();
				}
				break;
			case 8:
				{
				_localctx = new LessequalconstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				cid();
				setState(106);
				match(LESSEQUAL);
				setState(107);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new LessequalvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				cid();
				setState(110);
				match(LESSEQUAL);
				setState(111);
				var();
				}
				break;
			case 10:
				{
				_localctx = new GreaterequalconstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				cid();
				setState(114);
				match(GREATEREQUAL);
				setState(115);
				constant();
				}
				break;
			case 11:
				{
				_localctx = new GreaterequalvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				cid();
				setState(118);
				match(GREATEREQUAL);
				setState(119);
				var();
				}
				break;
			case 12:
				{
				_localctx = new NotequalconstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				cid();
				setState(122);
				match(NOTEQUAL);
				setState(123);
				constant();
				}
				break;
			case 13:
				{
				_localctx = new NotequalvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				cid();
				setState(126);
				match(NOTEQUAL);
				setState(127);
				var();
				}
				break;
			case 14:
				{
				_localctx = new InconstantlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				cid();
				setState(130);
				match(IN);
				setState(131);
				constantList();
				}
				break;
			case 15:
				{
				_localctx = new InvarlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				cid();
				setState(134);
				match(IN);
				setState(135);
				var();
				}
				break;
			case 16:
				{
				_localctx = new NotinconstantlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				cid();
				setState(138);
				match(NOTIN);
				setState(139);
				constantList();
				}
				break;
			case 17:
				{
				_localctx = new NotinvarlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				cid();
				setState(142);
				match(NOTIN);
				setState(143);
				var();
				}
				break;
			case 18:
				{
				_localctx = new BetweenconstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				cid();
				setState(146);
				match(BETWEEN);
				setState(147);
				constant();
				setState(148);
				match(AND);
				setState(149);
				constant();
				}
				break;
			case 19:
				{
				_localctx = new BetweenvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				cid();
				setState(152);
				match(BETWEEN);
				setState(153);
				var();
				setState(154);
				match(AND);
				setState(155);
				var();
				}
				break;
			case 20:
				{
				_localctx = new NotbetweenconstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				cid();
				setState(158);
				match(NOTBETWEEN);
				setState(159);
				constant();
				setState(160);
				match(AND);
				setState(161);
				constant();
				}
				break;
			case 21:
				{
				_localctx = new NotbetweenvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				cid();
				setState(164);
				match(NOTBETWEEN);
				setState(165);
				var();
				setState(166);
				match(AND);
				setState(167);
				var();
				}
				break;
			case 22:
				{
				_localctx = new IsnullcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				cid();
				setState(170);
				match(ISNULL);
				}
				break;
			case 23:
				{
				_localctx = new IsnotnullcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				cid();
				setState(173);
				match(ISNOTNULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndconditionContext(new ConditioncContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionc);
						setState(177);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(178);
						match(AND);
						setState(179);
						conditionc(25);
						}
						break;
					case 2:
						{
						_localctx = new OrconditionContext(new ConditioncContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionc);
						setState(180);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(181);
						match(OR);
						setState(182);
						conditionc(24);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class SelectCidListContext extends ParserRuleContext {
		public SelectCidListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCidList; }
	 
		public SelectCidListContext() { }
		public void copyFrom(SelectCidListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CidList_CidListContext extends SelectCidListContext {
		public CidListContext cidList() {
			return getRuleContext(CidListContext.class,0);
		}
		public CidList_CidListContext(SelectCidListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitCidList_CidList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CidList_StarContext extends SelectCidListContext {
		public TerminalNode STAR() { return getToken(StatementsParser.STAR, 0); }
		public CidList_StarContext(SelectCidListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitCidList_Star(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CidList_RegxContext extends SelectCidListContext {
		public TerminalNode TEXT() { return getToken(StatementsParser.TEXT, 0); }
		public CidList_RegxContext(SelectCidListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitCidList_Regx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectCidListContext selectCidList() throws RecognitionException {
		SelectCidListContext _localctx = new SelectCidListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectCidList);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				_localctx = new CidList_CidListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				cidList();
				}
				break;
			case STAR:
				_localctx = new CidList_StarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(STAR);
				}
				break;
			case TEXT:
				_localctx = new CidList_RegxContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(TEXT);
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

	public static class CidListContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(StatementsParser.LB, 0); }
		public List<CidContext> cid() {
			return getRuleContexts(CidContext.class);
		}
		public CidContext cid(int i) {
			return getRuleContext(CidContext.class,i);
		}
		public TerminalNode RB() { return getToken(StatementsParser.RB, 0); }
		public CidListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cidList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitCidList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CidListContext cidList() throws RecognitionException {
		CidListContext _localctx = new CidListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cidList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LB);
			setState(194);
			cid();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(195);
				match(T__0);
				setState(196);
				cid();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(RB);
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

	public static class CidContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(StatementsParser.TEXT, 0); }
		public CidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitCid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CidContext cid() throws RecognitionException {
		CidContext _localctx = new CidContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TEXT);
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

	public static class ConstantListContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(StatementsParser.LB, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode RB() { return getToken(StatementsParser.RB, 0); }
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LB);
			setState(207);
			constant();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(208);
				match(T__0);
				setState(209);
				constant();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(RB);
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

	public static class Constant2ListContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(StatementsParser.LB, 0); }
		public List<Constant2Context> constant2() {
			return getRuleContexts(Constant2Context.class);
		}
		public Constant2Context constant2(int i) {
			return getRuleContext(Constant2Context.class,i);
		}
		public TerminalNode RB() { return getToken(StatementsParser.RB, 0); }
		public Constant2ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant2List; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitConstant2List(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant2ListContext constant2List() throws RecognitionException {
		Constant2ListContext _localctx = new Constant2ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant2List);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LB);
			setState(218);
			constant2();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(219);
				match(T__0);
				setState(220);
				constant2();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(RB);
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

	public static class Constant3ListContext extends ParserRuleContext {
		public List<TerminalNode> LB() { return getTokens(StatementsParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(StatementsParser.LB, i);
		}
		public List<Constant2Context> constant2() {
			return getRuleContexts(Constant2Context.class);
		}
		public Constant2Context constant2(int i) {
			return getRuleContext(Constant2Context.class,i);
		}
		public List<TerminalNode> RB() { return getTokens(StatementsParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(StatementsParser.RB, i);
		}
		public Constant3ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant3List; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitConstant3List(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant3ListContext constant3List() throws RecognitionException {
		Constant3ListContext _localctx = new Constant3ListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant3List);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LB);
			setState(229);
			constant2();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(230);
				match(T__0);
				setState(231);
				constant2();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(RB);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(238);
				match(T__0);
				setState(239);
				match(LB);
				setState(240);
				constant2();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(241);
					match(T__0);
					setState(242);
					constant2();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(RB);
				}
				}
				setState(254);
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

	public static class Constant2Context extends ParserRuleContext {
		public Constant2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant2; }
	 
		public Constant2Context() { }
		public void copyFrom(Constant2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Constant2_NotNullContext extends Constant2Context {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Constant2_NotNullContext(Constant2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitConstant2_NotNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Constant2_NullContext extends Constant2Context {
		public TerminalNode NULL() { return getToken(StatementsParser.NULL, 0); }
		public Constant2_NullContext(Constant2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitConstant2_Null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant2Context constant2() throws RecognitionException {
		Constant2Context _localctx = new Constant2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_constant2);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new Constant2_NotNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				constant();
				}
				break;
			case NULL:
				_localctx = new Constant2_NullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(NULL);
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

	public static class LimitexpContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(StatementsParser.LIMIT, 0); }
		public List<TerminalNode> TEXT() { return getTokens(StatementsParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(StatementsParser.TEXT, i);
		}
		public LimitexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitLimitexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitexpContext limitexp() throws RecognitionException {
		LimitexpContext _localctx = new LimitexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_limitexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(LIMIT);
			setState(260);
			match(TEXT);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(261);
				match(T__0);
				setState(262);
				match(TEXT);
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

	public static class TablenameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(StatementsParser.TEXT, 0); }
		public TablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitTablename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablenameContext tablename() throws RecognitionException {
		TablenameContext _localctx = new TablenameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(TEXT);
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
		public TerminalNode TEXT() { return getToken(StatementsParser.TEXT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__1);
			setState(268);
			match(TEXT);
			setState(269);
			match(T__1);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(StatementsParser.TEXT, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StatementsVisitor ) return ((StatementsVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__2);
			setState(272);
			match(TEXT);
			setState(273);
			match(T__2);
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
		case 6:
			return conditionc_sempred((ConditioncContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditionc_sempred(ConditioncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 24);
		case 1:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\5\4>\n\4\3\5\3\5\5\5B\n\5\3\5\3"+
		"\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ba\n\b\f"+
		"\b\16\b\u00bd\13\b\3\t\3\t\3\t\5\t\u00c2\n\t\3\n\3\n\3\n\3\n\7\n\u00c8"+
		"\n\n\f\n\16\n\u00cb\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00d5\n"+
		"\f\f\f\16\f\u00d8\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00e0\n\r\f\r\16\r"+
		"\u00e3\13\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00eb\n\16\f\16\16\16\u00ee"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00f6\n\16\f\16\16\16\u00f9"+
		"\13\16\3\16\3\16\7\16\u00fd\n\16\f\16\16\16\u0100\13\16\3\17\3\17\5\17"+
		"\u0104\n\17\3\20\3\20\3\20\3\20\5\20\u010a\n\20\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\2\3\16\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\2\2\u012d\2*\3\2\2\2\4,\3\2\2\2\6\65\3\2\2\2\b?\3\2"+
		"\2\2\nH\3\2\2\2\fK\3\2\2\2\16\u00b1\3\2\2\2\20\u00c1\3\2\2\2\22\u00c3"+
		"\3\2\2\2\24\u00ce\3\2\2\2\26\u00d0\3\2\2\2\30\u00db\3\2\2\2\32\u00e6\3"+
		"\2\2\2\34\u0103\3\2\2\2\36\u0105\3\2\2\2 \u010b\3\2\2\2\"\u010d\3\2\2"+
		"\2$\u0111\3\2\2\2&+\5\6\4\2\'+\5\n\6\2(+\5\4\3\2)+\5\b\5\2*&\3\2\2\2*"+
		"\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\3\3\2\2\2,-\7\r\2\2-.\7\17\2\2.\60\5 "+
		"\21\2/\61\5\22\n\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\20"+
		"\2\2\63\64\5\32\16\2\64\5\3\2\2\2\65\66\7\n\2\2\66\67\5\20\t\2\678\7\21"+
		"\2\28:\5 \21\29;\5\f\7\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<>\5\36\20\2=<\3"+
		"\2\2\2=>\3\2\2\2>\7\3\2\2\2?A\7\16\2\2@B\5\20\t\2A@\3\2\2\2AB\3\2\2\2"+
		"BC\3\2\2\2CD\7\21\2\2DF\5 \21\2EG\5\f\7\2FE\3\2\2\2FG\3\2\2\2G\t\3\2\2"+
		"\2HI\7\13\2\2IJ\5\f\7\2J\13\3\2\2\2KL\7\t\2\2LM\5\16\b\2M\r\3\2\2\2NO"+
		"\b\b\1\2OP\7\7\2\2PQ\5\16\b\2QR\7\b\2\2R\u00b2\3\2\2\2ST\5\24\13\2TU\7"+
		" \2\2UV\5\"\22\2V\u00b2\3\2\2\2WX\5\24\13\2XY\7 \2\2YZ\5$\23\2Z\u00b2"+
		"\3\2\2\2[\\\5\24\13\2\\]\7\34\2\2]^\5\"\22\2^\u00b2\3\2\2\2_`\5\24\13"+
		"\2`a\7\34\2\2ab\5$\23\2b\u00b2\3\2\2\2cd\5\24\13\2de\7\36\2\2ef\5\"\22"+
		"\2f\u00b2\3\2\2\2gh\5\24\13\2hi\7\36\2\2ij\5$\23\2j\u00b2\3\2\2\2kl\5"+
		"\24\13\2lm\7\33\2\2mn\5\"\22\2n\u00b2\3\2\2\2op\5\24\13\2pq\7\33\2\2q"+
		"r\5$\23\2r\u00b2\3\2\2\2st\5\24\13\2tu\7\35\2\2uv\5\"\22\2v\u00b2\3\2"+
		"\2\2wx\5\24\13\2xy\7\35\2\2yz\5$\23\2z\u00b2\3\2\2\2{|\5\24\13\2|}\7\37"+
		"\2\2}~\5\"\22\2~\u00b2\3\2\2\2\177\u0080\5\24\13\2\u0080\u0081\7\37\2"+
		"\2\u0081\u0082\5$\23\2\u0082\u00b2\3\2\2\2\u0083\u0084\5\24\13\2\u0084"+
		"\u0085\7!\2\2\u0085\u0086\5\26\f\2\u0086\u00b2\3\2\2\2\u0087\u0088\5\24"+
		"\13\2\u0088\u0089\7!\2\2\u0089\u008a\5$\23\2\u008a\u00b2\3\2\2\2\u008b"+
		"\u008c\5\24\13\2\u008c\u008d\7\"\2\2\u008d\u008e\5\26\f\2\u008e\u00b2"+
		"\3\2\2\2\u008f\u0090\5\24\13\2\u0090\u0091\7\"\2\2\u0091\u0092\5$\23\2"+
		"\u0092\u00b2\3\2\2\2\u0093\u0094\5\24\13\2\u0094\u0095\7#\2\2\u0095\u0096"+
		"\5\"\22\2\u0096\u0097\7\31\2\2\u0097\u0098\5\"\22\2\u0098\u00b2\3\2\2"+
		"\2\u0099\u009a\5\24\13\2\u009a\u009b\7#\2\2\u009b\u009c\5$\23\2\u009c"+
		"\u009d\7\31\2\2\u009d\u009e\5$\23\2\u009e\u00b2\3\2\2\2\u009f\u00a0\5"+
		"\24\13\2\u00a0\u00a1\7$\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7\31\2\2"+
		"\u00a3\u00a4\5\"\22\2\u00a4\u00b2\3\2\2\2\u00a5\u00a6\5\24\13\2\u00a6"+
		"\u00a7\7$\2\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\7\31\2\2\u00a9\u00aa\5$"+
		"\23\2\u00aa\u00b2\3\2\2\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\7%\2\2\u00ad"+
		"\u00b2\3\2\2\2\u00ae\u00af\5\24\13\2\u00af\u00b0\7&\2\2\u00b0\u00b2\3"+
		"\2\2\2\u00b1N\3\2\2\2\u00b1S\3\2\2\2\u00b1W\3\2\2\2\u00b1[\3\2\2\2\u00b1"+
		"_\3\2\2\2\u00b1c\3\2\2\2\u00b1g\3\2\2\2\u00b1k\3\2\2\2\u00b1o\3\2\2\2"+
		"\u00b1s\3\2\2\2\u00b1w\3\2\2\2\u00b1{\3\2\2\2\u00b1\177\3\2\2\2\u00b1"+
		"\u0083\3\2\2\2\u00b1\u0087\3\2\2\2\u00b1\u008b\3\2\2\2\u00b1\u008f\3\2"+
		"\2\2\u00b1\u0093\3\2\2\2\u00b1\u0099\3\2\2\2\u00b1\u009f\3\2\2\2\u00b1"+
		"\u00a5\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00bb\3\2"+
		"\2\2\u00b3\u00b4\f\32\2\2\u00b4\u00b5\7\31\2\2\u00b5\u00ba\5\16\b\33\u00b6"+
		"\u00b7\f\31\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00ba\5\16\b\32\u00b9\u00b3"+
		"\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\17\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c2\5\22\n"+
		"\2\u00bf\u00c2\7\6\2\2\u00c0\u00c2\7\'\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\21\3\2\2\2\u00c3\u00c4\7\7\2\2\u00c4"+
		"\u00c9\5\24\13\2\u00c5\u00c6\7\3\2\2\u00c6\u00c8\5\24\13\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\b\2\2\u00cd\23\3\2\2"+
		"\2\u00ce\u00cf\7\'\2\2\u00cf\25\3\2\2\2\u00d0\u00d1\7\7\2\2\u00d1\u00d6"+
		"\5\"\22\2\u00d2\u00d3\7\3\2\2\u00d3\u00d5\5\"\22\2\u00d4\u00d2\3\2\2\2"+
		"\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\b\2\2\u00da\27\3\2\2\2\u00db"+
		"\u00dc\7\7\2\2\u00dc\u00e1\5\34\17\2\u00dd\u00de\7\3\2\2\u00de\u00e0\5"+
		"\34\17\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\b"+
		"\2\2\u00e5\31\3\2\2\2\u00e6\u00e7\7\7\2\2\u00e7\u00ec\5\34\17\2\u00e8"+
		"\u00e9\7\3\2\2\u00e9\u00eb\5\34\17\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00fe\7\b\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2\7\7"+
		"\2\2\u00f2\u00f7\5\34\17\2\u00f3\u00f4\7\3\2\2\u00f4\u00f6\5\34\17\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\b\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00f0\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\33\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0104"+
		"\5\"\22\2\u0102\u0104\7\27\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2"+
		"\u0104\35\3\2\2\2\u0105\u0106\7\22\2\2\u0106\u0109\7\'\2\2\u0107\u0108"+
		"\7\3\2\2\u0108\u010a\7\'\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\37\3\2\2\2\u010b\u010c\7\'\2\2\u010c!\3\2\2\2\u010d\u010e\7\4\2\2\u010e"+
		"\u010f\7\'\2\2\u010f\u0110\7\4\2\2\u0110#\3\2\2\2\u0111\u0112\7\5\2\2"+
		"\u0112\u0113\7\'\2\2\u0113\u0114\7\5\2\2\u0114%\3\2\2\2\24*\60:=AF\u00b1"+
		"\u00b9\u00bb\u00c1\u00c9\u00d6\u00e1\u00ec\u00f7\u00fe\u0103\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}