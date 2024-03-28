package oops.finalkeyword;

public class FinalVariable {


    public static void main(String[] args) {
        final int numberOfProducts = 100;
        // numberOfProducts = 299;
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }

        final Student s1 = new Student(1, "abc");
        // s1 = new Student(2, "xyz");
        // reference final
        s1.id = 100;
        s1.name = "Rohit";
        System.out.println(s1.id + "\t" + s1.name);
    }

}