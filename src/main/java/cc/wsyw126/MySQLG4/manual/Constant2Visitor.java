package cc.wsyw126.MySQLG4.manual;


import cc.wsyw126.MySQLG4.auto.StatementsBaseVisitor;
import cc.wsyw126.MySQLG4.auto.StatementsParser;

/**
 * @author xinzhi
 * */
public class Constant2Visitor extends StatementsBaseVisitor<Object> {

    @Override
    public Object visitConstant2_Null(StatementsParser.Constant2_NullContext ctx) {
        return null;
    }

    @Override
    public Object visitConstant2_NotNull(StatementsParser.Constant2_NotNullContext ctx) {
        return ctx.constant().TEXT().getText();
    }

}
