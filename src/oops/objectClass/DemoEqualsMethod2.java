package oops.objectClass;

import lombok.AllArgsConstructor;

public class DemoEqualsMethod2 {
    public static void main(String[] args) {

        class Product {
        }
        @AllArgsConstructor
        class Student {
            int id;
            String name;

            @Override
            public boolean equals(Object obj) {
                if ((obj == null )|| (this.getClass() != obj.getClass())) {
                    return false;
                }
                Student student = (Student) obj; //type casting
                return this.id == student.id;
            }
        }

        Student student1 = new Student(1, "abc");
        Student student2 = new Student(2, "abc");
        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//false
        Product product = new Product();
        System.out.println(student1.equals(product));//false
        System.out.println(student1.equals(null));//false

    }
}