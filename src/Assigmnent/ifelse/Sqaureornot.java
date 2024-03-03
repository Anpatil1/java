package Assigmnent.ifelse;

import java.util.Scanner;
//Take values of length and breadth of a rectangle from user and check if it is square or not.
public class Sqaureornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A Length ");
        int length = scanner.nextInt();
        System.out.println("Enter A breadth ");
        int breadth = scanner.nextInt();

        if(length == breadth) {
            System.out.println("It is a Sqaure");
        }else{System.out.println("It is  not a Sqaure");}

    }
}
