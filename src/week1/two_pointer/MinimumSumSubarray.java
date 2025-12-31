package week1.two_pointer;

//Sliding window and two pointer because window is variable here
public class MinimumSumSubarray {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 7, 2};
        int target = 8;
        System.out.println(minSubArrayLength(a, target));
    }

    private static int minSubArrayLength(int[] nums, int target){
        int n = nums.length-1;
        int minLenWindow = Integer.MAX_VALUE;
        int currentSum = 0;
        int low = 0;
        int high = 0;

        while(high <= n){

            currentSum += nums[high];
            high++;

            while(currentSum >= target){
                int currentWindowLen = high - low;
                minLenWindow = Math.min(currentWindowLen, minLenWindow);
                currentSum -= nums[low];
                low++;
            }
        }
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}
