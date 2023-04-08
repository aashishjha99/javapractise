import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClientAnimal {


    private static BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));


    public static void main(String[] args) throws Exception {

        System.out.println("Choose C or D for cat / Dog");

         String option = reader.readLine();

         if(option.equals("C")) {
            AnimlsFactory animlsFactory = new CatFactory();
            Animls animls = animlsFactory.createAnimls();
            System.out.println(animls.getSound());
         }else{
            AnimlsFactory animlsFactory = new DogFactory();
            Animls animls = animlsFactory.createAnimls();
            System.out.println(animls.getSound());
         }


       

    }
}
