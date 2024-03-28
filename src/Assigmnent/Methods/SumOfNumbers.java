package Assigmnent.Methods;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A First Number");
        int num1 = scanner.nextInt();
        System.out.println("Enter A Second Number");
        int num2 = scanner.nextInt();
        System.out.println("Enter A Third Number");
        int num3 = scanner.nextInt();
        System.out.println("The Adiition Of Given Number Is :"+calculateNum(num1,num2,num3));
    }
    public static int calculateNum(int num1,int num2,int num3){
        return num1 +num2+num3;
    }
}
