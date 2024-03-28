package oops.java8feature.lambdaExpression.Functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime>{


    @Override
    public LocalDateTime get() {
        return LocalDateTime.now() ;
    }
}
public class supplierDemo {

    public static void main(String[] args) {
//        tradditional method
//        Supplier<LocalDateTime> supplier=new SupplierImpl();
//        System.out.println(supplier.get());

        //using lambda
        Supplier<LocalDateTime> supplier=  () -> LocalDateTime.now() ;
        System.out.println(supplier.get());
    }
}
