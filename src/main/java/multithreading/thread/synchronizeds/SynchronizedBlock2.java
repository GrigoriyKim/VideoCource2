package multithreading.thread.synchronizeds;

public class SynchronizedBlock2 {
    volatile static int counter = 0;
    // synchronized block - v uslovii bloka mi ne mojem ispolzovat this tak kak method static
    public static void increment() {
        synchronized (SynchronizedBlock2.class) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class R2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            DateRace_Synchronized2.increment();
        }
    }
}