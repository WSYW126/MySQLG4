package cc.wsyw126.MySQLG4.utils;

import cc.wsyw126.MySQLG4.auto.StatementsParser;
import cc.wsyw126.MySQLG4.manual.Constant2Visitor;
import cc.wsyw126.MySQLG4.manual.FilterVisitor;
import cc.wsyw126.MySQLG4.manual.SelectCidListVisitor;
import cc.wsyw126.MySQLG4.model.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yangjunpeng
 * @version $Id: ContextUtil.java, v 0.1 2020年04月22日 下午4:14 yangjunpeng Exp $
 */
public class ContextUtil {

    public static List<String> parseColumnSchemaList(StatementsParser.SelectCidListContext selectCidListContext) {

        SelectCidListVisitor visitor = new SelectCidListVisitor();
        return selectCidListContext.accept(visitor);
    }

    public static List<String> parseColumnSchemaList(StatementsParser.CidListContext cidListContext) {

        List<String> result = new ArrayList<>();

        for (StatementsParser.CidContext cidContext : cidListContext.cid()) {
            result.add(cidContext.TEXT().getText());
        }

        return result;

    }

    public static String parseColumnSchema(StatementsParser.CidContext cidContext) {

        return cidContext.TEXT().getText();

    }

    public static StatementsParser.InsertcContext parseInsertcContext(StatementsParser.ProgContext progContext) {

        StatementsParser.InsertclContext insertHqlClContext = (StatementsParser.InsertclContext) progContext;
        StatementsParser.InsertcContext result = insertHqlClContext.insertc();

        return result;
    }

    public static StatementsParser.SelectcContext parseSelectcContext(StatementsParser.ProgContext progContext) {

        StatementsParser.SelectclContext selectHqlClContext = (StatementsParser.SelectclContext) progContext;
        StatementsParser.SelectcContext result = selectHqlClContext.selectc();

        return result;
    }

    public static StatementsParser.DeletecContext parseDeletehqlcContext(StatementsParser.ProgContext progContext) {

        StatementsParser.DeleteclContext deleteHqlClContext = (StatementsParser.DeleteclContext) progContext;
        StatementsParser.DeletecContext result = deleteHqlClContext.deletec();

        return result;
    }

    public static Object parsePara(StatementsParser.VarContext varContext,
                                   Map<String, Object> para) {

        String var = varContext.TEXT().getText();

        Object obj = para.get(var);

        return obj;
    }

    public static Object parseConstant(StatementsParser.ConstantContext constantContext) {
        return constantContext.TEXT().getText();
    }

    public static List<Object> parseConstantList(List<StatementsParser.ConstantContext> constantContextList) {
        List<Object> result = new ArrayList<>();
        for (StatementsParser.ConstantContext constantContext : constantContextList) {
            result.add(parseConstant(constantContext));
        }
        return result;
    }

    public static List<Object> parseParaList(List<StatementsParser.VarContext> varContextList,
                                             Map<String, Object> para) {

        List<Object> result = new ArrayList<>();
        for (StatementsParser.VarContext varContext : varContextList) {
            result.add(parsePara(varContext, para));
        }
        return result;
    }

    public static Filter parseSelectFilter(StatementsParser.ProgContext progContext,
                                           Map<String, Object> para) {

        StatementsParser.SelectclContext selectclContext = ((StatementsParser.SelectclContext) progContext);
        return parseFilter(selectclContext.selectc().wherec(), para);
    }

    private static Filter parseFilter(StatementsParser.WherecContext wherecContext,
                                      Map<String, Object> para) {

        if (wherecContext == null) {
            return null;
        }
        if (wherecContext.conditionc() == null) {
            return null;
        }

        FilterVisitor visitor = new FilterVisitor(para);
        return wherecContext.conditionc().accept(visitor);
    }


    public static Object parseConstant2(StatementsParser.Constant2Context constant2Context) {

        Constant2Visitor visitor = new Constant2Visitor();
        return constant2Context.accept(visitor);
    }


    public static List<Object> parseConstant2List(List<StatementsParser.Constant2Context> constant2Contexts) {
        List<Object> result = new ArrayList<>();
        for (StatementsParser.Constant2Context constant2Context : constant2Contexts) {
            result.add(parseConstant2(constant2Context));
        }

        return result;
    }

}