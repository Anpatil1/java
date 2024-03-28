package Assigmnent.strings;

public class SubstringOccurrences {
    public static void main(String[] args) {
        String mainString = "Java is a programming language. Java is used for developing various applications. Java is widely used.";
        String subString = "Java is";
        int occurrences = countSubstringOccurrences(mainString, subString);
        System.out.println("Number of occurrences of \"" + subString + "\" in the given string: " + occurrences);
    }

    public static int countSubstringOccurrences(String mainString, String subString) {
        if (mainString == null || mainString.isEmpty() || subString == null || subString.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = mainString.indexOf(subString);

        // Count occurrences while substring is found
        while (index != -1) {
            count++;
            // Move index to the next position after the current occurrence
            index = mainString.indexOf(subString, index + 1);
        }

        return count;
    }
}
