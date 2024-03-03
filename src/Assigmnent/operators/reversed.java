package Assigmnent.operators;

public class reversed {
    public static void main(String[] args) {
        int num =123;
        int first_digit =(num/100)%10;
        int second_digit =(num/10)%10;
        int third_digit =(num%10);
        int newnumber = third_digit*100+second_digit*10+first_digit;
        System.out.println("the original number is ="+num);//123
        System.out.println("the reverse number is ="+newnumber);//321


    }
}
