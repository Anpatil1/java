package operators;
public class Conditional_ternary_operator {

            public static void main(String[] args) {
        int number1 = 199;
        int number2 = 19888;
        int number3 = 99;
System.out.println(number1> number2 && number1> number3? number1
: number2 > number1 && number2 > number3 ? number2: number3);
}
}
