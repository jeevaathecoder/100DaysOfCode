package Day1;

//Coding Ninjas
//https://www.codingninjas.com/studio/problems/selection-sort_624469
public class SelectionSort {
        public static void selectionSort(int[] arr) {
            for(int i=0;i<arr.length;i++){
                int min=i;
                for(int j=0;j<arr.length;j++){

                    if(arr[j]<arr[min]){
                        min=j;
                    }

                }
                int temp=arr[min];
                arr[min] = arr[i];
                arr[i] =temp;

            }
        }
    }
