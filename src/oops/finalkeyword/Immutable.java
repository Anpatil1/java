package oops.finalkeyword;


import lombok.Getter;

public class Immutable {

    public static void main(String[] args) {
        @Getter
        class Student {
            private final int id;
            private final String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            // No setters, as the class is immutable
        }

        Student student = new Student(1, "xyz");
        System.out.println(student.getId() + " " + student.getName());
    }
}
