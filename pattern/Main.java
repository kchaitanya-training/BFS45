package pattern;

import pattern.factorypattern.Factory;
import pattern.factorypattern.Payment;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Payment payment = factory.pay(Factory.DEBIT);
        System.out.println(payment.pay(1000));
    }
}
