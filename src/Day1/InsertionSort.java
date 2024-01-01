package Day1;

//Coding Ninjas
//https://www.codingninjas.com/studio/problems/insertion-sort_624381
public class InsertionSort {
    public static void insertionSort(int[] arr, int size) {

        for(int i=0;i<arr.length-1; i++){

            for(int j=i+1; j>0 ; j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }

            }
        }
    }
}
