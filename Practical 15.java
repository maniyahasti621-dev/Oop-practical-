class Employee {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    private int teamSize;
    private String projectName;

    public Manager(String name, String department, int teamSize, String projectName) {
        super(name, department); 
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public void displayDetails() {
        System.out.println("--- Manager Details ---");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Riya Patel", "HR");
        System.out.println("Calling displayDetails() on Employee object:");
        emp.displayDetails(); 

        System.out.println();

        Manager mgr = new Manager("Amit Shah", "IT", 12, "Cloud Migration");
        System.out.println("Calling displayDetails() on Manager object:");
        mgr.displayDetails();

        System.out.println();

        Employee polyEmp = new Manager("Neha Desai", "Finance", 8, "SAP Upgrade");
        System.out.println("Calling displayDetails() on Employee reference to Manager object:");
        polyEmp.displayDetails(); 
    }
}
