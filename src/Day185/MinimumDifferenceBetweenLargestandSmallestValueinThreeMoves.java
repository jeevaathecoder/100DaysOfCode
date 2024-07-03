package Day185;

import java.util.Arrays;

public class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves {
    class Solution {
        public int minDifference(int[] nums) {
            int n=nums.length;

            if(n<=4){
                return 0;
            }
            Arrays.sort(nums);
            int result= Integer.MAX_VALUE;
            for(int i=0;i<4;i++){

                result= Math.min(result, nums[n-1-3+i] - nums[i]);
            }

            return result;
        }

    }
}
