package collections.map_interface;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Vova", "Gumennyi", 3);
        Student st2 = new Student("Artem", "Petrov", 1);
        Student st3 = new Student("Igor", "Alexeev", 2);
        Student st4 = new Student("Denis", "Gumennyi", 3);

        ht.put(7.8, st1);
        ht.put(9.3, st2);
        ht.put(5.8, st3);
        ht.put(6.0, st4);

        System.out.println(ht);

    }
}
