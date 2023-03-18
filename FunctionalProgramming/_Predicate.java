package FunctionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        // predicate

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("06888888888888"));

        System.out.println(isPhoneNumberValidPredicate.and(isPhoPredicate3).test("06878790898"));
        ;

        // bi predicate

        System.out.println(isPhoneNumberValidV2.test("123", 3));

    }

    static BiPredicate<String, Integer> isPhoneNumberValidV2 = (a, b) -> {
        return a.length() == b;
    };

    static Predicate<String> isPhoneNumberValidPredicate = phonenumber -> phonenumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoPredicate3 = phonenumber -> phonenumber.contains("8");
}
