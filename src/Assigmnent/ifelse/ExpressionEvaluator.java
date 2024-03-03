package Assigmnent.ifelse;

public class ExpressionEvaluator {

        public static void main(String[] args) {
            // Given values
            int x = 2;
            int y = 5;
            int z = 0;

            // Evaluate expressions
            boolean a = (x == 2);
            boolean b = (x != 5);
            boolean c = (x != 5 && y >= 5);
            boolean d = (z != 0 || x == 2);
            boolean e = !(y < 10);

            // Print the results
            if (a) {
                System.out.println("Expression a is true");
            } else {
                System.out.println("Expression a is false");
            }

            if (b) {
                System.out.println("Expression b is true");
            } else {
                System.out.println("Expression b is false");
            }

            if (c) {
                System.out.println("Expression c is true");
            } else {
                System.out.println("Expression c is false");
            }

            if (d) {
                System.out.println("Expression d is true");
            } else {
                System.out.println("Expression d is false");
            }

            if (e) {
                System.out.println("Expression e is true");
            } else {
                System.out.println("Expression e is false");
            }
        }
    }


