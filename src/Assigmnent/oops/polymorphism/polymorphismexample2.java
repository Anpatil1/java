package Assigmnent.oops.polymorphism;
 //2. Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle.
 // Override the speedUp() method in each subclass to increase the vehicle's speed differently.
 class Vehicle {
     private int speed;

     public void speedUp() {
         speed += 10;
     }

     public int getSpeed() {
         return speed;
     }
 }
class Car extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("\nCar speed increased by 22 units.");
    }
}
class Motorcycle extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Motorcycle speed increased by 12 units");
    }
}

public class polymorphismexample2 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + motorcycle.getSpeed());
        car.speedUp();
        motorcycle.speedUp();
        System.out.println("\nCar speed after speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + motorcycle.getSpeed());
    }
}
