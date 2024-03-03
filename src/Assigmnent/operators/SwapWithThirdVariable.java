package Assigmnent.operators;

public class SwapWithThirdVariable {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println("Before Swapping: ");
        System.out.println("a = " + a);
        System.out.println("b =" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b =" + b);
        //System.out.println( +c);
        SwapWithoutThirdVariable.main(args);
    }

}
class SwapWithoutThirdVariable{

public static void main(String[] args) {
    int a = 6;
    int b = 8;
    System.out.println("Before Swapping: ");
    System.out.println("a = " + a);
    System.out.println("b =" + b);

     a = a + b;
     b = a - b;
     a = a - b;
    System.out.println("After  Swapping: ");
    System.out.println("a = " + a);
    System.out.println("b = " + b);


}
        }
