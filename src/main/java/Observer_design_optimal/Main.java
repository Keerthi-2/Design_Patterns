package Observer_design_optimal;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        Observer observer3= new Observer3();
        Subject subject = new Subject();
        subject.add(observer1);
        subject.add(observer2);
        subject.add(observer3);
        subject.sendMsg("cricket updates are given");
        subject.sendMsg("movie updates are given");
    }


}
