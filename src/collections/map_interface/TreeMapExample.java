package collections.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Vova", "Gumennyi", 3);
        Student st2 = new Student("Artem", "Petrov", 1);
        Student st3 = new Student("Igor", "Alexeev", 2);
        Student st4 = new Student("Denis", "Gumennyi", 3);
        Student st5 = new Student("Artur", "Petrov", 1);
        Student st6 = new Student("Alex", "Alexeev", 2);
        Student st7 = new Student("Oleg", "Alexeev", 2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(8.2, st6);
        treeMap.put(7.9, st5);
        treeMap.put(9.1, st7);
        System.out.println(treeMap);
    }
}
