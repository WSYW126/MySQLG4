package cc.wsyw126.MySQLG4.manual;

import cc.wsyw126.MySQLG4.model.CompareOp;
import cc.wsyw126.MySQLG4.utils.ContextUtil;
import cc.wsyw126.MySQLG4.model.Filter;
import cc.wsyw126.MySQLG4.model.FilterList;
import cc.wsyw126.MySQLG4.model.SingleColumnValueFilter;
import cc.wsyw126.MySQLG4.auto.StatementsBaseVisitor;
import cc.wsyw126.MySQLG4.auto.StatementsParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * FilterVisitor.
 * 
 * @author xinzhi.zhang
 * */
public class FilterVisitor extends StatementsBaseVisitor<Filter> {

    private Map<String, Object> para;

    public FilterVisitor(Map<String, Object> para) {
        this.para = para;
    }

    @Override
    public Filter visitOrcondition(StatementsParser.OrconditionContext ctx) {
        List<StatementsParser.ConditioncContext> conditioncContextList = ctx.conditionc();
        List<Filter> filters = new ArrayList<Filter>();
        for (StatementsParser.ConditioncContext conditioncContext : conditioncContextList) {
            filters.add(conditioncContext.accept(this));
        }

        FilterList filterList = new FilterList(FilterList.Operator.MUST_PASS_ONE, filters);
        return filterList;
    }

    @Override
    public Filter visitAndcondition(StatementsParser.AndconditionContext ctx) {
        List<StatementsParser.ConditioncContext> conditioncContextList = ctx.conditionc();
        List<Filter> filters = new ArrayList<Filter>();
        for (StatementsParser.ConditioncContext conditioncContext : conditioncContextList) {
            filters.add(conditioncContext.accept(this));
        }

        FilterList filterList = new FilterList(FilterList.Operator.MUST_PASS_ALL, filters);
        return filterList;
    }

    @Override
    public Filter visitConditionwrapper(StatementsParser.ConditionwrapperContext ctx) {
        return ctx.conditionc().accept(this);
    }

    @Override
    public Filter visitEqualvar(StatementsParser.EqualvarContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.VarContext varContext = ctx.var();
        Object object = ContextUtil.parsePara(varContext, para);

        return constructFilter(ContextUtil.parseColumnSchema(cidContext),
            CompareOp.EQUAL, object);
    }

    @Override
    public Filter visitEqualconstant(StatementsParser.EqualconstantContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.ConstantContext constantContext = ctx.constant();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parseConstant(constantContext);

        return constructFilter(cid, CompareOp.EQUAL, object);
    }

    @Override
    public Filter visitIsnullc(StatementsParser.IsnullcContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        String cid = ContextUtil.parseColumnSchema(cidContext);
        return constructFilter(cid, CompareOp.EQUAL, null);
    }

    @Override
    public Filter visitIsnotnullc(StatementsParser.IsnotnullcContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        String cid = ContextUtil.parseColumnSchema(cidContext);
        return constructFilter(cid, CompareOp.NOT_EQUAL, null);
    }

    @Override
    public Filter visitNotequalconstant(StatementsParser.NotequalconstantContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.ConstantContext constantContext = ctx.constant();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parseConstant(constantContext);

        return constructFilter(cid, CompareOp.NOT_EQUAL, object);
    }

    @Override
    public Filter visitNotequalvar(StatementsParser.NotequalvarContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.VarContext varContext = ctx.var();
        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parsePara(varContext, para);

        return constructFilter(cid, CompareOp.NOT_EQUAL, object);
    }

    @Override
    public Filter visitLessvar(StatementsParser.LessvarContext ctx) {

        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.VarContext varContext = ctx.var();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parsePara(varContext, para);

        return constructFilter(cid, CompareOp.LESS, object);
    }

    @Override
    public Filter visitLessconstant(StatementsParser.LessconstantContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.ConstantContext constantContext = ctx.constant();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parseConstant(constantContext);

        return constructFilter(cid, CompareOp.LESS, object);

    }

    @Override
    public Filter visitLessequalconstant(StatementsParser.LessequalconstantContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.ConstantContext constantContext = ctx.constant();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parseConstant(constantContext);

        return constructFilter(cid, CompareOp.LESS_OR_EQUAL, object);
    }

    @Override
    public Filter visitLessequalvar(StatementsParser.LessequalvarContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.VarContext varContext = ctx.var();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parsePara(varContext, para);
        return constructFilter(cid, CompareOp.LESS_OR_EQUAL, object);
    }

    @Override
    public Filter visitGreaterconstant(StatementsParser.GreaterconstantContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.ConstantContext constantContext = ctx.constant();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parseConstant(constantContext);

        return constructFilter(cid, CompareOp.GREATER, object);
    }

    @Override
    public Filter visitGreatervar(StatementsParser.GreatervarContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.VarContext varContext = ctx.var();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parsePara(varContext, para);
        return constructFilter(cid, CompareOp.GREATER, object);
    }

    @Override
    public Filter visitGreaterequalvar(StatementsParser.GreaterequalvarContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.VarContext varContext = ctx.var();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parsePara(varContext, para);
        return constructFilter(cid, CompareOp.GREATER_OR_EQUAL, object);
    }

