package Assigmnent.loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == number;
    }
}
