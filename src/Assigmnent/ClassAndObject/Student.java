package Assigmnent.ClassAndObject;
//- **Assignment - 02**
//    1. Create a class named '**Student**' with String variable '**name**' and integer variable 'rollNumber'.
//        1. Assign the value of rollNumber as '2' and that of name as "John" by creating an object of
//        the class Student.
//    2. Assign and print the roll number, name of two students having names "Sam" and "John" respectively by
//    creating two objects of class 'Student'.
public class Student {
    String name;
    int rollNumber;
    public Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;

    }

public static void main(String[] args) {

    Student john =new  Student("john",2);
    Student sam = new Student("sam",1);
    System.out.println("Details of sam :");
    System.out.println("Name : "+sam.name);
    System.out.println("Roll Number: " + sam.rollNumber);
    System.out.println();
    System.out.println("Details of john :");
    System.out.println("Name : "+john.name);
    System.out.println("Roll Number: " + john.rollNumber);
}
}

