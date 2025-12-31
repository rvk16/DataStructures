package week1.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Minimum operation to make matrix equal
// k can be added or subtracted
public class MakeMatrixEqual {

    public static void main(String[] args) {
        int[][] arr = {{3, 63, 42},
            {18, 12, 12},
            {15, 21, 18},
            {33, 84, 24}};
        int k = 3;
        System.out.println(makeMatrixEqual(arr, k));
    }

    private static int makeMatrixEqual(int[][] arr, int k){
        int n = arr.length;
        if(n == 0) return 0;
        int m = arr[0].length;
        int total = n*m;
        int[] fullArray = new int[total];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                fullArray[i*m +j] = arr[i][j]; // classic 2D to 1D mapping of array
            }
        }
        Arrays.sort(fullArray);

        int median = fullArray[total/2];
        return makeMatrixHelper(fullArray, median, k);

    }

    private static int makeMatrixHelper(int[] arr, int m, int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count+= Math.abs(arr[i] - m)/k; // formula for calculating how to make arr[i] to m using k (addition/subtraction)
        }
        return count;
    }

    //Another Solution

    private static int MakeMatrixEqualAnother(int[][] arr, int k) {
        List<Integer> elements = new ArrayList<>();
        int remainder = arr[0][0] % k;

        // Step 1: Collect all elements and check feasibility
        for (int[] row : arr) {
            for (int val : row) {
                if (val % k != remainder) {
                    return -1;  // Impossible
                }
                elements.add(val);
            }
        }

        // Step 2: Sort and find median
        Collections.sort(elements);
        int median = elements.get(elements.size() / 2);

        // Step 3: Count operations to reach median
        int operations = 0;
        for (int val : elements) {
            operations += Math.abs(val - median) / k;
        }

        return operations;
    }
}

