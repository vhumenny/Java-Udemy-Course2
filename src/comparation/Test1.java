package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vova");
        list.add("Anna");
        list.add("Artem");
        System.out.println(list);
        Collections.sort(list);
    }
}
