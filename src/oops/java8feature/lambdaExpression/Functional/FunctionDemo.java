package oops.java8feature.lambdaExpression.Functional;

import java.util.function.Function;

public class  FunctionDemo{
    public static void main(String[] args) {
        Function<String,Integer>function = (String s) -> s.length();
        System.out.println(function.apply("avadhut"));
    }
}
