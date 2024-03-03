package Assigmnent.operators;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int firstDigit = (number / 10000) % 10;
        int secondDigit = (number / 1000) % 10; // Divide by 1000 to shift right by three digits, then take modulo 10 to get the second digit
        int thirdDigit = (number / 100) % 10;
        int fourthDigit = (number / 10) % 10;
        int fifthDigit = (number% 10);
        int sum = firstDigit +secondDigit;
         int sum2 = fourthDigit + fifthDigit;
        System.out.println( +firstDigit);
        System.out.println(+secondDigit);
        System.out.println(+thirdDigit);
        System.out.println(+fourthDigit);
        System.out.println( +fifthDigit);
        System.out.println("The sum is = "+sum);
        System.out.println( +sum2);



    }

}
