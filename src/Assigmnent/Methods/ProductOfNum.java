package Assigmnent.Methods;

import java.util.Scanner;

//- Assignment - 05
//
//    Define a method that returns the product of two numbers entered by user.
public class ProductOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A First Num :");
        double num1= scanner.nextDouble();
        System.out.print("Enter A Second Num :");
        double num2= scanner.nextDouble();
        System.out.println("The Multiplication Of Given Num is : "+calculateNum(num1,num2));
    }
    private static double calculateNum(double num1, double num2){

        return num1*num2;
    }
}
