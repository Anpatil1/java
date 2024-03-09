package Assigmnent.ClassAndObject;

class AddDistance {
    private int feet;
    private int inches;

    // Constructor to initialize feet and inches
    public AddDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to add two distances
    public AddDistance add(AddDistance other) {
        int newInches = this.inches + other.inches;
        int newFeet = this.feet + other.feet + (newInches / 12);
        newInches %= 12;
        return new AddDistance(newFeet, newInches);
    }

    // Method to display the distance
    public void display() {
        System.out.println("Total Distance: " + feet + " feet " + inches + " inches");
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Creating instances of AddDistance class
        AddDistance distance1 = new AddDistance(5, 8);
        AddDistance distance2 = new AddDistance(3, 10);

        // Adding two distances
        AddDistance totalDistance = distance1.add(distance2);

        // Displaying the total distance
        totalDistance.display();
    }
}
