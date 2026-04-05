// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?page=1&difficulty=Easy&sortBy=difficulty
// Missing And Repeating
// Difficulty: EasyAccuracy: 24.83%Submissions: 694K+Points: 2Average Time: 30m
// Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.

// Examples:

// Input: arr[] = [2, 2]
// Output: [2, 1]
// Explanation: Repeating number is 2 and the missing number is 1.
// Input: arr[] = [1, 3, 3] 
// Output: [3, 2]
// Explanation: Repeating number is 3 and the missing number is 2.
// Input: arr[] = [4, 3, 6, 2, 1, 1]
// Output: [1, 5]
// Explanation: Repeating number is 1 and the missing number is 5.
package GeeksForGeeks.ArrayEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingandRep {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        
        int duplicate = -1;
        int missing = 1;
        
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                duplicate = arr[i];
            }
            
            if(arr[i + 1] > arr[i] + 1){
                missing = arr[i] + 1;
            }
        }
        
        // Handle missing at end
        if(arr[arr.length - 1] != arr.length){
            missing = arr.length;
        }
        
        list.add(duplicate);
        list.add(missing);
        
        return list;
    }

}
// Input:

// [4,3,6,2,1,1]

// After sorting:

// [1,1,2,3,4,6]

// Initial:

// duplicate = -1
// missing = 1

// Loop:

// i = 0

// 1 == 1
// duplicate = 1

// i = 1

// 1 != 2

// No missing

// i = 2

// 2 != 3

// No missing

// i = 3

// 3 != 4

// No missing

// i = 4

// 4 != 6

// Check missing:

// 6 > 4 + 1
// 6 > 5 → true

// Missing found:

// missing = 5

// After loop:

// Check end:

// 6 != 6 → false

// Final:

// duplicate = 1
// missing = 5

// Output:

// [1,5]