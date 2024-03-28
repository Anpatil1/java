package oops.polymorphism;

public class A1 {
    public static void main(String[] args) {
        xyz a = new xyz();

        int result1 = a.m1(12,11); // Using overridden method with two parameters
        String result2 = a.m1("a","n","p"); // Using overloaded method with three parameters

        System.out.println("Result of m1 with two parameters: " + result1);
        System.out.println("Result of m1 with three parameters: " + result2);
    }
}
