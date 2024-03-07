package classComponents.nestedClasses;

public class NestedTest {
    public static void main(String[] args) {
        //1. static nested class : static + instance
        System.out.println(Outer.A.v2);//static variable
        Outer.A.m2();//static method

        Outer.A a = new Outer.A();
        System.out.println(a.v1);
        a.m1();

        //2. inner class : instance
        Outer outer = new Outer();
        Outer.B inner = outer.new B();
        System.out.println(inner.v1);
        inner.m1();

        //3. local inner class cannot be access outside the method
        Outer.print();

    }
}