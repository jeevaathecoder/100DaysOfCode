package Day51;
//https://leetcode.com/problems/missing-number/
// 268. Missing Number
public class MissingNumber {
    class Solution {

        public int missingNumber(int[] nums) {

            int sum=0;
            for(int i=0;i<nums.length; i++){
                sum = sum + nums[i];

            }
            int num = nums.length;
            int total = (num * (num +1)) / 2;
            return total-sum;
        }
    }

}
