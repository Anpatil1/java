package classComponents.blocks;

public class Demo2 {
    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Demo2 ref = new Demo2();
    }
}