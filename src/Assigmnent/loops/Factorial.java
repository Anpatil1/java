package Assigmnent.loops;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter A Number");
        int number = scanner.nextInt();
        long factorial =1;
        for (int i = 1; i <=number ; i++) {
            factorial *= i;

        }
        System.out.println("The factoral of "+number+"is"+factorial);
    }

}
