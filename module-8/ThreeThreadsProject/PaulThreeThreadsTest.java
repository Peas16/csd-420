/* Paul Fralix Assignment M8 11/30/2025 
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PaulThreeThreadsTest {

    @Test
    void testLetterGeneratorLength() {
        String letters = PaulThreeThreadsTestable.generateLetters();
        assertEquals(10000, letters.length(), "Letter output should be 10,000 characters long");
    }

    @Test
    void testDigitGeneratorLength() {
        String digits = PaulThreeThreadsTestable.generateDigits();
        assertEquals(10000, digits.length(), "Digit output should be 10,000 characters long");
    }

    @Test
    void testSymbolGeneratorLength() {
        String symbols = PaulThreeThreadsTestable.generateSymbols();
        assertEquals(10000, symbols.length(), "Symbol output should be 10,000 characters long");
    }

    @Test
    void testDigitsContainOnlyNumbers() {
        String digits = PaulThreeThreadsTestable.generateDigits();
        assertTrue(digits.matches("[0-9]+"), "Digits output should only contain numbers");
    }

    @Test
    void testLettersContainOnlyLowercase() {
        String letters = PaulThreeThreadsTestable.generateLetters();
        assertTrue(letters.matches("[a-z]+"), "Letters output should only contain lowercase letters");
    }

    @Test
    void testSymbolsContainOnlyAllowedChars() {
        String symbols = PaulThreeThreadsTestable.generateSymbols();
        assertTrue(symbols.matches("[!@#$%&*]+"), "Symbols output should only contain allowed symbols");
    }
}
