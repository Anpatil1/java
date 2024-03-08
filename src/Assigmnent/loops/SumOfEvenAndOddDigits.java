package Assigmnent.loops;
//- Assignment - 16
//
//    Write a program in java to find the sum of the even and odd digits of the number which is given as inpu
import java.util.Scanner;

public class SumOfEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumOfEvenDigits = 0;
        int sumOfOddDigits = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sumOfEvenDigits += digit;
            } else {
                sumOfOddDigits += digit;
            }
            number /= 10;
        }

        System.out.println("Sum of even digits: " + sumOfEvenDigits);
        System.out.println("Sum of odd digits: " + sumOfOddDigits);
    }
}

