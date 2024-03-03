package Assigmnent.ifelse;

import java.util.Scanner;

//- Assignment - 08
//
//    A student will not be allowed to sit in exam if his/her attendance is less than 75%.
//    Take following input from user
//    Number of classes held
//    Number of classes attended.
//    And print
//    percentage of class attended
//    Is student is allowed to sit in exam or not.
public class AttendanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of classes held: ");
        int  classesheld = scanner.nextInt();
        System.out.println("Number of classes attended");
        int classesattended = scanner.nextInt();
        // Calculate percentage of classes attended
        double attendancePercentage = (double) classesattended / classesheld * 100;

        // Ask user if they have a medical cause
        System.out.print("Do you have a medical cause? (Y/N): ");
        char medicalCause = scanner.next().charAt(0);

        if (attendancePercentage >= 75 || medicalCause == 'Y' || medicalCause == 'y'){
            System.out.println("Your percentage of class attended is : " +attendancePercentage +"%");
            System.out.println("You are allowed sit for exam ");
        }else{System.out.println("Your percentage of class attended is : " +attendancePercentage +"%");
            System.out.println("You are not  allowed sit for exam "); }


    }
}
