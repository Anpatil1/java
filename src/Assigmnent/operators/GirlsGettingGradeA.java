package Assigmnent.operators;
//- Assignment - 12
//
//    The total number of students in a class are 90 out of which 45 are boys.
// If 50% of the total students secured grade 'A' out of which 20 are boys,
//then write a program to calculate the total number of girls getting grade 'A'.
public class GirlsGettingGradeA {
    public static void main(String[] args) {
        int total_student = 90;
        int boys = 45;
        int  gradeA_boys = 20;
        double totalgradeApercentage = 50.0;
int totalgradeA = (int) (total_student*totalgradeApercentage)/100;
int girlsgradeA = (totalgradeA - gradeA_boys);
        System.out.println("The girl gradeA  is  "+girlsgradeA);
    }
}
