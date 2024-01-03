package Day3;

import java.util.ArrayList;
import java.util.List;

//https://www.codingninjas.com/studio/problems/sorted-array_6613259
//Merge 2 Sorted Array
public class MergeTwoSortedArray {
    public static List<Integer> sortedArray(int[] a, int[] b) {

        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<a.length && j<b.length){

            if(a[i]<b[j]){
                int num=a[i];
                addition(list, num);
                i++;
            }
            else{
                int num= b[j];
                addition(list,num);
                j++;
            }
        }


        while(i<a.length){
            int num=a[i];
            addition(list, num);
            i++;
        }

        while(j<b.length){
            int num= b[j];
            addition(list,num);
            j++;
        }

        return list;

    }

    public static void addition(List<Integer> list, int num){
        if(list.size() == 0 ||  list.get(list.size()-1) !=num ){
            list.add(num);
        }
    }

}
