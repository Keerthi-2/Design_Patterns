package StrategyPattern;

public class Upi implements PaymentStrategy{
    public void payAmount(){
        System.out.println("payment via UPI");
    }
    public String toString(){
        return getClass().getName();
    }
}
