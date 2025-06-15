package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAppNameProperty() {
        String expected = "My Maven Application";
        String actual = System.getProperty("app.name", expected);
        assertEquals(expected, actual);
    }
}

