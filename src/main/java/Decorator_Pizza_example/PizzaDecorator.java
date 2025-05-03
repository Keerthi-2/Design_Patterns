package Decorator_Pizza_example;

import java.util.List;

public abstract class PizzaDecorator implements Pizza{
    Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
    public List<String> get_tags(){
        return pizza.get_tags();
    }
}
