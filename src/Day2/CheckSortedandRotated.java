package Day2;

//1752. Check if Array Is Sorted and Rotated
//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/

public class CheckSortedandRotated {
    public boolean check(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                count++;
            } else {
                break;
            }
        }
        if (count == nums.length) {
            return true;
        }
        while (count > 0) {
            int first = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];

            }
            nums[nums.length - 1] = first;
            count--;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }

        }
        return true;
    }
}