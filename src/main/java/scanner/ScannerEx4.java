package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner("Privet moy drug!");
        Scanner scanner = new Scanner("Privet moy drug!\nKak pojivaesh?" +
                "\nChto xoroshego?");
//        String s = scanner.next();
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine()); // Exception tak kak net soobsheniya
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
        System.out.println(scanner.next().charAt(2));
    }
}
