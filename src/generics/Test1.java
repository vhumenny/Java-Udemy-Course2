package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("dasfsagsdags"));
//        list.add(new Car());

        list.add("hi");
        list.add("bye");
        list.add("ok");
        list.add("eye");
        for (Object o : list) {
            System.out.println(o + " length " + ((String) o).length());
        }

    }
}

class Car {
}