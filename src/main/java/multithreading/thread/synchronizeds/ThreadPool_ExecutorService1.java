package multithreading.thread.synchronizeds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool_ExecutorService1 {
    public static void main(String[] args) throws InterruptedException {
        // ExecutorService udobnee vsego sozdavat cherez factory method (fabrika po proizvodstvu thread pool) Executors
        // FixedThreadPool - ogranichivaet kol-vo potokov do ukazannogo kol-va
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
        // method SingleThreadExecutor - sozdayot 1 potok
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl100());
        }
        // method shutdown - ostanavlivaet programmu posle vipolneniya cikla
        executorService.shutdown();
        // method awaitTermination - pozvolyaet ostanovit thread posle ukazannogo vremeni daje esli thread ne zakonchen
//        executorService.awaitTermination(5, TimeUnit.SECONDS);
//        System.out.println("Main ends");
    }
}

class RunnableImpl100 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
//            Thread.sleep(500);
//            Thread.sleep(4000);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}