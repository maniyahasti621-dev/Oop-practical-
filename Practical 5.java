import java.util.Scanner;

public class Practical5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Validate if sides can form a triangle
        if (a + b > c && a + c > b && b + c > a) {
            // Heron's formula: s = (a+b+c)/2, Area = sqrt(s*(s-a)*(s-b)*(s-c))
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            
            System.out.printf("The area of the triangle is: %.2f\n", area);
        } else {
            System.out.println("Invalid triangle: The given sides cannot form a triangle.");
        }

        sc.close();
    }
}
