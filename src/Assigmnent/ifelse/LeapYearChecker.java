package Assigmnent.ifelse;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

                // Ask user for the year
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();

                // Check if it's a leap year
                boolean isLeapYear = false;

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    isLeapYear = true;
                }

                // Print the result
                if (isLeapYear) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        }


