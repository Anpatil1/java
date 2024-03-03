package Assigmnent.ifelse;

import java.util.Scanner;

//Take two int values from user and print greatest among them.
public class greatestnum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("The number is");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1>num2){
            System.out.println("the greater num is "+num1);

        }else if (num2>num1)
        {
            System.out.println("the greater num is " +num2);
        }else {
            System.out.println("the num are  equal");
        }
    }
}
