package Assigmnent.Input_by_user;

import java.util.Scanner;
//Take name, roll number and field of interest from user and print in the format below :
//
//Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
public class information {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter A Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter A Roll No: ");
        String roll_no = scanner.nextLine();
        System.out.print("Enter Your interest: ");
        String interest  = scanner.nextLine();
        System.out.println("Hey,my name is "+name +" and my roll number is "+roll_no +".My field of interest are "+interest);
    }
}
