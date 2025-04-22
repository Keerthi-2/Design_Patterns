package singleton_design_ex1;

public class Singleton {
    static Singleton s;
    private Singleton(){

    }
    public static Singleton obj_creation(){
        if(s==null){
            s=new Singleton();
            return s;
        }
        else{
            return s;
        }

    }
}
