package Day184;
import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArraysII {

    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            int[] count = new int[1001];
            List<Integer> intersectionList = new ArrayList<>();


            for (int num : nums1) {
                count[num]++;
            }


            for (int num : nums2) {
                if (count[num] > 0) {
                    intersectionList.add(num);
                    count[num]--;
                }
            }


            int[] intersectionArray = new int[intersectionList.size()];
            for (int i = 0; i < intersectionList.size(); i++) {
                intersectionArray[i] = intersectionList.get(i);
            }

            return intersectionArray;
        }
    }
}
