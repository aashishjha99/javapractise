package FunctionalProgramming;

import java.time.LocalDate;

import static FunctionalProgramming.CustomerValidator.*;

public class CusomerValidation {

    public static void main(String[] args) {

        Customer customer = new Customer("aashish", "aashishjhaoffgmail.com", "1234567890",
                LocalDate.of(1999, 06, 06));

        ValidationResults results = isEmailValid().and(CustomerValidator.isPhoneNumberValid())
                .and(CustomerValidator.isAdult())
                .apply(customer);

        System.out.println(results);
        if (results != ValidationResults.SUCCESS) {
            throw new IllegalStateException(results.name());
        }
    }
}
