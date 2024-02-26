package Day57;
//1704. Determine if String Halves Are Alike
//https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class StringHalvesAreAlive {

    class Solution {
        public boolean halvesAreAlike(String s) {
            int count1 = 0, count2 = 0;

            s = s.toLowerCase();

            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                        || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    count1++;
                }
            }
            for (int i = s.length() / 2; i < s.length(); i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                        || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    count2++;
                }
            }

            return count1 == count2;
        }
    }
}
