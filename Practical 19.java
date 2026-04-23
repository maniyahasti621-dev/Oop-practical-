package student;

public class Student {
    protected int rollNo;
    protected String name;
    
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

package exam;

import student.Student;

public class Result extends Student {
    private int marks1, marks2, marks3;
    
    public Result(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name); 
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    
    public void displayResult() {
        displayStudent(); 
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;
        
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f\n", average);
    }
    
    public static void main(String[] args) {
        System.out.println("--- Student Mark Sheet ---");
        Result s1 = new Result(101, "Riya Patel", 85, 90, 78);
        s1.displayResult();
        
        System.out.println("\n--- Student Mark Sheet ---");
        Result s2 = new Result(102, "Aman Shah", 65, 72, 60);
        s2.displayResult();
    }
}
