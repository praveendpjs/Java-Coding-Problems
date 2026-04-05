// Triplet Family
// Given an array arr of integers. First sort the array then find whether three numbers are such that the sum of two elements equals the third element.

// Example:

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: true
// Explanation: The pair (1, 2) sums to 3.
// Input: arr[] = [3, 4, 5]
// Output: false
// Explanation: No triplets satisfy the condition.
package GeeksForGeeks;

import java.util.Arrays;

public class TripletFamily {
    public boolean findTriplet(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        Arrays.sort(arr);

        // Treat arr[k] as the target sum
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                int sum = arr[i] + arr[j];

                if (sum == arr[k]) {
                    return true;
                } 
                else if (sum < arr[k]) {
                    i++;
                } 
                else {
                    j--;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
    }
}
