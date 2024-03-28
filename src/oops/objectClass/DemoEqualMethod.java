package oops.objectClass;

public class DemoEqualMethod {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;
            Student(int id,String name){
                this.id=id;
                this.name=name;
            }

        }
        int a=100;

        int b =100;
        System.out.println(a==b);//true



        Student student1= new Student(1,"abc");
        Student student2= new Student(1,"abc");
        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//false
    }
}
