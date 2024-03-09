package Assigmnent.ClassAndObject;
//- Assignment - 09
//    1. Write a program that would print the information (name, year of joining, salary, address)
//    of three employees by creating a class named 'Employee'.
 class Employee {
    private  String name;
    private  int yearOfJoining;

    private String address;

    public Employee (String name,int yearOfJoining,String address){
        this.name =name;
        this.yearOfJoining=yearOfJoining;
        this.address=address;
    }
    // Method to display the information of the employee
    public void displayInfo() {
        System.out.printf("%-10s%-20s%-20s\n", name, yearOfJoining, address);
    }
}
public  class Main3 {
    public static void main(String[] args) {
        Employee employee1 =new Employee("Robert",1994 ,"64C- WallsStreat");
        Employee employee2 =new Employee("Sam",2000 ,"64D- WallsStreat");
        Employee employee3 =new Employee("John",1999,"268- WallsStreat");

        System.out.printf("%-10s%-20s%-20s\n", "Name", "Year of joining", "Address");

        // Displaying the information of employees
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();

    }
}