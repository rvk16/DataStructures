package week1.sliding_window;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] arr = {3,4,4,5,-2,-1,-2,-1};
        System.out.println(findMaxAverage(arr, 4));
    }


    private static double findMaxAverage(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        int startIndex = 0;
        int endIndex = k;

        while (endIndex < n) {
            sum -= arr[startIndex];
            startIndex++;
            sum += arr[endIndex];
            endIndex++;

            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum/k;
    }
}


