package Array;

public class checkingCharOrInt {
    public static void main(String[] args) {
        char array[]={'a','b','c','d','e'};
        System.out.println("Contains digits: " + containsDigits(array));

        }
    public static boolean containsDigits(char[] array) {
        for (char c : array) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;

    }
}
