package multithreading.thread.synchronizeds;

public class DeadLock {
    // Dead lock - situaciya kogda monitori 2-x objectov zahvacheni i ojidayut drug druga kogda osvoboditsya vtoroy
    // Dead lock postoyannoe ojidanie potokov i nikakoy raboti
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread{
    public void run(){
        System.out.println("Thread10: Popitka zahvatit monitor objecta lock1");
        synchronized (DeadLock.lock1){
            System.out.println("Thread10: Monitor objecta lock1 zaxvachen");
            System.out.println("Thread10: Popitka zahvatit monitor objecta lock2");
            synchronized (DeadLock.lock2){
                System.out.println("Thread10: Monitori objectov lock1 i lock2 zaxvacheni");
            }
        }
    }
}
// dlya izbejaniya dead lock nujno chtobi posledovatelnost zaxvata vonitora bila odinakovoy
class Thread20 extends Thread{
    public void run(){
        System.out.println("Thread20: Popitka zahvatit monitor objecta lock1");
        synchronized (DeadLock.lock1){
            System.out.println("Thread20: Monitor objecta lock1 zaxvachen");
            System.out.println("Thread20: Popitka zahvatit monitor objecta lock2");
            synchronized (DeadLock.lock2){
                System.out.println("Thread20: Monitori objectov lock1 i lock2 zaxvacheni");
            }
        }
    }
}
