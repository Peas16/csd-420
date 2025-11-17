/*
Paul Fralix 11/16/2025 CSD420 Assignment M5
WordProcessorTest.java
This class tests the WordProcessor class for correct functionality.
*/





import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WordProcessorTest {

    @Test
    public void testUniqueWordsExtraction() throws IOException {
        String testFile = "collection_of_words.txt";
        Set<String> words = WordProcessor.getUniqueWords(testFile);

        assertNotNull(words);
        assertTrue(words.contains("apple"));
        assertTrue(words.contains("banana"));
        assertTrue(words.contains("orange"));
        assertTrue(words.contains("kiwi"));
        assertTrue(words.contains("grape"));

        // Ensure duplicates removed
        assertEquals(5, words.size());
    }

    @Test
    public void testAscendingOrder() throws IOException {
        String testFile = "collection_of_words.txt";
        Set<String> words = WordProcessor.getUniqueWords(testFile);

        String first = words.iterator().next();  // smallest
        assertEquals("apple", first);
    }
}
