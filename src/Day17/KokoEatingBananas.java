package Day17;

//875. Koko Eating Bananas
//https://leetcode.com/problems/koko-eating-bananas/
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h){

        int s=1;
        int e=piles[0];
        for(int num : piles){
            if(num>e){
                e=num;
            }
        }
        while(s<=e){
            double sum=0;
            int mid=(s+e)/2;
            for(int i=0;i<piles.length;i++){
                sum+=Math.ceil((double)piles[i]/(double)mid);
            }
            if(sum<=h){
                e=mid-1;
            }
            else{
                s=mid+1;
            }



        }
        return s;
    }



}
