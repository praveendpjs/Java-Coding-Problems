package GeeksForGeeks;

import java.util.ArrayList;

// Repeated IDs
// Geek is given a task to select at most 10 employees for a company project. Each employee is represented by a single-digit ID number which is unique for all the selected employees for the project. Geek has a technical problem in his system which printed ID number multiple times. You are given array arr having all printed IDs. Help him to get rid of the repeated IDs.

// Examples:

// Input: arr[] = [8, 8, 6, 2, 1] 
// Output: [8, 6, 2, 1] 
// Explanation: 8 is repeated, so takes 8 single time.
// Input: arr[] = [7, 6, 7, 4, 2, 7] 
// Output: [7, 6, 4, 2] 
// Explanation: 7 and 6 are repeated, so take 7 and 6 single time

public class RepeatedID {
    public static ArrayList<Integer> uniqueId(int[] arr) {
        //  code here
        boolean[] seen = new boolean[10];
        int[] temp = new int[arr.length];
        int index = 0;
        
        for(int num : arr){
            if(!seen[num]){
                seen[num] = true;
                temp[index++] = num;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < index; i++) {
                result.add(temp[i]);
            }

        return result;
    }
    public static void main(String[] args) {
        
    }
}

//  public static int[] removeDuplicates(int[] arr) {
//         LinkedHashSet<Integer> set = new LinkedHashSet<>();

//         for (int num : arr) {
//             set.add(num);   // duplicates automatically ignored
//         }

//         int[] result = new int[set.size()];
//         int i = 0;

//         for (int num : set) {
//             result[i++] = num;
//         }

//         return result;
//     }

// With array instead arraylist
// public static int[] removeDuplicatesSimple(int[] arr) {
//     boolean[] seen = new boolean[10];
//     int[] temp = new int[arr.length];
//     int index = 0;

//     for (int num : arr) {
//         if (!seen[num]) {
//             seen[num] = true;
//             temp[index++] = num;
//         }
//     }

//     return Arrays.copyOf(temp, index);
// }

// Why size 10 for seen? Because the problem promised IDs are single digits, 0–9. That constraint is a gift. We use the digit itself as an address in memory instead of playing guessing games with hash tables.

// At the start:

// seen = [false, false, false, false, false, false, false, false, false, false]
// temp = [0, 0, 0, 0, 0, 0]
// index = 0

// Index: 0 1 2 3 4 5 6 7 8 9
// Seen : F F F F F F F F F F
// Now feed the input one by one:

// Input: [7, 6, 7, 4, 2, 7]
// After reading 7
// r
// Copy code
// seen[7] = true

// Index: 0 1 2 3 4 5 6 7 8 9
// Seen : F F F F F F F T F F
// 7 is now marked as “already used.”

// After reading 6
// r
// Copy code
// seen[6] = true

// Index: 0 1 2 3 4 5 6 7 8 9
// Seen : F F F F F F T T F F