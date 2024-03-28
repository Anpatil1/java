package oops.objectClass;

import lombok.AllArgsConstructor;

import java.util.Objects;

public class DemoEqualsMethod1 {

        @AllArgsConstructor
       static class Student {
            int id;
            String name;

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                Student student = (Student) obj;
                return id == student.id && Objects.equals(name, student.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(id, name);
            }

            class Product{

        }
            public static void main(String[] args) {
        Student student1= new Student(1,"abc");
        Student student2= new Student(1,"abc");
        //false
        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));//true
        // System.out.println(student1.equals(null));//NPE
        System.out.println(student1.equals(null));//false
        System.out.println(student1.equals(student1));//true
       // Product product = new Product();
      // System.out.println(student1.equals(product));//NPE
    }
}
}