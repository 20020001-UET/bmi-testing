package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import source.BMI;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("BMI - Boundary Value Testing")
public class BMIBoundaryValueTest {

    @Test
    @DisplayName("Test 1 - (Nom, Nom)")
    void Test01() {
        assertEquals(3, BMI.BMICalculator(300.0f, 140));
    }

    @Test
    @DisplayName("Test 2 - (Nom, Min-)")
    void Test02() {
        assertEquals(-1, BMI.BMICalculator(300.0f, 0));
    }

    @Test
    @DisplayName("Test 3 - (Nom, Min)")
    void Test03() {
        assertEquals(3, BMI.BMICalculator(300.0f, 1));
    }

    @Test
    @DisplayName("Test 4 - (Nom, Min+)")
    void Test04() {
        assertEquals(3, BMI.BMICalculator(300.0f, 2));
    }

    @Test
    @DisplayName("Test 5 - (Nom, Max-)")
    void Test05() {
        assertEquals(3, BMI.BMICalculator(300.0f, 279));
    }

    @Test
    @DisplayName("Test 6 - (Nom, Max)")
    void Test06() {
        assertEquals(3, BMI.BMICalculator(300.0f, 280));
    }

    @Test
    @DisplayName("Test 7 - (Nom, Max+)")
    void Test07() {
        assertEquals(-1, BMI.BMICalculator(300.0f, 281));
    }

    @Test
    @DisplayName("Test 8 - (Min-, Nom)")
    void Test08() {
        assertEquals(-1, BMI.BMICalculator(0.0f, 140));
    }

    @Test
    @DisplayName("Test 9 - (Min, Nom)")
    void Test09() {
        assertEquals(0, BMI.BMICalculator(0.1f, 140));
    }

    @Test
    @DisplayName("Test 10 - (Min+, Nom)")
    void Test10() {
        assertEquals(0, BMI.BMICalculator(0.2f, 140));
    }

    @Test
    @DisplayName("Test 11 - (Max-, Nom)")
    void Test11() {
        assertEquals(3, BMI.BMICalculator(599.9f, 140));
    }

    @Test
    @DisplayName("Test 12 - (Max, Nom)")
    void Test12() {
        assertEquals(3, BMI.BMICalculator(600.0f, 140));
    }

    @Test
    @DisplayName("Test 13 - (Max+, Nom)")
    void Test13() {
        assertEquals(-1, BMI.BMICalculator(601.0f, 140));
    }
}
