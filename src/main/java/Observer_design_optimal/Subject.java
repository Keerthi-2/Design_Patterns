package Observer_design_optimal;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers=new ArrayList<>();


    public void add(Observer observer){
        observers.add(observer);
    }
    public void sendMsg(String msg){
        for(Observer ob:observers){
            ob.update(msg);
        }
    }
}
