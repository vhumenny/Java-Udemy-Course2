package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Vova");
        arraylist1.add("Anna");
        arraylist1.add("Artem");
        arraylist1.add("Nikolay");
        arraylist1.add("Artur");

        Iterator <String> iterator = arraylist1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arraylist1);

    }
}
