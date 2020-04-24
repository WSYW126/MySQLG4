package cc.wsyw126.MySQLG4.utils;

import cc.wsyw126.MySQLG4.auto.StatementsLexer;
import cc.wsyw126.MySQLG4.auto.StatementsParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;

import java.io.StringReader;

/**
 * @author yangjunpeng
 * @version $Id: TreeUtil.java, v 0.1 2020年04月22日 下午7:22 yangjunpeng Exp $
 */
public class TreeUtil {

    public static StatementsParser.ProgContext parseProgContext(String sql) {

        try {
            ANTLRInputStream input = new ANTLRInputStream(new StringReader(sql));
            StatementsLexer lexer = new StatementsLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            StatementsParser parser = new StatementsParser(tokens);
            parser.setErrorHandler(new DefaultErrorStrategy());
            StatementsParser.ProgContext progContext = parser.prog();
            return progContext;
        } catch (Exception e) {
            throw new RuntimeException("parse error.", e);
        }
    }

    public static String parseTableName(StatementsParser.ProgContext progContext) {

        if (progContext instanceof StatementsParser.InsertclContext) {
            return StatementsParser.InsertclContext.class.cast(progContext).insertc().tablename()
                    .TEXT().getText();
        }

        if (progContext instanceof StatementsParser.SelectclContext) {
            return StatementsParser.SelectclContext.class.cast(progContext).selectc().tablename()
                    .TEXT().getText();
        }

        if (progContext instanceof StatementsParser.DeleteclContext) {
            return StatementsParser.DeleteclContext.class.cast(progContext).deletec().tablename()
                    .TEXT().getText();
        }

        throw new RuntimeException("parse error.");
    }

}
