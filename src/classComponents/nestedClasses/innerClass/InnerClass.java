package classComponents.nestedClasses.innerClass;

public class InnerClass {
    public static void main(String[] args) {

        //outer class object creation
        Outer outer = new Outer();
        System.out.println("Outer IV " +outer.instanceVariable);


        //inner class object creation using outer reference
        Outer.Inner inner = outer.new Inner();
        System.out.println("Inner IV " +inner.instanceVariable);
        inner.instanceMethod();
    }
}