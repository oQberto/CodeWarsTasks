/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */
package shortestWord;

public class ShortestWord {
    public static int findShort (String text) {
        String[] str = text.split(" ");
        int min = Integer.MAX_VALUE;

        for (String word : str) {
            if (word.length() < min) min = word.length();
        }
        return min;
    }
}
