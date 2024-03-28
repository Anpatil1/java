package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class DemoShallowCopy {
    public static void main(String[] args)throws CloneNotSupportedException {
        @AllArgsConstructor
        @ToString
        class Address implements Cloneable{

            String city;
            String country;
            int pincode;
        }
        @AllArgsConstructor
        @ToString
        class Student implements Cloneable{
            int  id;
            String name;
            Address address;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

        }
        Address address =new Address("Kolhapur","India",416214);

        Student student1 = new Student(1, "XYZ",address);
        Student student2 = (Student)student1.clone();


        System.out.println(student1 + "\t" + student1.hashCode());
        System.out.println(student2 + "\t" + student2.hashCode());


        System.out.println("Address  Object Of  student1"  +student1.address.hashCode());
        System.out.println("Address  Object Of  student2"  +student2.address.hashCode());


        student1.address.city="mumbai";
        System.out.println(student1);
        System.out.println(student2);
    }
}
