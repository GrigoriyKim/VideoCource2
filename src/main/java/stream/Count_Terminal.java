package stream;

import java.util.stream.Stream;

public class Count_Terminal {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        // method cout - vivodit kol-vo elementov v stream
//        System.out.println(stream1.count()); // esli ne zakomentit - vivedet exception (stream nelzya ispolzovat 2 raz)
        System.out.println(stream1.distinct().count());

    }
}
