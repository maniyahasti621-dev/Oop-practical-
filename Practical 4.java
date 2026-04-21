import java.util.Scanner;

public class Practical4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        // Convert to metric
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.025
