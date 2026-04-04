package Linked_List;

public class MaximumTwinSum {
    public static void main(String[] args) {

    }

    public static int pairSum(ListNode head) {

        if (head == null || head.next == null) return head.val;


        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode newHead = reverseList(slow);


        int max = 0;
        while (newHead != null) {
            max = Math.max(max, head.val + newHead.val);
            head = head.next;
            newHead = newHead.next;
        }

        return max;


    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }
}
