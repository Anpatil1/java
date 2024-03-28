package oops.java8feature;



        @FunctionalInterface
        interface NumberProcessor1 {
            int process(int number);
        }

        //1. traditional way
        class Square1 implements NumberProcessor1 {
            @Override
            public int process(int number) {
                return number * number;
            }
        }
public class Demo4 {
    public static void main(String[] args) {
        NumberProcessor1 square1 = new Square1();
        System.out.println(square1.process(20));

        //2. anonymous class
        NumberProcessor1 cube = new NumberProcessor1() {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        };
        System.out.println(cube.process(20));

        //3. lambda expression
        NumberProcessor lambda = (int number) -> number * number * number * number;
        System.out.println(lambda.process(20));


    }
}