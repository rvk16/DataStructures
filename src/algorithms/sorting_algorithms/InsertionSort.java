package algorithms.sorting_algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5 ,2 ,13, 1, 3};

        int[] result = insertionSort(arr);
        for(int i: result){
            System.out.print(i+ " ");
        }
    }

    // 5 2 13 1 3
    static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int ele = arr[i];
            int j = i - 1;
            while(j >=0 && arr[j] > ele) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = ele;
        }
        return arr;
    }
}
