package pattern.payment;

import pattern.factorypattern.Payment;

public class CreditCardPayment implements Payment {

    @Override
    public String pay(int amount) {
        return "Credit Card payment done = " + amount;
    }

}
