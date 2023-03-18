package FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        /*
         * Takes one input produce one output
         * Function
         */

        Function<Integer, Integer> thenMultiply = multiply.compose(add);

        System.out.println(add.apply(1));
        System.out.println();
        System.out.println(thenMultiply.apply(3));
        System.out.println(multiply.andThen(add).apply(4));

        /*
         * takes two input and produce one output
         * Bi-Function
         */

        System.out.println(incrementByOneAndMultiply.apply(12, 4));

    }

    // function only takes one import
    static Function<Integer, Integer> add = number -> ++number;
    static Function<Integer, Integer> multiply = number -> number * 3;;

    static int incrementByOne(int numer) {
        return ++numer;
    }

    // takes two inputs

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply = (numberToIncrementByOne,
            numberToMultiply) -> ++numberToIncrementByOne * numberToMultiply;

    static int incrementByOneAndMultiplyF(int number, int numToMultiply) {
        return ++number * numToMultiply;
    }
}
