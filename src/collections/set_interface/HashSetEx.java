package collections.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Vova");
        set.add("Anna");
        set.add("Artem");
        set.add("Oleg");

        System.out.println(set);
        set.remove("Vova");

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Alex"));
    }
}
