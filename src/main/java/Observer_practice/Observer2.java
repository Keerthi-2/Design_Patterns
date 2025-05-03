package Observer_practice;

public class Observer2 implements Observer{
    public void update(String msg){
        System.out.println("Observer2 notified as "+msg);
    }


}
