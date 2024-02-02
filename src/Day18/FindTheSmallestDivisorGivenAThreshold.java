package Day18;

//1283.Find the Smallest Divisor Given a Threshold
//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
public class FindTheSmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }

        int s=1;
        int e=max;
        while(s<=e){
            int mid=(s+e)/2;

            int total = sum(nums,mid);
            if(total<=threshold){
                e=mid-1;
            }

            else{
                s=mid+1;
            }
        }

        return s;

    }

    int sum(int[] nums, int mid){
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=Math.ceil((double)nums[i]/(double)mid);
        }
        return total;
    }

}
