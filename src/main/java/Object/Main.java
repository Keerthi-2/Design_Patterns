package Object;

import java.util.*;

public class Main {  //equals == default
    public static void main(String args[]){
        Student student1=new Student(12,2011,"keerthi");
        Student student2=new Student(12,2011,"keerthi"); //shallow copy

        //add student1 student3 student5 student2 student6
        Student student3=new Student(20,2027,"praneeth");

        Student student4=new Student(25,2024,"Ashok");
        Student student5=new Student(32,2028,"manoj kumar");
        Student student6=new Student(32,2028,"manoj kumar");//duplicate


//        System.out.println(student1==student2);
//            System.out.println(student1.equals(student2));

        List<Student> students=new ArrayList<>();
        students.add(student1);

        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        //this is entirely related to removal of duplicates using manual implementation of  equals function
        //requirement is to remove dupliactes i.e objects which has same content but referenc
        System.out.println("result before removing duplicates"+students);
        List<Student> result=new ArrayList<>();
        for (Student s : students) {
            boolean isDuplicate = false;

            for (Student r : result) {
                if (r.equals(s)) { // manually comparing
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result.add(s);
            }
        }
        System.out.println("result after removing duplicates"+result);

        //we need to take care of hashcode and implement it now
        Set<Student> hashstudents = new HashSet<>();

        Student studentHash1=new Student(1, 2024, "Keerthi");
        Student studentHash2=new Student(1, 2024, "Keerthi");


        System.out.println(studentHash1.hashCode()==studentHash2.hashCode());

        HashSet<Student> set = new HashSet<>();
        set.add(new Student(1, 2025, "Keerthi"));
        set.add(new Student(1, 2025, "Keerthi"));
        set.add(new Student(9, 2025, "Keerthi")); // Same values, but different object

        System.out.println(set.size());











    }
}
