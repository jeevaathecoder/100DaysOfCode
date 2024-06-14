package Day166;

import java.util.Arrays;

//945. Minimum Increment to Make Array Unique
//https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/
public class MinimumOperationToMakeArrayUnique {
    class Solution {
        public int minIncrementForUnique(int[] nums) {
            Arrays.sort(nums);
            int ans = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] <= nums[i - 1]) {
                    ans += nums[i - 1] - nums[i] + 1;
                    nums[i] = nums[i - 1] + 1;
                }
            }
            return ans;
        }
    }
}
