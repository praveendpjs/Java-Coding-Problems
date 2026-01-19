// Last duplicate element in a sorted array
// You are given a sorted array arr[] that may contain duplicate elements. Your task is to find the index of the last occurrence of any duplicate element and return the index along with the value of that element. If no duplicate element is found, return [-1, -1].

// Examples :

// Input: arr[] = [1, 5, 5, 6, 6, 7]
// Output: [4, 6]
// Explanation: Last duplicate element is 6 having index 4.
// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [-1, -1]
// Explanation: No duplicate elements are present in the array.

package GeeksForGeeks;

public class LastDupinSortedArr {
    public int[] dupLastIndex(int[] arr) {
        int n = arr.length;

        int index = -1;
        int value = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                index = i;
                value = arr[i];
            }
        }

        return new int[]{index, value};
    }
    public static void main(String[] args) {
        
    }
}
