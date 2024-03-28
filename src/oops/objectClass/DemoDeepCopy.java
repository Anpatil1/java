package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class DemoDeepCopy {
    public static void main(String[] args)throws CloneNotSupportedException {
        @AllArgsConstructor
        @ToString
        class Address implements Cloneable{

            String city;
            String country;
            int pincode;
            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }
        @AllArgsConstructor
        @ToString
        class Student implements Cloneable{
            int  id;
            String name;
            Address address;

            @Override
            public Object clone() throws CloneNotSupportedException {
                Student studentclonedObject=(Student) super.clone();
                Address address=(Address) studentclonedObject.address.clone();
                studentclonedObject.address =address;

                return studentclonedObject;
            }

        }
        Address address =new Address("Kolhapur","India",416214);

        Student student1 = new Student(1, "XYZ",address);
        Student student2 = (Student)student1.clone();


        student1.address.city="mumbai";
        student1.address.pincode=123456;
        System.out.println(student1);
        System.out.println(student2);
    }
}
