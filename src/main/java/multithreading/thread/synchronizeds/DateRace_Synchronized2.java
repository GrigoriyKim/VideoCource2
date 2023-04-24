package multithreading.thread.synchronizeds;

public class DateRace_Synchronized2 {
    // klyuchevoe slovo volatile - ne reshaet problemu
    volatile static int counter = 0;
    // klyuchevoe slovo synchronized - veshaet zamok na method chtobi odnovremenno im polzovalsya tolko 1 potok
    public static synchronized void increment(){counter++;}

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class R implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            DateRace_Synchronized2.increment();
        }
    }
}
