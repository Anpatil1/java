package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class DemoShallowcopy1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        @AllArgsConstructor
        @ToString
        class Employee implements Cloneable{

            String name;
            int salary;


        }
        @AllArgsConstructor
        @ToString
        class Company implements Cloneable{
            int companyid;
            String companyname;
            Employee employee;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return  super.clone();


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
