package singleton_design;

public class Singleton {
    static Singleton s=null;
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
