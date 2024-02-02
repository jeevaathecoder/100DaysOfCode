package Day19;

import java.util.Arrays;

// Aggressive Cows
//https://www.codingninjas.com/studio/problems/aggressive-cows_1082559?leftPanelTabValue=PROBLEM
public class AggressiveCows {
    static boolean canPlace(int[] stalls, int dist, int cows){
        int cntCows = 1, last = stalls[0];
        for(int i=1; i<stalls.length; i++){
            if(stalls[i] - last >= dist){
                cntCows++;
                last = stalls[i];
            }
        }

        return cntCows >= cows;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 0, high = stalls[n - 1];

        while(low <= high){
            int mid = (low + high) >>> 1;

            if(canPlace(stalls, mid, k)){
                low = mid + 1;
            }
            else high = mid - 1;
        }

        return high;
    }
}
