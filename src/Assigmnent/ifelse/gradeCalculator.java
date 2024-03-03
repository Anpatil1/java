package Assigmnent.ifelse;
//A school has following rules for grading system:
//
//a. Below 25 - F
//
//b. 25 to 45 - E
//
//c. 45 to 50 - D
//
//d. 50 to 60 - C
//
//e. 60 to 80 - B
//
//f. Above 80 - A
//
//Ask user to enter marks and print the corresponding grade
import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        // Ask user for their marks
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        // Calculate grade based on marks
        String grade = calculateGrade(marks);

        // Print the corresponding grade
        System.out.println("Your grade is: " + grade);
    }

    // Function to calculate grade based on marks
    private static String calculateGrade(int marks) {
        if (marks < 25) {
            return "F";
        } else if (marks >= 25 && marks < 45) {
            return "E";
        } else if (marks >= 45 && marks < 50) {
            return "D";
        } else if (marks >= 50 && marks < 60) {
            return "C";
        } else if (marks >= 60 && marks < 80) {
            return "B";
        } else {
            return "A";
        }
    }
}

