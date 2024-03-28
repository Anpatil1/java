package oops.java8feature.lambdaExpression;




        @FunctionalInterface
        interface Supplier {
            int get();
        }
public class Demo3 {
    public static void main(String[] args) {
        Supplier supplier = () -> 10;
        System.out.println(supplier.get());
    }
}