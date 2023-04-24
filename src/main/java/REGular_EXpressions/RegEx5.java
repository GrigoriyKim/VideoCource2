package REGular_EXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5 {
    public static void main(String[] args) {
        // virajenie{n,} - "n" ili bolee kolichestvo povtoreniy
//    // virajenie+ - 1 ili bolee povtoreniy
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+");
//    // virajenie* - 0 ili bolee povtoreniy
//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)*");
//    // virajenie? - 0 ili 1 povtorenie
//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)?");
//        // virajenie{n} - "n" kolichestvo povtoreniy
//        String s1 = "poka abc Zaur dom kino abstrakcionizm";
//        Pattern pattern1 = Pattern.compile("\\w{4}");
        // virajenie{m,n} - ot "m" do "n" kolichestvo povtoreniy
//        String s1 = "abcd abce3 abcfa78abcg6a";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}");
//        String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("A{2,3}"); // net sovpadeniy
//        Pattern pattern1 = Pattern.compile("AB{2,3}"); // net sovpadeniy - poisk tolko po B
//        Pattern pattern1 = Pattern.compile("(AB){2,3}"); // net sovpadeniy - poisk tolko po B
        String s1 = "DABCDABABDABABABABD";
        Pattern pattern1 = Pattern.compile("D(AB){2,}"); // net sovpadeniy - poisk tolko po B


        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()){
            System.out.println("Position: " + matcher.start() + "  " + matcher.group());
        }
    }
}