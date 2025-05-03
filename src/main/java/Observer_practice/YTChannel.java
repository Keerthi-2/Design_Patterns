package Observer_practice;

import java.util.*;
public class YTChannel {

    ArrayList<Observer> observers=new ArrayList<>();
    public void add(Observer ob){
        observers.add(ob);
    }
    public void sendMsg(String msg){
        for(Observer ob:observers){
            ob.update(msg);
        }

    }
}
