/*
Given a set of numbers, return the additive inverse of each.
Each positive becomes negatives, and the negatives become positives.
 */
package invertValues;

public class InvertValues {
    public static int[] invert (int[] array) {

        int invertNumber;
        int[] invertArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            invertNumber = -array[i];
            invertArray[i] = invertNumber;
        }
        return invertArray;
    }
}
