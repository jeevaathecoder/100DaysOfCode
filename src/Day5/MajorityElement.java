package Day5;

//169. Majority Element
//https://leetcode.com/problems/majority-element/

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr= {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int element=nums[0];
        int count=1;
        int n= nums.length;
        // 2 2 1 1 1 2 2
        for(int i=1;i<n;i++ ){

            if(count == 0){
                element=nums[i];
                count=1;
                continue;
            }
            if(nums[i] == element){
                count++;
            }

            else if(nums[i] != element){
                count--;
            }


        }

        return element;
    }
}
