package multithreading.thread.synchronizeds;

public class Monitor_SynchronizedBlocks {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter1{
    volatile static int count = 0;
}
class MyRunnableImpl2 implements Runnable{
    private void doWork2(){
        System.out.println("Ura!!!");
    }
    // synchronized block - pozolyaet sinhronizirovat tolko chast koda methoda
    public void doWork1(){
        doWork2();
        synchronized (this) {
            Counter1.count++;
            System.out.println(Counter1.count);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            doWork1();
        }
    }

}