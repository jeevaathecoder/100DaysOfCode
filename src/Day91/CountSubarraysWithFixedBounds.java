package Day91;
//2444. Count Subarrays With Fixed Bounds
//https://leetcode.com/problems/count-subarrays-with-fixed-bounds/
public class CountSubarraysWithFixedBounds {
    class Solution {
        public long countSubarrays(int[] nums, int minK, int maxK) {

            int start = 0;
            int minStart = 0, maxStart = 0;

            boolean isMin = false, isMax = false;

            long result = 0;

            for(int i = 0; i < nums.length; i++){

                int num = nums[i];
                if(num < minK || num > maxK){
                    isMin = false;
                    isMax = false;
                    start = i+1;
                }

                if(num == minK){
                    isMin = true;
                    minStart = i;
                }

                if(num == maxK){
                    isMax = true;
                    maxStart = i;
                }

                if( isMin && isMax){
                    result += Math.min(minStart,maxStart)-start+1;
                }
            }

            return result;
        }
    }
}
