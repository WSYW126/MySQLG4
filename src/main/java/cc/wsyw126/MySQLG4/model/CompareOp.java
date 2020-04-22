package cc.wsyw126.MySQLG4.model;

/**
 * @author yangjunpeng
 * @version $Id: CompareOp.java, v 0.1 2020年04月22日 下午7:22 yangjunpeng Exp $
 */
public enum CompareOp {
                       /** less than */
                       LESS,
                       /** less than or equal to */
                       LESS_OR_EQUAL,
                       /** equals */
                       EQUAL,
                       /** not equal */
                       NOT_EQUAL,
                       /** greater than or equal to */
                       GREATER_OR_EQUAL,
                       /** greater than */
                       GREATER,
                       /** no operation */
                       NO_OP;

    /**
     * @return the string which is supported to be parsed as this compare op
     */
    public String toParseableString() {
        switch (this) {
            case LESS:
                return "<";
            case LESS_OR_EQUAL:
                return "<=";
            case EQUAL:
                return "=";
            case NOT_EQUAL:
                return "!=";
            case GREATER_OR_EQUAL:
                return ">=";
            case GREATER:
                return ">";
            default:
                throw new IllegalArgumentException("Invalid compare operator " + this);
        }
    }
}