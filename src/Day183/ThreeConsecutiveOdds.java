package Day183;

public class ThreeConsecutiveOdds {
    class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2!=0){
                    int j=i+1;
                    int count=2;
                    while(count>0 && j<arr.length){
                        if(arr[j] %2!=0){
                            count--;
                            j++;
                        }else{
                            break;
                        }

                        if(count==0) return true;


                    }
                }
            }

            return false;
        }
    }
}
