package Assigmnent.controlstatement;
import java.util.Scanner;
public class greatest2num


 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " is the greatest.");
        else if (num2 > num1)
            System.out.println(num2 + " is the greatest.");
        else
            System.out.println("Both numbers are equal.");
    }
}

