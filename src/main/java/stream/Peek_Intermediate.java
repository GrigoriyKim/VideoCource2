package stream;

import java.util.stream.Stream;

public class Peek_Intermediate {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        // method peek - pozvolyaet posmotret/vivesti chto proizoshlo na raznom etape (analog ForEach)
        System.out.println(stream1.distinct().peek(System.out::println).count());
    }
}
