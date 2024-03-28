package oops.java8feature.lambdaExpression.Functional;

import java.util.function.BiFunction;
import java.util.function.Function;

class Person {
    private String name1;

    public Person(String name1) {
        this.name1 = name1;
    }

    public String getName() {
        return name1;
    }
}
public class AdditionIMp {
    public AdditionIMp(int num1 ,int num2){
        System.out.println(num1*num2);}
    public static int  add1(int num1, int num2){
        return num1 +num2;
    }

    public  int  add2(int num1, int num2){
        return num1 +num2;
    }

    public static void main(String[] args) {
        AdditionIMp additionIMp1 = new AdditionIMp(4,5);
       // using Lambda
        BiFunction<Integer,Integer,Integer>biFunctionLambda=(a,b)->AdditionIMp.add1(a,b);
        System.out.println(biFunctionLambda.apply(10,12));
      //  using  method  reference
        BiFunction<Integer,Integer,Integer>biFunctionLambdaM =AdditionIMp::add1;//static className::Object
        System.out.println(biFunctionLambdaM.apply(11,12));
        BiFunction<Integer,Integer,Integer>biFunctionLambdaM2 =additionIMp1::add2;//instance Ref variable::object
        System.out.println(biFunctionLambdaM2.apply(11,12));

       // Using constructor reference
        Function<String, Person> personFactory = Person::new;

        // Creating a new Person object using constructor reference
        Person person = personFactory.apply("John");

        // Printing the name of the created Person object
        System.out.println("Name: " + person.getName());
    }
}
