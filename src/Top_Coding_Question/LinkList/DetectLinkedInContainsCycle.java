package Top_Coding_Question.LinkList;

public class DetectLinkedInContainsCycle {

    public static void main(String[] args) {

    }

    public static boolean findCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}