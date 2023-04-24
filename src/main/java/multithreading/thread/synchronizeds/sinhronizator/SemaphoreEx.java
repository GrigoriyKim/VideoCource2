package multithreading.thread.synchronizeds.sinhronizator;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Zaur", callBox);
        new Person("Oleg", callBox);
        new Person("Elena", callBox);
        new Person("Viktor", callBox);
        new Person("Marina", callBox);
    }
}

class Person extends Thread{
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    public void run(){
        try {
            System.out.println(name + " jdet...");
            callBox.acquire();
            System.out.println(name + " polzuetsya telefonom");
            sleep(2000);
            System.out.println(name + " zavershil(a) zvonok");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}