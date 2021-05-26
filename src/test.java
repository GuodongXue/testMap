import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        /*
        Map的学习
       Key-Value键值对
        增加 put(K key V value)
        修改
        查看 entrySet() get(Object key) keySet() size() values()
        删除 clear() remove(key)
        判断 containsKey（）containsValue（）isEmpty()
         */

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(4, "zhao");
        map.put(7, "li");
        map.put(8, "zhang");
        map.put(8, "xue");
        map.put(2, "liu");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(8));
        //map.clear();
        //System.out.println(map.isEmpty());
        //对map的key做遍历
        Set<Integer> integers = map.keySet();
        for(Integer i : integers){
            System.out.println(i);
        }
        //对map的values做遍历
        Collection<String> values = map.values();
        for (String s : values){
            System.out.println(s);
        }

        for (Integer i : integers){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> set1 = map.entrySet();
        for (Map.Entry<Integer, String> m:set1){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
