package Assigmnent.operators;
//- Write a program to add 8 to the number 2345 and then divide it by 3.
//- Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
//- Display the final result.
public class operator_assignmentno3 {
    public static void main(String[] args) {
        int number = 2345;
        number +=8;
        System.out.println("addition is ="+number);
        number /=3;
        System.out.println("divide is ="+number);
        number %=5;
        System.out.println(" is Quotient  ="+number);
        number *=5;
        System.out.println(" the result is :" +number);
    }
}
