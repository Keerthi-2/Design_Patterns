package singleton_design;

public class Singleton {
    static Singleton s=null; //we are making object reference as static as we are calling it in static method object_creation
    private Singleton() {

    }
    public static Singleton object_creation(){
       if(s==null){
           s=new Singleton();
           return s;
       }
       else{
          return s;
       }

    }

}
