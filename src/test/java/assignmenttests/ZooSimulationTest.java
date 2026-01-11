package assignmenttests;

import org.example.ZooSimulation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooSimulationTest {

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
    void testZooSimulationOutput() {
        ZooSimulation.main(new String[]{});

        String ls = System.lineSeparator();
        String expectedOutput =
                "[Lion] Name: Simba, Age: 5, Diet: Carnivore" + ls +
                        "Simba the Lion is eating meat." + ls +
                        "Simba the Lion roars!" + ls +
                        "Simba is sleeping... Zzz" + ls +
                        "----" + ls +
                        "[Elephant] Name: Dumbo, Age: 12, Trait: Strong" + ls +
                        "Dumbo the Elephant is eating grass and fruits." + ls +
                        "Dumbo the Elephant trumpets!" + ls +
                        "Dumbo is sleeping... Zzz" + ls +
                        "----" + ls +
                        "[Parrot] Name: Kiwi, Age: 2, Color: Green" + ls +
                        "Kiwi the Parrot is eating seeds." + ls +
                        "Kiwi the Parrot says: 'Hello!'" + ls +
                        "Kiwi is sleeping... Zzz" + ls +
                        "----" + ls +
                        "[Eagle] Name: Sky, Age: 4, Vision: Sharp" + ls +
                        "Sky the Eagle is eating fish." + ls +
                        "Sky the Eagle screeches!" + ls +
                        "Sky is sleeping... Zzz" + ls +
                        "----" + ls;

        String failureMessage = "The output does not match the expected output.\n" +
                "Please ensure your Zoo simulation prints exactly the expected animal information and behaviors, line by line.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
