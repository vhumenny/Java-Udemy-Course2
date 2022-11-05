package collections;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Vova");
        arraylist1.add("Anna");
        arraylist1.add("Artem");
        arraylist1.add("Vova");
        System.out.println(arraylist1);

//        ArrayList<String> arraylist2 = new ArrayList<>();
//        arraylist2.add("!!!");
//        arraylist2.add("???");
//        arraylist1.addAll(1,arraylist2);
//        System.out.println(arraylist1);
//        arraylist1.clear();
        System.out.println(arraylist1.indexOf("Vova"));
        System.out.println(arraylist1.lastIndexOf("Vova"));
        System.out.println(arraylist1.size());
        System.out.println(arraylist1.isEmpty());
        System.out.println(arraylist1.contains("Anna"));
    }

}
