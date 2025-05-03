package StrategyPattern;

public class Debit_card implements PaymentStrategy{
    public void payAmount(){
        System.out.println("payment via debit card");
    }
}
