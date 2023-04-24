package REGular_EXpressions;

import java.util.regex.Pattern;

public class ProverkaIP {
    void checkIP(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";
        // 25[0-5]  |   2[0-4]\d    |   [01]?\d?\d  (\.)    {3}
        // 250-255  |   200-249     |   0-199       .       povtorit 3 raza


        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }
    public static void main(String[] args) {
        // korrekten esli - 0-255.0-255.0-255.0-255
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        ProverkaIP pr = new ProverkaIP();
        pr.checkIP(ip1);
        pr.checkIP(ip2);
    }
}
