package collection.List.ArrayListEx;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        // method addAll
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Ivan");
        System.out.println(arrayList1);
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
////        arrayList1.addAll(arrayList2);
//        arrayList1.addAll(1, arrayList2);
//        System.out.println(arrayList1);
//
//        // method clear
//        arrayList1.clear();
//        System.out.println(arrayList1);

        // method indexOf (esli v list est dublikat Ivan - to method naydet 1 podhodyashiy)
        System.out.println(arrayList1.indexOf("Ivan"));

        // method lastIndexOf
        System.out.println(arrayList1.lastIndexOf("Ivan"));

        // method size
        System.out.println(arrayList1.size());

        // method isEmpty (pust list ili net - false/true)
//        arrayList1.clear();
//        System.out.println(arrayList1.isEmpty());

        // method contains (est li v liste element - false/true)
        System.out.println(arrayList1.contains("Mariya"));

        // method toString - vivodit spisok v skobkah no ego ne pishut obichno
        System.out.println(arrayList1.toString());
    }
}
