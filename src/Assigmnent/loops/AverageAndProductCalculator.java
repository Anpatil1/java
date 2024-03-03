package Assigmnent.loops;
import java.util.Scanner;
//- **Assignment - 09**
//
//    Take integer inputs from user until he/she presses q
//    ( Ask to press q to quit after every integer input ).
//    Print average and product of all numbers.

public class AverageAndProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long product = 1;

        System.out.println("Enter integers (press 'q' to quit):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                product *= num;
                count++;
            } else if (scanner.hasNext("q")) {
                scanner.next(); // consume 'q'
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
                scanner.next(); // consume the invalid input
            }

            System.out.println("Enter next integer (or press 'q' to quit):");
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        } else {
            System.out.println("No valid integers entered.");
        }

        scanner.close();
    }
}
