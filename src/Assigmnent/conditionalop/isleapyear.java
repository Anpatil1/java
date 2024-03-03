package Assigmnent.conditionalop;

import java.util.Scanner;

public class isleapyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a leap year : ");
        int year = scanner.nextInt();
        boolean isleapyear =((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        if (isleapyear)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

    }

}
