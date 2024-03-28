package oops.inheritance.superkeyword;

public class SuperKeyword2 {
    public static void main(String[] args) {
        class Parent {
            int x = 10;
            int y = 20;
        }
        class Child extends Parent {
            int x = 100;
            int m = 200;

            void display(/*local variables */int x, int m) {
                System.out.println("Local variable " + x);//10000
                System.out.println("local variable" + m);//20000

                System.out.println("instance variable " + this.x);//100
                System.out.println("instance variable" + this.m);//200

                System.out.println("super instance variable " + super.x);//10
                System.out.println("super instance variable" + super.y);//20
            }
        }

        Child child = new Child();
        child.display(10000, 20000);
    }
}