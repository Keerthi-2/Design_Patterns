package Decorator;

public class Basic_coffee implements Coffee{


    @Override
    public String get_description() {
        return "basic coffee";
    }

    @Override
    public Double get_cost() {
        return 5.0;
    }
}
