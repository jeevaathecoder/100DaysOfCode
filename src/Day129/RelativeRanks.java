package Day129;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//506. Relative Ranks
//https://leetcode.com/problems/relative-ranks/
public class RelativeRanks {
    public class Solution {
        public String[] findRelativeRanks(int[] score) {

            Map<Integer, Integer> scoreMap = new HashMap<>();
            for (int i = 0; i < score.length; i++) {
                scoreMap.put(score[i], i);
            }
            Arrays.sort(score);

            String[] result = new String[score.length];
            for (int i = score.length - 1; i >= 0; i--) {

                int rank = score.length - i;
                if (rank == 1) {
                    result[scoreMap.get(score[i])] = "Gold Medal";
                } else if (rank == 2) {
                    result[scoreMap.get(score[i])] = "Silver Medal";
                } else if (rank == 3) {
                    result[scoreMap.get(score[i])] = "Bronze Medal";
                } else {
                    result[scoreMap.get(score[i])] = String.valueOf(rank);
                }
            }

            return result;
        }
    }
}
