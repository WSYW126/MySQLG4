package cc.wsyw126.MySQLG4.manual;

import cc.wsyw126.MySQLG4.auto.StatementsParser;
import cc.wsyw126.MySQLG4.mockdata.MockData;
import cc.wsyw126.MySQLG4.model.Filter;
import cc.wsyw126.MySQLG4.utils.ContextUtil;
import cc.wsyw126.MySQLG4.utils.TreeUtil;
import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @author yangjunpeng
 * @version $Id: Test.java, v 0.1 2019年09月06日 上午11:05 yangjunpeng Exp $
 */
public class Test {
    public static void main(String[] args) {


        StatementsParser.ProgContext progContext = TreeUtil.parseProgContext("select (name,id,age) from table_name where id equal #id# and name = \"12\" and age notin #ages#  and age between #age1# and #age2#");
        StatementsParser.SelectcContext selectcContext = ContextUtil.parseSelectcContext(progContext);


        StatementsParser.SelectCidListContext selectCidListContext = selectcContext.selectCidList();
        List<String> strings = ContextUtil.parseColumnSchemaList(selectCidListContext);
        System.out.println("selectcContext = " + JSON.toJSONString(strings));


        String tableName = TreeUtil.parseTableName(progContext);
        System.out.println("s = " + tableName);


        Filter filter = ContextUtil.parseSelectFilter(progContext, MockData.getMap());
        System.out.println("filter.toString() = " + filter.toString());


    }


}