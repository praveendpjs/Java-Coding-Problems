// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

// 448. Find All Numbers Disappeared in an Array

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

// I know your first instinct is to sort the array but it's not required
public class FindDisappearedNum {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        LinkedHashSet<Integer> temp = new LinkedHashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int num: nums){
            temp.add(num);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!temp.contains(i)){
                result.add(i);
            }
        }
        return result;
        
    }
}

//  public List<Integer> findDisappearedNumbers(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             int idx = Math.abs(nums[i]) - 1;
//             if (nums[idx] > 0) {
//                 nums[idx] = -nums[idx];
//             }
//         }

//         List<Integer> result = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > 0) {
//                 result.add(i + 1);
//             }
//         }
//         return result;
//     }