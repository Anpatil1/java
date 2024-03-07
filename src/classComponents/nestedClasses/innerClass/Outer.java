package classComponents.nestedClasses.innerClass;

public class Outer {
    int instanceVariable = 1999;
    class Inner {
        //non static --> IV, IM, IB, Con, IC
        int instanceVariable = 100;
        void instanceMethod(){
            System.out.println("Inner class : instance method");
        }
    }
}