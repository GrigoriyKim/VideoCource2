package collection.List.ArrayListEx;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        // method add
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1, "Misha");
        // 1 sposob vivesti vse elementi
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();
        // method get
//        System.out.println(arrayList1.get(2));
        // 2 sposob vivesti vse elementi
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }

        // method set
        arrayList1.set(1, "Masha");
        System.out.println(arrayList1);

        // method remove
        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}
