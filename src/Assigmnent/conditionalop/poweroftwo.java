package Assigmnent.conditionalop;

import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        String isPowerOfTwo = ((num > 0) && ((num & (num - 1)) == 0)) ? "is a power of two" : "is not a power of two";
        System.out.println(num + " " + isPowerOfTwo);
    }
}
