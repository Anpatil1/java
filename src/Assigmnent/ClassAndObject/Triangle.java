package Assigmnent.ClassAndObject;
//- **Assignment - 03**
//    1. Write a program to print the area and perimeter of
//    a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
public class Triangle {
    private double side1 ;
    private double side2 ;
    private double side3 ;
    public Triangle(){
        side1 =  5;
        side2 = 6;
        side3 = 7;
    }

    // Method to calculate and return the area of the triangle
    public double calculateArea() {
        // Using Heron's formula to calculate the area
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate and return the perimeter of the triangle
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }


public static void main(String[] args) {
        Triangle triangle =new Triangle();
    System.out.println("Area of Triangle is  "+triangle.calculateArea());
    System.out.println("Perimeter Of Triangle is "+triangle.calculatePerimeter());
 }
}
