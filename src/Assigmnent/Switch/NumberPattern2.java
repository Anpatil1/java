package Assigmnent.Switch;
//Write a program to print number pattern using switch statement.
//1
//23
//456
//7890
public class NumberPattern2 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        int num = 1; // Starting number

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
