package collection.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
//        // method add - tak kak mi capacity ukazali 4 to pri dobavlenii 5 elementa vivedet exception
//        queue.add(5);
        // method offer - pri perepolnenii proignoriruet element (ne dobavit)
        queue.offer(5);
        System.out.println(queue);
    }
}
