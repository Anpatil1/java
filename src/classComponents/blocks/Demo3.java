package classComponents.blocks;

public class Demo3 {
    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    Demo3() {
        System.out.println("Demo3 constructor");
    }

    public static void main(String[] args) {
        Demo3 ref = new Demo3();
    }
}