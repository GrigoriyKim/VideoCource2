package multithreading.thread;

public class Sleep_Join2 extends Thread {
    public void run(){
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new MyRunnable1());
        Sleep_Join2 thread2 = new Sleep_Join2();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Konec!");
    }
}

class MyRunnable1 implements Runnable{
    public void run(){
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}