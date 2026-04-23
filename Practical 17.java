interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    
    public boolean isPassed(int mark) {
        return mark >= 40;
    }
    
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Result student = new Result();
        
        int marks = 75;
        double average = 68.5;
        
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + student.isPassed(marks));
        
        System.out.println("Average: " + average);
        System.out.println("Division: " + student.getDivision(average));
        
        System.out.println("\n--- Testing another case ---");
        int marks2 = 35;
        double avg2 = 38.0;
        
        System.out.println("Marks: " + marks2);
        System.out.println("Passed: " + student.isPassed(marks2));
        
        System.out.println("Average: " + avg2);
        System.out.println("Division: " + student.getDivision(avg2));
    }
}
