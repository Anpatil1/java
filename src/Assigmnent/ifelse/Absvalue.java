package Assigmnent.ifelse;

import java.util.Scanner;

//Write a program to print absolute value of a number entered by user. E.g.-
//
//INPUT: 1OUTPUT: 1
//
//INPUT: -1 OUTPUT: 1
public class Absvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number :");
        int number = scanner.nextInt();
        int absvalue;
        if (number >= 0) {
            absvalue = number;
        } else {
            absvalue = -number;
        }
            System.out.println("The abosolute number of  "+number +" is "  + absvalue);
        }
    }
