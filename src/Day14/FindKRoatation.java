package Day14;
//https://www.codingninjas.com/studio/problems/rotation_7449070
// Rotation
public class FindKRoatation {
    public static int findKRotation(int []arr){

        int s=0;
        int e=arr.length-1;

        int min=Integer.MAX_VALUE;
        int index=-1;

        while(s<=e){
            int mid= (s+e)/2;
            if(arr[s]<=arr[e]){

                if(arr[s]<min){
                    min=arr[s];
                    index=s;

                }

                break;

            }

            if(arr[s]<=arr[mid]){
                if(arr[s]<min){
                    index=s;
                    min=arr[s];

                }
                s=mid+1;

            }

            else{
                e=mid-1;
                if(arr[mid]<min){
                    min=arr[mid];
                    index=mid;
                }

            }

        }
        return index;
    }
}
