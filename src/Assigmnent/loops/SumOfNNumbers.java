package Assigmnent.loops;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("Sum of the entered numbers: " + sum);
    }
}

