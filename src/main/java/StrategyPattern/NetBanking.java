package StrategyPattern;

public class NetBanking implements PaymentStrategy{
    public void payAmount(){
        System.out.println("payment via NetBanking");
    }
}
