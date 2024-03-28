package Assigmnent.strings;

public class WordCount {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split(" ");
        int wordCount = 0;

        for (String word : words) {
            if (!word.trim().isEmpty()) {
                wordCount++;
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String inputString = "Java Program to Count Number of Words in Given String";
        int wordCount = countWords(inputString);
        System.out.println("Number of words in the string: " + wordCount);

    }
}
