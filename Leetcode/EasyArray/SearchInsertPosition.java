// https://leetcode.com/problems/search-insert-position/description/
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return start;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6, 7, 8, 9 };
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        System.out.println(searchInsert(nums, target1));
        System.out.println(searchInsert(nums, target2));
        System.out.println(searchInsert(nums, target3));
    }
}

//I don't think this is Olog(n) time complexity
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int i; //compilation error if you declare variable in for loop
//         for(i=0;i<nums.length;i++){
//         if(nums[i] > target) 
//             return i;
//         else if(nums[i] == target) 
//             return i;
//         }
//         return i;
//     }
// }