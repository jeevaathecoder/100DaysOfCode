package Day120;
//2997. Minimum Number of Operations to Make Array XOR Equal to K
//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/?envType=daily-question&envId=2024-04-29
public class MinimumNumberofOperations {
    class Solution {
        public int minOperations(int[] nums, int k) {

            int finalXor = 0;

            for (int n : nums) {
                finalXor = finalXor ^ n;
            }

            int count = 0;

            while (k > 0 || finalXor > 0) {
                if ((k % 2) != (finalXor % 2)) {
                    count++;
                }

                k /= 2;
                finalXor /= 2;
            }

            return count;
        }
    }
}
