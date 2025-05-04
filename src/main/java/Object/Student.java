package Object;

import java.util.Objects;

public class Student{
    int age;
    int rollnumber;
    String name;

   public Student(int age,int rollnum,String name){
    this.age=age;
    this.rollnumber=rollnumber;
    this.name=name;
   }

    @Override
    public boolean equals(Object o) {
        Student other = (Student) o;
        return rollnumber == other.rollnumber &&
                age == other.age  && name==other.name;
    }
  //manual creation of similar function to check for content in objects
    public boolean similar(Student other) {

        return rollnumber == other.rollnumber &&
                age == other.age && name==other.name;
    }

    @Override
    public String toString() {
        return rollnumber + " - " + this.age + " - " + this.name;
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(rollnumber, age, name); // Computes a unique hash value based on these fields
//    }
    public int hashCode() {
       //it generates new values based on the passed values
        // if we insert two values into hashset and thy have same hashcode then only equals will be called. As a refernce check internal implementaion of hashcode for that specific collection(hashset/hashmap)

        System.out.println(Objects.hash(age,rollnumber, name));
            return Objects.hash(age,rollnumber, name); // Computes a unique hash value based on these fields
        }



}
