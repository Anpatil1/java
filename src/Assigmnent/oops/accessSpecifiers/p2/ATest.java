package Assigmnent.oops.accessSpecifiers.p2;

import Assigmnent.oops.accessSpecifiers.p1.A;

public class ATest {
    public static void main(String[] args) {
        A a = new A();
       // System.out.println(a.id);//private.*CTE outside pacakage
        System.out.println(a.name);
        //System.out.println(a.a);protected *CTE outside pacakage
        System.out.println(a.b);

    }
}
