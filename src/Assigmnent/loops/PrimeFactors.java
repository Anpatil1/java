package Assigmnent.loops;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime factors of " + number + " are:");
        findPrimeFactors(number);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find prime factors of a number
    public static void findPrimeFactors(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number /= i;
            }
        }
    }
}
