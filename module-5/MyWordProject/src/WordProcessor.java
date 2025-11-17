/*
Paul Fralix 11/16/2025 CSD420 Assignment M5
This class reads a text file, extracts unique words, and returns them in ascending order.
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

public class WordProcessor {

    // Reads file, extracts unique words, returns them in ascending order
    public static Set<String> getUniqueWords(String fileName) throws IOException {
        String content = Files.readString(Paths.get(fileName));

        // Normalize by converting to lowercase and splitting on non-letters
        String[] words = content.toLowerCase().split("[^a-zA-Z]+");

        Set<String> uniqueWords = new TreeSet<>();

        for (String word : words) {
            if (!word.isBlank()) {
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }
}
