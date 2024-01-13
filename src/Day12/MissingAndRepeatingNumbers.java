package Day12;
// Missing And Repeating Numbers
//https://www.codingninjas.com/studio/problems/missing-and-repeating-numbers_6828164?
public class MissingAndRepeatingNumbers {
    public static int[] findMissingRepeatingNumbers(int []a) {
        int[] arr= new int[a.length+1];


        for(int i=0;i<a.length;i++){
            int num=a[i];

            if(arr[num]>0){
                arr[num]=2;
            }
            else{
                arr[num]=1;
            }
        }

        int duplicate=0;
        int missing=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2){
                duplicate=i;
            }
            if(arr[i]==0){
                missing=i;
            }

        }

        return new int[]{duplicate,missing};
    }
}
