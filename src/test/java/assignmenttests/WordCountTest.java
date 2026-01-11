package assignmenttests;

import org.example.WordCount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountTest {

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
    void testWordCountOutput() {
        WordCount.main(new String[]{});

        String expectedOutput =
                "2" + System.lineSeparator() +
                        "3" + System.lineSeparator();

        String failureMessage = "The output does not match the expected output.\n" +
                "Please ensure your program prints 2 for 'Hello, world!' and 3 for 'Hi... there  friend' (each on a new line).";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
