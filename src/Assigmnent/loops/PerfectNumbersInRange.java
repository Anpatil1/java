package Assigmnent.loops;

public class PerfectNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Perfect numbers in the range of 1-1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
