package Decorator_Pizza_example;

import java.util.*;

public class CheeseBurstCrust extends PizzaDecorator {
    public CheeseBurstCrust(Pizza pizza) {
        super(pizza);
    }

    public String get_description() {
        return pizza.get_description() + " on Cheese Burst Crust";
    }

    public Double get_price() {
        return pizza.get_price() + 2.5;
    }


}

