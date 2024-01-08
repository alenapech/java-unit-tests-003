package org.alenapech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    private MainHW mainHW;
    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @CsvSource({
            "-2147483648, true",
            "0, true",
            "1, false",
            "2, true",
            "2147483647, false"})
    void evenOddNumber(int value, boolean result) {
        assertEquals(result, mainHW.evenOddNumber(value));
    }

    @ParameterizedTest
    @CsvSource({
            "-1, false",
            "0, false",
            "25, false",
            "51, true",
            "100, false"})
    void numberInInterval(int value, boolean result) {
        assertEquals(result, mainHW.numberInInterval(value));
    }
}