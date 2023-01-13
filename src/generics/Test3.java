package generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();

        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        ShowListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("hi");
        list2.add("bye");
        ShowListInfo(list2);

        ArrayList <Double> arrayListDouble = new ArrayList<>();
        arrayListDouble.add(3.14);
        arrayListDouble.add(3.15);
        arrayListDouble.add(3.16);
        System.out.println(sum(arrayListDouble));

        ArrayList <Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(3);
        arrayListInteger.add(35);
        arrayListInteger.add(30);
        System.out.println(sum(arrayListInteger));
    }

    static void ShowListInfo(List<?> list) {
        System.out.println("My list contains next elements: " + list);

    }

    public static double sum(ArrayList<? extends Number> a1) {
        double sum = 0;
        for (Number n : a1) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
