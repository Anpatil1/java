package Assigmnent.operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Perimeter_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Sides  Of Triangle");
        Double side1 = scanner.nextDouble();
        Double side2 = scanner.nextDouble();
        Double side3 = scanner.nextDouble();
       double Perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle Is :"+Perimeter);
    }
}
