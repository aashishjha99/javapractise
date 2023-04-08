import java.util.concurrent.CompletableFuture;

public class CompleteFutu {
    


    public static void main(String[] args) throws Exception{






        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{

            try {
                Thread.sleep(5000); // stimulate long running time
            } catch (Exception e) {

                e.printStackTrace();

            }

            return "hello word";

        });


        System.out.println("Future is running");

    
        String result = future.join();

        System.out.println(future.get());

        System.out.println(result);
        
    }
}
