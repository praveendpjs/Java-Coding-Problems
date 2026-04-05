// https://www.geeksforgeeks.org/problems/type-of-array4605/1?page=1&sortBy=difficulty
// Type of array
// You are given an array arr[] having unique elements. Your task is to return the type of array.
// Note: The array can be categorized into ascending, descending, descending rotated and ascending rotated followed by:

// Return 1 if the array is in ascending order
// Return 2 if the array is in descending order
// Return 3 if the array is in descending rotated order
// Return 4 if the array is in ascending rotated order
// Examples:

// Input: arr[] = [2, 1, 5, 4, 3]
// Output: 3
// Explanation: Descending rotated, rotate 2 times left.
// Input: arr[] = [3, 4, 5, 1, 2]
// Output: 4
// Explanation: Ascending rotated, rotate 2 times right. 

package GeeksForGeeks;
public class TypeOfArray {
    int maxNtype(int arr[]) {
        int n = arr.length;

        boolean asc = true, desc = true;

        // First check normal order without circular wrap
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) asc = false;
            if (arr[i] < arr[i + 1]) desc = false;
        }

        if (asc) return 1;
        if (desc) return 2;

        // Now check rotated cases using circular logic
        int ascBreaks = 0, descBreaks = 0;

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int next = arr[(i + 1) % n];

            if (curr > next) ascBreaks++;
            if (curr < next) descBreaks++;
        }

        if (ascBreaks == 1) return 4;   // ascending rotated
        if (descBreaks == 1) return 3;  // descending rotated

        return -1;
    }
    public static void main(String[] args) {
        
    }
}
