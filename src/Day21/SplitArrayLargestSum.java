package Day21;
//https://leetcode.com/problems/split-array-largest-sum/
//410. Split Array Largest Sum
public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int m) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            max = Math.max(max , nums[i]);
            sum += nums[i];
        }
        int low = max;
        int high = sum;
        int mid = 0;
        int res = 0;
        while(low <= high){
            mid = low + (high- low)/2;
            if(isvalid(nums, mid, m)){
                res = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return res;
    }
    public static boolean isvalid(int nums[], int mid , int m){
        int sum = 0;
        int key = 1;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum  > mid){
                key += 1;
                sum = nums[i];
            }
        }
        return key<=m;
    }
}
