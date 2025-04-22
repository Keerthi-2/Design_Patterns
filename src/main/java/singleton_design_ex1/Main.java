package singleton_design_ex1;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.obj_creation();
        Singleton obj2 = Singleton.obj_creation();

        System.out.println(obj1);
        System.out.println(obj2);
    }

}
