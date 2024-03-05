package Day62;
//https://leetcode.com/problems/squares-of-a-sorted-array/description/?envType=daily-question&envId=2024-03-02
//977. Squares of a Sorted Array
public class SquaresOfSortedArray {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];
            int left = 0, right = n-1, end = n-1;
            while(left <= right) {
                if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                    res[end--] = nums[left]*nums[left++];
                } else {
                    res[end--] = nums[right]*nums[right--];
                }
            }
            return res;
        }
    }
}
