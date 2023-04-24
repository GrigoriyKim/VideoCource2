package REGular_EXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx4 {
        // /b - granica slova ili chisla
        // /B - granica ne slova ili ne chisla
    public static void main(String[] args) {
//    // /A - virajenie v nachale String-a
//        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern1 = Pattern.compile("\\Aabcd");
        // /Z - virajenie v konce String-a
        String s1 = "abcd abce abcfabcgabch";
        Pattern pattern1 = Pattern.compile("abch\\Z");

        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "  " + matcher.group());
        }

    }
}
