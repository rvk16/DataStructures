package week1.two_pointer;


public class SortColours {
    public static void main(String[] args) {
        int[] arr = {2,2,1,2,1,0,0,2,1,2,0,0,0,1};
        int[] result = sortColours(arr);
        printArray(result);
    }

    private static int[] sortColours(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
