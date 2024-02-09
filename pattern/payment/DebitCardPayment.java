package pattern.payment;

import pattern.factorypattern.Payment;

public class DebitCardPayment implements Payment {

    @Override
    public String pay(int amount) {
        return "Debit Card payment done = " + amount;
    }
}
