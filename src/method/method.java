package method;
//Calling a method within the same class:
public class method {
    public  static int add1(int number1, int number2)

    {
        return (number1 + number2);
    }

    public int add(int number1, int number2)

    {
        return (number1 + number2);
    }

    public static void main(String[] args) {
        method obj = new method();
        int result = obj.add(12,44);
        ;
        int result1 = add1(12,34);//static method calling
            System.out.println("Result = "+result);
        System.out.println("Result = "+result1);

    }
}