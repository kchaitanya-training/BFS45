package pattern.factorypattern;

import pattern.payment.CreditCardPayment;
import pattern.payment.DebitCardPayment;
import pattern.payment.UpiPayment;

public class Factory {
    public static String CREDIT = "credit";
    public static String DEBIT = "debit";
    public static String UPI = "upi";

    public Payment pay(String paymentType) {
        switch (paymentType) {
            case "credit":
                return new CreditCardPayment();
            case "debit":
                return new DebitCardPayment();
            case "upi":
                return new UpiPayment();
            default:
                throw new IllegalArgumentException("Please provide option");
        }
    }
}