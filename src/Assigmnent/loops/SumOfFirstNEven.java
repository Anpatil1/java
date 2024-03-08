package Assigmnent.loops;

import java.util.Scanner;

//- **Assignment - 22**
//
//    write a program to find the sum of first n even numbers
public class SumOfFirstNEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  n number :");
        int num = scanner.nextInt();
       int sum =0;
        for (int i = 1; i <=num; i++) {
            int evenNumber = 2 * i;
            sum += evenNumber;

        }
        System.out.println("The Sum Of First " +num +"  Even Number is : "+sum);
    }

}
