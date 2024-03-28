package oops.finalkeyword;


public class finalmethod {
    class A {
        /*final */void m1(){

        }
        //public static final void m2(){}
        final public void main(String[] args) {
            System.out.println("main method made as final");
        }
    }

    class B extends A{
        @Override
        void m1() {
            System.out.println("Method overidden");
        }
    }//CTE

    final public static void main(String[] args) {
        System.out.println("main");
    }

}
