package Decorator_Pizza_example;

import java.util.List;

public class Paneer extends PizzaDecorator{

    public Paneer(Pizza pizza){
        super(pizza);
    }
    @Override
    public String get_description(){
        return pizza.get_description()+" with topping as paneer";
    }
    @Override
    public Double get_price(){
        return pizza.get_price()+30.0;
    }
    public List<String> get_tags() {
        return pizza.get_tags();
    }
}
