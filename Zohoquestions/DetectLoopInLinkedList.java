// You are given the head of a singly linked list. You have to determine whether the given linked list contains a loop or not. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.

// Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null. Note that pos is not passed as a parameter.

// https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1



// Using Floyd's Cycle-Finding Algorithm

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class DetectLoopInLinkedList {
    static boolean detectLoop(Node head) {

        // Fast and slow pointers initially points to the head
        Node slow = head, fast = head;

        // Loop that runs while fast and slow pointer are not
        // null and not equal
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If fast and slow pointer points to the same node,
            // then the cycle is detected
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        head.next.next.next = head.next;

        if (detectLoop(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
