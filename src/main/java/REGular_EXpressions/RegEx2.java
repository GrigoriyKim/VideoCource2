package REGular_EXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
//        // ABC - posledovatelno idushie simvoli
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");
//        // [ABC] - ili A ili B ili C
//        String s1 = "OPABMNCD";
//        Pattern pattern1 = Pattern.compile("[ABC]");
//        // [C-F] - odna iz bukv v diapazone C-F
//        String s1 = "ABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
//        // [3-8] - odna iz cifr v diapazone 3-8
//        // [B-Fd-j3-8] - odna iz bukv v diapazone B-F ili d-j ili cifr 3-8
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");
//        // [^B-Fd-j3-8] - ni odna iz bukv v diapazone B-F ili d-j ili cifr 3-8
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");
//        // (a|b) - libo bukva a libo bukva b
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");
//        // . - odin lyuboy simvol. (Isklyuchenie: simvol novoy stroki
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");
//        // ^virajenie - virajenie v nachale stroki
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("^abc"); // est v nachale stroki
//        Pattern pattern1 = Pattern.compile("^abc5"); // net v nachale stroki
//        // virajenie$ - virajenie v konce stroki
        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("ch$"); // est v nachale stroki
        Pattern pattern1 = Pattern.compile("abc$"); // net v nachale stroki


        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()){
//            System.out.println(matcher.group());
            System.out.println("Position: " + matcher.start() + "  " + matcher.group());
        }
    }
}
