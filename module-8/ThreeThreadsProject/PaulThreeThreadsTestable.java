/* Paul Fralix Assignment M8 11/30/2025 
*/


import java.util.Random;

public class PaulThreeThreadsTestable {

    public static final int OUTPUT_COUNT = 10000;

    public static String generateLetters() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(OUTPUT_COUNT);
        for (int i = 0; i < OUTPUT_COUNT; i++) {
            char letter = (char) ('a' + rand.nextInt(26));
            sb.append(letter);
        }
        return sb.toString();
    }

    public static String generateDigits() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(OUTPUT_COUNT);
        for (int i = 0; i < OUTPUT_COUNT; i++) {
            int digit = rand.nextInt(10);
            sb.append(digit);
        }
        return sb.toString();
    }

    public static String generateSymbols() {
        Random rand = new Random();
        char[] symbols = {'!', '@', '#', '$', '%', '&', '*'};
        StringBuilder sb = new StringBuilder(OUTPUT_COUNT);
        for (int i = 0; i < OUTPUT_COUNT; i++) {
            char symbol = symbols[rand.nextInt(symbols.length)];
            sb.append(symbol);
        }
        return sb.toString();
    }
}

    public static final int OUTPUT_COUNT = 10000;

    public static String generateLetters() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(OUTPUT_COUNT);
        for (int i = 0; i < OUTPUT_COUNT; i++) {
            char letter = (char) ('a' + rand.nextInt(26));
            sb.append(letter);
        }
        return sb.toString();
    }

    public static String generateDigits() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(OUTPUT_COUNT);
        for (int i = 0; i < OUTPUT_COUNT; i++) {
            int digit = rand.nextInt(10);
            sb.append(digit);
        }
        return sb.toString();
    }

    public static String generateSymbols() {
        Random rand = new Random();
        char[] symbols = {'!', '@', '#', '$', '%', '&', '*'};
        StringBuilder sb = new StringBuilder(OUTPUT_COUNT);
        for (int i = 0; i < OUTPUT_COUNT; i++) {
            char symbol = symbols[rand.nextInt(symbols.length)];
            sb.append(symbol);
        }
        return sb.toString();
    }
}