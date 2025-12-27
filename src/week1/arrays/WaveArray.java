package week1.arrays;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,9,5,2,0,7,4,8,3,6};
        int[] result = waveArrayNotLexographic(arr);
        printArray(result);
    }

    private static int[] waveArray(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        for(int i=1; i<n; i+=2){
            swap(arr, i, i-1);
        }
        return arr;
    }

    private static int[] waveArrayNotLexographic(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                swap(arr, i, i-1);
            }
            if(i<n-1 && arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
