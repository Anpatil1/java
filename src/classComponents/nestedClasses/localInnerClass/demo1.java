package classComponents.nestedClasses.localInnerClass;

public class demo1 {
    public static void main(String[] args) {
        //local inner class : only non-static members
        // a class defined inside a method, block, constructor
        class A {
            int instanceVariable = 100;
            //static int b = 100;
            void instanceMethod(){
                System.out.println("local inner class : instance method");
            }
        }

        A a = new A();
        System.out.println(a.instanceVariable);
        a.instanceMethod();
    }
}