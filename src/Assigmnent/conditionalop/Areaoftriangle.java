package Assigmnent.conditionalop;

import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a height =" );
        double height = scanner.nextDouble();
        System.out.print("enter a base =" );
        double base =  scanner.nextDouble();
       double Areaoftriangle =( base*height)/2;
        System.out.println("area of triangle is  "+Areaoftriangle);
    }
}
