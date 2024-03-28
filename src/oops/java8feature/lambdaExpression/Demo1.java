package oops.java8feature.lambdaExpression;




        interface NumberProcessor {
            int process(int number);
        }
public class Demo1 {
    public static void main(String[] args) {
        NumberProcessor numberProcessor = number -> number * number;
        System.out.println(numberProcessor.process(10));
    }
}
