package Day15;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
//540. Single Element in a Sorted Array
public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
    int n=nums.length;
       if(n==1) return nums[0];
       if(nums[0] != nums[1]) return nums[0];
       if(nums[n-1] != nums[n-2]) return nums[n-1];
    int s = 1, e = n - 2;
        while(s<=e){
        int mid=(s+e)/2;

        if(nums[mid]!= nums[mid+1]  && nums[mid]!= nums[mid-1]){
            return nums[mid];
        }

        if((mid % 2 == 0 && nums[mid] == nums[mid+1]) ||
                (mid%2 == 1 && nums[mid] == nums[mid-1])){
            s=mid+1;
        }
        else{
            e=mid-1;
        }

    }
        return -1;
}
}
