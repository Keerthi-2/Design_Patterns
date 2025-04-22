package singleton_design;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        Singleton singleton1=new Singleton();
        Singleton singleton2=new Singleton();
        System.out.println(singleton1);
        System.out.println(singleton2);
   // singleton means having only one object for a class
    }

}
