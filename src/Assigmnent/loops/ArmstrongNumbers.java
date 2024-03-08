package Assigmnent.loops;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");
        for (int i = 100; i <= 500; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        // Extracting digits and calculating sum of cubes
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        // Checking if sum of cubes equals the original number
        return sum == originalNumber;
    }
}

