package Day164;

public class SortColors {
    class Solution {
        public void sortColors(int[] nums) {
            int start=0;
            int mid=0;
            int end=nums.length-1;

            while(mid<=end){
                if(nums[mid]==0){
                    swap(nums,start,mid);
                    start++;
                    mid++;
                }
                else if(nums[mid]==1){
                    mid++;
                }
                else{
                    swap(nums,mid,end);
                    end--;
                }

            }
        }

        public  void swap(int[] nums,int a,int b){
            int temp= nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
        }
    }
}
