package Assigmnent.ClassAndObject;

import java.util.Scanner;

//- Assignment - 08
//    1. Print the sum, difference and product of two complex numbers by creating
//    a class named 'Complex' with separate methods
//    for each operation whose real and imaginary parts are entered by user.
class Complex{
    private double real;
    private  double imaginary;

    // Constructor to initialize the real and imaginary parts of the complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex Sum1(Complex other){
        return  new Complex(this.real + other.real,this.imaginary+other.imaginary);
    }
    public Complex Sub(Complex other){
        return  new Complex(this.real - other.real,this.imaginary - other.imaginary);
    }
    public  Complex Mul(Complex other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.real) + (this.imaginary * other.imaginary);
        return new Complex(realPart, imaginaryPart);
    }
        public void display() {
            System.out.println("Result: " + this.real + " + " + this.imaginary + "i");
        }
    }



public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();

        Complex complex1 =new Complex(real1,imaginary1);
        Complex complex2 =new Complex(real2,imaginary2);

        Complex sum1 = complex1.Sum1(complex2);
        Complex sub = complex1.Sub(complex2);
        Complex mul = complex1.Mul(complex2);

        System.out.println("Addition");
        sum1.display();

        System.out.println("Subtraction");
        sub.display();

        System.out.println("Multiplication");
        mul.display();

    }
}
