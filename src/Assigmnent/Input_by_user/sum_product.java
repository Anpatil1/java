package Assigmnent.Input_by_user;

import java.util.Scanner;
//Write a program to take two integer inputs from user and print sum and product of them.
public class sum_product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A  Number");
        int num1= scanner.nextByte();
        int num2 = scanner.nextInt();
        int sum = num1+ num2;
        int mul = num1*num2;
        System.out.println("The sum Of  "+num1 +" and "+num2 +" is:"+sum);
        System.out.println("The multiplication of "+num1 +" and "+num2 +" is:"+mul);
    }
}
