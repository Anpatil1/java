package classComponents.nestedClasses.staticNestedClasses;

public class StaticNestedClassTest {
    public static void main(String[] args) {
        System.out.println("Outer class static variable " +
                Outer.outerClassStaticVariable);

        //accessing static nested class static members
        System.out.println("Static nested class static variable "+Outer.A.sv);
        Outer.A.sm();
    }
}