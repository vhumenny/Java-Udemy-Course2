package regex;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "Hello,       my   friend!    How     Java studying is   going     ?";
        System.out.println(s1);
//        s1 = s1.replace("Java", "SQL");
//        s1 = s1.replaceAll(" (2,)", " ");
//        s1 = s1.replaceAll("\\bs\\w+", "4444");
        s1 = s1.replaceFirst("\\bh\\w+", "4444");

        System.out.println(s1);
    }
}
