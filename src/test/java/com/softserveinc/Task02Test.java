package com.softserveinc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class Task02Test {

    @DisplayName("Test task #02")
    @ParameterizedTest
    @CsvSource({"25, 5000, 1250, 375", "125, 25000, 6250, 1875"})
    void test(int cups, int water, int milk, int beans) {
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ByteArrayInputStream bis = new ByteArrayInputStream(String.valueOf(cups).getBytes());
        System.setOut(new PrintStream(bos));
        System.setIn(bis);

        // action
        Task02.main(null);

        String expected = String.format("Write how many cups of coffee you will need: " +
                ">>> " +
                "For %d cups of coffee you will need: " +
                "%d ml of water " +
                "%d ml of milk " +
                "%d g of coffee beans", cups, water, milk, beans);

        // assertion
        String output = bos.toString();
        assertNotNull(output, "Output should not be null");
        assertFalse(output.isEmpty() || output.isBlank(), "Output should not be blank or empty");
        String actual = Arrays.stream(output.split("\\n")).map(String::trim).collect(Collectors.joining(" "));
        assertEquals(expected, actual);

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
