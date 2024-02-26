package Day52;
//201. Bitwise AND of Numbers Range
//https://leetcode.com/problems/bitwise-and-of-numbers-range/description/
public class BitwiseANDofNumbersRange {
    class Solution {

        public int rangeBitwiseAnd(int left, int right) {

            int shift = 0;

            while (left < right) {
                left >>= 1;
                right >>= 1;
                shift++;
            }
            int ans = left << shift;

            return ans;
        }
    }
}
