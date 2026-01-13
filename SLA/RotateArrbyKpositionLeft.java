import java.util.Arrays;

public class RotateArrbyKpositionLeft {
    static int[] leftRotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        int[] result = new int[n];
        int index = 0;
        for(int i = k; i < n; i++){
            result[index++] = arr[i];
        }
        for(int i = 0; i < k; i++){
            result[index++] = arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        arr = leftRotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
