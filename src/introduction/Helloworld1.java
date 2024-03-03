package introduction;

public class Helloworld1 {
    static public void main (String[] args) {
        System.out.println("Hello world!");
        // Call the main methods of classes A, B, and C
        A.main(args);
        B.main(args);
        C.main(args);


    }
class A {
    static public void main(String[] args) {
        System.out.println("Main : A");
    }
}
class B {
        static public void main(String[] args) {
            System.out.println("Main : B");
        }
}
    class C {
        static public void main(String[] args) {
            System.out.println("Main : C");
        }
    }
}