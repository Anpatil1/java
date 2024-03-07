package classComponents.nestedClasses;

public class Outer {

    //static nested class : static + instance
    static class A{
        int v1 = 100;
        void m1(){
            System.out.println("A m1");
        }

        static int v2 = 200;
        static void m2(){
            System.out.println("A m2");
        }
    }

    //inner class : instance
    class B{
        int v1 = 200;
        void m1(){
            System.out.println("B m1");
        }

    }

    //local inner class : instance
    static void print(){

        class C{
            int v1 = 300;
            void m1(){
                System.out.println("C m1");
            }
        }

        C c = new C();
        System.out.println(c.v1);
        c.m1();
    }
}