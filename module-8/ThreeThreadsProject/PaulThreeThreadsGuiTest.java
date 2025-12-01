/* Paul Fralix Assignment M8 11/30/2025 
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javax.swing.*;

public class PaulThreeThreadsGuiTest {

    @Test
    void testGuiThreadsProduceOutput() throws Exception {
        SwingUtilities.invokeAndWait(PaulThreeThreads::new);

        Thread.sleep(6000); // adjust if needed

        PaulThreeThreads gui = (PaulThreeThreads) JFrame.getFrames()[0];
        String output = gui.getTextArea().getText();

        assertTrue(output.length() >= 30000, "GUI should contain at least 30,000 characters");
        assertTrue(output.matches(".*[a-z].*"), "Output should contain letters");
        assertTrue(output.matches(".*[0-9].*"), "Output should contain digits");
        assertTrue(output.matches(".*[!@#$%&*].*"), "Output should contain symbols");
    }
}