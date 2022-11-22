package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("Bye");
        arrayList.add("See you");
        arrayList.add("Good day");
        arrayList.add("Nice weather");
//        arrayList.removeIf(element -> element.length()<5);
        Predicate<String> p = element -> element.length() < 5;
        arrayList.removeIf(p);
        System.out.println(arrayList);
    }
}
