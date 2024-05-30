package Day151;
///https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
//1442. Count Triplets That Can Form Two Arrays of Equal XOR
        
public class CountTriplets {
    class Solution {
        public int countTriplets(int[] arr) {
            int count = 0;
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int a = 0;
                    for (int k = i; k < j; k++) {
                        a ^= arr[k];
                    }

                    int b = 0;
                    for (int k = j; k < n; k++) {
                        b ^= arr[k];
                        if (a == b) {
                            count++;
                        }
                    }
                }
            }

            return count;
        }
    }
}
