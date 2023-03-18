package FunctionalProgramming;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(gSupplier.get());
        System.out.println(gSupplier2.get());

    }

    static Supplier<String> gSupplier = () -> "sexy i know it";

    static Supplier<List<String>> gSupplier2 = ()-> List.of("aashish","jha");
}
 