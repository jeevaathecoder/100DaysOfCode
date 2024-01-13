package Day13;

//34. Find First and Last Position of Element in Sorted Array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {



        int starting= check(nums,target,true);
        int ending= check(nums,target,false);

        return new int[] {starting, ending};

    }

    public int check(int[] arr,int target, boolean firstElement){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;

            if(arr[mid]>target){
                e=mid-1;
            }


            else if(arr[mid]<target){
                s=mid+1;
            }

            else{
                ans=mid;
                if(firstElement){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }

        }

        return ans;
    }
}
