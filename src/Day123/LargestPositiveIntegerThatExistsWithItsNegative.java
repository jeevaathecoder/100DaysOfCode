package Day123;

//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
//2441. Largest Positive Integer That Exists With Its Negative


import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    class Solution {
        public int findMaxK(int[] nums) {

            Arrays.sort(nums);

            for(int i=0;i<nums.length; i++){
                for(int j=nums.length-1;j>i; j--){

                    if(nums[i] == -nums[j]){
                        return nums[j];
                    }

                }
            }

            return -1;
        }
    }
}
