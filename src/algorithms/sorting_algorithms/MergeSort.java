package algorithms.sorting_algorithms;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {10, 4, 43, 5, 57, 91, 45, 9, 7};
        mergeSort(arr);
        printArray(arr);
    }

    private static void mergeSort(int[] arr){
        int arraySize = arr.length;

        if(arraySize < 2) {
            return;
        }

        int midIndex = arraySize / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arraySize - midIndex];

        for(int i=0; i< midIndex; i++){
            leftHalf[i] = arr[i];
        }
        for(int i=midIndex; i< arraySize; i++){
            rightHalf[i-midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }


    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0, j=0, k=0;

        while(i < leftSize && j < rightSize){
            if(leftHalf[i] < rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}
