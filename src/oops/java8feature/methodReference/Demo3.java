package oops.java8feature.methodReference;

interface Number1 {
    void add(int number1, int number2);
}
public class Demo3 {
    public static void main(String[] args) {

        //1. lambda expression
//        Number lambda = (number1, number2) -> System.out.println(number1 + number2);
//        lambda.add(1002, 2000);


        //2. method reference : constructor
        Number1 methodRef = Demo3::new;
        methodRef.add(500, 900);


    }

    public Demo3(int number1, int number2) {
        System.out.println(number1 + number2);
    }
}