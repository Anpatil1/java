package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class DemoCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @ToString
        class Student implements Cloneable {
            int id;
            String name;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Student student1 = new Student(1, "XYZ");

        // Reference copy - student2 now refers to the same object as student1
        Student student2 = student1;

        // Cloning student1 to create a new object student3
        Student student3 = (Student) student1.clone();

        // Printing details and hash codes of all three students
        System.out.println(student1 + "\t" + student1.hashCode());
        System.out.println(student2 + "\t" + student2.hashCode());
        System.out.println(student3 + "\t" + student3.hashCode());
    }
}
