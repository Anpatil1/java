package oops.objectClass;

import java.lang.reflect.Method;

public class DemoGetClassMethod {
    public static void main(String[] args) {
        class Student{
            void m1(){

            }
        }
        Student student = new Student();
        Class ref = student.getClass();
        for(Method method : ref.getMethods()){
            System.out.println(method.getName());
        }
        System.out.println(student.getClass());
    }
}
