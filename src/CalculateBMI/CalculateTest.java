package CalculateBMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void bmi() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }
}