package oops.java8feature.methodReference;

interface Number {
    int add(int number1, int number2);
}
public class add {
    public static void main(String[] args) {

        //1. lambda expression
        Number lambda = (number1, number2) -> number1 + number2;
        System.out.println(lambda.add(100, 200));

        Number methodRef = add::addTwoNumbers;
        System.out.println(methodRef.add(100,200));


    }

    public static int addTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }
}
