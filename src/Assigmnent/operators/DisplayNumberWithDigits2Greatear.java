package Assigmnent.operators;
//- Assignment - 14
//
//    Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
//
//    For example, if the number which was taken is 5696, then the displayed number should be 7818.
public class DisplayNumberWithDigits2Greatear {
    public static void main(String[] args) {
        int number =2234;
        int firstDigit= (number/1000 +2 )%10;
        int secondDigit= (number/100 +2)%10;
        int thirdDigit= (number/10 % 10 +2)%10;
        int fourthDigit= (number%10 +2 ) %10;
        int sum_ofDigits= firstDigit+secondDigit+thirdDigit+fourthDigit;
        int newnumber = firstDigit*1000 + secondDigit*100 + thirdDigit*10 + fourthDigit;
        System.out.println("the original number is ="+number);
        System.out.println("the new number is ="+newnumber);
        System.out.println("sum of digit is ="+sum_ofDigits);
//reversed

    }
}


