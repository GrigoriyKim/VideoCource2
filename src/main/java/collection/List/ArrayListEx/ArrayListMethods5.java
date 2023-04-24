package collection.List.ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        // method of - on ne modificiruetsa - uvelichit list nelzya - tak je nelza ispolzovat elementi null
        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);
//        list1.add(100);

        // method copyOf - tak je ne modificiruetsa
        List<String> list2 = List.copyOf(arrayList1);
//        list2.add("Zoya");
        System.out.println(list2);


//        System.out.println("ArrayList = " + arrayList1);
//
//        // method toArray
//        Object[] array = arrayList1.toArray();
////        String[] array2 = arrayList1.toArray(new String[5]);
////        String[] array2 = arrayList1.toArray(new String[7]); // tak kak elementov vsego 5 ostalnie budut null
//        String[] array2 = arrayList1.toArray(new String[2]); // tak kak elementov bolshe 2 to avtomatom list uelichitsa i budet 5
//        for (String s : array2){
//            System.out.println(s);
//        }

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Mariya");
//        arrayList2.add("Igor");
//
//        // method subList pokazivaet elementi c 1 chisla po posledniy -1
//        List<String> myList = arrayList1.subList(1, 4);
//        System.out.println("Sub list = " + myList);
//        // myList evlyaetsa ne otdelnim listom a tolko ego predstavleniem
//        myList.add("Fedor");
//        System.out.println("Sub list = " + myList);
//        System.out.println("ArrayList = " + arrayList1);
//        arrayList1.add("Sveta");
//        System.out.println("ArrayList = " + arrayList1);
//        System.out.println("Sub list = " + myList);

        // method removeAll udalit vse elementi arrayList2 is arrayList1
//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

//        // method retainAll ostavit tolko te elementi kororie est v oboih listah
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

//        // method containsAll soderjit li arrayList1 vse elementi arrayList2
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);


    }
}
