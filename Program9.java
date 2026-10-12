public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

       
            int result = a / b;
            System.out.println("Result: " + result);

            int[] arr = new int[3];
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
           
            System.out.println("Catch Block 1: Cannot divide by zero! (" + e.getMessage() + ")");

        } catch (ArrayIndexOutOfBoundsException e) {
          
            System.out.println("Catch Block 2: Array index is out of bounds! (" + e.getMessage() + ")");

        } catch (Exception e) {
          
            System.out.println("Catch Block 3: Generic Exception caught: "
