package Observer_design_brute;

public class Main2 {

    public static void main(String[] args){
        Subject subject=new Subject(new FirstObserver(),new SecondObserver(),new ThirdObserver());
        subject.sendMsg("new video uploaded");

        subject.sendMsg("uploaded  video related to food");

    }
}
