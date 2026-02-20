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

// Step,mid Value,Action Taken,New Array State,Next Pointers
// 1,arr[0] == 2,Swap mid (index 0) and high (index 7). Decrease high. Note: We don't increase mid because the newly swapped value at mid hasn't been evaluated yet.,"[0, 0, 1, 0, 2, 1, 1, 2]",low = 0mid = 0high = 6
// 2,arr[0] == 0,"Swap low (index 0) and mid (index 0). Increase both low and mid. (Swapping an element with itself changes nothing, but pointer moves are vital).","[0, 0, 1, 0, 2, 1, 1, 2]",low = 1mid = 1high = 6
// 3,arr[1] == 0,Swap low (index 1) and mid (index 1). Increase both low and mid.,"[0, 0, 1, 0, 2, 1, 1, 2]",low = 2mid = 2high = 6
// 4,arr[2] == 1,"1s belong in the middle, so they are ignored. Just increase mid.","[0, 0, 1, 0, 2, 1, 1, 2]",low = 2mid = 3high = 6
// 5,arr[3] == 0,"Swap low (index 2, which is 1) and mid (index 3, which is 0). Increase low and mid.","[0, 0, 0, 1, 2, 1, 1, 2]",low = 3mid = 4high = 6
// 6,arr[4] == 2,"Swap mid (index 4, which is 2) and high (index 6, which is 1). Decrease high.","[0, 0, 0, 1, 1, 1, 2, 2]",low = 3mid = 4high = 5
// 7,arr[4] == 1,Ignore the 1 and increase mid.,"[0, 0, 0, 1, 1, 1, 2, 2]",low = 3mid = 5high = 5
// 8,arr[5] == 1,Ignore the 1 and increase mid.,"[0, 0, 0, 1, 1, 1, 2, 2]",low = 3mid = 6high = 5
