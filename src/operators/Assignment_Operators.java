package operators;

public class Assignment_Operators {
    public static void main(String[] args) {
        int a = 1;// value
        int b = a;// variable
        int sum = a+b;//expression
        int c =  sum( a, b);//method call
        int d = a+b-c/a*b%c; // expression
        System.out.println("sum = " + sum);
        System.out.println("c ="+ c);
        System.out.println("d ="+ d);
    }
    // Method to calculate sum
    public static int sum(int a, int b) {
        return a + b;
    }
}