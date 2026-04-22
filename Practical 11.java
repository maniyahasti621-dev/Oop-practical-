import java.util.Scanner;

class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        private String studentName;
        private String course;

        public void acceptStudentInfo() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();
            System.out.print("Enter course enrolling in: ");
            course = sc.nextLine();
        }

        public void displayAdmissionDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name : " + collegeName);
            System.out.println("Student Name : " + studentName);
            System.out.println("Course       : " + course);
        }
    }
}

public class AdmissionDemo {
    public static void main(String[] args) {
        College college = new College("Shree Swami Atmanand Saraswati Institute of Technology");

        College.Admission admission = college.new Admission();

        admission.acceptStudentInfo();
        admission.displayAdmissionDetails();
    }
}
