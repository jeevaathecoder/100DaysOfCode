package Day171;

public class MinimumNumberofDaystoMakemBouquets {
    class Solution {
        public int minDays(int[] bloomDay, int m, int k) {
            int n=bloomDay.length;
            if((long)m*k > n){
                return -1;
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i =0; i<n; i++){
                min=Math.min(min,bloomDay[i]);
                max=Math.max(max,bloomDay[i]);
            }

            int s=min;
            int e=max;

            while(s<=e){
                int mid= (s+e)/2;

                if(possilbe(bloomDay,mid,m,k)){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }

            }
            return s;
        }

        public boolean possilbe(int[] bloomDay, int mid ,int m , int k){

            int count=0;
            int noDay=0;

            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    count++;
                }
                else{
                    noDay = noDay + count/k;
                    count=0;
                }
            }
            noDay+=count/k;



            return noDay>=m;
        }
    }
}
