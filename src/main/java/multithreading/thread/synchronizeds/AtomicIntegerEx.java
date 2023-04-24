package multithreading.thread.synchronizeds;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
//    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger(0);
//    public synchronized static void increment() {
    public static void increment() {
//        counter++;
        // method incrementAndGet(incrementiruet i poluchaet - poluchaem novoe znachenie) - atomarniy method - po etomu synchronized ne nujen
        // method getAndIncrement(poluchaet i incrementiruet - poluchaem staroe znachenie) - atomarniy method - po etomu synchronized ne nujen
//        counter.incrementAndGet();
        // method addAndGet(dobavit i poluchit - poluchaem znachenie + n) - atomarniy method - po etomu synchronized ne nujen
        // v nashem sluchae 200 * 5 (t.e. 200 raz pribavlyaem 5) = 1000
//        counter.addAndGet(5);
        // method getAndAdd(poluchit i dobavit - poluchaem staroe znachenie + n) - atomarniy method - po etomu synchronized ne nujen
//        counter.getAndAdd(5);
        // method decrementAndGet(umenshi na 1 i poluchi novoe znachenie)
//        counter.decrementAndGet();
        // method getAndDecrement(poluchi staroe znachenie i umenshi na 1)
        counter.getAndDecrement();

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImp118());
        Thread thread2 = new Thread(new MyRunnableImp118());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnableImp118 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerEx.increment();
        }
    }
}