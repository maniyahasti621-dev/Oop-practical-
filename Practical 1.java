import java.util.Scanner;

public class Practical1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        
        double feet = meters * 3.28084;

        System.out.printf("%.2f meters = %.2f feet\n", meters, feet);
        
        sc.close();
    }
}
