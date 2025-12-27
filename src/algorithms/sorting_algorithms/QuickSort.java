package algorithms.sorting_algorithms;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {10, 4, 43, 5, 57, 91, 45, 9, 7};
        quickSort(arr);
        printArray(arr);
    }

    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int lowIndex, int highIndex){

        if(lowIndex >= highIndex){
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex- lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);

        int leftPointer = partition(arr, lowIndex, highIndex, pivot);
        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer ){
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}
