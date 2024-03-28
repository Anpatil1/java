package oops.inheritance;

   class A {
    static int a =12;
    int b =25;
      A(){
        System.out.println("A class constructor");
    }
    void m1(){
        System.out.println("A class method");
    }

}
 class B extends A{

   static int p =12;
    int q= 23;
     B(){
         System.out.println("B class constructor");
     }
     void m2(){
         System.out.println("B class method");
     }

}

class C extends B{

    static int p =12;
    int q= 23;
    C(){
        System.out.println("c class constructor");
    }
    void m3(){
        System.out.println("c class method");
    }

}
 class xyz {
public static void main(String[] args) {
//    A a = new A();
//    System.out.println(A.a);
//    System.out.println(a.b);
//
//    B b = new B();
//    System.out.println(B.p);
//    System.out.println(b.q);

    C c = new C();
    System.out.println(C.a);
    System.out.println(c.b);
    System.out.println(B.p);
//    System.out.println(b.q);    *CTE

    System.out.println(c.q);
    c.m1();
    c.m2();
    c.m3();

 }
}