package regex;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Ukraine, Kiev, Alex street, 51, flat 48, " +
                "email: vivanov@gmail.com, Postcode: AA99, Phone number: +123456789010; " +
                "Petrova Mariya, Ukrain, Odessa, Ekaterininskaya street, 10, flat 30, " +
                "email: masha@gmail.com, Postcode: UKR59, Phone number: +380123453545; " +
                "Chuck Norris, USA, Hollywod, All stars street, 87, flat 21, " +
                "email: chuck@gmail.com, Postcode: USA23, Phone number: +136478952.";

        String s2 = "chuck@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com)");
        String[] array = s.split(" ");

        System.out.println(Arrays.toString(array));
    }
}
