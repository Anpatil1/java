package Assigmnent.Input_by_user;

import java.util.Scanner;
//Write a program to enter the values of two variables 'a' and 'b'
// from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.
public class CheckConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A value");
        int a = scanner.nextInt();
        System.out.println("Enter B value");
        int b = scanner.nextInt();
        String checkcondition = (a<50 && a<b ) ?  " true" :"  false";
        System.out.println( "The both condition  are"+checkcondition);
    }
}
