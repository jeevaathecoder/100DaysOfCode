package Day85;
//https://leetcode.com/problems/find-the-duplicate-number/?envType=daily-question&envId=2024-03-24
//287. Find the Duplicate Number
public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        for(int i : nums){
            i= Math.abs(i);
            if(nums[i-1] < 0){
                return i;
            }
            nums[i-1] = nums[i-1]*-1;

        }
        return -1;
    }
}
