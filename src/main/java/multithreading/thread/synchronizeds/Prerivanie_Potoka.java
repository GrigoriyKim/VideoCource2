package multithreading.thread.synchronizeds;

public class Prerivanie_Potoka {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        // ne rekomenduetsya ispolzovat tak kak method stop grubo ostanavlivaet potok (obrubaet)
//        thread.stop();
        // method interrupt ne prerivaet potok a pokazivaet chto potok main hochet prervat potok thread
        thread.interrupt();
        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;
    public void run(){
        for (int i = 1; i <= 1_000_000_000; i++){
            // esli potok main zahochet prervat potok thread to budet true i method vipolniv vivodi na ekran prervetsya return
            // esli potok main ne zahochet prervat potok thread to budet false i if budet ignorirovan
            if (isInterrupted()) {
                System.out.println("Potok xotyat prervat");
                System.out.println("Mi ubedilis, chto sostoyanie" +
                        " vsex obyektov normalnoe i reshili zavershit rabotu potoka");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Potok xotyat prervat vo vremya sna." +
                        " Davayte zavershim ego rabotu");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}