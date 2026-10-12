import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
         
            System.out.print("Enter numerator (integer): ");
            int a = sc.nextInt();

            System.out.print("Enter denominator (integer): ");
            int b = sc.nextInt();

       
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
       

        } catch (InputMismatchException e) {
         
            System.out.println("Catch Block 2: Invalid input! Please enter valid integers only.");

        } catch (Exception e) {
            
            System.out.println("Catch Block 3: An unexpected error occurred: " + e.getMessage());

        } finally {
        
            System.out.println("Finally Block: Resource cleanup, closing scanner.");
            sc.close();
        }

        System.out.println("Program execution completed.");
    }
}
