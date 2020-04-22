package cc.wsyw126.MySQLG4.manual;

import cc.wsyw126.MySQLG4.utils.ContextUtil;
import cc.wsyw126.MySQLG4.auto.StatementsBaseVisitor;
import cc.wsyw126.MySQLG4.auto.StatementsParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinzhi
 * */
public class SelectCidListVisitor extends StatementsBaseVisitor<List<String>> {

    @Override
    public List<String> visitCidList_CidList(StatementsParser.CidList_CidListContext ctx) {

        return ContextUtil.parseColumnSchemaList(ctx.cidList());
    }

    @Override
    public List<String> visitCidList_Star(StatementsParser.CidList_StarContext ctx) {
        ArrayList<String> result = new ArrayList<>();
        result.add("ALL");
        return result;
    }

    @Override
    public List<String> visitCidList_Regx(StatementsParser.CidList_RegxContext ctx) {
        String regx = ctx.TEXT().getText();
        ArrayList<String> result = new ArrayList<>();
        result.add(regx);
        return result;
    }
}
