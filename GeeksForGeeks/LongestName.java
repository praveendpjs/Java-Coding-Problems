// https://www.geeksforgeeks.org/problems/display-longest-name0853/1
// Given an array arr[] containing strings of names. Your task is to return the longest string. If there are multiple names of the longest size, return the first occurring name.

// Examples :

// Input: arr[] = ["Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"]
// Output: "GeeksforGeeks"
// Explanation: name "GeeksforGeeks" has maximum length among all names. 
// Input: arr[] = ["Apple", "Mango", "Orange", "Banana"]
// Output: "Orange"
// Explanation: names "Orange" and "Banana" both have maximum length among all names but Orange comes first so answer will be "Orange". 

package GeeksForGeeks;

import java.util.List;

public class LongestName {
    public String longest(List<String> arr) {
        // code here
        String max = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i).length() > max.length()){
                max = arr.get(i);
            }
        }
        return max;
    }
}

// Similarly for array
// public static ArrayList<String> solve(String arr[],int N)
//     {
    
//         // Edge Case
//         if (N == 0) {
//             ArrayList<String> temp
//                 = new ArrayList<String>();
//             return temp;
//         }

//         // Initialize Max
//         int Max = arr[0].length();

//         // Create an arraylist res
//         ArrayList<String> res = new ArrayList<String>();

//         // Insert first element in res
//         res.add(arr[0]);

//         // Traverse the array
//         for (int i = 1; i < N; i++) {

//             // If string with greater length
//             // is found
//             if (arr[i].length() > Max) {
//                 Max = arr[i].length();
//                 res.clear();
//                 res.add(arr[i]);
//             }

//             // If string with current max length
//             else if (arr[i].length() == Max) {
//                 res.add(arr[i]);
//             }
//         }

//         // Return the final answer
//         return res;
//     }
