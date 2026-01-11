package assignmenttests;

import org.example.AnagramCheck;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramCheckTest {

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
    void testAnagramOutput() {
        AnagramCheck.main(new String[]{});

        String expectedOutput =
                "true" + System.lineSeparator() +
                        "false" + System.lineSeparator();

        String failureMessage = "The output does not match the expected output.\n" +
                "Please ensure your program prints true for 'listen'/'silent' and false for 'hello'/'world' (each on a new line).";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

}
