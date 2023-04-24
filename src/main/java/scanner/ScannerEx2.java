package scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite 2 chisla");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Chastnoe = " + x/y);
        System.out.println("Ostatok = " + x%y);
    }
}
