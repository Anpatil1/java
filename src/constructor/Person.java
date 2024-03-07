package constructor;

public class Person {
    int id;
    String name;

    Person() {
        id = 101;
        name = "abc";
        System.out.println("zero param constructor");
    }

    Person(int id, String name) {
        //local variables to instance variable
        this.id = id;
        this.name = name;
    }
    Person(Person oldPerson){
        this.id = oldPerson.id;
        this.name= oldPerson.name;
    }

    public static void main(String[] args) {
        Person person1 = new Person(1, "Raju");
        Person person2 = new Person(2,"Don");
        Person person3 = new Person(3,"Saheb");
        Person person4 = new Person(4, "Nete");
        Person person5 = new Person(5,"Tatya");

        Person person6 = new Person(person1);
    }
}