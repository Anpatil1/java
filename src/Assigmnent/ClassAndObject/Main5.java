package Assigmnent.ClassAndObject;

class Employee1 {
    private double salary;
    private int hoursOfWorkPerDay;

    // Method to set employee information (salary and hours of work per day)
    public void setEmployeeInformation(double salary, int hoursOfWorkPerDay) {
        this.salary = salary;
        this.hoursOfWorkPerDay = hoursOfWorkPerDay;
    }

    // Method to add $10 to salary if it's less than $500
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    // Method to add $5 to salary if the number of hours of work per day is more than 6 hours
    public void addWork() {
        if (hoursOfWorkPerDay > 6) {
            salary += 5;
        }
    }

    // Method to display the final salary
    public void displayFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Creating an instance of Employee class
        Employee1 employee = new Employee1();

        // Setting employee information
        employee.setEmployeeInformation(450, 8);

        // Adding salary based on conditions
        employee.addSal();
        employee.addWork();

        // Displaying the final salary
        employee.displayFinalSalary();
    }
}

