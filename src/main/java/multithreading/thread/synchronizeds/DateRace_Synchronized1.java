package multithreading.thread.synchronizeds;

public class DateRace_Synchronized1 {
    public static void main(String[] args) {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter{
    // klyuchevoe slovo volatile - ne reshaet problemu
    volatile static int count = 0;
}
class MyRunnableImpl1 implements Runnable{
    // klyuchevoe slovo synchronized - veshaet zamok na method chtobi odnovremenno im polzovalsya tolko 1 potok
    public synchronized void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            increment();
        }
    }

}