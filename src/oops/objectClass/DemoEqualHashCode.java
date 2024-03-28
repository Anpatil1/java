package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.Objects;

public class DemoEqualHashCode {
    public static void main(String[] args) {

        @AllArgsConstructor
        //@EqualsAndHashCode
        class Student {
            int id;
            String name;

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return id == student.id;
            }

            @Override
            public int hashCode() {
                return Objects.hash(id);
            }
        }

        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");

        System.out.println(student1.equals(student2));//true
        System.out.println(student1.hashCode() == student2.hashCode());//false

    }
}