package Assigmnent.conditionalop;

import java.util.Scanner;

public class perfectsqare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        double sqrt = Math.sqrt(number);
        String isPerfectSquare = ((sqrt - Math.floor(sqrt)) == 0) ? "is a Perfect square" : "is not a Perfect square";
        System.out.println(number + " " + isPerfectSquare);
    }
}
