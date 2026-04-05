// https://www.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1?page=1&difficulty=Easy&sortBy=difficulty
// Left most and right most index
// Difficulty: EasyAccuracy: 38.23%Submissions: 85K+Points: 2Average Time: 15m
// Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element X in the given array.

// Note: If the element is not present in the array return {-1,-1} as pair.

// Example 1:

// Input:
// N = 9
// v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
// X = 5
// Output:
// 2 5
// Explanation:
// Index of first occurrence of 5 is 2
// and index of last occurrence of 5 is 5.
// Example 2:

// Input:
// N = 9
// v[] = {1, 3, 5, 5, 5, 5, 7, 123, 125}
// X = 7
// Output:
// 6 6

package GeeksForGeeks.Array Easy;


// User function Template for Java


class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

public class FirstAndLast {
    public pair indexes(long v[], long x) {
        int first = first(v, x);
        int last = last(v, x);
        return new pair(first,last);
    }
    public int first(long v[], long x){
        for(int i = 0; i < v.length; i++){
            if(v[i] == x){
                return i;
            }
        }
        return -1;
    }
    public int last(long v[], long x){
        for(int i = v.length - 1; i >= 0; i--){
            if(v[i] == x){
                return i;
            }
        }
        return -1;
    }
}
