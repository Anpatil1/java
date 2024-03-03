package Assigmnent.Switch;
//Assignment - 19
//Write a program to print number pattern using switch statement.
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
//4 4 4 4
//3 3 3
//2 2
//1
public class NumberPattern12 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                switch (i) {
                    case 1:
                        System.out.print("1");
                        break;
                    case 2:
                        System.out.print("2");
                        break;
                    case 3:
                        System.out.print("3");
                        break;
                    case 4:
                        System.out.print("4");
                        break;
                    case 5:
                        System.out.print("5");
                        break;
                    default:
                        break;
                }

            }
            System.out.println();

        }
        for (int i = row-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                switch (i) {
                    case 1:
                        System.out.print("1");
                        break;
                    case 2:
                        System.out.print("2");
                        break;
                    case 3:
                        System.out.print("3");
                        break;
                    case 4:
                        System.out.print("4");
                        break;
                    case 5:
                        System.out.print("5");
                        break;
                    default:
                        break;
                }

            }
            System.out.println();
        }

    }
}
