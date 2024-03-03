package Assigmnent.controlstatement;

import java.util.Scanner;

public class GratuityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of years worked
        System.out.print("Enter the number of years worked: ");
        double yearsWorked = scanner.nextDouble();

        // Prompt the user to enter the last drawn basic salary plus DA
        System.out.print("Enter the  salary : ");
        double basicSalaryAndDA = scanner.nextDouble();

        // Check if the number of years worked is at least 5 years
        if (yearsWorked >= 5) {
            // Calculate the gratuity amount
            double gratuityAmount = (yearsWorked * basicSalaryAndDA * 15) / 26;
            // Display the gratuity amount
            System.out.println("Gratuity amount: " + gratuityAmount);
        } else {
            System.out.println("You must have worked for at least 5 years to be eligible for gratuity.");
        }

        scanner.close();
    }
}
