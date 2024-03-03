package Assigmnent.controlstatement;


import java.util.Scanner;

public class sqareornot {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the length of the rectangle:");
            double length = scanner.nextDouble();
            System.out.println("Enter the breadth of the rectangle:");
            double breadth = scanner.nextDouble();

            if (length == breadth)
                System.out.println("It is a square.");
            else
                System.out.println("It is not a square.");
        }
    }


