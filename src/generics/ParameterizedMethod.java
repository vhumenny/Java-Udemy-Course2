package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("abc");
        arrayList2.add("def");
        arrayList2.add("ghi");
        String s = GenMethod.getSecondElement(arrayList2);
        System.out.println(a);
    }

}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}


