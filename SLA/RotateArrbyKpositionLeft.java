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

// public static void reverse(int[] arr, int left, int right){
//         while(left < right){
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//     }

//     public static void leftRotate(int[] arr, int k) {
//         int n = arr.length;
//         if (n == 0) return;

//         k = k % n;
//         if (k == 0) return;

//         reverse(arr, 0, k - 1); // reverse first k elements

//         // Reverses [1, 2, 3] → [3, 2, 1] Array becomes: [3, 2, 1, 4, 5, 6, 7]

//         reverse(arr, k, n - 1); //reverse the remaining elements

//         // Reverses [4, 5, 6, 7] → [7, 6, 5, 4] Array becomes: [3, 2, 1, 7, 6, 5, 4]

//         reverse(arr, 0, n - 1); //reverse the entire array

//         // Reverses everything: [4, 5, 6, 7, 1, 2, 3]


//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7};
//         int k = 3;

//         System.out.println("Original array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }

//         leftRotate(arr, k);

//         System.out.println("\nArray after left rotation by " + k + " positions: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }


// // Original array
// // [1, 2, 3, 4, 5, 6, 7]
// //  k = 3


// // Split mentally:

// // [1, 2, 3] | [4, 5, 6, 7]
// //    A      |      B


// // Goal:

// // B + A → [4, 5, 6, 7, 1, 2, 3]