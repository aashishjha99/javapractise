package FunctionalProgramming;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import FunctionalProgramming.CustomerValidator.ValidationResults;

public interface CustomerValidator extends Function<Customer, ValidationResults> {

    static CustomerValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? ValidationResults.SUCCESS
                : ValidationResults.EMAIL_ID_NOT_VALID;
    }

    static CustomerValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().length() == 10 ? ValidationResults.SUCCESS
                : ValidationResults.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16
                ? ValidationResults.SUCCESS
                : ValidationResults.IS_NOT_AN_ADULT;
    }



    default CustomerValidator and(CustomerValidator other) {
        return customer -> {

            ValidationResults validationResults = this.apply(customer);
            return ValidationResults.SUCCESS.equals(validationResults) ? other.apply(customer)
                    : validationResults;
        };
    }



    public static enum ValidationResults {
        SUCCESS, PHONE_NUMBER_NOT_VALID, EMAIL_ID_NOT_VALID, IS_NOT_AN_ADULT
    }

}
