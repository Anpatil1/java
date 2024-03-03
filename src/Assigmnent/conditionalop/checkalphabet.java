package Assigmnent.conditionalop;

import java.util.Scanner;

public class checkalphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:  " );
        char ch = scanner.next().charAt(0);
        boolean result=((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
        System.out.println(result ? ch + " is an alphabet." : ch + " is not an alphabet.");


    }
}
