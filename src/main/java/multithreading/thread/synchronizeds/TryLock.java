package multithreading.thread.synchronizeds;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee1("Zaur", lock);
        new Employee1("Oleg", lock);
        new Employee1("Elena", lock);
        Thread.sleep(5000);
        new Employee1("Viktor", lock);
        new Employee1("Marina", lock);


    }
}

class Employee1 extends Thread{
    String name;
    private Lock lock;
    public Employee1(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run(){
        if (lock.tryLock()) {
            try {
//               System.out.println(name + " jdet...");
//               lock.lock();
                System.out.println(name + " polzuyetsya bankomatom");
                Thread.sleep(2000);
                System.out.println(name + " zavershil(a) svoi dela");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " ne hochet jdat ocheredi");
        }
    }
}