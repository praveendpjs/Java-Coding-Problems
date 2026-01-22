// Given a sorted array arr[]. Count the number of distinct absolute values present in the array.

// Examples:

// Input: arr[] = [-3, -2, 0, 3, 4, 5]
// Output: 5
// Explanation: There are 5 distinct absolute values i.e. 0, 2, 3, 4 and 5.
// Input: arr[] = [-1, -1, -1, -1, 0, 1, 1, 1, 1]
// Output: 2
// Explanation: There are 2 distinct absolute values among the elements of this array, i.e. 0 and 1.
package GeeksForGeeks;

import java.util.HashSet;

// My solution is weak but I figured out myself
public class DistinctAbsolute {
    public int distinctCount(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = Math.abs(arr[i]);
            }
            set.add(arr[i]);
        }
        return set.size();
        
    }
    public static void main(String[] args) {
        
    }
}


// public class DistinctAbsoluteValues {

//     public static int countDistinctAbs(int[] arr) {
//         int n = arr.length;
//         int left = 0, right = n - 1;
//         int count = 0;

//         while (left <= right) {
//             int leftAbs = Math.abs(arr[left]);
//             int rightAbs = Math.abs(arr[right]);

//             if (leftAbs > rightAbs) {
//                 count++;
//                 int val = leftAbs;
//                 while (left <= right && Math.abs(arr[left]) == val) {
//                     left++;
//                 }
//             } else if (leftAbs < rightAbs) {
//                 count++;
//                 int val = rightAbs;
//                 while (left <= right && Math.abs(arr[right]) == val) {
//                     right--;
//                 }
//             } else {
//                 // same absolute value on both sides
//                 count++;
//                 int val = leftAbs;
//                 while (left <= right && Math.abs(arr[left]) == val) {
//                     left++;
//                 }
//                 while (left <= right && Math.abs(arr[right]) == val) {
//                     right--;
//                 }
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         System.out.println(countDistinctAbs(new int[]{-3, -2, 0, 3, 4, 5})); // 5
//         System.out.println(countDistinctAbs(new int[]{-1, -1, -1, -1, 0, 1, 1, 1, 1})); // 2
//     }
// }


// arr = [-3, -2, 0, 3, 4, 5]
// Initial state:

// left = 0   → -3
// right = 5  →  5
// count = 0
// Step 1
// leftAbs  = | -3 | = 3
// rightAbs = |  5 | = 5
// Comparison:

// 3 < 5
// Meaning:

// Absolute value 5 is unique

// Nothing on the left can match it (array is sorted)

// Action:

// count++ → 1
// Move right pointer past all 5s
// New state:

// right = 4 → 4
// Step 2
// leftAbs  = | -3 | = 3
// rightAbs = |  4 | = 4
// Comparison:

// 3 < 4
// Action:

// count++ → 2
// Move right pointer past all 4s
// New state:

// right = 3 → 3
// Step 3
// leftAbs  = | -3 | = 3
// rightAbs = |  3 | = 3
// Comparison:

// 3 == 3
// Meaning:

// -3 and 3 represent the same absolute value

// Count it once, not twice

// Action:

// count++ → 3
// Move BOTH pointers past abs(3)
// New state:

// left = 1  → -2
// right = 2 → 0
// Step 4
// leftAbs  = | -2 | = 2
// rightAbs = |  0 | = 0
// Comparison:

// 2 > 0
// Action:

// count++ → 4
// Move left pointer past all -2s
// New state:

// left = 2 → 0
// Step 5
// leftAbs  = | 0 | = 0
// rightAbs = | 0 | = 0
// Comparison:

// 0 == 0
// Action:

// count++ → 5
// Move both pointers
// New state:

// left = 3
// right = 1
// (left > right → stop)
// Final Answer
// count = 5
// Distinct absolute values:
// 0, 2, 3, 4, 5


// Another example
// Input
// arr = [-1, -1, -1, -1, 0, 1, 1, 1, 1]
// index   0   1   2   3   4  5  6  7  8


// Initial state:

// left = 0   → -1
// right = 8  →  1
// count = 0

// Step 1
// leftAbs  = | -1 | = 1
// rightAbs = |  1 | = 1


// Comparison:

// 1 == 1


// Meaning:

// -1 and 1 represent the same absolute value

// Even though there are MANY of them, they count as one

// Action:

// count++ → 1
// Move left past all abs(1)
// Move right past all abs(1)


// Pointer movement:

// left  moves from 0 → 4
// right moves from 8 → 4


// New state:

// left = 4 → 0
// right = 4 → 0

// Step 2
// leftAbs  = | 0 | = 0
// rightAbs = | 0 | = 0


// Comparison:

// 0 == 0


// Meaning:

// Zero has no mirror value

// Still counts as one absolute value

// Action:

// count++ → 2
// Move both pointers


// Pointer movement:

// left  = 5
// right = 3


// Loop stops (left > right)

// Final Answer
// count = 2
// Distinct absolute values: 0, 1