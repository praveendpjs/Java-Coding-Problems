// Sort an array using insertion sort
package Humworld;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 5, 2, 9, 1 };

        insertionSort(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
}

// Initial array:

// [8, 3, 5, 2, 9, 1]

// Key invariant (this is the law of the universe here):

// Left side of i → always sorted
// Right side of i → unknown chaos
// Pass 1 (i = 1)
// key = arr[1] = 3
// j = 0

// Compare:

// arr[j] = 8 > 3 → shift 8 to right

// Array becomes:

// [8, 8, 5, 2, 9, 1]

// j becomes:

// j = -1

// Now insert key at:

// arr[j+1] = arr[0] = 3

// Array becomes:

// [3, 8, 5, 2, 9, 1]

// Sorted region:

// [3, 8]
// Pass 2 (i = 2)
// key = 5
// j = 1

// Compare:

// 8 > 5 → shift 8 right

// Array:

// [3, 8, 8, 2, 9, 1]

// j becomes:

// j = 0

// Compare:

// 3 > 5 → NO

// Insert key at:

// arr[j+1] = arr[1] = 5

// Array:

// [3, 5, 8, 2, 9, 1]

// Sorted region:

// [3, 5, 8]
// Pass 3 (i = 3)
// key = 2
// j = 2

// Compare and shift:

// 8 > 2 → shift
// [3, 5, 8, 8, 9, 1]

// 5 > 2 → shift
// [3, 5, 5, 8, 9, 1]

// 3 > 2 → shift
// [3, 3, 5, 8, 9, 1]

// Insert key at index 0:

// [2, 3, 5, 8, 9, 1]

// Sorted region:

// [2, 3, 5, 8]
// Pass 4 (i = 4)
// key = 9
// j = 3

// Compare:

// 8 > 9 → NO

// Insert at same place.

// Array unchanged:

// [2, 3, 5, 8, 9, 1]

// Sorted region:

// [2, 3, 5, 8, 9]
// Pass 5 (i = 5)
// key = 1
// j = 4

// Shift everything right:

// 9 → shift
// 8 → shift
// 5 → shift
// 3 → shift
// 2 → shift

// Array during shifts:

// [2, 3, 5, 8, 9, 9]
// [2, 3, 5, 8, 8, 9]
// [2, 3, 5, 5, 8, 9]
// [2, 3, 3, 5, 8, 9]
// [2, 2, 3, 5, 8, 9]

// Insert key at index 0:

// [1, 2, 3, 5, 8, 9]
// Final sorted array
// [1, 2, 3, 5, 8, 9]
// The deep truth of insertion sort

// Insertion sort doesn't swap randomly. It creates a hole, shifts larger elements, then drops the key into the hole.

// This line is the soul of the algorithm:

// arr[j + 1] = arr[j];

// You are not swapping. You are making space.

// Then this line seals the deal:

// arr[j + 1] = key;