package Decorator_Pizza_example;

public class Main {
    public static void main(String args[]){
        //without any type of crust
        Pizza pizza=new Paneer(new Mushrooms(new Margharetta(Size.MEDIUM)));
        System.out.println(pizza.get_description());
        System.out.println(pizza.get_price());
        System.out.println(pizza.get_tags());

        //with cheese  type of crust
        Pizza pizza1=new CheeseBurstCrust(new Paneer(new Mushrooms(new Margharetta(Size.SMALL))));
        System.out.println(pizza1.get_description());
        System.out.println(pizza1.get_price());
        System.out.println(pizza1.get_tags());

    }
}
