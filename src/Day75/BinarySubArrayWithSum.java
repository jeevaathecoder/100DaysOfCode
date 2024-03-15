package Day75;

//https://leetcode.com/problems/binary-subarrays-with-sum/?envType=daily-question&envId=2024-03-14
//930. Binary Subarrays With Sum
public class BinarySubArrayWithSum {
    class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int count = 0;
            int sum = 0;
            for(int i=0;i<nums.length;i++){
                sum = 0;
                for(int j=i;j<nums.length;j++){
                    sum+=nums[j];
                    if(sum==goal){
                        count++;
                        continue;
                    }
                }

            }
            return count;
        }
    }
}
