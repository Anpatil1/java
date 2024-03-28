package oops.java8feature;


import java.util.Collection;


        interface I {
            void m1();

            default void m2() {
                System.out.println("this is the default implementation for all of subclasses");
            }
        }
        class A implements I {
            @Override
            public void m1() {
                System.out.println("A class m1 method");
            }
        }

        class B implements I {
            @Override
            public void m1() {
                System.out.println("B class m1 method");
            }
        }

        class C implements I {
            @Override
            public void m1() {
                System.out.println("C class m1 method");
            }

            @Override
            public void m2() {
                System.out.println("c class m2 method ");
            }
        }
public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();

        B b = new B();
        b.m1();
        b.m2();

        C c = new C();
        c.m1();
        c.m2();
    }
}