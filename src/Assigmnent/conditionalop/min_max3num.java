package Assigmnent.conditionalop;

import java.util.Scanner;

public class min_max3num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int min = (num1<num2)?num1:(num2<num3)?num2:num3;
        int max = (num1>num2)?num1:(num2>num3)?num2:num3;
        System.out.println("The min number is "+min);
        System.out.println("The max number is "+max);

    }
}
