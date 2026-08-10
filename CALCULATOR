// Make a calculator program using simple class 
import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    int subtract(int a, int b) {
        return a - b;
    }
    
    int multiply(int a, int b) {
        return a * b;
    }
    
    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return  a / b;
    }
}

public class Lucky1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.print("Pehla number enter karein: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Dusra number enter karein: ");
        int num2 = scanner.nextInt();
        
        System.out.println("\nInputs: " + num1 + " and " + num2);
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
        
        scanner.close();
    }
}
