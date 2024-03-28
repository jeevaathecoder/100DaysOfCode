package Day89;
//2958. Length of Longest Subarray With at Most K Frequency
//https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/?envType=daily-question&envId=2024-03-28
public class LengthOfLongestSubArray {
    class Solution {
        public int maxSubarrayLength(int[] nums, int k) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            int[] frequencies = new int[max - min + 1];

            int left = 0;

            int maxWindow = 0;

            for (int right = 0; right < nums.length; right++) {
                frequencies[nums[right] - min]++;

                while (frequencies[nums[right] - min] > k) {
                    frequencies[nums[left] - min]--;

                    left++;
                }

                maxWindow = Math.max(maxWindow, right - left + 1);
            }

            return maxWindow;
        }
    }
}
