package Assigmnent.loops;

import java.util.Scanner;

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int product = 0;
        for (int i = 0; i < num2; i++) {
            product += num1;
        }

        System.out.println("Multiplication: " + product);
    }
}

