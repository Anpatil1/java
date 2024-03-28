package oops.java8feature.lambdaExpression.Functional;

import java.util.function.Function;

public class FunctionalImpl implements Function<String,Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

