/*
Write function bmi that calculates body mass index (bmi = weight / height ^ 2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
 */
package CalculateBMI;

public class Calculate {
    public static String bmi (double weight, double height) {
        while (true) {
            double bmi = weight / Math.pow(height, 2);
            if (bmi <= 18.5) return "Underweight";

            if (bmi <= 25.0 && bmi >= 18.5) return "Normal";

            if (bmi <=30.0 && bmi >= 25.0) return "Overweight";

            if (bmi > 30.0) return "Obese";
        }
    }
}
