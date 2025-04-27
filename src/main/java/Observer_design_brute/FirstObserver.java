package Observer_design_brute;

public class FirstObserver {
   // actual value in function definition is arguments , in function call it is parameters
    public void update(String msg){
        System.out.println("first observer got notified as "+msg);
    }


}
