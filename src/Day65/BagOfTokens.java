package Day65;

import java.util.Arrays;
//https://leetcode.com/problems/bag-of-tokens/submissions/1193795594?envType=daily-question&envId=2024-03-04
//948. Bag of Tokens
public class BagOfTokens {
    class Solution {
        public int bagOfTokensScore(int[] tokens, int power) {
            Arrays.sort(tokens);
            int s = 0;
            int maxi = 0;
            int l = 0, r = tokens.length - 1;

            while (l <= r) {
                if (power >= tokens[l]) {
                    power -= tokens[l];
                    s++;
                    l++;
                    maxi = Math.max(maxi, s);
                } else if (s > 0) {
                    power += tokens[r];
                    s--;
                    r--;
                } else {
                    break;
                }
            }

            return maxi;
        }
    }
}
