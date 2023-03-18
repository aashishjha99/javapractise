package FunctionalProgramming;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer aashsih = new Customer("aashish", "12345678");
        new Customer("jha", "345678");

        // Single input
        greetCustomerConsumer.accept(aashsih);

        // Two Output

        greetCustomerConsumerV2.accept(aashsih, true);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = ((Customer, showNumber) -> System.out
            .println("Hello " + Customer.getCustomer() + " thanks for registering with "
                    + (showNumber ? Customer.getCustomerPhoneNumber() : "###########################")));

    static Consumer<Customer> greetCustomerConsumer = Customer -> System.out.println(" Hello " + Customer.getCustomer()
            + " thanks for registring phone number " + Customer.getCustomerPhoneNumber());

    static void greetCustomer(Customer customer) {
        System.out.println("Hello  " + customer.getCustomer() + "thanks for regestring phone number "
                + customer.getCustomerPhoneNumber());
    }

    static class Customer {

        private final String customer;
        private final String customerPhoneNumber;

        public String getCustomer() {
            return customer;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }

        public Customer(String customer, String customerPhoneNumber) {
            this.customer = customer;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}
