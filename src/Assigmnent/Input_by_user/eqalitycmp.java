package Assigmnent.Input_by_user;

import java.util.Scanner;

public class eqalitycmp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Take 3 inputs from user and check :
        //
        //all are equal
        //
        //any of two are equal
        //
        //( use **&& || )**

        System.out.println("Enter A Three Number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        String eqality = (num1==num2 && num2==num3)?"All are equal":(num1 == num2 || num2 ==num3 ||num1 ==num3)?"Any Two are equal ":"All are different";
        System.out.println(""+eqality);
    }
}
