package Day90;
//2962. Count Subarrays Where Max Element Appears at Least K Times
//https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/?envType=daily-question&envId=2024-03-29
public class CountSubArrayWhereMaxElementOccures2Times {
    class Solution {
        public long countSubarrays(int[] nums, int k) {

            long result = 0;    
            int max = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max){
                    max = nums[i];
                }
            }
            int start = 0;
            int end = 0;
            int count = 0;

            while(end < nums.length){

                if(nums[end] == max){
                    count++;
                }

                while(count >= k){
                    result += nums.length - end;
                    if(nums[start] == max){
                        count--;
                    }

                    start++;
                }

                end++;
            }
            return result;
        }
    }

}
