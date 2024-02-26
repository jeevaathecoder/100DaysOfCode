package Day50;
//231. Power of Two
//https://leetcode.com/problems/power-of-two/
public class PowerOf2 {
    class Solution {

        public boolean isPowerOfTwo(int n) {

            for (int i = 0; i < 31; i++) {
                int ans = (int)
                        Math.pow(2, i);

                if (ans == n) {
                    return true;
                }

            }
            return false;
        }
    }
}
