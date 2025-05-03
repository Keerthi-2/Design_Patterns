package Decorator_Pizza_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Margharetta implements Pizza{

    Size size;
    public Margharetta(Size size){
        this.size=size;
    }

    @Override
    public String get_description() {
        return "order placed is Margharetta of "+size.name();
    }

    @Override
    public Double get_price() {
        switch(size){
            case SMALL:return 40.0;
            case MEDIUM:return 50.0;
            case LARGE:return 60.0;
        }
        return 0.0;
    }
    public List<String> get_tags(){
        return Arrays.asList("Vegetarian");
    }
}
