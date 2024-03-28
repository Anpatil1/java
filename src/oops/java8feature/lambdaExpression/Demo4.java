package oops.java8feature.lambdaExpression;




        interface Predicate1<X> {
            boolean test(X x);
        }
public class Demo4 {
    public static void main(String[] args) {
        Predicate1<String> predicate= (str) ->str.startsWith("A");
        System.out.println(predicate.test("Abc"));
        System.out.println(predicate.test("xyz"));
    }
}