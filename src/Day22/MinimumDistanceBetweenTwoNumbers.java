package Day22;


//https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1?
//Minimum distance between two numbers
import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenTwoNumbers {
    int minDist(int[] arr, int n, int x, int y) {

        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) l.add(i);
            else if (arr[i] == y) l1.add(i);
        }
        if (l.size() == 0 || l1.size() == 0) return -1;
        else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < l.size(); i++) {
                for (int j = 0; j < l1.size(); j++) {
                    if (Math.abs(l.get(i) - l1.get(j)) < min) {
                        min = Math.abs(l.get(i) - l1.get(j));
                    }
                }
            }
            return min;

        }


    }
}
