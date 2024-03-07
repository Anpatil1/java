package classComponents.nestedClasses.staticNestedClasses;

public class Outer {
    static int outerClassStaticVariable = 1000;
    //static nested class
    static class A {
        int iv = 100;
        static int sv = 200;

        void im() {
            System.out.println("A:instance method");
        }

        static void sm() {
            System.out.println("A: static method");
        }

        A() {
            System.out.println("A con");
        }

        {
            System.out.println("A instance block");
        }

        static {
            System.out.println("A static block");
        }
    }
}