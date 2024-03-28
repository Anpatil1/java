package oops.java8feature.methodReference;

import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args) {
        Predicate<Integer> isPrime =(number)->{
            for (int i = 2; i <=number /2 ; i++) {
                if (number %i == 0) {
                    return false;
                }

            }
            return true;
        };
        System.out.println(isPrime.test(19));
        System.out.println(isPrime.test(20));
    }
}
