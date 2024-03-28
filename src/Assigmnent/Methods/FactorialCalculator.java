package Assigmnent.Methods;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int number = scanner.nextInt();
        long factorial = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    public static long factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
