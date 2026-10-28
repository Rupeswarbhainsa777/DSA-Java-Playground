package Top_Coding_Question.LinkList;

public class FindTheMiddleNode {

    public static void main(String[] args) {

    }

    public static ListNode findTheMiddleNode(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}