// https://www.geeksforgeeks.org/problems/greater-on-right-side4305/1?page=1&difficulty=Easy&sortBy=difficulty
// Greater on right side
// You are given an array arr. Replace every element with the next greatest element (the greatest element on its right side) in the array. Note: There is no element next to the last element, so replace it with -1.

// Example:

// Input: arr[] = [16, 17, 4, 3, 5, 2]
// Output: [17, 5, 5, 5, 2, -1]
// Explanation: For 16 the greatest element 
// on its right is 17. For 17 it's 5. 
// For 4 it's 5. For 3 it's 5. For 5 it's 2. 
// For 2 it's -1(no element to its right). 
// Input: arr[] = [2, 3, 1, 9]
// Output: [9, 9, 9, -1]
// Explanation: For each element except 9 the
// greatest element on its right is 9.

import java.util.ArrayList;
import java.util.Collections;


public class GreaterOnRight {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int max = -1;
        
        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            res.add(max);
            max = Math.max(max, temp);
        }
        
        Collections.reverse(res);
        return res;
    }
}
