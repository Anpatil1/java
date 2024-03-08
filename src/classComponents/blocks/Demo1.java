package classComponents.blocks;

public class Demo1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();
        Customer customer5 = new Customer();
        Customer customer6 = new Customer(1,"abc");
        Customer customer7 = new Customer(1,"abc");
        Customer customer8 = new Customer(1,"abc");
        System.out.println("Total customer objects created "+Customer.customerCount);
    }
}