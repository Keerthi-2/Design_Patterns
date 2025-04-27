package Observer_design_optimal;

public class Observer3 implements Observer{
    public void update(String msg){
        System.out.println("observer3 got notified with info as:"+msg);
    }
}
