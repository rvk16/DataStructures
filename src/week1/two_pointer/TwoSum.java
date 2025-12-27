package week1.two_pointer;

// here input array must be the sorted order else this will not work.
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,4,4,5};
        int[] result = twoSum(arr,7);
        printArray(result);
    }

    private static int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if( sum == target){
                return new int[] {left, right};
            }else if(sum < target){
                left++;
            }else {
                right--;
            }
        }
        return new int[] {-1,-1};
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
