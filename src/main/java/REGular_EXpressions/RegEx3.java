package REGular_EXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
    public static void main(String[] args) {
//        // \d - odna cifra
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("[1-9]");
//        Pattern pattern1 = Pattern.compile("\\d");
//        // \D - odna ne cifra
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D");
//        // \w - odna bukva, cifra ili "_"
//        String s1 = "abcd abce abc_5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w"); // libo mojno bilo napisat tak [A-Za-z0-9_]
//        // \W - odna ne bukva, ne cifra ili ne "_"
//        String s1 = "abcd!?abce====abc ++5abcg6abch"; // libo mojno bilo napisat tak [^A-Za-z0-9_]
//        Pattern pattern1 = Pattern.compile("\\W");
//        // \s - probelniy simvol
        String s1 = "poka       abc          Zaur    dom  kino abstrakcionizm";
        Pattern pattern1 = Pattern.compile("\\w\\s+\\w"); // [\t\n\r\f]
        // \S - ne probelniy simvol
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\S");


        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()){
            System.out.println("Position: " + matcher.start() + "  " + matcher.group());
        }
    }
}