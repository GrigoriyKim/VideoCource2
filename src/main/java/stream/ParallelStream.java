package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    // 1 2 3 4 ... 1_000_000_000
    // 1 stream = 1 ... 250_000_000
    // 2 stream = 250_000_001 ... 500_000_000
    // 3 stream = 500_000_001 ... 750_000_000
    // 4 stream = 750_000_001 ... 1_000_000_000
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
        // slojenie s pomoshyu stream
        double sumResult = list.stream()
                .reduce((accumulator, element) -> accumulator+element).get();
        System.out.println("sumResult = " + sumResult);
        // slojenie s pomoshyu parallelStream
        double sumResult1 = list.parallelStream()
                .reduce((accumulator, element) -> accumulator+element).get();
        System.out.println("sumResult1 = " + sumResult1);
        //delenie s pomoshyu stream (korrektno ta kak vajna posledovatelnost)
        // vivod = 10 / 5 = 2 / 1 = 2 / 0.25 = 8
        double divisionResult = list.stream()
                .reduce((accumulator, element) -> accumulator/element).get();
        System.out.println("divisionResult = " + divisionResult);
        //delenie s pomoshyu parallelStream (ne korrektno ta kak vajna posledovatelnost)
        // vivod stream1 = 10 / 5 = 2
        // vivod stream2 = 1 / 0.25 = 4
        // vivod = 2 / 4 = 0.5
        double divisionResult1 = list.parallelStream()
                .reduce((accumulator, element) -> accumulator/element).get();
        System.out.println("divisionResult1 = " + divisionResult1);

    }
}
