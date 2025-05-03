package Decorator;


public abstract class Coffee_decorator implements Coffee{
    Coffee coffee;  //it just an interface coffee
    //basic coffee here in this example of coffees
    public Coffee_decorator(Coffee coffee){
        this.coffee=coffee;
    }

//    public String get_description(){
//        return coffee.get_description();
//    }
//    public Double get_cost(){
//        return coffee.get_cost();
//    }
}
