package assignmenttests;

import org.example.CountVowels;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountVowelsTest {

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
    void testVowelCountOutput() {
        CountVowels.main(new String[]{});

        String expectedOutput = "6" + System.lineSeparator();
        String failureMessage = "The output does not match the expected output.\n" +
                "Please ensure your program prints the number of vowels in 'documentation' followed by a newline.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
