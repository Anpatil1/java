package Assigmnent.Switch;


    import java.util.Scanner;

    public class SortThreeNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Get the three numbers from the user
            System.out.println("Enter three numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();

            // Sort the three numbers using switch statement
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 > num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            // Print the sorted numbers
            System.out.println("Numbers in ascending order: " + num1 + ", " + num2 + ", " + num3);
            System.out.println("Numbers in descending order: " + num3 + ", " + num2 + ", " + num1);
        }
    }
