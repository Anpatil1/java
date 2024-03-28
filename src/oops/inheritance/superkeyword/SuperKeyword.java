package oops.inheritance.superkeyword;

public class SuperKeyword {
    public static void main(String[] args) {
        class A {
            int a = 100;

        }
        class B extends A{

            int a =1000;
            void display( ){
                System.out.println("local variable "+a);
                System.out.println("Super  variable "+ super.a);
                System.out.println(" Super Variable "+ this.a);
            }

        }
        B b = new B();
        b.display();
    }
}
