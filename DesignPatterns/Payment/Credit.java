package DesignPatterns.Payment;

public class Credit {


    private Integer amount;
    private String number;
    private String date;

    private String cvv;


    public Credit(String number, String date, String cvv) {
        this.amount = 10000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }



    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
