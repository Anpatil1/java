package Assigmnent.Methods;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = 84; // Example number

        System.out.println("Prime factors of " + number + " are:");
        printPrimeFactors(number);
    }

    // Method to print prime factors of a number
    public static void printPrimeFactors(int number) {
        // Print 2 as a prime factor while the number is divisible by 2
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Check for other prime factors starting from 3
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If the remaining number is still greater than 2, it's also a prime factor
        if (number > 2) {
            System.out.print(number);
        }
    }
}
