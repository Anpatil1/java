package Assigmnent.Input_by_user;

import java.util.Scanner;

//Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
public class areaofrectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double Area = length * breadth;
        int areaint =(int)Area;
        System.out.println("The area of rectangle is:"+areaint);

    }
}
