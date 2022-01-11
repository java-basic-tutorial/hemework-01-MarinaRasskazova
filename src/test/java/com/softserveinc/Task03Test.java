package com.softserveinc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class Task03Test {

    PrintStream originalOut;
    InputStream originalIn;

    ByteArrayOutputStream bos;

    @BeforeEach
    void setup() {
        originalOut = System.out;
        originalIn = System.in;
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
    }

    @DisplayName("Test task #03")
    @ParameterizedTest
    @CsvSource({" 300,  65, 100,  1, 'Yes, I can make that amount of coffee'",
                " 500, 250, 200, 10, 'No, I can make only 2 cup(s) of coffee'",
                "1550, 299, 300,  3, 'Yes, I can make that amount of coffee (and even 2 more than that)'",
               "    0,   0,   0,  1, 'No, I can make only 0 cup(s) of coffee'",
               "    0,   0,   0,  0, 'Yes, I can make that amount of coffee'",
               "  250,  50,  15,  0, 'Yes, I can make that amount of coffee (and even 1 more than that)'"})
    void test(int water, int milk, int beans, int cups, String message) {
        String input = String.format("%d\n%d\n%d\n%d\n", water, milk, beans, cups);
        ByteArrayInputStream bis = new ByteArrayInputStream(input.getBytes());
        System.setIn(bis);

        // action
        Task03.main(null);

        String expected = String.format("Write how many ml of water the coffee machine has:\n" +
                ">>> " +
                "Write how many ml of milk the coffee machine has:\n" +
                ">>> " +
                "Write how many grams of coffee beans the coffee machine has:\n" +
                ">>> " +
                "Write how many cups of coffee you will need:\n" +
                ">>> " +
                "%s", message);

        // assertion
        String output = bos.toString();
        assertNotNull(output, "Output should not be null");
        assertFalse(output.isEmpty(), "Output should not be blank or empty");
        String actual = Arrays.stream(output.split("\\n")).map(String::trim).collect(Collectors.joining("\n"));
        assertEquals(expected, actual);
    }

    @AfterEach
    void tearDown() {
        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);

        bos = null;
    }
}
