package StrategyPattern;

public class Credit_card implements PaymentStrategy{
    public void payAmount(){
        System.out.println("payment via creditCard");
    }
}
