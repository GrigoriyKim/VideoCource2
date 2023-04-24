package multithreading.thread;

public class Name_Priority1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("moy_potok");
//      // variant ispolsovaniya s cifroy
//      myThread.setPriority(9);
        // variant ispolsovaniya gotovogo resheniya
        myThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread = " + myThread.getName() +
                " Priority of myThread = " + myThread.getPriority());
//    MyThread myThread1 = new MyThread();
//        System.out.println("Name of myThread1 = " + myThread1.getName() +
//                " Priority of myThread1 = " + myThread1.getPriority());

    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("privet");
    }
}