package Assigmnent.Methods;

import java.util.Scanner;

//- **Assignment - 03**
//
//    A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter A  Age");
        int age = scanner.nextInt();
        if(isEligibletovote(age)){
            System.out.println("You Are Eligible To Vote");
        }else
        {
            System.out.println("You Are  Not Eligible To Vote");
        }

    }
    public static boolean isEligibletovote(int age){
        return age >= 18;
    }

}
