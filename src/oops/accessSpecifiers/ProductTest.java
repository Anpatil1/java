package oops.accessSpecifiers;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", 12400);
      product.setProductPrice(125000);
      System.out.println(product.getProductId());
      System.out.println(product.getProductName());
      System.out.println(product.getProductPrice());
//
      System.out.println(product.toString());
       System.out.println(product);
    }
}