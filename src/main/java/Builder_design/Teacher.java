package Builder_design;

//order of parameters in constructor during object
// creation  need to be maintained as it is hectic thing so to overcome that problem we are going for builder design
public class Teacher {
    int id;
    String subject;
    int salary;
    //constructor is private to disallow object creation
    private Teacher(){

     }

   //print values a class has defined
    public String toString() {
        return this.id+" - "+this.subject+" - "+this.salary;

    }
    public int run(){
        return 1000;
    }

    static class teacher {
         int id;
         String subject;
         int salary;

         public teacher setId(int id) {
             this.id = id;
             return this;
         }

         public teacher setSubject(String subject) {
             this.subject = subject;
             return this;
         }
        public int run(){
            return 1000;
        }
         public teacher setSalary(int salary) {
             this.salary = salary;
             return this;
         }

         public Teacher build() {
             Teacher teacherObj = new Teacher();
             teacherObj.id = this.id;
             teacherObj.subject = this.subject;
             teacherObj.salary = this.salary;
             return teacherObj;
         }
     }





}
