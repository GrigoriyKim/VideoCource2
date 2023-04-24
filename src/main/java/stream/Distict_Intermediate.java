package stream;

import java.util.stream.Stream;

public class Distict_Intermediate {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        // method vidaet tolko unicalnie elementi
        stream1.distinct().forEach(System.out::println);

    }
}
