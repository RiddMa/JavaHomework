package hw18;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class sortHashMap {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<String, Object>();
        int i;
        for (i = 0; i < 10; i++) {
            map.put("key" + i * i, (long) (i * i));
        }
        // 将键值对保存到集合
        List<Entry<String, Object>> lst = new ArrayList<Entry<String, Object>>(map.entrySet());
        // 使用集合工具来排序
        Collections.sort(lst, new Comparator<Map.Entry<String, Object>>() {
            // 自己构造排序规则
            @Override
            public int compare(Entry<String, Object> o1, Entry<String, Object> o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });

        for (Entry<String, Object> entry : lst) {
            System.out.println(entry.hashCode() + ":" + entry.getKey() + "-->" + entry.getValue());
        }
    }
}
