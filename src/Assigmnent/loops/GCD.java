package Assigmnent.loops;
// Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers


import java.util.Scanner;

public class GCD {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input two numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Find GCD/HCF
            int gcd = findGCD(num1, num2);

            // Output the result
            System.out.println("Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);

            scanner.close();
        }

        // Method to find GCD/HCF
        public static int findGCD(int num1, int num2) {
            int gcd = 1;
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }
            return gcd;
        }
    }

