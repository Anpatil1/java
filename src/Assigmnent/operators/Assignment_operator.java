package Assigmnent.operators;

import java.util.Scanner;

public class Assignment_operator {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Sides Of Rectangle :");
        double length= scanner.nextDouble();
        double width= scanner.nextDouble();
        double area = length * width;
        double perimeter = 2*(length + width);
        System.out.println("Area Of Rectangle Is :"+area);
        System.out.println(" Perimeter Of Rectangle Is:"+perimeter);
    }
}
