package Day88;

public class MaximumSubarrayProductLessThanK {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {

            if (k <= 1) return 0;
            int left=0;
            int right=0;
            int product =1;
            int end = nums.length;
            int count=0;

            while(right<end){
                product = product * nums[right];
                while(product>=k){
                    product = product/nums[left];
                    left++;
                }
                count += 1 +(right-left);
                right++;
            }
            return count;
        }
    }
}
