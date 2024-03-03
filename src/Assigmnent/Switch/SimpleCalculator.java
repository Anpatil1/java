package Assigmnent.Switch;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
                double num1,num2,result =0;
                char operator =0;
        System.out.println("Welcome to simple calculator");
        System.out.println("1: Addition(+)");
        System.out.println("2: Subtraction(-)");
        System.out.println("3: Multiplication(*)");
        System.out.println("4: Division(/)");

        System.out.println("Enter your choice : ");

        int choice = scanner.nextInt();

        System.out.println("enter a  num1");

        num1 = scanner.nextInt();

        System.out.println("enter a  num2");
        num2 = scanner.nextInt();
        switch (choice){
            case 1 :
                operator = '+';
                result = num1 + num2;

                break;
            case 2 :
                operator = '-';
                result = num1 - num1;

                break;
            case 3 :
                operator = '*';
                result = num1 * num2;

            case 4 :
                operator = '/';
                if (num2 != 0) {
                    result = num1 / num2;

                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
    }
}
