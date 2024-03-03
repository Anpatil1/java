package Assigmnent.loops;

import java.util.Scanner;



public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int number;

        System.out.println("Enter 10 integers:");

        // Loop to take 10 integers from the user
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer #" + i + ": ");
            number = scanner.nextInt();
            sum += number;
            count++;
        }

        // Calculate the average
        double average = (double) sum / count;

        // Print the average
        System.out.println("Average value: " + average);


    }
}
