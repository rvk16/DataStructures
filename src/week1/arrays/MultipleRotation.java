package week1.arrays;


//below solution is for left rotation
//if we want to do right rotation in that case we would need to keep same logic
//just change the offset to m - r (here m is total number of element in a and r is what they have given
public class MultipleRotation {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,3};

        int[][] result = multipleRotate(a,b);
        for(int[] e: result){
            printArray(e);
        }
    }

    private static int[][] multipleRotate(int[] a , int[] b){
        int m = a.length;
        int n = b.length;
        int[][] result = new int[n][m];

        int temp[] = new int[2*m];
        for(int i=0; i<m; i++){
            temp[i] = a[i];
            temp[m+i] = a[i];
        }
        // 1 2 3 4 5 1 2 3 4 5
        for(int i=0; i<n; i++){
            int offset = (b[i])%m;
            for(int j=0; j<m; j++){
                result[i][j] = temp[j+offset];
            }
        }
        return result;
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}