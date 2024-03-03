package operators;

public class Arithmetic_Operators {
    public static void main(String[] args) {
        int a =12;
        int b =26;
        System.out.println(a+b );//addition
        System.out.println(a-b);//substraction
        System.out.println(a*b);//multiplication
        System.out.println(a/b);//divide
        System.out.println(a%b);//reminder
        System.out.println(10/0);// A.E
        System.out.println(10%0);// A.E
        System.out.println(10.0/0);//infinity
        System.out.println(10.0%0);//nan
        System.out.println('A' / 0);//java.lang.ArithmeticException: / by zero
    }
}
