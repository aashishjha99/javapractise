import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyRunnable implements Runnable {

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("Task Complete");
    }



    public static void main(String[] args) throws InterruptedException, ExecutionException{
        


        ExecutorService executorservice = Executors.newSingleThreadExecutor();

        Future<?> future = executorservice.submit(new MyRunnable());

        System.out.println("waiting for the task to complete");

        System.out.println(future.get());



    }

}