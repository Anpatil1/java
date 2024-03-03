package Assigmnent.conditionalop;

import java.util.Scanner;

public class absValue {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number:");
            int num = scanner.nextInt();

            int absValue = (num < 0) ? -num : num;

            System.out.println("Absolute value of " + num + " is: " + absValue);
        }
    }
