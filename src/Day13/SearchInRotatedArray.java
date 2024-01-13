package Day13;

//33. Search in Rotated Sorted Array
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedArray {
    public int search(int[] nums, int target) {

        int s=0;
        int e=nums.length-1;

        while(s<=e){
            int mid= (s+e)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[s]<=nums[mid]){
                if(nums[s]<= target && target<=nums[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }

            }

            else{
                if(nums[mid]<=target && target<=nums[e]){
                    s=mid+1;
                }

                else{
                    e=mid-1;
                }
            }


        }
        return -1;
    }
}
