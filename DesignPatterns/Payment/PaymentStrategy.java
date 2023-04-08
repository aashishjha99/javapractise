package DesignPatterns.Payment;

/*

    common interface for payment strategy

 */

public interface PaymentStrategy {

    boolean pay(int amount);

    void billPaymentDetails();
}
