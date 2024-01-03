package Day3;

// 268. Missing Number
//https://leetcode.com/problems/missing-number/
public class MissingNumber {

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
