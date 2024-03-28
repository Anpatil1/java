package Assigmnent.Methods;

import java.util.Scanner;
//Write a program which will ask the user to enter his/her marks (out of 100).
//
//Define a method that will display grades according to the marks entered as below:
//
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Your Marks:");
        int marks = sc.nextInt();
        dislayGrade(marks);
    }

    public static void dislayGrade(int marks) {
        char grade = 0;
        if (marks >= 91 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 81 && marks <= 90) {
            grade = 'B';
        } else if (marks >= 71 && marks <= 80) {
            grade = 'C';
        }else if (marks >= 61 && marks <= 70) {
            grade = 'c';
        }else if (marks >= 51 && marks <= 60) {
            grade = 'E';
        }else if (marks >= 41 && marks <= 50) {
            grade = 'F';
        }else if ( marks <= 40) {
            grade = 'G';
        }

        switch (grade) {
            case 'A' :
                System.out.println("Your Grade is AA");
            break;
            case 'B' :
                System.out.println("Your Grade is AB");
                break;
            case 'C' :
                System.out.println("Your Grade is BB");
                break;
            case 'D' :
                System.out.println("Your Grade is BC");
                break;
            case 'E' :
                System.out.println("Your Grade is CD");
                break;
            case 'F' :
                System.out.println("Your Grade is DD");
                break;
            case 'G' :
                System.out.println("Your  Are  Fail!");
                break;

        }
    }
}
