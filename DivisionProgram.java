
import java.util.Scanner;

public class DivisionProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking two integers as input
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            // Handling any other exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Operation completed.");
            scanner.close(); // Closing the scanner resource
        }
    }
}
