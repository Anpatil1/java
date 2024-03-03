package Assigmnent.ifelse;

import java.util.Scanner;

//A company decided to give bonus of 50% to employee if his/her year of service is more than 5 years.
//
//Ask user for their salary and year of service and print the net bonus amount.
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Salary: ");
        int Salary = scanner.nextInt();
        System.out.println("YearOfService");
        int YearOfService = scanner.nextInt();

        if (YearOfService >= 5) {
            int bonus = (int) (0.5 * Salary);
            System.out.println("Bonus Is " + bonus);
        } else {
            System.out.println("not eligible ");
        }
    }
}
