package oops.java8feature.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;

interface MathOperation {
    int method1(int num1, int num2);
}

public class demo implements MathOperation {
    @Override
    public int method1(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Function<Integer,Double> function=(input) ->Math.sqrt(input);
        System.out.println(function.apply(4));
        demo demo = new demo();

        // Using lambda expression
        MathOperation additionLambda = (int num1, int num2) -> num1 + num2;

        // Using method reference
        MathOperation additionMethodRef = demo::method1;

        System.out.println("Result using lambda: " + additionLambda.method1(12, 23));
        System.out.println("Result using method reference: " + additionMethodRef.method1(12, 23));
    }
}
