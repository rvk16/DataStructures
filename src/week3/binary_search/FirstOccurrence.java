package week3.binary_search;

public class FirstOccurrence {
    public static void main(String[] args) {
        int a[] = {1, 1, 1, 1, 6, 7, 9, 10};
        int k = 1;
        System.out.println(lastOccurrence(a, k));
    }

    private static int firstOccurrence(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (k < arr[mid]) right = mid - 1;
            else if (k > arr[mid]) left = mid + 1;
            else {
                right = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }

    private static int lastOccurrence(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (k < arr[mid]) right = mid - 1;
            else if (k > arr[mid]) left = mid + 1;
            else {
                left = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
