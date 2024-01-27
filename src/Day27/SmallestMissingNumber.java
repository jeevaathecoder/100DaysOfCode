package Day27;

import java.util.HashSet;

public class SmallestMissingNumber {
    static int missingNumber(int arr[], int size)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }


        int i = 1;
        while(set.contains(i)) {
            i++;
        }
        return i;

    }
}
