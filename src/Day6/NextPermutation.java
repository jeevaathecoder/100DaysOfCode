package Day6;

//https://leetcode.com/problems/next-permutation/
//31. Next Permutation
public class NextPermutation {
    public void nextPermutation(int[] nums) {

        int index=-1;
        int n=nums.length;

        for(int i=n-2 ; i>= 0 ; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }


        if(index == -1 ){
            int i=0;
            int j=n-1;
            while(i<j){

                swap(nums,i,j);
                i++;
                j--;
            }
        }

        else{

            for(int i=n-1 ; i>index ; i--){
                if(nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i]= nums[index];
                    nums[index] = temp;
                    break;
                }
            }

            int i=index+1;
            int j=n-1;
            while(i<j){
                swap(nums,i,j);
                i++;
                j--;
            }

        }
    }

    public void swap(int[] nums, int i ,int  j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }
}
