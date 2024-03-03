package Assigmnent.operators;
//- Assignment - 05

//    Write a program to check if the two numbers 23 and 45 are equal.
public class eqaliity_check {
    public static void main(String[] args)

    {
        int num1 = 23;
        int num2 = 45;
        System.out.println((num1==num2)? "These  Number Are Equal":"These  Number Are Not Equal");
A.main(args);
B.main(args);
C.main(args);
    }
}
//- Assignment - 06
//
//    Write a program to print the power of 7 raised to 5.
class A{
    public static void main(String[] args) {
        double result = Math.pow(7,5);
        System.out.println("The power of 7 raised to 5 is = "+result);

    }
}
class B{
    public static void main(String[] args) {
        int a = 55;
        int b = 70;
        boolean bothcondtions = (a < 50) && (a < b) ? true:false;
        boolean condition = (a < 50) || (a < b) ? true:false;
        System.out.println(" The given condition is "+bothcondtions);
        System.out.println( " The codition is "+condition);
    }
}
class C{
    //If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
    //write a program to calculate his total marks and percentage marks.
    public static void main(String[] args) {
        int sub1= 78;
        int sub2= 45;
        int sub3= 62;
double total_marks = sub1+sub2+sub3 ;
double max_marks = 100*3;
double percentage = (double)( total_marks / max_marks *100 );
        System.out.println("The total marks is:"+total_marks);
        System.out.println("The Percentage is:"+percentage);
    }
}