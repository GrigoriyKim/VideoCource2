package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);
//        // method addAll - ob`edinyaet 2 spiska bez kopiy
//        Set<Integer> union = new HashSet<>(hashSet1);
//        union.addAll(hashSet2);
//        System.out.println(union);
//        // method retainAll - pokazivaet elementi kotorie est v oboih spiskah
//        Set<Integer> intersect = new HashSet<>(hashSet1);
//        intersect.retainAll(hashSet2);
//        System.out.println(intersect);
        // method removeAll - udalyaet is 1 spiska elementi 2 spiska
        Set<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);
    }
}
