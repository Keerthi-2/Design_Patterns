package StrategyPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PaymentContext context = new PaymentContext();

        Scanner sc=new Scanner(System.in);
        System.out.println("select a mode of payment");
        int choice=sc.nextInt();
       switch(choice){
           case 1:System.out.println("upi choosen");
                 context.setPaymentStrategy(new Upi());

                  break;
           case 2:System.out.println("debitcard choosen");
                  context.setPaymentStrategy(new Debit_card());
                  break;
           case 3:context.setPaymentStrategy(new Credit_card());
                  break;
           case 4:context.setPaymentStrategy(new NetBanking());
                  break;
           case 5:context.setPaymentStrategy(new PayPal());
                  break;


       }
        context.pay();
    }
}
