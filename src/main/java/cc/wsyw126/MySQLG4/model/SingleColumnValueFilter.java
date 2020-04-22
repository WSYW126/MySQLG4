/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package cc.wsyw126.MySQLG4.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author yangjunpeng
 * @version $Id: SingleColumnValueFilter.java, v 0.1 2020年04月22日 下午5:21 yangjunpeng Exp $
 */
public class SingleColumnValueFilter implements Filter {
    private String ColumnName;
    private String CompareOp;
    private Object ColumnValue;

    public SingleColumnValueFilter(String columnName, String compareOp, Object columnValue) {
        ColumnName = columnName;
        CompareOp = compareOp;
        ColumnValue = columnValue;
    }

    /**
     * Getter method for property <tt>ColumnName</tt>.
     *
     * @return property value of ColumnName
     */
    public String getColumnName() {
        return ColumnName;
    }

    /**
     * Setter method for property <tt>ColumnName</tt>.
     *
     * @param columnName value to be assigned to property ColumnName
     */
    public void setColumnName(String columnName) {
        ColumnName = columnName;
    }

    /**
     * Getter method for property <tt>CompareOp</tt>.
     *
     * @return property value of CompareOp
     */
    public String getCompareOp() {
        return CompareOp;
    }

    /**
     * Setter method for property <tt>CompareOp</tt>.
     *
     * @param compareOp value to be assigned to property CompareOp
     */
    public void setCompareOp(String compareOp) {
        CompareOp = compareOp;
    }

    /**
     * Getter method for property <tt>ColumnValue</tt>.
     *
     * @return property value of ColumnValue
     */
    public Object getColumnValue() {
        return ColumnValue;
    }

    /**
     * Setter method for property <tt>ColumnValue</tt>.
     *
     * @param ColumnValue value to be assigned to property ColumnValue
     */
    public void setColumnValue(Object columnValue) {
        ColumnValue = columnValue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}