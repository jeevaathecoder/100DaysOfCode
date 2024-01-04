package Day4;

//75. Sort Colors
// https://leetcode.com/problems/sort-colors/description/
public class SortColors {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int i = 0;
        while (i <= end) {
            if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            } else if (nums[i] == 1) {
                i++;
            } else {
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;

                start++;
                i++;
            }
        }
    }

}
