package multithreading.thread.synchronizeds;

import java.util.concurrent.*;

public class Interface_Callable_Future1 {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        // method submit vozvrashaet rezultat nashego taska
        Future<Integer> future = executorService.submit(factorial2);
        try {
            factorialResult = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            // method getCause - pokasuvaet prichinu po katoroy proizoshol exception
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial2 implements Callable<Integer>{
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Vi vveli nevernoye chislo");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}