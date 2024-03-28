package oops.java8feature;

import java.util.Comparator;
import java.util.function.*;


        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
        }
        class Square implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }
        class Cube implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        }
public class Demo3 {
    public static void main(String[] args) {

        NumberProcessor square = new Square();
        NumberProcessor cuber = new Cube();

        System.out.println(square.process(10));
        System.out.println(cuber.process(10));


    }
}