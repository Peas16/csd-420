/* Paul Fralix Assignment M8 11/30/2025 
*/


import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class PaulThreeThreads extends JFrame {

    private final JTextArea textArea;
    private static final int OUTPUT_COUNT = 10000;

    public PaulThreeThreads() {
        super("Three Threads Output");

        textArea = new JTextArea(30, 80);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        new Thread(new LetterGenerator(), "LetterThread").start();
        new Thread(new DigitGenerator(), "DigitThread").start();
        new Thread(new SymbolGenerator(), "SymbolThread").start();
    }

    class LetterGenerator implements Runnable {
        public void run() {
            Random rand = new Random();
            for (int i = 0; i < OUTPUT_COUNT; i++) {
                char letter = (char) ('a' + rand.nextInt(26));
                appendText(String.valueOf(letter));
            }
        }
    }

    class DigitGenerator implements Runnable {
        public void run() {
            Random rand = new Random();
            for (int i = 0; i < OUTPUT_COUNT; i++) {
                int digit = rand.nextInt(10);
                appendText(String.valueOf(digit));
            }
        }
    }

    class SymbolGenerator implements Runnable {
        private final char[] symbols = {'!', '@', '#', '$', '%', '&', '*'};

        public void run() {
            Random rand = new Random();
            for (int i = 0; i < OUTPUT_COUNT; i++) {
                char symbol = symbols[rand.nextInt(symbols.length)];
                appendText(String.valueOf(symbol));
            }
        }
    }

    private void appendText(String text) {
        SwingUtilities.invokeLater(() -> textArea.append(text));
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PaulThreeThreads::new);
    }
}