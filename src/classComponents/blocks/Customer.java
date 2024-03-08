package classComponents.blocks;

public class Customer {
    int id;
    String name;
    public static int customerCount;

    {
        System.out.println("instance block");
        customerCount++;
    }
    static {
        System.out.println("static block ");
    }
    public Customer(){
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(int id) {
        this.id = id;
    }

    public Customer(String name) {
        this.name = name;
    }
}