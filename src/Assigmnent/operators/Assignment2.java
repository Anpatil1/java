package Assigmnent.operators;

public class Assignment2 {
    public static void main(String[] args) {
        int  myInt=6;
        double mydouble = 8.2;
        char mychar = 'h';
        int asciiValue = 'h';

        System.out.println("Integer:"+myInt);
        System.out.println("double:"+mydouble);
        System.out.println("Character:"+mychar);
        System.out.println("h ="+asciiValue);

A.main(args);
B.main(args);
C.main(args);
D.main(args);
    }

   static class A{
        public static void main(String[] args) {
            int A = 123;
            double B  = 124;
            System.out.println("Product of number is :"+(A*B));


        }

    }
    static class B{
        public static void main(String[] args) {
            double A = 100.235;
            int B  = (int)A;
            System.out.println("decimal convert in  int is = "+B);
        }
    }
    static class C{
        public  static void main(String[] args) {
            int a = 3;
            char character = 'd';
            int newasciiValue = (int)character +a;
            char newcharacter =(char) newasciiValue;
            System.out.println("Equivalent character after adding 3 to the ASCII value of 'd': " + newcharacter);
        }
    }
}
//Write a program to add an integer variable having value 5 and a double variable having value 6.2.
class D
{
    public static void main(String[] args) {
        int a = 5;
        double b = 6.2;
        double num =3.9;
        double sum = a + b;
        double sqaure = num * num;
        System.out.println("sum is "+sum);
        //Write a program to find the square of the number 3.9.
        System.out.println("The square of :"+num + "  is :"+sqaure );
    }
}
