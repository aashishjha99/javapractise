package DesignPatterns.Payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Client {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static Order order = new Order();
    private static PaymentStrategy paymentStrategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {

        

        while (!order.isClosed()) {
            Integer cost;

            String continueChoice;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");

                Integer choice = Integer.valueOf(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.println("Count :");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.println("Do you wish to continue to select Products Y/N");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (paymentStrategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();


                paymentStrategy = paymentMethod.equals("1") ? new PayByPayPal() : new PayViaCreditCard();


            }

            order.proccessOrder(paymentStrategy);
            System.out.println("Pay " + order.getTotalCost() + "units or continue shopping ? P/C");
            String proccessedOrder = reader.readLine();

            if (proccessedOrder.equals("P")) {
                System.out.println("Payment has been done");
            } else {
                System.out.println("Failed ! Check you data");
            }

            order.setClosed();
        }
    }

}
