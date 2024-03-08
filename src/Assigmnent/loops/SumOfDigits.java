package Assigmnent.loops;


import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A number");
        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char digichar = input.charAt(i);
            int digit = Character.getNumericValue(digichar);
            sum += digit;
        }
        System.out.println("sum of digit is : "+sum);
    }
}
