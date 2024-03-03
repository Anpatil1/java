package Assigmnent.conditionalop;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:  ");
        int num = scanner.nextInt();
        String result = (num % 2 ==0)?"even":"odd";
        System.out.println("The number is "+result);

    }
}
