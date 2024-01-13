package Day12;
//https://www.codingninjas.com/studio/problems/binary-search_972
public class BinarySearch {
    public static int search(int []nums, int target) {

        int start=0;
        int end= nums.length-1;

        while(start<=end){
            int mid= (start+end)/2;

            if(nums[mid]== target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }

            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
