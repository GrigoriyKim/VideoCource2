package multithreading;
// 4 sposob sozdanie potoka
public class Ex5 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex5());
        thread.start();
        for (int i = 1000; i > 0; i--){
            System.out.println(i);
        }
    }
}
