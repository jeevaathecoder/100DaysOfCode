package Day87;

import java.util.HashSet;
import java.util.Set;

public class FindMissingPositive
{
    class Solution {
        public int firstMissingPositive(int[] nums) {

            Set<Integer> numbers = new HashSet<>();
            for(int num: nums){
                numbers.add(num);
            }

            for(int i=1;i<=nums.length; i++){
                if(!numbers.contains(i)){
                    return i;
                }
            }

            return nums.length+1;
        }
    }
}
