package cc.wsyw126.MySQLG4.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjunpeng
 * @version $Id: Filter.java, v 0.1 2020年04月22日 下午4:43 yangjunpeng Exp $
 */
public class FilterList implements Filter {
    /** set operator */
    public static enum Operator {
                                 /** !AND */
                                 MUST_PASS_ALL,
                                 /** !OR */
                                 MUST_PASS_ONE
    }

    private Operator     operator = Operator.MUST_PASS_ALL;
    private List<Filter> filters  = new ArrayList<Filter>();

    public FilterList(final Operator operator, final List<Filter> rowFilters) {
        this.filters = rowFilters;
        this.operator = operator;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}