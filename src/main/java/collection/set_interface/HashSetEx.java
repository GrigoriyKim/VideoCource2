package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // method add - dobavlyaet element
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
//        set.add(null);

        // method remove - udaleniye elementa
        set.remove("Zaur");

//        System.out.println(set);
        for (String s : set){
            System.out.println(s);
        }

        // method size - pokazivaet kol-vo elementov
        System.out.println(set.size());
        // method isEmpty - pokazivaet pustoy spisok ili net (true/false)
        System.out.println(set.isEmpty());
        // method contains - proveraet est li element v spiske
        System.out.println(set.contains("Misha"));
    }
}
