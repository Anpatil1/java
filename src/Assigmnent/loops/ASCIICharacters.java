package Assigmnent.loops;

public class ASCIICharacters {
    public static void main(String[] args) {
        System.out.println("ASCII values and their equivalent characters:");

        for (int i = 0; i <= 255; i++) {
            char character = (char) i;
            System.out.println("ASCII value: " + i + ", Character: " + character);
        }
    }
}
