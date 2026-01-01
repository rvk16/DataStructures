package week1.arrays;

//to return maximum profit
public class StocksBuySell {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(stockBuySell(arr));
    }

    private static int stockBuySell(int[] arr) {
        // Edge case: if array is null or has less than 2 elements, no transaction possible
        if(arr == null || arr.length < 2) {
            return 0;
        }

        int n = arr.length;
        int minSofar = arr[0];
        int maxProfit = 0;
        for(int i = 1; i < n; i++){
            int profit = arr[i] - minSofar;
            maxProfit = Math.max(profit, maxProfit);
            minSofar = Math.min(arr[i], minSofar);

        }
        return maxProfit;
    }

    private static int stockBuySellSpace(int[] arr) {
        int n = arr.length;
        int[] maxFromRight = new int[n];

        // Build auxiliary array: maxFromRight[i] = max price from index i to end
        maxFromRight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxFromRight[i] = Math.max(arr[i], maxFromRight[i + 1]);
        }

        // Calculate maximum profit by comparing each buy price with max sell price ahead
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            int profit = maxFromRight[i] - arr[i];
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }

    private static int stockBuySellBruitForce(int[] arr) {
        int n = arr.length;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
}
