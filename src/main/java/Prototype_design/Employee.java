package Prototype_design;

public class Employee extends Object implements Cloneable{
    int age;
    int salary;
    String name="private_people";

//manual implementaion of clone function which is not needed if use use inbuilt clone function of super class Object
//    public Employee clone(){
//        Employee employee1=new Employee();
//        employee1.age=this.age;
//        employee1.salary=this.salary;
//        employee1.name=this.name;
//        return employee1;
//    }

//    @Override
//    public Object clone(){
//        Employee employee1=new Employee();
//        employee1.age=this.age;
//        employee1.salary=this.salary;
//        employee1.name=this.name;
//        return employee1;

//    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//    //public String toString(){
//        return "name is"+this.name+"\nsalary is "+this.salary+"\n age is"+this.age;
//    }

}
