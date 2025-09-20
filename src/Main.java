public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Aladdin");

        try {
            s1.takeExam(105);
        } catch (FailGradeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            s1.takeExam(95);
        } catch (FailGradeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
