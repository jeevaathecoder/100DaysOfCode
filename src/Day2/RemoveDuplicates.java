package Day2;

//26. Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1;i<nums.length ;i++){
            if(nums[i-1] != nums[i]){
                nums[count] = nums[i];
                count ++;
            }
        }
        return count;
    }
}
