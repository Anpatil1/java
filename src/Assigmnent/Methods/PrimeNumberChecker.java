package Assigmnent.Methods;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number :");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("The  Number Is Prime");
        }else{
            System.out.println("The Number Is Not Prime");
        }
    }
    public static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num %i ==0){
                return false;
            }
            
        }
        return true;
    }
    
}
