package introduction;

public class Helloworld1 {
     public static void main (String[] args) {
        System.out.println("Hello world!");
        // Call the main methods of classes A, B, and C
       A.main1();
       C.main3();
       B.main2();


    }
static class A {
     public static void main1() {
        System.out.println("Main : A");
    }
}
static class B {
    public static void main2()
        {
            System.out.println("Main : B");
        }
}
   static  class C {
         public  static void main3() {
            System.out.println("Main : C");
        }
    }
}