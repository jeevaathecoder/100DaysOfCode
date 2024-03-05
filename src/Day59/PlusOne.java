package Day59;
//https://leetcode.com/problems/plus-one/submissions/1188915606/
//66. Plus One
public class PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length -1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }

            int digits2[] = new int[digits.length + 1];
            digits2[0] = 1;
            return digits2;
        }
    }
}
