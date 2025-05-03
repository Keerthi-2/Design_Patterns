package Observer_practice;

public class Main {
    public static void main(String[] args){
        Observer observer1=new Observer1();
        Observer observer2=new Observer2();


        YTChannel ytchannel=new YTChannel();
        ytchannel.add(observer1);
        ytchannel.add(observer2);

        ytchannel.sendMsg("check out my new video on delivery agents");



    }
}
