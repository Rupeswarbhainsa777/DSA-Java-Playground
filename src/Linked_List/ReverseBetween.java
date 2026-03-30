package Linked_List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        int i = 1;

        // Move to 'left' position
        while (curr != null && i != left) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        ListNode pointToSt = prev; // node before left
        ListNode start = curr;     // left node

        prev = null;

        // Reverse between left and right
        while (curr != null && i != right + 1) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

        start.next = curr;

        if (pointToSt != null) {
            pointToSt.next = prev;
        } else {
            return prev;
        }

        return head;
    }
}

public class ReverseBetween {

    // Helper function to print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();
        head = sol.reverseBetween(head, 2, 4);

        System.out.println("After Reversing from 2 to 4:");
        printList(head);
    }
}