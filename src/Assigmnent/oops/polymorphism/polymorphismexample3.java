package Assigmnent.oops.polymorphism;
//3. Write a Java program to create a base class Shape with a method called calculateArea().
// Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each
// subclass to calculate and return the shape's area.

//6. Write a Java program to create a class Shape with methods getArea() and getPerimeter().
// Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter() methods in each
// subclass to calculate and return the area and perimeter of the respective shapes.
class Shape
{
    public double calculateArea(){
 return 0;
    }
}
class Circle extends Shape{

private double radius =4;
public Circle (double radius){
    this.radius =radius;
}
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Calculate area of circle
    }
}
class Rectangle extends Shape{

    private double  length = 6;
    private  double breadth =5;

    public Rectangle (double length,double breadth){
        this.length =length;
        this.breadth =breadth;
    }
    @Override
    public double calculateArea() {
        return  length * breadth; // Calculate area of rectangle
    }

}
class Triangle extends Shape{
    private double  base  = 4;
    private  double height =9;
    public Triangle (double base,double height){
        this.base =base;
        this.height =height;
    }
    @Override

    public double calculateArea() {
        return  0.5 * base*height; // Calculate area of rectangle
    }


}
public class polymorphismexample3 {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(12, 34);
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(5, 9);
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
    }

}
