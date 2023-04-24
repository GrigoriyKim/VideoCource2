package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
//        // method add - dobavlenie elementa - esli pereshli za gran` to budet oshibka
//        queue.add("Zaur");
//        queue.add("Oleg");
//        queue.add("Ivan");
//        queue.add("Mariya");
//        queue.add("Aleksandr");
        // method offer - dobavlenie elementa - esli pereshli za gran` to oshibki ne budet no i element ne dobavit
        queue.offer("Zaur");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Mariya");
        queue.offer("Aleksandr");
        System.out.println(queue);
//        // method remove - udalyaet element - esli elementov bolshe net vivedet Exception
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        // method poll - udalyaet element - esli elementov bolshe net vivedet null (Exception ne budet)
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        // method element - pokazivaet 1 element v spiske - esli elementov net - vivodit Exception
//        System.out.println("Udalyaem element " + queue.poll());
//        System.out.println("Element " + queue.element() + " vstaet v nachalo spiska");
//        System.out.println("Udalyaem element " + queue.poll());
//        System.out.println("Element " + queue.element() + " vstaet v nachalo spiska");
//        System.out.println("Udalyaem element " + queue.poll());
//        System.out.println("Element " + queue.element() + " vstaet v nachalo spiska");
//        System.out.println("Udalyaem element " + queue.poll());
//        System.out.println("Element " + queue.element() + " vstaet v nachalo spiska");
//        System.out.println("Udalyaem element " + queue.poll());
//        System.out.println("Element " + queue.element() + " vstaet v nachalo spiska");
        // method peek - pokazivaet 1 element v spiske - esli elementov net - vivodit null
        System.out.println("Udalyaem element " + queue.poll());
        System.out.println("Element " + queue.peek() + " vstaet v nachalo spiska");
        System.out.println("Udalyaem element " + queue.poll());
        System.out.println("Element " + queue.peek() + " vstaet v nachalo spiska");
        System.out.println("Udalyaem element " + queue.poll());
        System.out.println("Element " + queue.peek() + " vstaet v nachalo spiska");
        System.out.println("Udalyaem element " + queue.poll());
        System.out.println("Element " + queue.peek() + " vstaet v nachalo spiska");
        System.out.println("Udalyaem element " + queue.poll());
        System.out.println("Element " + queue.peek() + " vstaet v nachalo spiska");

    }
}
