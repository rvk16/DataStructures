package week1.arrays;

//concept : array preprocessing
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 0, 1, 3, 2};
        System.out.println(rainWater(arr));
        //left = {3,3,3,4,4,4,4,4}
        //right ={4,4,4,4,3,3,3,2}
    }

    private static int rainWater(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (Math.min(left[i], right[i]) - arr[i]);
        }

        return ans;
    }
}
