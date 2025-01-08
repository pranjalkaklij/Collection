import java.util.HashMap;
import java.util.Map;

public class HashMapExample{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Orange");
        map.put(2, "Banana");
        map.put(3, "Apple");
        map.putIfAbsent(3, "Chiku");

        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Apple"));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        //Iterating Over Keys In a Map
        // In java 10+ we can use var to declare variable we don't need to define data type
        for (Integer i : map.keySet()) {
            System.out.println(i);
        }
        for (var i : map.values()) {
            System.out.println(i);
        }

        //Iterate over the Key, value

        for (var e : map.entrySet()) {
            System.out.println(e);
            // System.out.println(e.getKey());
            // System.out.println(e.getValue());
        }
    }
}