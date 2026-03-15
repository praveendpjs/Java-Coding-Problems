// Largest three distinct elements
// You are given an array arr[], you need to find the top three largest distinct integers present in the array and return an array of size three in descending order.

// Note: If there are less than three distinct elements in the array, then return the available distinct numbers in descending order.

// Examples:

// Input: arr[] = [10, 4, 3, 50, 23, 90, 90]
// Output: [90, 50, 23]
// Explanation: Since 90 appears two times in the given array, hence it is only counted once. Therefore, the top 3 distinct largest numbers are 90, 50 and 23.
// Input: arr[] = [10, 10, 10]
// Output: [10]
// Explanation: Since there is only one distinct element, hence the answer is 10.
// Input: arr[] = [6, 8, 9, 2, 1, 10]
// Output: [10, 9, 8]

package GeeksForGeeks;

public class LargestThreeDistinct {
    public int[] getThreeLargest(int arr[]) {
        // code here
        Integer first = null, second = null, third = null;

        for (int num : arr) {

            // Skip duplicates
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } 
            else if (second == null || num > second) {
                third = second;
                second = num;
            } 
            else if (third == null || num > third) {
                third = num;
            }
        }

        // Build result dynamically based on how many we found
        if (third != null) return new int[]{first, second, third};
        if (second != null) return new int[]{first, second};
        return new int[]{first};
    
    }
    public static void main(String[] args) {
        
    }
}
