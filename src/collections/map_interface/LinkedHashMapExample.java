package collections.map_interface;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Vova", "Gumennyi", 3);
        Student st2 = new Student("Artem", "Petrov", 1);
        Student st3 = new Student("Igor", "Alexeev", 2);
        Student st4 = new Student("Denis", "Gumennyi", 3);


        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(7.5, st4);

    }
}
