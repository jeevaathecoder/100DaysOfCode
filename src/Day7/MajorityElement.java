package Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/majority-element-ii/
//229. Majority Element II
public class MajorityElement {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int count1=0;
        int count2=0;
        int element1=Integer.MIN_VALUE;
        int element2= Integer.MIN_VALUE;
        for(int i=0;i<nums.length; i++){
            if(count1== 0 && nums[i] !=element2){
                count1++;
                element1=nums[i];
            }

            else if(count2==0 && nums[i]!=element1){
                count2++;
                element2=nums[i];
            }

            else if(nums[i] == element1){
                count1++;
            }

            else if(nums[i] == element2){
                count2++;
            }

            else{
                count1--;
                count2--;
            }
        }
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(element1 == nums[i]){
                a++;
            }
            if(element2 == nums[i]){
                b++;
            }
        }

        int n= nums.length/3;
        if(a>n){
            list.add(element1);
        }
        if(b>n){
            list.add(element2);
        }
        Collections.sort(list);
        return list;
    }
}
