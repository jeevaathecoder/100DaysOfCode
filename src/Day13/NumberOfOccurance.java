package Day13;

// Number of occurrence
//https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456
public class NumberOfOccurance {

    public static int count(int[] arr,int n, int x) {

        int starting= check(arr,x,true);
        int ending= check(arr,x,false);
        if(starting==-1 && ending == -1){
            return 0;
        }
        return ending-starting+1;

    }

    public static int check(int[] arr,int target, boolean firstElement){
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
