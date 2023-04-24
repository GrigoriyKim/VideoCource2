package collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // method addFirst - dobavlyaet elementi v nachalo spiska
        // method addLast - dobavlyaet elementi v konec spiska
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.addFirst(1);
        deque.addLast(8);
        System.out.println(deque);
        // method getFirst - pokazivaet 1 element v spiske - esli elementov net - vivodit Exception
        System.out.println(deque.getFirst());
        // method getLast - pokazivaet posledniy element v spiske - esli elementov net - vivodit Exception
        System.out.println(deque.getLast());
        // method removeFirst - udalyaet element iz nachala spiska - esli elementov bolshe net vivedet Exception
        System.out.println(deque.removeFirst());
        // method peekFirst - pokazivaet 1 element v spiske - esli elementov net - vivodit null
        System.out.println(deque.peekFirst());
        // method peekLast - pokazivaet posledniy element v spiske - esli elementov net - vivodit null
        System.out.println(deque.peekLast());
        // method removeLast - udalyaet element iz konca spiska - esli elementov bolshe net vivedet Exception
        System.out.println(deque.removeLast());
        // method pollFirst - udalyaet element iz konca spiska - esli elementov bolshe net vivedet null (Exception ne budet)
        System.out.println(deque.pollFirst());
        // method pollLast - udalyaet element iz konca spiska - esli elementov bolshe net vivedet null (Exception ne budet)
        System.out.println(deque.pollLast());
    }
}
