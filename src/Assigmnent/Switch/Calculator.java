package Assigmnent.Switch;

import java.util.Scanner;
// **Assignment - 04**
//Take two numbers from user and an operator (+, -, *, /) and then calculate the value.
// (Use switch statement)
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A  first number");
        double number1 = scanner.nextInt();
        System.out.println("Enter A  second number");
        double number2 = scanner.nextInt();
        System.out.println("Enter the operator(+, -, *, /)");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator){
            case '+' :
            result = number1 + number2;
            System.out.println("Result: " + result);
            break;
            case '-' :
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*' :
                result = number1 * number2;
                System.out.println("Result: " + result);
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }
    }
}
