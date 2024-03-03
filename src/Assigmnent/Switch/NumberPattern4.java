package Assigmnent.Switch;
//Write a program to print number pattern using switch statement.
//5
//45
//345
//2345
//12345
public class NumberPattern4 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            int num = 5 - i + 1; // Starting number for each row
            for (int j = 1; j <= i; j++) {
                switch (j) {
                    case 1:
                        System.out.print(num);
                        break;
                    default:
                        System.out.print(num + j - 1);
                        break;
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
