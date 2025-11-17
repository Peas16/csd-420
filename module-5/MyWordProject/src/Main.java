/*
Paul Fralix 11/16/2025 CSD420 Assignment M5
This program reads a text file containing a collection of words, extracts unique words,
and displays them in both ascending and descending order. 
*/






import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String fileName = "collection_of_words.txt";

        try {
            Set<String> ascending = WordProcessor.getUniqueWords(fileName);

            System.out.println("Ascending Order:");
            for (String word : ascending) {
                System.out.println(word);
            }

            System.out.println("\nDescending Order:");
            Set<String> descending = new TreeSet<>((a, b) -> b.compareTo(a));
            descending.addAll(ascending);
            for (String word : descending) {
                System.out.println(word);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
