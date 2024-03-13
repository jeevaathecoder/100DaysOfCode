package Day74;
//Find the Pivot Integer
//https://leetcode.com/problems/find-the-pivot-integer/?envType=daily-question&envId=2024-03-13
public class FindPivotElement {
    class Solution {
        public int pivotInteger(int n) {
            int totalSum = (n*(n+1))/2;
            int curSum=0;

            for(int i=n;i>=0;i--){

                curSum+=i;
                if(curSum==totalSum){
                    return i;
                }
                totalSum-=i;

            }
            return -1;
        }
    }

}
