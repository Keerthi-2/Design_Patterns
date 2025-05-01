package Builder_design;

public class Main {

    public static void main(String[] args){
//        Teacher obj=new teacher().setTeacher();
        //Teacher obj=new Teacher.teacher().setId(456).setSubject("maths").setSalary(3890).build();
        //creation of innerclass object using outerclass

        Teacher.teacher obj=new Teacher.teacher();
        obj=obj.setId(34); //return inner teacher class
        obj=obj.setSubject("botany");
        obj=obj.setSalary(100);
        Teacher obj1=obj.build();
        System.out.println(obj1);

//        System.out.println(obj);
    }



}
