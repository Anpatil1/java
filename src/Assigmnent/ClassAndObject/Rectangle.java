package Assigmnent.ClassAndObject;

import java.util.Scanner;

//  - **Assignment - 01**
//        1. Write a program to print the area of a rectangle by creating a class named 'Rectangle'
//        having two methods.
//            1. First method named as 'setDimension' takes length and breadth of rectangle as
//            parameters and the second method named as '**getArea**' returns the area of the rectangle.
//            2. Length and breadth of rectangle are entered through keyboard. in java
public class Rectangle {
    private double length;
    private double breadth;
    public void setDimension(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getArea(){
        return length * breadth;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Enter The Length Of Rectangle:");
        double length = scanner.nextDouble();
        System.out.print("Enter The Breadth Of Rectangle:");
        double breadth = scanner.nextDouble();
        rectangle.setDimension(length, breadth);
        System.out.println("Area Of Rectangle is  " +rectangle.getArea());

    }
}
