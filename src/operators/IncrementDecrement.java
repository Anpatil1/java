package operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 7;
        System.out.println(a++);//2
        System.out.println(++a);//4
        System.out.println(a);//4
        System.out.println(a--);//4
        System.out.println(a);//3
        System.out.println(--a);//2
        System.out.println(a++ + ++a + a - a - --a);//3
        System.out.println(a++ +( ++a + a - a )- --a *  ++b + b++ +b + ++c + c++ +c);//22

    }
}
