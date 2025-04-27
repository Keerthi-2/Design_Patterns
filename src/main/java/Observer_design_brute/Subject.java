package Observer_design_brute;

import java.util.ArrayList;

public class Subject {
    // the one to which we are subscribing ex: youtube to watch content of youtube channels


    FirstObserver observer1;
    SecondObserver observer2;
    ThirdObserver observer3;

    public Subject(FirstObserver observer1,SecondObserver observer2,ThirdObserver observer3){
        this.observer1=observer1;
        this.observer2=observer2;
        this.observer3=observer3;
    }

    public void sendMsg(String msg){
        observer1.update(msg);
        observer2.update(msg);
        observer3.update(msg);
    }


}
