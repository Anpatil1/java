package oops.java8feature.lambdaExpression.Functional;

import java.util.function.Consumer;

class consumerImpl implements Consumer<String> {

    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}
public class consumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("Avadhut");
    }
}
