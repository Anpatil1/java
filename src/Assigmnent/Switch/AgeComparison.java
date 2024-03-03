package Assigmnent.Switch;

import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of person 1");
        int age1 = scanner.nextInt();
        System.out.println("Enter age of person 2");
        int age2 = scanner.nextInt();
        System.out.println("Enter age of person 3");
        int age3 = scanner.nextInt();

        int oldest, youngest;
        switch ((age1 > age2) ? (age1 > age3 ? 1 : 3) : (age2 > age3 ? 2 : 3)) {
            case 1:
                oldest = age1;
                break;
            case 2:
                oldest = age2;
                break;
            case 3:
                oldest = age3;
                break;
            default:
                oldest = youngest = age1;

        }
        switch ((age1 < age2) ? (age1 < age3 ? 1 : 3) : (age2 < age3 ? 2 : 3)) {
            case 1:
                youngest = age1;
                break;
            case 2:
                youngest = age2;
                break;
            case 3:
                youngest = age3;
                break;
            default:
                oldest = youngest = age1;

        }
        System.out.println("The Youngest age is "+youngest);

        System.out.println("The oldest age is "+oldest);

    }
}
