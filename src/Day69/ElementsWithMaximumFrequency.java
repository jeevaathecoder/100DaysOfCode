package Day69;
//3005. Count Elements With Maximum Frequency
//https://leetcode.com/problems/count-elements-with-maximum-frequency/submissions/1197726785?envType=daily-question&envId=2024-03-08
import java.util.HashMap;
import java.util.Map;

public class ElementsWithMaximumFrequency {
    class Solution {

        public int maxFrequencyElements(int[] nums) {
            Map<Integer, Integer> freqMp = new HashMap<>();
            int maxFreq = 0;
            for(var num : nums){
                freqMp.put(num, freqMp.getOrDefault(num, 0) + 1);
                maxFreq = Math.max(maxFreq, freqMp.get(num));
            }

            int maxFreqEleCnt = 0;
            for(var entry : freqMp.entrySet()){
                int currEleFreq = entry.getValue();
                if(currEleFreq == maxFreq){
                    maxFreqEleCnt++;
                }
            }
            return maxFreq * maxFreqEleCnt;
        }
    }

}
