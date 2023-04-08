package DesignPatterns.Payment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PayViaCreditCard implements PaymentStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private Credit card;

    @Override
    public boolean pay(int amount) {

        if (isCardPresent()) {
            System.out.println("Paying" + amount + "payment via credit card");
            card.setAmount(card.getAmount() - amount);
            return true;
        }
        return false;
    }

    @Override
    public void billPaymentDetails() {

        try {
            System.out.println("ENTER THE CARD NUMBER");
            String number = READER.readLine();
            System.out.println("ENTER THE EXPIRATION DATE dd/mm");
            String date = READER.readLine();
            System.out.println("ENTER THE CVV");
            String cvv = READER.readLine();
            card = new Credit(number, date, cvv);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private boolean isCardPresent() {
        return card != null;
    }
}
