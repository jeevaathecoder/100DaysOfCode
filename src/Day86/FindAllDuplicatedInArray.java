package Day86;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatedInArray {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            for(int i : nums){
                i= Math.abs(i);
                if(nums[i-1] < 0){
                    ans.add(i);
                }
                nums[i-1] = nums[i-1]*-1;

            }
            return ans;
        }
    }

}
