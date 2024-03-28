package Assigmnent.Methods;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number :");
        int number = sc.nextInt();
        int multiplier =1;
        printMultiplicationTable(number, multiplier);
    }

    // Recursive method to print the multiplication table of a number
    public static void printMultiplicationTable(int number, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            printMultiplicationTable(number, multiplier + 1); // Recursively call the method with the next multiplier
        }
    }
}

