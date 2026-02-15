// 83. Remove Duplicates from Sorted List

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

// Example 1:

// Input: head = [1,1,2]
// Output: [1,2]
// Example 2:

// Input: head = [1,1,2,3,3]
// Output: [1,2,3]

public class RemoveDupLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {

        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;

            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }

            return head;
        }

        public static ListNode buildList(int[] arr) {
            if (arr.length == 0)
                return null;

            ListNode head = new ListNode(arr[0]);
            ListNode temp = head;

            for (int i = 1; i < arr.length; i++) {
                temp.next = new ListNode(arr[i]);
                temp = temp.next;
            }

            return head;
        }

        public static void printList(ListNode head) {
            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode head1 = Solution.buildList(new int[] { 1, 1, 2 });
        head1 = sol.deleteDuplicates(head1);
        Solution.printList(head1);

        ListNode head2 = Solution.buildList(new int[] { 1, 1, 2, 3, 3 });
        head2 = sol.deleteDuplicates(head2);
        Solution.printList(head2);
    }
}
