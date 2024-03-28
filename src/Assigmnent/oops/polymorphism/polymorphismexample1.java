package Assigmnent.oops.polymorphism;
//1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
// Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
 class Animal {
    public void makeSound(){
        System.out.println(" The Animal Is Make A sound");

    }
}
class  Bird extends Animal{
     @Override
     public void makeSound(){
         System.out.println(" The bird chirps ");

     }

}
class  cat extends Animal{
     @Override
     public void makeSound(){
         System.out.println(" The cat meows ");

     }

}
public class polymorphismexample1{
    public static void main(String[] args) {
        Animal animal =new Animal();
        Bird bird = new Bird();
        cat cat = new cat();

        animal.makeSound();
        bird.makeSound();
        cat.makeSound();

    }

}

