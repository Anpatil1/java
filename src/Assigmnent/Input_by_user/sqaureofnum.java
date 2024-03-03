package Assigmnent.Input_by_user;

import java.util.Scanner;

public class sqaureofnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int number = scanner.nextInt();
        int square = number*number;
        System.out.println("The Sqaure of give no : "+square);
    }
}
