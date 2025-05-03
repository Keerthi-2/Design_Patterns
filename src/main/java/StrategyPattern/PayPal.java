package StrategyPattern;

public class PayPal implements PaymentStrategy{
    @Override
    public void payAmount() {
        System.out.println("pay through paypal");
    }
}
