package algorithms.searching_algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 6, 7, 9, 10};
        int k = 101;
        System.out.println(binarySearchRecursive(a, k, 0, a.length-1));
    }

    private static int binarySearchIterative(int[] arr, int k) {
        int l = 0 , r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l)/2;
            if (arr[mid] == k) return mid;
            if (arr[mid] < k) l = mid + 1;
            else if (arr[mid] > k) r = mid - 1;
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] arr, int k, int l, int r) {
        if (l > r) return -1;
        int mid = l + (r - l)/2;
        if (arr[mid] == k) return mid;
        if (arr[mid] < k) return binarySearchRecursive(arr, k, mid+1, r);
        return binarySearchRecursive(arr, k, l, mid-1);
    }
}
