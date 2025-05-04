package Prototype_design;

import java.util.*;

public class Main {
 public static void main(String[] args) throws CloneNotSupportedException {
     Employee employee1=new Employee();
     employee1.age=35;
     employee1.name="Ashok yella";
     employee1.salary=20000000;

    // Employee employee2=employee1.clone(); //this a shallow copy of employee1 object
     Employee employee2= (Employee) employee1.clone();

     Employee employee3=new Employee();
     employee3.age=25;
     employee3.name="keerthi kondur";
     employee3.salary=20;

     Employee employee4=new Employee();
     employee4.age=15;
     employee4.name="praneeth kondur";
     employee4.salary=30000;

     Employee employee5=new Employee();
     employee4.age=55;
     employee5.name="lalitha kondur";
     employee5.salary=8000000;

     List<Employee> employees=new ArrayList<>();
     employees.add(employee1);
     employees.add(employee2);

     //System.out.println(employee1.contains(employee2));
     System.out.println(employees);
     System.out.println(employee1);
     System.out.println(employee2);

 }

}
