// write a java program to find the length of the longest consecutive sequence in an unsorted array. 
// Input: 100, 4, 200, 1, 3, 2 output: 4
// Explanation 1,2,3,4 are consecutive so total numbers = 4

// Was asked in today's SLA L1 test almost got it right

import java.util.Arrays;

public class LongestConsecutive {
    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        int max = 1;
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] == arr[i]) {
                // duplicate, ignore
                continue;
            }

            if (arr[i + 1] == arr[i] + 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        max = Math.max(max, count);

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // 4
    }
}
