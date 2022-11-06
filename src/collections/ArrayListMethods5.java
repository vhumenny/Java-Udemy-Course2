package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Vova");
        arraylist1.add("Anna");
        arraylist1.add("Artem");
        arraylist1.add("Nikolay");
        arraylist1.add("Artur");
//        System.out.println("ArrayList: " + arraylist1);
//
//        Object[] array = arraylist1.toArray();
//        String[] array2 = arraylist1.toArray(new String[0]);
//
//        for (String s : array2) {
//            System.out.println(s);
//        }

        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);
//        list1.add(100);

        List<String> list2 = List.copyOf(arraylist1);
        System.out.println(list2);

//        List<String> myList = arraylist1.subList(1, 4);
//        System.out.println("Sub list: " + myList);
//        myList.add("Inna");
//        System.out.println("Sub list: " + myList);
//        System.out.println("ArrayList: " + arraylist1);
//        arraylist1.add("Sveta");
//        System.out.println("ArrayList: " + arraylist1);


//        ArrayList<String> arraylist2 = new ArrayList<>();
//        arraylist2.add("Anna");
//        arraylist2.add("Artem");
//        arraylist2.add("Igor");

//        arraylist1.removeAll(arraylist2);
//        arraylist1.retainAll(arraylist2);

//        boolean result = arraylist1.containsAll(arraylist2);
//        System.out.println(result);
    }
}
