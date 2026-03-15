// Strange Sort
// Given an array arr[] of non-negative integers. Sort the array in ascending order such that the element at the Kth position in the unsorted array stays unmoved and all other elements are sorted. 

// Examples:

// Input: arr[] = [3, 12, 30, 79, 2] , k=2
// Output: [2, 12, 3, 30, 79]
// Explanation: The element at the 2nd position (12) remains at its own place while others are sorted.
// Input: arr[] = [16, 16, 18, 10, 9, 22, 11, 5, 35, 22] , k=5
// Output: [5, 10, 11, 16, 9, 16, 18, 22, 22, 35]
// Explanation: The element at the 5th position (9) remains at its own place while others are sorted.

package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrangeSort {
    public static void sortExceptK(int[] arr, int k) {
        int n = arr.length;

        // Convert k to 0-based index
        int idx = k - 1;

        if (idx < 0 || idx >= n) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        int fixed = arr[idx];

        // Collect all elements except the kth one
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i != idx) {
                list.add(arr[i]);
            }
        }

        // Sort remaining elements
        Collections.sort(list);

        // Rebuild the array
        int j = 0; //j is required if not we will get arrayindexoutofbounds
        for (int i = 0; i < n; i++) {
            if (i == idx) {
                arr[i] = fixed;
            } else {
                arr[i] = list.get(j++);
            }
        }
    }

    // Demo
    public static void main(String[] args) {
        int[] arr1 = {3, 12, 30, 79, 2};
        sortExceptK(arr1, 2);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {16, 16, 18, 10, 9, 22, 11, 5, 35, 22};
        sortExceptK(arr2, 5);
        System.out.println(Arrays.toString(arr2));
    }
}
