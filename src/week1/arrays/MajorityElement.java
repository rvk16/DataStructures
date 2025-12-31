package week1.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Moore's Voting Algorithm
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,1,2,2,2,2};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr){
        int n = arr.length;
        int ansIndex = 0;
        int count = 1;
        for(int i=1; i<n; i++){
            if(arr[i] == arr[ansIndex]){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                ansIndex = i;
                count=1;
            }
        }
        int finalCount = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==arr[ansIndex]){
                finalCount++;
            }
        }
        if(finalCount > n/2){
            return arr[ansIndex];
        }
        return -1;
    }


    private static int majorityElementBruitForce(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count> n/2){
                return arr[i];
            }
        }

        return -1;
    }

    private static int majorityElementBySorting(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        int count=1;
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
                if( count > n/2){
                    return arr[i];
                }
            }else{
                count = 1;
            }
        }
        return -1;
    }

    private static int majorityElementHashmap(int[] arr){
        int n= arr.length;

        Map<Integer, Integer> numToFreq = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!numToFreq.containsKey(arr[i])){
               numToFreq.put(arr[i],1);
            }else{
                numToFreq.put(arr[i], numToFreq.get(arr[i]) + 1);
            }
        }

        // Check if any element has frequency > n/2
        for(Map.Entry<Integer, Integer> entry : numToFreq.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }

        return -1;
    }


}
