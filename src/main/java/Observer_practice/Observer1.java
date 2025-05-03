package Observer_practice;

public class Observer1 implements Observer{
    public void update(String msg){
        System.out.println("Observer1 notified as "+msg);

    }

}
