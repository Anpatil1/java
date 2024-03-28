package Assigmnent.Methods;

import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Radius Of circle");
        double radius = scanner.nextDouble();
        System.out.println("Area Of Circle Is :"+area(radius));
    }
    private static double area(double radius){
        return 3.12 * radius * radius ;
    }
}
