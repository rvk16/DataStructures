package algorithms.sorting_algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 43, 5, 57, 91, 45, 9, 7};
        int[] result = selectionSort(arr);
        printArray(result);
    }

    private static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i; // assume i is minimum index
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}
