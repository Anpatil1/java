package Assigmnent.conditionalop;

import java.util.Scanner;

public class checknum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num = scanner.nextInt();

        String result = (num >= 0)?"positive":"negative";
        System.out.println(" The Num is: "+result);
    }
}
