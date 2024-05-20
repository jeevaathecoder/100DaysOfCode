package Day141;


//1863. Sum of All Subset XOR Totals
public class SumofAllSubsetXORTotals {
    class Solution {
        public int subsetXORSum(int[] nums) {
            int sumTotal = 0;

            for (int num : nums) {
                sumTotal |= num;
            }
            return sumTotal << (nums.length - 1);
        }
    }
}
