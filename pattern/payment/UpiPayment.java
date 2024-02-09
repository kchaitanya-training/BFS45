package pattern.payment;

import pattern.factorypattern.Payment;

public class UpiPayment implements Payment {

    @Override
    public String pay(int amount) {
        return "Upi payment done = " + amount;
    }
}
