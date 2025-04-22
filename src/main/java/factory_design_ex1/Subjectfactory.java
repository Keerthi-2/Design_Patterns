package factory_design_ex1;

public class Subjectfactory {

    public static Subjects getSubject(String sub) {
        if (sub.equalsIgnoreCase("English")) {
            return new English();
        } else if (sub.equalsIgnoreCase("Hindi")) {
            return new Hindi();
        } else if (sub.equalsIgnoreCase("Maths")) {
            return new Maths();
        } else if (sub.equalsIgnoreCase("Science")) {
            return new Science();
        } else {
            // No nulls anymore — throw a proper exception
            throw new SubjectNotFoundException("No subject found with name: " + sub);
        }
    }

    // Inner exception class (optional to move out later)

}
