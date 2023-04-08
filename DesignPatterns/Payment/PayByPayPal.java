package DesignPatterns.Payment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/*
    class implementing payment strategy
 */
public class PayByPayPal implements PaymentStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    public static final String ENTER_THE_USER_EMAIL = "Enter the user Email";
    public static final String ENTER_THE_PASSWORD = "Enter the password";
    public static final String DATA_VERIFICATION_HAS_BEEN_SUCCESFUL = "Data Verification has been succesful";
    public static final String WRONG_EMAIL_AND_PASSWORD = "Wrong Email and password";
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private String mail;
    private String password;

    private boolean signedIn;


    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    private boolean verify() {
        setSignedIn(mail.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    @Override
    public boolean pay(int amount) {
        if (signedIn) {
            System.out.println("Paying" + amount + "using PayPal");
            return true;
        }
        return false;
    }

    @Override
    public void billPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println(ENTER_THE_USER_EMAIL);
                mail = READER.readLine();
                System.out.println(ENTER_THE_PASSWORD);
                password = READER.readLine();

                if (verify()) {
                    System.out.println(DATA_VERIFICATION_HAS_BEEN_SUCCESFUL);
                } else {
                    System.out.println(WRONG_EMAIL_AND_PASSWORD);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
