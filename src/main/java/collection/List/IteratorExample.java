package collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

//        Iterator<String> iterator = arrayList1.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.hasNext());
//        }
        // otlichie iterator ot forich loop - iterator mojet udalit elementi
        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            iterator.hasNext(); // esli bez methoda next to mi ne smojem udalit tak kak proveriv est li element mi ego ne poluchili
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
