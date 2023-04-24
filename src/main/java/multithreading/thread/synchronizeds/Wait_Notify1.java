package multithreading.thread.synchronizeds;

public class Wait_Notify1 {
    public static void main(String[] args) {
        // ispolzuem klyuchevoe slovo synchronized
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}

class Market{
    private int breadCount = 0;
    public synchronized void getBread(){
        // ispolzuem while a ne if tak kak po rekomendaciyam iz java.doc while postoyanno proveryaet chto
        // potok ne prosnulsya bez notify (v ochen` redkih sluchayah eto vozmojno)
        while (breadCount < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Potrebitel kupil 1 xleb");
        System.out.println("Kolichestvo xleba v magazine = " + breadCount);
        notify();
    }

    public synchronized void putBread(){
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Proizvoditel dobavil na vitrinu 1 xleb");
        System.out.println("Kolichestvo xleba v magazine = " + breadCount);
        notify();
    }
}

class Producer implements Runnable{
    Market market;
    Producer(Market market) {
        this.market = market;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}
class Consumer implements Runnable{
    Market market;
    Consumer(Market market) {
        this.market = market;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}