package week1.arrays;

/* In this problem we can buy and sell stocks as many times as we want just that we need to make sure we can only sell
 after buying */

public class StockBuySell2 {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,4,7,3,6};
        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {
        int n = arr.length;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }
}
