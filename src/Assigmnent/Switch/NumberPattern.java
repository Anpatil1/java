package Assigmnent.Switch;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 10; // Number of rows

        for (int i = 1; i <= n; i++) {
            switch (i) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("22");
                    break;
                case 3:
                    System.out.println("333");
                    break;
                case 4:
                    System.out.println("4444");
                    break;
                case 5:
                    System.out.println("55555");
                    break;
                case 6:
                    System.out.println("5555555");
                    break;
                case 7:
                    System.out.println("5555555555");
                    break;
                case 8:
                    System.out.println("55555555555555");
                    break;
                case 9:
                    System.out.println("55555555555555555555");
                    break;
                case 10:
                    System.out.println("555555555555555555555555555555");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}

