package com.incubyte.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    public void testAddEmptyString() {
        Addition addition = new Addition();
        int result = addition.add("");



    }
}
