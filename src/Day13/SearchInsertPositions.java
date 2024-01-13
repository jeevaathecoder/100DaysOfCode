package Day13;
//https://leetcode.com/problems/search-insert-position/
//35. Search Insert Position
public class SearchInsertPositions {
    public int searchInsert(int[] nums, int target) {

        int s=0;
        int e=nums.length-1;
        int mid=0;
        while(s<=e){
            mid=(s+e)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid]<target){
                s=mid+1;
            }

            else{

                e=mid-1;
            }
   }

        return s;
    }
}
