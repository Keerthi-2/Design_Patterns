package Decorator_Pizza_example;

import java.util.List;

public class Mushrooms extends PizzaDecorator{
    public Mushrooms(Pizza pizza){
        super(pizza);
    }
    @Override
    public String get_description(){
        return pizza.get_description()+" with topping as mushrooms";
    }
    @Override
    public Double get_price(){
        return pizza.get_price()+20.0;
    }
    public List<String> get_tags(){
        return pizza.get_tags();
    }
}
