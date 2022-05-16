import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import source.BMI;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @Test
    @DisplayName("Partition Input Testing")
    void BMICalculatorPartitionInputTesting() {
        assertAll(
                () -> assertEquals(3, BMI.BMICalculator(296.0f, 156)),
                () -> assertEquals(-1, BMI.BMICalculator(296.0f, 320)),
                () -> assertEquals(-1, BMI.BMICalculator(-270.0f, 256))
        );
    }

    @Test
    @DisplayName("Partition Output Testing")
    void BMICalculatorPartitionOutputTesting() {
        assertAll(
                () -> assertEquals(-1, BMI.BMICalculator(700.0f, -100)),
                () -> assertEquals(0, BMI.BMICalculator(17.0f, 100)),
                () -> assertEquals(1, BMI.BMICalculator(18.5f, 100)),
                () -> assertEquals(2, BMI.BMICalculator(25.0f, 100)),
                () -> assertEquals(3, BMI.BMICalculator(30.0f, 100))
        );
    }

    @Test
    @DisplayName("Boundary Value Testing")
    void BMICalculatorBoundaryValueTesting() {
        assertAll(
                () -> assertEquals(3, BMI.BMICalculator(300.0f, 140)),
                () -> assertEquals(-1, BMI.BMICalculator(300.0f, 0)),
                () -> assertEquals(3, BMI.BMICalculator(300.0f, 1)),
                () -> assertEquals(3, BMI.BMICalculator(300.0f, 2)),
                () -> assertEquals(3, BMI.BMICalculator(300.0f, 279)),
                () -> assertEquals(3, BMI.BMICalculator(300.0f, 280)),
                () -> assertEquals(-1, BMI.BMICalculator(300.0f, 281)),
                () -> assertEquals(-1, BMI.BMICalculator(0.0f, 140)),
                () -> assertEquals(0, BMI.BMICalculator(0.1f, 140)),
                () -> assertEquals(0, BMI.BMICalculator(0.2f, 140)),
                () -> assertEquals(3, BMI.BMICalculator(599.9f, 140)),
                () -> assertEquals(3, BMI.BMICalculator(600.0f, 140)),
                () -> assertEquals(-1, BMI.BMICalculator(601.0f, 140))
        );
    }
}