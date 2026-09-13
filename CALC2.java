//Make a simple calculator to provide basic functions like addition,subtraction ,multiplication,division, as the member function and upgarde it to a scientific calculator by inheritance by adding log and exponent functionality in java

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}


class ScientificCalculator extends Calculator {
    
    // Calculates base raised to the power of exponent
    public double exponent(double base, double exp) {
        return Math.pow(base, exp);
    }


    public double log10(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Logarithm undefined for zero or negative numbers.");
        }
        return Math.log10(value);
    }

    // Calculates natural logarithm (base e)
    public double ln(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Logarithm undefined for zero or negative numbers.");
        }
        return Math.log(value);
    }
}


public class Main {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();

        System.out.println("--- Basic Operations ---");
        System.out.println("15 + 7 = " + calc.add(15, 7));
        System.out.println("20 - 4 = " + calc.subtract(20, 4));
        System.out.println("6 * 8 = " + calc.multiply(6, 8));
        System.out.println("24 / 3 = " + calc.divide(24, 3));

        System.out.println("\n--- Scientific Operations ---");
        System.out.println("2^5 = " + calc.exponent(2, 5));
        System.out.println("log10(100) = " + calc.log10(100));
        System.out.println("ln(Math.E) = " + calc.ln(Math.E));
    }
}
