package week1.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] a = {12,9,8,2,11,13};
        List<List<Integer>> result = minimumDifference(a);
        System.out.println(result);

    }

    private static List<List<Integer>> minimumDifference(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            minDiff = Math.min(minDiff, arr[i]-arr[i-1]);
        }

        for(int i=1; i<n; i++){
            if(arr[i]-arr[i-1] == minDiff){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i-1]);
                result.add(temp);
            }
        }
        return result;
    }
}
