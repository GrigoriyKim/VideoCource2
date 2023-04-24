package stream.chaining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chaining2 {
    public static void main(String[] args) {
    Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//    // vivedet pustotu tak kak net method tipa eager(Terminal method), est tolko method lazy(Intermediate methods)
//    stream1.filter(el -> {
//        System.out.println("!!!");
//        return el % 2 == 0;
//    });
        // vivedet !!! (8 strok) tak kak est ne zavershonniy method lazy(Intermediate methods)
    stream1.filter(el -> {
        System.out.println("!!!");
        return el % 2 == 0;
    }).collect(Collectors.toList());

    }
}
