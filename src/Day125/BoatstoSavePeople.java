package Day125;

import java.util.Arrays;

//881. Boats to Save People
//https://leetcode.com/problems/boats-to-save-people/description
public class BoatstoSavePeople {
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int boats = 0;
            int left = 0, right = people.length - 1;
            while (left <= right) {
                if (people[left] + people[right] <= limit) {
                    left++;
                }
                right--;
                boats++;
            }   
            return boats;
        }
    }

}
