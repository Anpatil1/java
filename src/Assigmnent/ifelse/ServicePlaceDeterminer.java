package Assigmnent.ifelse;

import java.util.Scanner;


//- Assignment - 12
//    1. Ask user to enter age, gender ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
//    2. if employee is female, then she will work only in urban areas.
//    3. if employee is a male and age is in between 20 to 40 then he may work in anywhere
//    4. if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//    5. And any other input of age should print "ERROR".
public class ServicePlaceDeterminer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a age ");
        int age = scanner.nextInt();
        System.out.println("Enter a gender ( M or F )");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter a marital status ( Y or N ) ");
        char maritalStatus = scanner.next().charAt(0);
        // Determine place of service
        String placeOfService;

        if (gender == 'F' || gender == 'f' )  {
            placeOfService = "Urban areas";
        } else if (gender == 'M' || gender == 'm') {
            if (age >= 20 && age <= 40 ) {
                placeOfService = "Work in anywhere";
            } else if ((age > 40 && age <= 60) ) {
                placeOfService = "urban areas";
            } else {
                placeOfService = "ERROR";
            }
        }else {
                placeOfService = "ERROR";
            }

            System.out.println("Place of service: " +placeOfService);
    }
}