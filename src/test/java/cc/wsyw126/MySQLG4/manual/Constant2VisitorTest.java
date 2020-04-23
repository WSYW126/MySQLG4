package cc.wsyw126.MySQLG4.manual;

import cc.wsyw126.MySQLG4.auto.StatementsParser;
import cc.wsyw126.MySQLG4.utils.ContextUtil;
import cc.wsyw126.MySQLG4.utils.TreeUtil;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.List;

class Constant2VisitorTest {

    @Test
    void visitConstant2_Null() {

    }

    @Test
    void visitConstant2_NotNull() {
        StatementsParser.ProgContext progContext = TreeUtil.parseProgContext("insert into table_name (id,name,age) values (\"12\", \"li\", \"18\"),(\"13\", \"zhang\", \"20\")");
        StatementsParser.InsertcContext insertcContext = ContextUtil.parseInsertcContext(progContext);

        String tableName = TreeUtil.parseTableName(progContext);
        System.out.println("tableName: " + tableName);

        List<String> strings = ContextUtil.parseColumnSchemaList(insertcContext.cidList());
        System.out.println("column: " + strings);

        List<StatementsParser.Constant2Context> constant2Contexts = insertcContext.constant3List().constant2();
        System.out.println("values: " + JSON.toJSONString(ContextUtil.parseConstant2List(constant2Contexts)));

    }
}