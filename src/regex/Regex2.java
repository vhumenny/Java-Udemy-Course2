package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABCD");
//        String s1 = "ABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc$");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc$");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w");
//        String s1 = "abcd!?abce====abc ++5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W+");
//        String s1 = "poka abc Zaur dom kino";
//        Pattern pattern1 = Pattern.compile("\\w{4}");
//        String s1 = "poka        abc       Zaur   dom kino";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");    //[\t\n\r\f]
//        String s1 = "abcd abce3 abcfa78abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}");
//        String s1 = "abcd abce3 abcfa78abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D{2,}");
//        String s1 = "abcd abce3 abcfa78abcg6abch";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}");
//        String s1 = "DABCDABABDABABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}");
//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)*");
        String s1 = "abcd abce abcfabcgabch";
        Pattern pattern1 = Pattern.compile("\\A");

        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "    " + matcher.group());
        }
    }

}
