package Assigmnent.conditionalop;

import java.util.Scanner;

public class divisibleBy2And3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        boolean result = (num % 2 == 0 && num % 3 == 0);
        System.out.println(result ? (num + " is divisible by both 2 and 3.") : (num + " is not divisible by both 2 and 3."));
    }
}
