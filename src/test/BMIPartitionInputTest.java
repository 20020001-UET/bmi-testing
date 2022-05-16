package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import source.BMI;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("BMI - Partition Input Testing")
public class BMIPartitionInputTest {

    @Test
    @DisplayName("Test 1 - Valid Input")
    void Test1() {
        assertEquals(3, BMI.BMICalculator(296.0f, 156));
    }

    @Test
    @DisplayName("Test 2 - Invalid height value")
    void Test2() {
        assertEquals(-1, BMI.BMICalculator(296.0f, 320));
    }

    @Test
    @DisplayName("Test 3 - Invalid weight value")
    void Test3() {
        assertEquals(-1, BMI.BMICalculator(-270.0f, 256));
    }
}
