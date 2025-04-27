package Observer_design_optimal;

public class Observer1 implements Observer{

    public void update(String msg){
        System.out.println("observer1 got notified with info as:"+msg);
    }
}
