package Day7;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/pascals-triangle/submissions/1139297481/
//118. Pascal's Triangle
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);


        for(int i=1;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> prevlist =ans.get(i-1); // 1 1
            list.add(1);
            for(int j=1;j<i;j++){

                list.add(prevlist.get(j-1)+prevlist.get(j));
            }


            list.add(1);
            ans.add(list);
        }
        return ans;
    }
    }
