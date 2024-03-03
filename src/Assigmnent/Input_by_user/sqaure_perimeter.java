package Assigmnent.Input_by_user;

import java.util.Scanner;

public class sqaure_perimeter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter A Side Of Square: ");
        double side = scanner.nextDouble();
        double perimeter =4*side;
        System.out.println("The Sqaure side of perimeter is:  " +perimeter);

    }
}
