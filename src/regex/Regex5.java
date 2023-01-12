package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String myString = "32123456789987650422145;" +
                "987856754643532523423;" +
                "685357483573284234324";
        // 3212 3456 7899 8765 04/22 (145)

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(myNewString);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
