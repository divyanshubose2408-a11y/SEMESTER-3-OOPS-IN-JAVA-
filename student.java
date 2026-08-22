// Create a Student Class with Getter and Setter Functions and create object in separate Main class
import java.util.Scanner;

class StudentBlueprint {
    private String name;
    private int rollNumber;
    private double marks;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }
}

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        StudentBlueprint s1 = new StudentBlueprint();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        s1.setName(name);
        s1.setRollNumber(rollNumber);
        s1.setMarks(marks);

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNumber());
        System.out.println("Marks: " + s1.getMarks());

        scanner.close();
    }
}
