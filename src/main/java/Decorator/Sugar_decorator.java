package Decorator;

public class Sugar_decorator extends Coffee_decorator{
    public Sugar_decorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String get_description(){
        return coffee.get_description()+" and added sugar";
    }
    public Double get_cost(){
        return coffee.get_cost()+1.0;
    }
}
