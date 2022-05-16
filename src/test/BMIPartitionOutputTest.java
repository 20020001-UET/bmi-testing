package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import source.BMI;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("BMI - Partition Output Testing")
public class BMIPartitionOutputTest {

    @Test
    @DisplayName("Test 1 - Invalid Input (-1)")
    void Test1() {
        assertEquals(-1, BMI.BMICalculator(700.0f, -100));
    }

    @Test
    @DisplayName("Test 2 - Underweight (0)")
    void Test2() {
        assertEquals(0, BMI.BMICalculator(17.0f, 100));
    }

    @Test
    @DisplayName("Test 3 - Normal (1)")
    void Test3() {
        assertEquals(1, BMI.BMICalculator(18.5f, 100));
    }

    @Test
    @DisplayName("Test 4 - Overweight (2)")
    void Test4() {
        assertEquals(2, BMI.BMICalculator(25.0f, 100));
    }

    @Test
    @DisplayName("Test 5 - Obese (3)")
    void Test5() {
        assertEquals(3, BMI.BMICalculator(30.0f, 100));
    }
}
