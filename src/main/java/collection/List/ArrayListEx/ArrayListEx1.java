package collection.List.ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
//        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        System.out.println(arrayList1 == arrayList4);

        // java pozvolyaet tak pisat no ne stoit tak delat
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("Zaur");
        arrayList5.add(7);
        arrayList5.add(new Car());
    }
}

class Car{}