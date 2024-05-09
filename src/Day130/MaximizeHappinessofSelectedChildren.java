package Day130;

//3075. Maximize Happiness of Selected Children
//https://leetcode.com/problems/maximize-happiness-of-selected-children/description/
import java.util.Arrays;

public class MaximizeHappinessofSelectedChildren {
    class Solution {
        public long maximumHappinessSum(int[] happiness, int k) {
            Arrays.sort(happiness);
            long ans=0;
            int temp=0;

            int n=happiness.length;
            for(int i=n-1;i>=n-k;i--){

                happiness[i] = Math.max(happiness[i] - temp,0);
                ans+=happiness[i];
                temp++;
            }
            return ans;

        }


    }

}
