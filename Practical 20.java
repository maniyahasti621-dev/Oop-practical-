public class DivisionHandler {
    public static void main(String[] args) {
        try {
            if (args.length!= 2) {
                System.out.println("Error: Please provide exactly 2 arguments.");
                System.out.println("Usage: java DivisionHandler <numerator> <denominator>");
                return;
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Arguments must be valid integers.");
            System.out.println("Example: java DivisionHandler 10 2");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Denominator cannot be 0.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
