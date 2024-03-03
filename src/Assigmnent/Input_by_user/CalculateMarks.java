package Assigmnent.Input_by_user;

import java.util.Scanner;

//If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
// write a program to calculate his total marks and percentage marks
public class CalculateMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Subject1 Marks: ");
        int Subject1 = scanner.nextInt();
        System.out.print("Enter A Subject2 Marks: ");
        int Subject2 = scanner.nextInt();
        System.out.print("Enter A Subject3 Marks: ");
        int Subject3 = scanner.nextInt();

        int total_marks =(Subject1+Subject2+Subject3);
        System.out.println("The total marks is : "+total_marks);
        double percentage =(total_marks/300.0)*100;
        System.out.println("total percentage is : "+percentage);



        System.out.println();

    }
}
