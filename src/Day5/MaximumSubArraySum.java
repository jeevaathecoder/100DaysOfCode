package Day5;
//53. Maximum Subarray
//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubArraySum {

        public int maxSubArray(int[] nums) {
            int currSum = 0;
            int max=Integer.MIN_VALUE;

            for(int i=0;i<nums.length;i++){
                currSum = currSum + nums[i];
                max= Math.max(currSum , max);
                if(currSum<0){
                    currSum=0;
                }


            }
            return max;
        }


}
