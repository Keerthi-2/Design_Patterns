package factory_design_ex1;

public class Main {
    public static void main(String[] args) {

        try {
            Subjects subject1 = Subjectfactory.getSubject("Math");
            subject1.assign_teacher();
        } catch (SubjectNotFoundException e) {
            System.out.println("Math error: " + e.getMessage());
        }

        try {
            Subjects subject2 = Subjectfactory.getSubject("English");
            subject2.assign_teacher();
        } catch (SubjectNotFoundException e) {
            System.out.println("English error: " + e.getMessage());
        }

        try {
            Subjects subject3 = Subjectfactory.getSubject("Science");
            subject3.assign_teacher();
        } catch (SubjectNotFoundException e) {
            System.out.println("Science error: " + e.getMessage());
        }

        try {
            Subjects subject4 = Subjectfactory.getSubject("Hindi");
            subject4.assign_teacher();
        } catch (SubjectNotFoundException e) {
            System.out.println("Hindi error: " + e.getMessage());
        }

        try {
            Subjects subject5 = Subjectfactory.getSubject("Chemistry");
            subject5.assign_teacher();
        } catch (SubjectNotFoundException e) {
            System.out.println("Chemistry error: " + e.getMessage());
        }

    }
}
