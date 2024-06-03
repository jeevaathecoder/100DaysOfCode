package Day155;
//2486. Append Characters to String to Make Subsequence
//
public class AppendCharacters {

    class Solution {
        public int appendCharacters(String s, String t) {
            int sIndex = 0, tIndex = 0;
            int sLength = s.length(), tLength = t.length();

            while (sIndex < sLength && tIndex < tLength) {
                if (s.charAt(sIndex) == t.charAt(tIndex)) {
                    tIndex++;
                }
                sIndex++;
            }

            return tLength - tIndex;

        }
    }

}
