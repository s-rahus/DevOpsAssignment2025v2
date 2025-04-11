package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testMainMethod() {
        // Create a custom output stream to capture the printed output
        final java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        // Call the main method
        App.main(new String[]{});

        // Get the output and verify the expected result
        String output = outputStream.toString().trim();
        assertEquals("Hello, Maven!", output, "The output should be 'Hello, Maven!'");
    }
}
