package multithreading.thread.synchronizeds;

public class SynchronizedBlock3 {
    // sozdayom object car (mojno lyuboy drugoy object) dlya synchronized blocka no luchshe tak ne delat tak kak kod ne chitabelniy
    // luchshe ispolzovat object i nazvat ego lock
    // konstruktor sinhronizirovat nevozmojno - jvm garantiruet chto konstruktor odnovremenno mojet obrabativatsya tolko odnim potokom
//    static final Car car = new Car();
    static final Object lock = new Object();
    void mobileCall() {
        // ispolzuem synchronized block s usloviem object car dlya sinhronizacii
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }
    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }
    void whatsappCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable{
    public void run(){
        new SynchronizedBlock3().mobileCall();
    }
}
class RunnableImplSkype implements Runnable {
    public void run() {
        new SynchronizedBlock3().skypeCall();
    }
}
class RunnableImplWhatsapp implements Runnable{
    public void run(){
        new SynchronizedBlock3().whatsappCall();
    }
}

//class Car{}