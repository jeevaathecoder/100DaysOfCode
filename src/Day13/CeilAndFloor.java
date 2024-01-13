package Day13;

//https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?
//Ceil The Floor
public class CeilAndFloor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {

        int floor=getFloor(a, n, x);
        int ceil = getCeil(a, n, x);

        int[] arr={floor,ceil};

        return arr;

    }

    static int getFloor(int[] arr, int n, int x){
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;

            if(arr[mid]<=x){
                ans=arr[mid];
                s=mid+1;


            }
            else{

                e=mid-1;

            }
        }

        return ans;
    }
    static int getCeil(int[] arr, int n, int x){
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;

            if(arr[mid]>=x){
                ans=arr[mid];
                e=mid-1;

            }



            else{
                s=mid+1;

            }
        }

        return ans;
    }
}
