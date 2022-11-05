package collections;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Vova");
        arraylist1.add("Anna");
        arraylist1.add("Artem");
        arraylist1.add(1, "Misha");

        for (String s : arraylist1) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (int i = 0; i < arraylist1.size(); i++) {
            System.out.println(arraylist1.get(i));
        }
        arraylist1.set(1, "Artur");
        arraylist1.remove(0);

        System.out.println(arraylist1);
    }

}
