package Day28;

import java.util.Arrays;

public class SortCharactersByFrequency {

    public static void main(String[] args) {
        System.out.println(frequencySort("ABaab"));
    }
    private static int MAX_AVAILABLE_CHAR = 123;

    public static String frequencySort(String s) {
        int[] characterFrequency = new int[MAX_AVAILABLE_CHAR];
        for (char character : s.toCharArray()) {
            characterFrequency[character]++;
        }

        char[] sortedString  = new char[s.length()];
        for (int i = 0; i < s.length();) {
            int max = 0;
            int index = 0;

            for (int j = 0; j < MAX_AVAILABLE_CHAR; j++) {
                if (characterFrequency[j] > max) {
                    max = characterFrequency[j];
                    index = j;
                }
            }

            char curChar = (char) index;
            int frequency = characterFrequency[index];
            for (int j = 0; j < frequency; j++) {
                sortedString[i++] = curChar;
            }
            characterFrequency[index] = 0;
        }
        return new String(sortedString);
    }
}
