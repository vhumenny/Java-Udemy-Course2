package collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Vladimir Gumennyi");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Alex Alexeev");
        map1.put(2000, "Zaur Tregulov");
        map1.putIfAbsent(1000, "Zaur Tregulov");
        System.out.println(map1);
//        System.out.println(map1.get(1000));
        map1.remove(6578);
//        System.out.println(map1);
//        System.out.println(map1.containsValue("Zaur Tregulov"));
//        System.out.println(map1.containsKey(1000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Alex", "Good");
        map2.put("Ivan", "Smart");
    }
}
