package Day2;

//283. Move Zeroes
//https://leetcode.com/problems/move-zeroes/description/

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }

        for(int i = count; i<nums.length; i++){
            nums[i]=0;
        }
    }
}
