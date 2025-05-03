package Decorator;

// decorator decorates things . we have object coffee with add ons
public class Main {
    public static void main(String args[]) {

//      Coffee coffee = new Basic_coffee();
//        System.out.println(coffee);
//      coffee = new Milk_decorator(coffee);
//        System.out.println(coffee);
//      coffee = new Sugar_decorator(coffee);
//        System.out.println(coffee);
      //    simple way of doing it
        Coffee coffee = new Sugar_decorator(new Milk_decorator(new Basic_coffee()));

        System.out.println("order placed is "+coffee.get_description());
        System.out.println("total cost is "+coffee.get_cost());

}

}
