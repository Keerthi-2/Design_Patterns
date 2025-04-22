package singleton_design;



public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
//        Singleton singleton1=new Singleton();
//        Singleton singleton2=new Singleton();
//        System.out.println(singleton1);
//        System.out.println(singleton2);  (sout shortcut for it)

        Singleton obj1=Singleton.object_creation();
        Singleton obj2=Singleton.object_creation();
        System.out.println(obj1);
        System.out.println(obj2);
   // singleton means having only one object for a class
    }

}
