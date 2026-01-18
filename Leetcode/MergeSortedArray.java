public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1; // last real element of nums1
        int j = n - 1; // last element of nums2
        int k = m + n - 1; // last position of nums1

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}

// 1. Why while (j >= 0) and not i >= 0?

// Think about the mission objective:

// nums1 already has its first m elements in correct order.

// nums2 must be completely inserted into nums1.

// Anything left in nums1 is already in place.

// So the real question is: whose elements are at risk of being lost if we stop early?
// Only nums2.

// If j becomes negative, it means every element of nums2 has been placed. Whatever remains in nums1 (the i side) is already sorted and already sitting exactly where it should be. No work left.

// But flip the situation: imagine you used while (i >= 0).
// Case:

// nums1 = [4,5,6,0,0,0], m = 3
// nums2 = [1,2,3], n = 3


// You would finish copying all of nums1 first and exit — leaving [1,2,3] from nums2 completely unmerged. Disaster.