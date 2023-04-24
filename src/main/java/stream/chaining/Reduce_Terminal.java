package stream.chaining;

import java.util.ArrayList;
import java.util.List;

public class Reduce_Terminal {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator*element).get();
        System.out.println(result);
        // 5 8 2 4 3
        // accumulator = 5 40 80 320 960
        // element =     8  2  4   3

//        List<Integer> list100 = new ArrayList<>();
//        // tut oshibka tak kak get ne vivodit null
//        int result100 = list100.stream().reduce((accumulator, element) ->
//                accumulator*element).get();
//        System.out.println(result100);
//        // tut vmesto oshibki vivedet nashu realizaciyu exception
//        Optional<Integer> o = list100.stream().reduce((accumulator, element) ->
//                accumulator*element);
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        } else {
//            System.out.println("Not present");
//        }

        int result2 = list.stream().reduce(1, (accumulator, element) ->
                accumulator*element);
        System.out.println(result2);
        // 5 8 2 4 3
        // accumulator = 1  5  40  80  320  960
        // element =     5  8   2   4    3

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("OK");
        list3.add("poka");
        String result3 = list3.stream().reduce((a, e) ->
                a + " " + e).get();
        System.out.println(result3);
    }
}
