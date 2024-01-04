package Day4;

import java.util.HashMap;
import java.util.Map;

//1. Two Sum
//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for( int i=0 ;i< nums.length ; i++){
            int comply = target- nums[i];

            if(map.containsKey(comply)){

                return new int[] {map.get(comply), i};
            }

            map.put(nums[i],i);


        }
        return new int[] {-1};
    }
}
