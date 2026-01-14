import java.util.Arrays;

public class RotateArrbyKpositionRight {
    public static int[] rightRotate(int arr[], int k) {
		int n = arr.length;
		int[] newArr = new int[n];
		k = k % n;
		int index = 0;
		for(int i = n-k; i < n; i++) {
			newArr[index] = arr[i];
			index++;
		}
		for(int i = 0; i < n-k; i++) {
			newArr[index] = arr[i];
			index++;
		}
		return newArr;
	}
	
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        arr = rightRotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
