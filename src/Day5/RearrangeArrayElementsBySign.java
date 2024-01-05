package Day5;

//2149. Rearrange Array Elements by Sign
//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
public class RearrangeArrayElementsBySign {
      public int[] rearrangeArray(int[] nums) {
            int[] arr=new int[nums.length];
            int i=0;
            int j=1;
            for(int num : nums){
                if(num > 0){
                    arr[i]=num;
                    i+=2;
                }
                else{
                    arr[j] = num;
                    j+=2;
                }
            }

            return arr;
        }
    }

