package Decorator;

public class Milk_decorator extends Coffee_decorator {
    public Milk_decorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String get_description(){
        return coffee.get_description()+" with added milk";
    }
    @Override
    public Double get_cost(){
        return coffee.get_cost()+2.0;
    }
}
