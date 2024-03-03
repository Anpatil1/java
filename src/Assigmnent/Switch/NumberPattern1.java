package Assigmnent.Switch;

public class NumberPattern1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                switch (j % 2) {
                    case 0:
                        System.out.print("0");
                        break;
                    case 1:
                        System.out.print("1");
                        break;
                }
            }
            System.out.println();
        }
    }
}
