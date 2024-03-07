package Assigmnent.loops;


    public class PrimeNumbers {
        public static void main(String[] args) {
            System.out.println("Prime numbers between 1 and 100:");

            // Loop through numbers from 2 to 100
            for (int i = 2; i <= 100; i++) {
                boolean isPrime = true;

                // Check if the number is divisible by any number other than 1 and itself
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // If it's not divisible by any other number, it's prime
                if (isPrime) {
                    System.out.print(i + "");
                }
            }
        }
    }
