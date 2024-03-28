package oops.Abstraction.interFace;



public interface MessageService {
    // by default variables are public static final
    public static final int variable = 100;

    // by default methods are public abstract
    public abstract void sendMessage();

    //void m1(){}//CTE

    //MessageService(){}//CTE
    //{}
    //static {}

    // by default nested classes are public static
    public static class Nested {}

    public static void m2(){}// from java 8

    public default void m3(){}// java 8 default method

    // abstract method, static method, default methods from java 8
    // main method we can define from java 8
}