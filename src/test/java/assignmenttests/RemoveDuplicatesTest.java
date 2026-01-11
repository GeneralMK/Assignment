package assignmenttests;

import org.example.RemoveDuplicates;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testRemoveDuplicatesOutput() {
        RemoveDuplicates.main(new String[]{});

        String expectedOutput = "[A, B, C]" + System.lineSeparator();
        String failureMessage = "The output does not match the expected output.\n" +
                "Please ensure your program prints the ArrayList with duplicates removed (preserving order), followed by a newline.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
