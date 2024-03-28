package Assigmnent.oops.polymorphism;
//7. Write a Java program to create a base class Animal with methods move() and makeSound().
// Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves.
// Also, override the makeSound() method in each subclass to make a specific sound for each animal.


class Animal1 {
    public void move(){
        System.out.println("Animal moves");
    }
    public void makeSound(){

        System.out.println("Animal makes a sound");
    }

}
class Bird1 extends Animal1{
    @Override
    public void move(){
        System.out.println("Bird flies");
    }
    @Override
    public void makeSound(){

        System.out.println("Bird chirps");
    }

}

class Panthera extends Animal1{
    @Override
    public void move(){
        System.out.println("Panthera Walk");
    }
    @Override
    public void makeSound(){

        System.out.println("Panthera roars");
    }

}
public class polymorphismexample6 {
    public static void main(String[] args) {

        Bird1 bird = new Bird1();
        Panthera panthera = new Panthera();

        performAction(bird);
        performAction(panthera);

    }

    public static void performAction(Animal1 animal) {
        animal.move();
        animal.makeSound();
    }
}