package source;

import java.util.Scanner;

public class BMI {
    /**
     * source.BMI Calculator - Calculate the source.BMI Score (Mean) from 2 input values:
     * weight and height. source.BMI Score is equal to weight divided by height squared.
     * @param weight is the weight of the person.
     * @param height is the height of the person.
     *
     * @return source.BMI Score
     */
    public static int BMICalculator(float weight, int height) {
        /**
         * Bug 1: weight invalid value
         *
        if (weight <= 0.0f || weight > 600.0f) {
            return -1;
        }
        */

        // Bug 2: height invalid (negative and above max value)
        if (height == 0) {
            return -1;
        }

        float BMIScore = weight / (height * height) * 10000;
        if (BMIScore < 18.5f) {
            return 0;
        }

        if (BMIScore < 25.0f) {
            return 1;
        }

        if (BMIScore < 30.0f) {
            // Bug 3: Wrong return value (expected 2)
            return 3;
        }

        return 3;
    }

    /**
     * BMIScript - Return the result script from BMIScore.
     * @param BMIScore is the source.BMI Score that calculated in BMICalculator.
     * @return source.BMI Result script.
     */
    public static String BMIScript(int BMIScore) {
        if (BMIScore == -1) {
            return "Invalid input";
        }

        if (BMIScore == 0) {
            return "Underweight";
        }

        if (BMIScore == 1) {
            return "Normal";
        }

        if (BMIScore == 2) {
            return "Overweight";
        }

        return "Obese";
    }

    /**
     * main function.
     * @param args arguments.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float weight;
        int height;
        System.out.print("Height (cm) = ");
        height = input.nextInt();
        System.out.print("Weight (kg) = ");
        weight = input.nextFloat();
        System.out.println("Result: " + BMIScript(BMICalculator(weight, height)));
    }
}
