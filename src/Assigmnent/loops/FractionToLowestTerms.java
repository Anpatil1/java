package Assigmnent.loops;

import java.util.Scanner;

public class FractionToLowestTerms {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the fraction (in the form a/b): ");
            String input = scanner.nextLine();
            String[] parts = input.split("/");
            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);
            int gcd = findGCD(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
            System.out.println("The fraction in lowest terms is: " + numerator + "/" + denominator);
        }

        private static int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
