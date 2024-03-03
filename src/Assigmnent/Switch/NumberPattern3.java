package Assigmnent.Switch;
//Write a program to print number pattern using switch statement.
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
public class NumberPattern3 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            int num = 1; // Initialize number for each row
            for (int j = 1; j <= i; j++) {
                switch (j) {
                    case 1:
                        System.out.print(num);
                        break;
                    default:
                        System.out.print(" " + num);
                        break;
                }
                num++; // Increment number for next iteration
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

