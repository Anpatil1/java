package oops.Abstraction.abstractClass;

public class demo {
    public static void main(String[] args) {
        abstract class A {
            abstract  void m1();
        }
        abstract class B extends A{
            @Override
            void m1(){
                System.out.println("m1 method overridden by B");
            }
            abstract  void m2();
        }
        abstract class C extends B{
            abstract  void m3();
        }
         class D extends C{
            @Override
            void m2(){
                System.out.println("m2 overriden i D");
            }
            @Override
            void m3(){
                System.out.println("m3 overriden i D");
            }
        }
        C ref = new D();
        ref.m2();
        ref.m1();
        ref.m3();
    }
}
