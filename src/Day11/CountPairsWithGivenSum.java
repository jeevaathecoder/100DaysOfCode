package Day11;
//Count pairs with given sum
//https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
import java.util.HashMap;

public class CountPairsWithGivenSum {
    int getPairsCount(int[] arr, int n, int k) {


        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int a : arr){

            count+=map.getOrDefault(k-a,0);
            map.put(a,map.getOrDefault(a,0)+1);

        }

        return count;

    }
}
