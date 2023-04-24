package multithreading.thread.synchronizeds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool_ExecutorService2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl200());
//        }
        // method schedule - ukazivaet cherez skolko nachat rabotu classa (v nashem sluchae cherez 3 sec)
//        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);

//        // method scheduleAtFixedRate -  ukazivaet cherez skolko nachat rabotu classa v 1 raz
//        // i cherez skolko kajdiy posleduyushiy (vremya schitaetsya ot nachala vipolneniyz taska i do nachala posleduyushego)
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);

        // method scheduleAtFixedRate -  ukazivaet cherez skolko nachat rabotu classa v 1 raz
        // i cherez skolko kajdiy posleduyushiy (vremya schitaetsya ot konca vipolneniyz taska i do nachala posleduyushego)
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        // method newCachedThreadPool - sozdayot keshirovanniy thread pool
        // thread pool budut sozdavatsya po mere neobhodimosti - esli thread zaconchen no zadaniya net to CachedThreadPool udalit thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}

class RunnableImpl200 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}