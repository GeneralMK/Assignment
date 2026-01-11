package assignmenttests;

import org.example.FilterAStrings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterAStringsTest {


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
    void testFilterAStringsOutput() {
        FilterAStrings.main(new String[]{});

        String expectedOutput = "[apple, ant, axe]" + System.lineSeparator();
        String failureMessage = "The output does not match the expected output.\n" +
                "Please ensure your program prints only the strings starting with 'A' in lower case, as a list, followed by a newline.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
