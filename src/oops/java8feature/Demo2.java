package oops.java8feature;

interface I1 {
    void  method1();
    default void m2() {
        System.out.println("this is the default implementation for all of subclasses");
    }

}
interface I2{
    void  method1();
    default void m2() {
        System.out.println("this is the default implementation for all of subclasses");
    }


}

class child1 implements I1,I2{
    @Override
    public void method1() {
        System.out.println("Implementation of method1 in child1");
    }

    @Override
    public void  m2(){

        I1.super.m2();
        I2.super.m2();
        System.out.println("rest of the code of Child class method");
    }
}
    public class Demo2 {
        public static void main(String[] args) {
            child1 child = new child1();
            child.method1();
            child.m2();
        }
    }

