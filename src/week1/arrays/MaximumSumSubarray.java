package week1.arrays;

// Kadane's Algorithm
public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {-3, -2, -5};
        System.out.println(maximumSumSubarray(arr));
    }

    private static int maximumSumSubarray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            currSum += arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
