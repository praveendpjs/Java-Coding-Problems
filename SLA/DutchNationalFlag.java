import java.util.Arrays;

public class DutchNationalFlag {
    // Function to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to solve the Dutch National Flag problem
    public static void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // If the element is 0, swap it with the element at 'low' and increment both 'low' and 'mid'
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 2) {
                // If the element is 2, swap it with the element at 'high' and decrement 'high'
                swap(arr, mid, high);
                high--;
                // Note that we do not increment mid here because the swapped element at arr[mid] 
                // could be a 0 or 1, and thus needs to be re-examined.
            } else {
                // If the element is 1, it is already in the correct position (middle), so just increment 'mid'
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 0, 1, 0, 2, 1, 1, 0};
        System.out.println("Original array: " + Arrays.toString(array));
        sortColors(array);
        System.out.println("Sorted array: " + Arrays.toString(array)); // Output: [0, 0, 0, 1, 1, 1, 2, 2]
    }
}
