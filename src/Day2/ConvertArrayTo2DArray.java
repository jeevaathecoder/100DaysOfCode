package Day2;

//2610. Convert an Array Into a 2D Array With Conditions
//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertArrayTo2DArray {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<List<Integer>> result = new ArrayList<>();

        while (!map.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                list.add(key);
                value--;
                if (value == 0) {
                    temp.add(key);
                } else {
                    map.put(key, value);
                }
            }
            result.add(list);
            for (int i : temp) {
                map.remove(i);
            }
        }
        return result;
    }
}

//Appraoch 2 Using List

class Solution {
    public List<List<Integer>> findMatrix(int[] num) {
        List <Integer> nums = new ArrayList<>();
        for(int i=0;i<num.length;i++){
            nums.add(num[i]);
        }

        List <List<Integer>> list = new ArrayList<>();
        while(nums.size() > 0){
            List <Integer> l2 = new ArrayList<>();
            int i = 0;
            while(i < nums.size()){
                if(!l2.contains(nums.get(i))){
                    l2.add(nums.get(i));
                    nums.remove(i);
                }
                else{i++;}
            }
            list.add(l2);
        }
        return list;
    }
}
