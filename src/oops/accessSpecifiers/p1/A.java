package oops.accessSpecifiers.p1;

public class A {
    private int id = 1;
    public String name = "XYZ";
    protected int a = 1;
    public  int b = 11;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.id); // This will not work because id is private
        System.out.println(a.name); // This will work
        System.out.println(a.a); // This will work because it's protected
        System.out.println(a.b); // This will work
    }
}
