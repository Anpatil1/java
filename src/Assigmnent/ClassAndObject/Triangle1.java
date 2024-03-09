package Assigmnent.ClassAndObject;

public class Triangle1 {
    private double side1;
    private double side2;
    private double side3;

    // Constructor to initialize the sides of the triangle
    public Triangle1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
        // Creating an object of Triangle class with sides 3, 4, and 5 units
        Triangle1 triangle = new Triangle1(3, 4, 5);

        // Calculating and printing the area and perimeter of the triangle
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
    }
}
