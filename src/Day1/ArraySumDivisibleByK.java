package Day1;

import java.util.HashMap;

//Array Pair Sum Divisibility Problem
//  https://www.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1

public class ArraySumDivisibleByK {
    public boolean canPair(int[] nums, int k) {
        int n = nums.length;

        if(n % 2 != 0){
            return false;
        }

        int remZero=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(i% k == 0){
                remZero++;
                continue;
            }
            int target= k-(i % k);

            if(map.containsKey(target)){
                int frequency = map.get(target);
                if(frequency == 1){
                    map.remove(target);
                }
                else{
                    map.put(target , frequency-1);
                }


            }
            else{
                map.put(i%k ,map.getOrDefault(i%k,0)+1);
            }
        }
        return map.size() == 0 && remZero % 2 == 0;
    }
}