    @Override
    public Filter visitGreaterequalconstant(StatementsParser.GreaterequalconstantContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.ConstantContext constantContext = ctx.constant();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parseConstant(constantContext);

        return constructFilter(cid, CompareOp.GREATER_OR_EQUAL, object);
    }

    private static Filter constructFilter(String cid, CompareOp compareOp,
                                          Object value) {

        return new SingleColumnValueFilter(cid, compareOp.toParseableString(), value);
    }

    @Override
    public Filter visitNotinconstantlist(StatementsParser.NotinconstantlistContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        String cid = ContextUtil.parseColumnSchema(cidContext);

        StatementsParser.ConstantListContext constantListContext = ctx.constantList();
        List<StatementsParser.ConstantContext> constantContextList = constantListContext.constant();
        List<Object> list = ContextUtil.parseConstantList(constantContextList);

        return constructFilterForContain(cid, CompareOp.NOT_EQUAL, list,
            FilterList.Operator.MUST_PASS_ALL);
    }

    @Override
    public Filter visitNotinvarlist(StatementsParser.NotinvarlistContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.VarContext varContext = ctx.var();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parsePara(varContext, para);

        return constructFilterForContain(cid, CompareOp.NOT_EQUAL,
            (List<Object>) object, FilterList.Operator.MUST_PASS_ALL);
    }

    @Override
    public Filter visitInvarlist(StatementsParser.InvarlistContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        StatementsParser.VarContext varContext = ctx.var();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        Object object = ContextUtil.parsePara(varContext, para);

        return constructFilterForContain(cid, CompareOp.EQUAL, (List<Object>) object,
            FilterList.Operator.MUST_PASS_ONE);
    }

    @Override
    public Filter visitInconstantlist(StatementsParser.InconstantlistContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        String cid = ContextUtil.parseColumnSchema(cidContext);

        StatementsParser.ConstantListContext constantListContext = ctx.constantList();
        List<StatementsParser.ConstantContext> constantContextList = constantListContext.constant();
        List<Object> list = ContextUtil.parseConstantList(constantContextList);

        return constructFilterForContain(cid, CompareOp.EQUAL, list,
            FilterList.Operator.MUST_PASS_ONE);
    }

    private static Filter constructFilterForContain(String cid, CompareOp compareOp,
                                                    List<Object> list,
                                                    FilterList.Operator operator) {

        List<Filter> filters = new ArrayList<>();
        for (Object obj : list) {
            filters.add(constructFilter(cid, compareOp, obj));
        }

        FilterList filterList = new FilterList(operator, filters);
        return filterList;
    }

    @Override
    public Filter visitNotbetweenconstant(StatementsParser.NotbetweenconstantContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        String cid = ContextUtil.parseColumnSchema(cidContext);

        List<StatementsParser.ConstantContext> constantContextList = ctx.constant();

        List<Object> list = ContextUtil.parseConstantList(constantContextList);

        Filter startFilter = constructFilter(cid, CompareOp.LESS, list.get(0));
        Filter endFilter = constructFilter(cid, CompareOp.GREATER, list.get(1));

        FilterList filterList = new FilterList(FilterList.Operator.MUST_PASS_ONE,
            Arrays.asList(startFilter, endFilter));
        return filterList;
    }

    @Override
    public Filter visitNotbetweenvar(StatementsParser.NotbetweenvarContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        List<StatementsParser.VarContext> varContextList = ctx.var();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        List<Object> list = ContextUtil.parseParaList(varContextList, para);

        Filter startFilter = constructFilter(cid, CompareOp.LESS, list.get(0));
        Filter endFilter = constructFilter(cid, CompareOp.GREATER, list.get(1));

        FilterList filterList = new FilterList(FilterList.Operator.MUST_PASS_ONE,
            Arrays.asList(startFilter, endFilter));

        return filterList;
    }

    @Override
    public Filter visitBetweenvar(StatementsParser.BetweenvarContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        List<StatementsParser.VarContext> varContextList = ctx.var();

        String cid = ContextUtil.parseColumnSchema(cidContext);
        List<Object> list = ContextUtil.parseParaList(varContextList, para);

        Filter startFilter = constructFilter(cid, CompareOp.GREATER_OR_EQUAL,
            list.get(0));
        Filter endFilter = constructFilter(cid, CompareOp.LESS_OR_EQUAL, list.get(1));

        FilterList filterList = new FilterList(FilterList.Operator.MUST_PASS_ALL,
            Arrays.asList(startFilter, endFilter));
        return filterList;
    }

    @Override
    public Filter visitBetweenconstant(StatementsParser.BetweenconstantContext ctx) {
        StatementsParser.CidContext cidContext = ctx.cid();
        String cid = ContextUtil.parseColumnSchema(cidContext);

        List<StatementsParser.ConstantContext> constantContextList = ctx.constant();

        List<Object> list = ContextUtil.parseConstantList(constantContextList);

        Filter startFilter = constructFilter(cid, CompareOp.GREATER_OR_EQUAL,
            list.get(0));
        Filter endFilter = constructFilter(cid, CompareOp.LESS_OR_EQUAL, list.get(1));

        FilterList filterList = new FilterList(FilterList.Operator.MUST_PASS_ALL,
            Arrays.asList(startFilter, endFilter));

        return filterList;
    }
}
