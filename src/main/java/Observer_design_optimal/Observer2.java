package Observer_design_optimal;

public class Observer2 implements Observer{
    public void update(String msg){
        System.out.println("observer2 got notified with info as:"+msg);
    }
}
