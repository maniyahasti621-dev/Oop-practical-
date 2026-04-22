import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Employee Salary: %.2f\n", employeeSalary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        
        System.out.println("Enter details for employee:");
        emp1.readEmployeeData();        
        
        System.out.println("\nEmployee Details:");
        emp1.displayEmployeeData();     

        System.out.println();
        Employee emp2 = new Employee();
        System.out.println("Enter details for second employee:");
        emp2.readEmployeeData();
        
        System.out.println("\nSecond Employee Details:");
        emp2.displayEmployeeData();
    }
}
