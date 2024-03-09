package Assigmnent.ClassAndObject;
//Write a program to print the area of two rectangles having
// sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
// and breadth passed as parameters to its constructor.
public class Rectangle1 {
    private double length;
    private double breadth;
    public Rectangle1(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle1 rectangle1 =new Rectangle1( 4,5);
        Rectangle1 rectangle2 =new Rectangle1( 5,8);
        System.out.println("Area of rectangle1: " + rectangle1.area());
        System.out.println("Area of rectangle2: " + rectangle2.area());
    }
}
