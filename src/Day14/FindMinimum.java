package Day14;
//153. Find Minimum in Rotated Sorted Array
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class FindMinimum {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(s<=e){
            int mid=(s+e)/2;

            if(nums[s]<=nums[mid]){
                min=Math.min(min,nums[s]);
                s=mid+1;
            }
            if(nums[mid]<=nums[e]){
                min=Math.min(min,nums[mid]);
                e=mid-1;
            }


        }
        return min;
    }
}
