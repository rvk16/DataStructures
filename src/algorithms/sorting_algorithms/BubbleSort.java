package algorithms.sorting_algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 43, 5, 57, 91, 45, 9, 7};
        int[] result = bubbleSort(arr);
        System.out.println();
        printArray(result);
    }

    private static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            boolean swapped = false;

            for (int j=0; j<n-i-1; j++){

                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
            System.out.println();
            printArray(arr);
        }
        return arr;
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}
