package multithreading.thread.synchronizeds;

public class DaemonExample {
    // Daemon potok zakonchit svoyu rabotu kogda vipolnitsya Thread potok daje esli Daemon potok vse eshe ne vipolnil rabotu do konca
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("User_Thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon_Thread");
        // SetDaemon - doljen bit oboznachen do starta
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (char i = 'A'; i < 'J'; i++){
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class DaemonThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}