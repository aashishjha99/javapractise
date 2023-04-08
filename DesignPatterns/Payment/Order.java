package DesignPatterns.Payment;

public class Order {

    private int totalCost = 0;
    private boolean isClosed = false;

    public void proccessOrder(PaymentStrategy paymentStrategy){
        paymentStrategy.billPaymentDetails();
    }
    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        this.isClosed = true;
    }
}
