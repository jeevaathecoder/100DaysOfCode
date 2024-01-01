package Day1;

//Coding Ninjas
//https://www.codingninjas.com/studio/problems/bubble-sort_624380
public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {


        for(int i=n-1 ; i>=0;i--){

            for(int j=0;j<i; j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
