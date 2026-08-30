//Program 3: WAP to display data of student class defined in University Package
//2. ake a separate file for Main Class which is a part of default package and import university package in the same to input and print student data.

import java.util.Scanner;
import University.UniStudent; 

public class Program3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UniStudent student1 = new UniStudent(); 

        System.out.print("Enter Student Name: ");
        student1.setName(sc.nextLine());

        System.out.print("Enter Institute Code: ");
        student1.setInstituteCode(sc.nextLine());

        System.out.print("Enter Roll No: ");
        student1.setRollNo(sc.nextInt());

        
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll No: " + student1.getRollNo());
        System.out.println("Institute Code: " + student1.getInstituteCode());

        sc.close();
    }
}
