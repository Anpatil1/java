package oops.objectClass;

public class DemoHashCode  {
    public static void main(String[] args) {
        class A {}
        A a1= new A();
        A a2= new A();
        System.out.println(a1.hashCode()+"\t"+a2.hashCode());
        a1=a2;
        System.out.println("After Hash code is");
        System.out.println(a1.hashCode()+"\t"+a2.hashCode() );

    }
}
