package Day55;
//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
//Find First Palindromic String in the Array
public class FirstPalindromicString {
    public class Solution {

        public static String firstPalindrome(String[] words) {

            for (String word : words) {
                StringBuilder reversed =
                        new StringBuilder(word).reverse();

                if (word.equals(reversed.toString())) {
                    return word;
                }
            }
            return "";
        }
    }
}
