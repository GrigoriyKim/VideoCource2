package multithreading.thread.synchronizeds;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock_ReentrantLock_Bankomat {
    public static void main(String[] args) {
    Lock lock = new ReentrantLock();
    new Employee("Zaur", lock);
    new Employee("Oleg", lock);
    new Employee("Elena", lock);
    new Employee("Viktor", lock);
    new Employee("Marina", lock);


    }
}

class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run(){
        try {
            System.out.println(name + " jdet...");
            lock.lock();
            System.out.println(name + " polzuyetsya bankomatom");
            Thread.sleep(2000);
            System.out.println(name + " zavershil(a) svoi dela");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}