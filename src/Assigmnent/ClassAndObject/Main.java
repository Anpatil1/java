package Assigmnent.ClassAndObject;

import java.util.Scanner;

//- **Assignment - 07**
//    1. Print the average of three numbers entered by user by creating a
//    class named 'Average' having a method to calculate and print the average
 class Average {

    public void calculateAndPrintAverage(double num1,double num2,double num3){

        double average = (num1+num2+num3)/3.0;
        System.out.println("Average Of three num is :"+average);
    }

}
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A First Number :" );
        double num1 = scanner.nextDouble();
        System.out.println("Enter A Second Number :" );
        double num2 = scanner.nextDouble();
        System.out.println("Enter A Third Number :" );
        double num3 = scanner.nextDouble();
        Average average =new Average();
       average.calculateAndPrintAverage(num1,num2,num3);
    }
}

