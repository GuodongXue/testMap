import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class testTable {
    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<Integer, String>();
        map.put(4, "zhao");
        map.put(7, "li");
        map.put(9, "zhang");
        map.put(8, "xue");
        map.put(2, "liu");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(8));
    }
}
