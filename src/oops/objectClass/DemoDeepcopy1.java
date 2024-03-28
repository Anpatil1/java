package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class DemoDeepcopy1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        @AllArgsConstructor
        @ToString
        class Employee implements Cloneable{

            String name;
            int salary;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }
        @AllArgsConstructor
        @ToString
        class Company implements Cloneable{
            int companyid;
            String companyname;
            Employee employee;

            @Override
            public Object clone() throws CloneNotSupportedException {
                Company clonedCompany = (Company) super.clone();
                clonedCompany.employee = (Employee) clonedCompany.employee.clone();
                return clonedCompany;
            }
        }
        Employee employee =new Employee("XYZ",60000);
        Company company1 = new Company(1,"Techno",employee);
        Company company2 = (Company) company1.clone();
        company1.employee.salary=70000;
        System.out.println(company1);
        System.out.println(company2);

    }
}
