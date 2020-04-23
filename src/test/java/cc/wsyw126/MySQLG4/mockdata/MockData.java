package cc.wsyw126.MySQLG4.mockdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangjunpeng
 * @version $Id: MockData.java, v 0.1 2020年04月23日 上午11:02 yangjunpeng Exp $
 */
public class MockData {
    public static final Map<String, Object> getMap() {
        Map<String, Object> para = new HashMap<>();
        para.put("id", "12");
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(18);
        ages.add(19);
        para.put("ages", ages);

        Integer age1 = 17;
        Integer age2 = 22;
        para.put("age1", age1);
        para.put("age2", age2);

        return para;
    }
}