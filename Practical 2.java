import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Solve system:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println();

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - e * c;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("The system has infinitely many solutions");
            } else {
                System.out.println("The system has no solution");
            }
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
        }

        sc.close();
    }
}
