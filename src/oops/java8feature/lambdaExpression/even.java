package oops.java8feature.lambdaExpression;



        @FunctionalInterface
        interface Predicate {
            boolean test(int number);
        }
public class even {
    public static void main(String[] args) {
        Predicate predicate = number -> number % 2 == 0;
        System.out.println("Is even number : "+predicate.test(10));
        System.out.println("Is even number : "+predicate.test(11));
    }


}

