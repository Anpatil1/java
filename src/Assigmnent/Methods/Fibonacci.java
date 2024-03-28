package Assigmnent.Methods;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
//        int n = 10; // Change this to the desired value of n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A number ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th term of Fibonacci series is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
