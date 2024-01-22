package Day22;
//https://www.geeksforgeeks.org/problems/equilibrium-index-of-an-array/1?
public class EquilibriumIndex {
    public static int findEquilibrium(int[] arr, int n) {

        int leftSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (sum == leftSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
