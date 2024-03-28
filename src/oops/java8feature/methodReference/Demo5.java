package oops.java8feature.methodReference;

import java.util.Comparator;

public class Demo5 {
    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("running");
        runnable1.run();

        Comparator<Integer> comparator = (number1, number2) -> number1 - number2;
        // Comparator<Integer> comparator = Comparator.comparingInt(number -> number);
        System.out.println(comparator.compare(10, 11));
    }
}