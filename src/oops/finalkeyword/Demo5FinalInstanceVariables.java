package oops.finalkeyword;

public class Demo5FinalInstanceVariables {
    public static void main(String[] args) {
        class Student {
            final int id;
            final String name;
            //Student(){}//CTE

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }

        Student student1 = new Student(1, "Raj");
        Student student2 = new Student(1, "Raj");


       /* student1.id = 101;
        student1.name= "abc";

        student2.id = 102;
        student2.name= "xyz";
*/

    }
}