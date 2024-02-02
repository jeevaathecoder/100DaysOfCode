package Day18;


//1011. Capacity To Ship Packages Within D Days
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            max = Math.max(max, weights[i]);
        }

        int s=max;
        int e=sum;
        while(s<=e){
            int mid = (s+e)/2;

            if(capacity(weights, days, mid)){
                e=mid-1;
            }

            else{
                s=mid+1;
            }
        }
        return s;
    }
    //   10       53   31
    public boolean capacity(int[] weights, int days, int mid){
        int day=1;
        int weight=0;

        for(int i=0;i<weights.length;i++){


            if(weight+weights[i]>mid){
                day+=1;
                weight=weights[i];
            }

            else{
                weight+=weights[i];
            }
        }
        return day<=days;
    }
}
