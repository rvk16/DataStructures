package week1.arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = productExceptSelf(arr);

        printArray(result);
    }

    private static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] prefixArray = new int[n];
        prefixArray[0] = 1;
        for (int i = 1; i < n; i++) {
            prefixArray[i] = prefixArray[i - 1] * arr[i - 1];
        }
        int suffixProduct = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            prefixArray[i] = prefixArray[i] * suffixProduct;
            suffixProduct *= arr[i];
        }

        return prefixArray;
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
