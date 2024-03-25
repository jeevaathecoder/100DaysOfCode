package Day80;

import java.util.Arrays;

//https://leetcode.com/problems/task-scheduler/?envType=daily-question&envId=2024-03-19
public class TaskScheduler {
    class Solution {
        public int leastInterval(char[] tasks, int n) {
            int []taskFreqMp = new int[26];
            for(char c : tasks){
                taskFreqMp[c- 'A']++;
            }
            Arrays.sort(taskFreqMp);
            int batchCnt = taskFreqMp[25]-1;
            int vacantSlots = batchCnt * n;
            for(int indx = 24; indx >= 0; indx--){
                vacantSlots -= Math.min(taskFreqMp[indx], batchCnt);
            }
            return vacantSlots > 0 ? tasks.length + vacantSlots : tasks.length;
        }
    }
}
