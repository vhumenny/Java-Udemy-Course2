package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {

        String s = "Ivanov Vasiliy, Ukraine, Kiev, Alex street, 51, flat 48, " +
                "email: vivanov@gmail.com, Postcode: AA99, Phone number: +123456789010; " +
                "Petrova Mariya, Ukrain, Odessa, Ekaterininskaya street, 10, flat 30, " +
                "email: masha@gmail.com, Postcode: UKR59, Phone number: +380123453545; " +
                "Chuck Norris, USA, Hollywod, All stars street, 87, flat 21, " +
                "email: chuck@gmail.com, Postcode: USA23, Phone number: +136478952.";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d(2)\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{9}");

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");


        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
