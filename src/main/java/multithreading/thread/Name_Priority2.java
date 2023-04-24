package multithreading.thread;

public class Name_Priority2 implements Runnable{
    public void run(){
        // method currentThread - pokazivaet tekushiy potok
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Name_Priority2());
        thread.start();
//        thread.run(); // ne zapuskaet potok a pokazivaet potok main v kotorom on zapushen
        System.out.println("Method main. Thread name = " +
                Thread.currentThread().getName());
    }
}
