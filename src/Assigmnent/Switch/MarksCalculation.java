package Assigmnent.Switch;

import java.util.Scanner;
//Write a program to enter the marks of a student in 5 subjects.
// Calculate the total and average of marks using switch case.
public class MarksCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marksTotal = 0;
        double marksAverage = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            marksTotal += marks;
        }

        System.out.println("Choose an option:");
        System.out.println("1. Calculate total marks");
        System.out.println("2. Calculate average marks");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Calculate total marks
                System.out.println("Total marks: " + marksTotal);
                break;
            case 2: // Calculate average marks
                marksAverage = marksTotal / 5.0;
                System.out.println("Average marks: " + marksAverage);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
