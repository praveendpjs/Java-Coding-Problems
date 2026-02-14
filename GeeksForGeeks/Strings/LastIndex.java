// https://www.geeksforgeeks.org/problems/last-index-of-15847/1?page=1&category=Strings&difficulty=Basic&sortBy=difficulty
// Last index of One
// Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.

// Note: If '1' is not present, return "-1"

// Examples:

// Input: s = 00001
// Output: 4
// Explanation: Last index of  1 in given string is 4.
// Input: s = 0
// Output: -1
// Explanation: Since, 1 is not present, so output is -1.

package GeeksForGeeks.Strings;
// Did it myself
public class LastIndex {
    public int lastIndex(String s) {
        for(int i = s.length() - 1; i >= 0; i--){
            char curr = s.charAt(i);
            if(curr == '1'){
                return i;
            }
        }
        return -1;
    }
}


// public static void main(String[] args) {
//         String s1 = "00001";
//         String s2 = "0";

//         System.out.println(findLastIndex(s1));
//         System.out.println(findLastIndex(s2));
//     }

//     public static int findLastIndex(String s) {
//         return s.lastIndexOf('1');
//     }