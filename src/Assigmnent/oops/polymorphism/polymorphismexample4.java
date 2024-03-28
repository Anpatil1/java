package Assigmnent.oops.polymorphism;
//4. Write a Java program to create a class Employee with a method called calculateSalary().
// Create two subclasses Manager and Programmer. In each subclass,
// override the calculateSalary() method to calculate and return the salary based on their specific roles

import lombok.Getter;

@Getter
class Employee{
   private  String name;
   private  String role;

    public  Employee( String name,String role){
        this.name=name;
        this.role=role;
    }


    public double calculateSalary() {
        return 0.0;
    }
}
class  Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }


    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

}
class  Programmer extends Employee {
    private double baseSalary;
    private double oveertimepay;

    public Programmer(String name, double baseSalary, double oveertimepay) {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.oveertimepay = oveertimepay;
    }


    @Override
    public double calculateSalary() {
        return baseSalary + oveertimepay;
    }

}
public class polymorphismexample4 {
    public static void main(String[] args) {
        Employee emp1 = new Manager("ABC",75000,10000);
        Employee emp2 = new Programmer("XYZ",45000,5000);
        System.out.println("Manager:"+ emp1.getName()+ "\nRole: " + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());
        System.out.println("Programmer:"+ emp2.getName()+"\nRole:"+ emp1.getRole() +"\nSalary: $"+ emp2.calculateSalary());
    }

}
