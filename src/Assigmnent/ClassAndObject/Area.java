package Assigmnent.ClassAndObject;
//- **Assignment - 06**
//    1. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle.
//    2. Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;

class Rectangle3{
    private double length;
    private double breadth;
    public Rectangle3(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    // Method to calculate and return the area of the rectangle
    public double returnArea() {
        return length * breadth;
    }

}

public class Area {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter A Length Of Rectangle");
        double length = scanner.nextDouble();
        System.out.println("Enter A Breadth Of Rectangle");
        double Breadth = scanner.nextDouble();
        Rectangle3 rectangle = new Rectangle3( length,Breadth);
        System.out.println("Area Of Rectangle Is : "+rectangle.returnArea());

    }

}
