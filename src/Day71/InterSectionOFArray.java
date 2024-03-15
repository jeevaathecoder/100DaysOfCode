package Day71;
//https://leetcode.com/problems/intersection-of-two-arrays/description/
//349. Intersection of Two Arrays
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterSectionOFArray {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<nums1.length; i++){
                set.add(nums1[i]);
            }

            for(int i=0;i<nums2.length;i++){
                if(set.contains(nums2[i])){
                    list.add(nums2[i]);
                    set.remove(nums2[i]);

                }
            }

            int[] ans= new int[list.size()];
            for(int i=0;i<ans.length;i++){
                ans[i]=list.get(i);
            }

            return ans;
        }
    }
}
