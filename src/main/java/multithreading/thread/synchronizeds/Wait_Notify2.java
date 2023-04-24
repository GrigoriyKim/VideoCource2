package multithreading.thread.synchronizeds;

public class Wait_Notify2 {
    public static void main(String[] args) {
        // ispolzuem synchronized block
        Market1 market = new Market1();
        Producer1 producer = new Producer1(market);
        Consumer1 consumer = new Consumer1(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}

class Market1{
    private int breadCount = 0;
    private final Object lock = new Object();
    public void getBread(){
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Potrebitel kupil 1 xleb");
            System.out.println("Kolichestvo xleba v magazine = " + breadCount);
            lock.notify();
        }
    }

    public void putBread(){
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount++;
            System.out.println("Proizvoditel dobavil na vitrinu 1 xleb");
            System.out.println("Kolichestvo xleba v magazine = " + breadCount);
            lock.notify();
        }
    }
}

class Producer1 implements Runnable{
    Market1 market;
    Producer1(Market1 market) {
        this.market = market;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}
class Consumer1 implements Runnable{
    Market1 market;
    Consumer1(Market1 market) {
        this.market = market;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
