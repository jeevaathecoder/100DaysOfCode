package Day4;

import java.util.HashMap;
import java.util.Map;

//2870. Minimum Number of Operations to Make Array Empty
//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
public class MinimumNoOfOperationToMakeArrayEmpty {
    class Solution {

        public int minOperations(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int val : nums) {
                map.put(val, map.getOrDefault(val, 0)+1);
            }

            int count = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                if(value == 1) return -1;

                count += value/3;
                if(value % 3 != 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
