package multithreading.thread;

public class Volatile extends Thread{
    // klyuchevoe slovo volatile - spravlyaetsa tolko kogda lish 1 potok menyaet znachenie peremennoy
    volatile boolean b = true;

    public void run(){
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile thread = new Volatile();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End of programm");
    }
}
