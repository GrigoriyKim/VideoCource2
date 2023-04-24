package collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
//        Student st8 = new Student("Elena", "Sidorova", 4);
//        Student st8 = new Student("Petr", "Sidorov", 4);
        // method put - dobavleniye
//        treeMap.put(5.8, st1);
//        treeMap.put(9.1, st7);
//        treeMap.put(6.4, st2);
//        treeMap.put(7.5, st4);
//        treeMap.put(7.2, st3);
//        treeMap.put(8.2, st6);
//        treeMap.put(7.9, st5);
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);
////        treeMap.put(3.2, st8);
////        treeMap.put(9.1, st8);

//        // vidast oshibku ClassCastException tak kak net u Student net implements Comparable
//        treeMap.put(st1, 5.8);
//        treeMap.put(st7, 9.1);
//        treeMap.put(st2, 6.4);
//        treeMap.put(st4, 7.5);
//        treeMap.put(st3, 7.2);
//        treeMap.put(st6, 8.2);
//        treeMap.put(st5, 7.9);
        System.out.println(treeMap);

//        Student st8 = new Student("Elena", "Sidorova", 4);
//        System.out.println(treeMap.containsKey(st8));

//        // method get - poluchenie elementa po klyuchu
//        System.out.println(treeMap.get(6.4));
//        // method remove - udalenie elementa po klyuchu
//        treeMap.remove(5.8);
//        System.out.println(treeMap);
//        // method descendingMap - pokazivaet spisok po ubivaniyu
//        System.out.println(treeMap.descendingMap());
//        // method tailMap - pokazivaet elementi vishe ukazannogo klyucha
//        System.out.println(treeMap.tailMap(7.3));
//        // method headMap - pokazivaet elementi nije ukazannogo klyucha
//        System.out.println(treeMap.headMap(7.3));
//        // method lastEntry - pokazivaet posledniy element v spiske
//        System.out.println(treeMap.lastEntry());
//        // method firstEntry - pokazivaet perviy element v spiske
//        System.out.println(treeMap.firstEntry());

    }
}
