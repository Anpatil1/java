package constructor;

public class Person {
    int id;
    String name;

    // Zero-parameterized constructor
    Person() {
        id = 101;
        name = "abc";
        System.out.println("zero param constructor");
    }

    // Parameterized constructor with id and name parameters
    Person(int id, String name) {
        // Assigning values from parameters to instance variables
        this.id = id;
        this.name = name;
    }

    // Copy constructor to create a new Person object from an existing Person object
    Person(Person oldPerson){
        // Assigning values of oldPerson's instance variables to this object's instance variables
        this.id = oldPerson.id;
        this.name= oldPerson.name;
    }

    public static void main(String[] args) {
        // Creating Person objects using different constructors
        Person person1 = new Person(1, "Raju");
        Person person2 = new Person(2,"Don");
        Person person3 = new Person(3,"Saheb");
        Person person4 = new Person(4, "Nete");
        Person person5 = new Person(5,"Tatya");

        // Creating a new Person object using the copy constructor
        Person person6 = new Person(person1);
    }
}
