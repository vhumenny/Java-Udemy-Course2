package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArraylistEx1 {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Vova");
        arraylist1.add("Anna");
        arraylist1.add("Artem");
        System.out.println(arraylist1);

        ArrayList<String> arraylist2 = new ArrayList<>(200);
        arraylist2.add("Vova");
        arraylist2.add("Artem");

        List<String> arraylist3 = new ArrayList<>();

        ArrayList<String> arraylist4 = new ArrayList<>(arraylist1);

    }
}
